package io.test01;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileOutputStreamDemo {

    public static void main(String[] args)throws IOException {

        FileOutputStream fileOutputStream = new FileOutputStream("a.txt",true);
        Scanner sc=new Scanner(System.in);
        int i = sc.nextInt();
        for (int j=0;j<=i;j++) {
            String s = sc.nextLine();
            fileOutputStream.write(s.getBytes());
        }


        fileOutputStream.close();

    }
}
