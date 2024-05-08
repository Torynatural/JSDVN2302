package cn.tedu.file;

import java.io.File;
import java.io.IOException;

public class DeleteNewFileDemo {
    public static void main(String[] args) throws IOException {
        //idea默认加"./"
        File file = new File("./demo/new.txt");
        if (file.exists()){
            file.delete();
            System.out.println("文件删除成功！");
        }else {
            System.out.println("文件不存在！");
        }
    }
}
