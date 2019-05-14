package Thread_Practice;

//Runnable
public class Thread2 {
	public static void main(String[] args) {
		MyTest2 t1 = new MyTest2("C");
		MyTest2 t2 = new MyTest2("D");
		
		Thread t3 = new Thread(t1);
		Thread t4 = new Thread(t2);
		t3.start();
		t4.start();
		
		//t4.destroy(); 官方不建議使用
		//t4.stop();	官方不建議使用

		
		t4.interrupt(); //產生InterruptedException
	}
}

class MyTest2 implements Runnable{
	private String name;
	MyTest2(String name){this.name = name;}
	@Override
	public void run() {
		for(int i=0;i<20;i++) {
			System.out.println(name+":"+i);
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				break;
			}
		}
	}
}