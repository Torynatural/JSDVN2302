package cn.tedu.file;


import java.io.File;

public class FileDemo {
    public static void main(String[] args) {
        File file = new File("D:\\programming\\JSDVN\\JSDVN2302\\src\\demo\\demo.txt");
        File file1 = new File("./demo/demo.txt");
        String name = file.getName();
        System.out.println(name);
        long length = file.length();
        System.out.println(length);
    }
}
