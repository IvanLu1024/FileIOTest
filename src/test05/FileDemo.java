package test05;

import java.io.File;

/**
 * 递归地读取文件
 */
public class FileDemo {
    public static void listFiles(File file){
        if (file==null||!file.exists()){
            return;
        }
        if (file.isFile()){
            System.out.println("文件名："+file.getName());
            return;
        }
        for (File f:file.listFiles()){
            listFiles(f);
        }

    }

    public static void main(String[] args) {
        listFiles(new File("D:\\培训资料\\【阶段03】Redis\\WEB27_Redis\\WEB27_Redis"));

    }
}
