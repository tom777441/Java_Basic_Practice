package IO_Test;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;

public class StreamTest2 {
	public static void main(String[] args) {
		try {
			//FileInputStream fin = new FileInputStream("./testdir/file1");
			FileReader fin = new FileReader("./testdir/file1");
			BufferedReader bin = new BufferedReader(fin);
			//BufferedInputStream bin = new BufferedInputStream(fin);
			int temp;
			String line;
			while((line = bin.readLine()) != null) {
				System.out.println(line);
			}
			/*while((temp = bin.read()) != -1) {
				//以byte方式讀入 用中文會產生亂碼
				System.out.print((char)temp);
			}*/
			
			//bin.close();
			fin.close();
			
		}catch(Exception e) {
			System.out.println("Exception");
		}
			
	}
}	
