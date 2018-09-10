package test03;

import java.io.File;

public class FileDemo {

    public static void main(String[] args) {
        File file = new File("D:\\");
        String[] list = file.list();
        for (String f:list){
            System.out.println(f);
        }

    }
}
