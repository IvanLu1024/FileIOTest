package serializable;

import java.io.*;

public class TestDemo {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        A a1=new A(123,"abc");
        String objectFile="a1";

        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(objectFile));
        objectOutputStream.writeObject(a1);
        objectOutputStream.close();

        ObjectInputStream objectInputStream=new ObjectInputStream(new FileInputStream(objectFile));
        A a2 = (A) objectInputStream.readObject();
        objectInputStream.close();
        System.out.println(a2);


    }

    /**
     * 序列化的类需要实现 Serializable 接口，
     * 它只是一个标准，没有任何方法需要实现，
     * 但是如果不去实现它的话而进行序列化，会抛出异常。
     */
    private static class A implements Serializable{
        private int x;

        private String y;

        public A(int x, String y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public String toString() {
            return "A{" +
                    "x=" + x +
                    ", y='" + y + '\'' +
                    '}';
        }
    }
}
