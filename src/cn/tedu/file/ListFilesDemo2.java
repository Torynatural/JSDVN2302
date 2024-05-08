package cn.tedu.file;

import java.io.File;
import java.io.FileFilter;

public class ListFilesDemo2 {
    public static void main(String[] args) {
        File dir = new File(".");
        FileFilter fileFilter = new FileFilter() {
            /**
             * @param file 默认的，表示过滤一个文件
             * @return 布尔值，如果返回true ,表示当前过滤文件
             *
             */
            @Override
            public boolean accept(File file) {
                String filename = file.getName();
                return filename.contains("o");
            }
        };
        File[] subs = dir.listFiles(fileFilter);
        for (int i = 0; i < subs.length; i++) {
            System.out.println(subs[i].getName());
        }
                
    }
}
