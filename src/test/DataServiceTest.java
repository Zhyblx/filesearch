package test;

import converter.DataService;
import folder.ScanFile;

import java.io.File;

public class DataServiceTest {

    public static void main(String[] args) throws Exception {
        File file=new File("/Users/zhangyibin/Downloads/test/");
        String[] strTitle=DataService.getArray(ScanFile.getScanFilePath(file));
        for(String str:strTitle){
            System.out.println(str);
        }

    }


}
