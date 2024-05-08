package cn.tedu.lambda;

import java.io.File;
import java.io.FileFilter;

public class LambdaDemo {
    /*
    * 匿名内部类
    * 接口函数只有一个方法
    * 函数标签
    *
    *
    *
    * */
    public static void main(String[] args) {
        //不使用lambda表达式
        FileFilter f1 = new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                return pathname.getName().contains("11");
            }
        };

        FileFilter f2 = (File file1) -> {
            return file1.getName().contains("22");
        };

        FileFilter f3 = (file1) -> {
            return file1.getName().contains("22");
        };

        FileFilter f4 = file1 -> {
            return file1.getName().contains("22");
        };

        FileFilter f5 = file1 -> file1.getName().contains("22");

        File dir = new File(".");
        File[] subs = dir.listFiles(file -> file.getName().contains("m"));
        for (int i = 0; i < subs.length; i++) {
            System.out.println(subs[i].getName());
        }
    }
}
