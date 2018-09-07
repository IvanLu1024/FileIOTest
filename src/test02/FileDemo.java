package test02;

import java.io.File;

/**
 * 重命名功能：如果路径名相同就是改名；
 *           如果路径名不同就是切贴。
 */
public class FileDemo {

    public static void main(String[] args) {
        File file = new File("D://a.txt");
        File newFile = new File("D://b.txt");
        file.renameTo(newFile);


    }
}
