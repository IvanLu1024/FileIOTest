package network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.URL;

public class UrlDemo {
    public static void main(String[] args) throws IOException {

        URL url = new URL("http:www.github.com");



        //字节流
        InputStream in = url.openStream();
        //字符流
        InputStreamReader reader = new InputStreamReader(in, "utf-8");
        //带有缓存的字符流
        BufferedReader bufferedReader = new BufferedReader(reader);

        String line;
        while ((line=bufferedReader.readLine())!=null){
            System.out.println(line);
        }
        bufferedReader.close();


    }
}
