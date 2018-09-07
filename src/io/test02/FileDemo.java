package io.test02;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileDemo {

    public static void copyFile(String src,String dist)throws IOException {
        FileOutputStream outputStream = new FileOutputStream(dist);
        FileInputStream inputStream = new FileInputStream(src);
        byte[] buffer = new byte[20 * 1024];

        // read() 最多读取 buffer.length 个字节
        // 返回的是实际读取的个数
        // 返回 -1 的时候表示读到 eof，即文件尾
        while (inputStream.read(buffer,0,buffer.length-1)!=-1){
            outputStream.write(buffer);

        }
        inputStream.close();
        outputStream.close();


    }

    public static void main(String[] args) {
        try {
            copyFile("a.txt","b.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
