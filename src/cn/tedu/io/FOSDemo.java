package cn.tedu.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FOSDemo {
    public static void main(String[] args) throws IOException {
        File file = new File("./demo/fos.txt");
        FileOutputStream fos = new FileOutputStream(file);
        fos = new FileOutputStream("./demo/fos.txt");
        new FileOutputStream("./demo/fos.txt",true);
        fos.write(97);
        fos.write(98);
        fos.write(99);
        fos.write(100);
        fos.write(13);
        fos.write(10);
        fos.write("Hello JSDVN12302!\r\n".getBytes());
        fos.write("ABCDEFG\r\nHJK".getBytes(),5,5);
        fos.close();
    }
}
