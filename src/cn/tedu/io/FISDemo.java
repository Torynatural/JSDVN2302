package cn.tedu.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FISDemo {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("./demo/fos.txt");
        /*读整数，顺序连续读取
        * 读到文件末尾返回-1
        *
        *
        * */
        int d = fis.read();
        System.out.println((char) d);
        System.out.println((char) fis.read());

        //重要！！！！！
        int data;
        while ((data = fis.read()) != -1){
            System.out.print((char) data);
        }
        fis.close();
    }

}
