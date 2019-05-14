package Thread_Practice;

//Thread
public class Thread1 {
	public static void main(String[] args) {
		MyThread1 t1 = new MyThread1("A");
		MyThread1 t2 = new MyThread1("B");
		t1.start();
		t2.start();
		
	} 	
}

//
class MyThread1 extends Thread{
	private String name;
	MyThread1(String name){this.name = name;}
	@Override
	public void run() {
		for(int i=0;i<20;i++) {
			System.out.println(name+":"+i);
			try {
				Thread.sleep(200); //大於或等於0.2秒
			} catch (InterruptedException e) {
			}
		}
	}
}