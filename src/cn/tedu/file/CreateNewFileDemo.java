package cn.tedu.file;

import java.io.File;
import java.io.IOException;

public class CreateNewFileDemo {
    public static void main(String[] args) throws IOException {
        //idea默认加"./"
        File file = new File("./demo/new.txt");
        if (file.exists()){
            System.out.println("文件已存在！");
        }else {
            file.createNewFile();
            System.out.println("该文件创建完毕！");
        }
    }
}
