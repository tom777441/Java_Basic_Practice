package IO_Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.xml.transform.Templates;

public class StreamTest {
	public static void main(String[] args) {
		try {
				FileInputStream fin = new FileInputStream("./testdir/file1");
				int temp;
				while((temp = fin.read()) != -1) {
					System.out.print((char)temp); //未轉char會以ASCII CODE方式呈現
				}
				fin.close();
		}catch(FileNotFoundException e){
				System.out.println("FileNotFound Exception");
		}catch(IOException e){
				System.out.println("File I/O Exception");
		}
		byte[] b = "Test1".getBytes();
		try {
				//boolean決定是否保留源字串
				FileOutputStream fout = new FileOutputStream("./testdir/file2",false);
				
				//若已存在，則覆蓋
				fout.write(b);		
						
				fout.flush(); //把緩衝區的資料送出	
				fout.close();
		}catch(FileNotFoundException e) {
		}catch(IOException e) {
		}
		
	}
}
