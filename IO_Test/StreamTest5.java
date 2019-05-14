package IO_Test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

//繼承關係下的序列化
public class StreamTest5 {
	
	public static void main(String[] args){
		TestC c = new TestC();
		try {
			ObjectOutputStream oout = 
					new ObjectOutputStream(new FileOutputStream("./testdir/test.dat"));
			oout.writeObject(c);
			oout.flush();
			oout.close();
		}catch(Exception e) {
			System.out.println("Ex1");
		}
		
		try {
			ObjectInputStream oin = 
					new ObjectInputStream(new FileInputStream("./testdir/test.dat"));
			TestC c2 = (TestC)oin.readObject();
			oin.close();
		}catch(Exception e) {
			System.out.println("Ex2");
		}
	}
}

// 子類別序列化 ，父類別不會序列化 ，故建構市仍會執行
class TestA{
		TestA(){
			System.out.println("TestA");
		}
}
class TestB extends TestA implements Serializable{
	TestB(){
		System.out.println("TestB");
	}
}
class TestC extends TestB {
	Brad b = new Brad();
	TestC(){
		System.out.println("TestC");
	}
}
//物件實體要序列化，本身也須實作序列化
class Brad implements Serializable{
	
}