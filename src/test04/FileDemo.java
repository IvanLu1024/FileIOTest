package test04;

import java.io.File;

/**
 *  获取指定后缀名的文件对象
 */
public class FileDemo {

    public static void main(String[] args) {
        //创建根目录下的File对象
        File file = new File("D://");
        //获取得到该目录下的所有File对象
        File[] files = file.listFiles();
        //遍历该File数组
        for (File f:files){
            //判断是否为文件
            if (f.isFile()){
                //判断是否为avi文件
                if (f.getName().endsWith(".avi")){
                    //输出该文件名
                    System.out.println("Avi的文件为："+f.getName());
                }
            }
        }


    }
}
