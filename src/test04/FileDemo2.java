package test04;

import java.io.File;
import java.io.FilenameFilter;

/**
 * 使用FileFilter来实现获取指定后缀名的文件对象
 */
public class FileDemo2 {
    public static void main(String[] args) {
        File file=new File("D://");
        File[] files = file.listFiles(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {

                return new File(dir,name).isFile()&&name.endsWith("");
            }
        });

        for (File f:files){
            System.out.println(f.getName());
        }
    }
}
