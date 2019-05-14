package IO_Test;

import java.io.File;
import java.io.IOException;

public class MyDir {
	public static void main(String[]args) {
		File testdir = new File("./testdir");
		if(!testdir.exists())testdir.mkdirs(); //mkdirs()如果父目錄不存在會一併建立 ，mkdir()則不建立
		File testfile1 =  new File(testdir, "file2");
		if(!testfile1.exists()) {
			try {
				testfile1.createNewFile();
				System.out.println("Create OK");
			}catch(IOException e) {
				System.out.println("Failed");
			}
		}
	}
}
