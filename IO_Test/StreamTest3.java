package IO_Test;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class StreamTest3 {

	public static void main(String[] args) {
		
		int a = 10;
		byte b = 3;
		boolean c = true;
		
		try {
			FileOutputStream fout = new FileOutputStream("./testdir/file3");
			DataOutputStream dout = new DataOutputStream(fout);
			dout.writeInt(a);
			dout.writeByte(b);
			dout.writeBoolean(c);
		
			fout.flush();
			fout.close();
			System.out.println("OK");
		}catch(Exception ee) {
			System.out.println("Exception");
		}
		
		
		try {
			FileInputStream fin = new FileInputStream("./testdir/file3");
			DataInputStream din = new DataInputStream(fin);
			
			int d = din.readInt();
			byte e = din.readByte();
			boolean f = din.readBoolean();
			System.out.println(d);
			System.out.println(e);
			System.out.println(f);
		
			fin.close();
			System.out.println("OK");
		}catch(Exception ee) {
			System.out.println("Exception");
		}
	}
}
