package test;

import folder.ScanFile;

import java.io.File;

public class ScanFileTest {
    public static void main(String[] args){
        try {
            File file=new File("/Users/zhangyibin/Downloads/test/");
            System.out.println(ScanFile.getScanFilePath(file));
            System.out.println(ScanFile.getScanFileName(file));
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
