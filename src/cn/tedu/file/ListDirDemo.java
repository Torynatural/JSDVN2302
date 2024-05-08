package cn.tedu.file;

import java.io.File;

public class ListDirDemo {
    public static void main(String[] args) {
        File dir = new File("./demo");
        recursionDir(dir);
        //删除dir目录以及其中所有文件
        recursionDeleteDir(dir);
    }

    private static void recursionDeleteDir(File dir) {
        if(dir.isFile()){
            System.out.println("文件不支持递归");
            return;
        }else {
            File[] subs = dir.listFiles();
            for(int i = 0; i< subs.length; i++){
                if(subs[i].isFile()){
                    System.out.println("文件:" + subs[i]);
                    subs[i].delete();
                }else {
                    System.out.println("目录:" + subs[i]);
                    recursionDeleteDir(subs[i]);
                }
            }
            dir.delete();
            System.out.println("成功删除"+dir.getName()+"目录!");

        }
    }

    /**
     *
     * @param dir
     * */
    private static void recursionDir(File dir) {
        if(dir.isFile()){
            System.out.println("文件不支持递归");
            return;
        }else {
            File[] subs = dir.listFiles();
            for(int i = 0; i< subs.length; i++){
                if(subs[i].isFile()){
                    System.out.println("文件:" + subs[i]);
                }else {
                    System.out.println("目录:" + subs[i]);
                    recursionDir(subs[i]);
                }
            }
        }
    }

}
