package cn.tedu.file;

import java.io.File;

public class MKDirDemo {
    public static void main(String[] args) {
        File dir = new File("./demo/a/b/lo/d/o/k/oo");
        if(dir.exists()){
            System.out.println("该目录已存在");
        }else {
            dir.mkdirs();
            //mkdirs();
            System.out.println("目录制作完毕！");
        }
    }
}
