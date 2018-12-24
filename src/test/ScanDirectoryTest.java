package test;

import java.io.File;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

import folder.ScanDirectory;

public class ScanDirectoryTest {


    public static void main(String[] args){
        try{
            System.out.println("开始扫描……");
            File file=new File("/Users/zhangyibin/Downloads/test");
            List<String> list=new ArrayList<String>();
            list.addAll(ScanDirectory.getScanDirectory(file,0));
            Iterator<String> iterator=list.iterator();
            while (iterator.hasNext()){
                String str=iterator.next();
                System.out.println(str);

            }
            System.out.println("结束扫描……");

        }catch (Exception e){
            e.printStackTrace();
        }
    }

}
