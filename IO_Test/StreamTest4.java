package IO_Test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class StreamTest4 {
	
	public static void main(String[] args) {
		Student s1 = new Student(90,80,70);
		Student s3 = new Student(60,50,40);
		System.out.println(s1.getAvg());
		
		try {
			ObjectOutputStream oout = 
					new ObjectOutputStream( new FileOutputStream("./testdir/Student.dat"));
			
			oout.writeObject(s1);
			oout.writeObject(s3);
			oout.flush();
			oout.close();
			System.out.println("OK 1");
		}catch(Exception e) {
			System.out.println("Exception 1");
		}
		
		try {
			ObjectInputStream oin = 
					new ObjectInputStream( new FileInputStream("./testdir/Student.dat"));
			Student s2 = (Student)oin.readObject();
			Student s4 = (Student)oin.readObject();
			
			System.out.println(s2.getAvg());
			System.out.println(s4.getAvg());
			oin.close();
			System.out.println("OK 2");
		}catch(Exception e) {
			System.out.println("Exception 2");
		}
	}
}

//實作序列化
class Student implements Serializable{
	int Chinese;
	int English; //transient int English 此時English非序列化
	int Math;
	Student(int c, int e, int m){Chinese = c; English = e;Math = m;}
	int getScore() {return Chinese + English + Math;}
	double getAvg() {return getScore()/3.0;}
}