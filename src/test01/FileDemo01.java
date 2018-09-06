package test01;

import java.io.File;
import java.io.IOException;

public class FileDemo01 {



    public static void main(String[] args) {
        File file=new File("D://Ivan");
        File file1=new File("D://Iva/a.txt");
        boolean mkdir = file.mkdir();
        boolean newFile=false;
        try {
             newFile= file1.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        //注意：想要创建文件，必须保证该路径下的目录存在
        System.out.println("mkdir: "+mkdir);
        System.out.println("createNewFile:"+newFile);


    }
}
