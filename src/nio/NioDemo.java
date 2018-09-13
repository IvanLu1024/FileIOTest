package nio;

import java.io.*;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 使用NIO来实现文件的快速复制的例子
 * 使用传统的IO实现文件的复制
 *
 */
public class NioDemo {

    /**
     * 使用NIO的文件复制
     * @param src
     * @param dist
     * @throws IOException
     */
    public static void fastCopy(String src,String dist) throws IOException {
        //获取源数据输入字节流
        FileInputStream fin = new FileInputStream(src);

        //获取输入字节流的文件通道
        FileChannel finChannel = fin.getChannel();

        //获取目标文件的输出字节流
        FileOutputStream fout = new FileOutputStream(dist);

        //获取输出字节流的文件通道
        FileChannel foutChannel = fout.getChannel();

        //创建固定大小的缓冲区
        ByteBuffer buffer = ByteBuffer.allocate(1024);

        //开始处理数据
        while (true){
            //从输入通道中读取数据到缓冲区中
            int r = finChannel.read(buffer);

            //当read（）返回值为-1表示数据读取完毕
            if (r==-1){
                break;
            }

            //切换读写
            buffer.flip();

            //把缓冲区中的数据写入到输出通道
            int write = foutChannel.write(buffer);

            //清空缓冲区
            buffer.clear();



        }

    }

    /**
     * 使用传统IO的文件复制
     * @param src
     * @param dict
     * @throws IOException
     */
    public static void copyFile(String src,String dict) throws IOException {

        Reader reader=new InputStreamReader(new FileInputStream(src));
        Writer writer=new OutputStreamWriter(new FileOutputStream(dict));

        char[] buffer = new char[1024];
        int len;
        while ((len=reader.read(buffer))!=-1){
            writer.write(buffer);

        }
        writer.flush();
        writer.close();
        reader.close();

    }

    public static void main(String[] args) {
        long before = System.currentTimeMillis();

        try {
            fastCopy("a.txt","w.txt");
            long after = System.currentTimeMillis();
            System.out.println(after-before);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
