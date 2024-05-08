package cn.tedu.file;

import java.io.File;

public class ListFilesDemo {
    public static void main(String[] args) {
        File dir = new File("./demo");
        if(dir.isDirectory()){
            File[] subs = dir.listFiles();
            System.out.println(subs.length);
            for (int i = 0; i < subs.length; i++) {
                System.out.println(subs[i].getName());
            }
        }else {
            System.out.println("是文件！！！");
        }
    }
}
