package test01;

import java.io.File;
import java.io.IOException;

public class FileDemo02 {

    public static void main(String[] args) {
        File file = new File("D:\\Ivan");
        boolean delete = file.delete();
        System.out.println("delete: "+delete);
        File aaa = new File("aaa");
        try {
            aaa.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
