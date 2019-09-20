package com.ls.Test.packages.p4;
public class Test9 extends Thread {
	public static void main(String[] args) throws InterruptedException {
		/*new Thread(()-> {
				for (int i = 0; i < 100; i++) {
						System.out.println(currentThread().getName()+"-->"+i);
			}
		},"我的线程").start();;
	
		t1.start();
		Thread t2 = new Thread(new Runnable() {
			boolean running = true;
			@Override
			public void run() {
				// TODO Auto-generated method stub
				for (int i = 0; i < 300; i++) {
						System.out.println(currentThread().getName()+"-->"+i);
				}
				running = false;
			}
		},"t2");
		t2.start();
		TestRunnable tr  = new TestRunnable();
		new Thread(tr,"t1").start();
		TestThread tt = new TestThread();
		tt.setName("t2");
		tt.start();
		for (int i = 0; i < 100; i++) {
			System.out.println(currentThread().getName()+"-->"+i);
		}
		tr.runing = false;
		tt.runing = false;*/
		
		 TestRunnable tt = new TestRunnable();
		 Thread t = new Thread(tt,"测试线程");
		 t.setDaemon(true);
		 t.start();
		 for (int i = 0; i < 100; i++) {
			 System.out.println(Thread.currentThread().getName()+"->"+i);
		 }
		
	
	}
	
}
class TestThread extends Thread{
	boolean runing = true;
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0;runing &&i < 300; i++) {
			System.out.println(Thread.currentThread().getName()+"-->"+i);
	}
		runing = false;
	}
}
class TestRunnable implements Runnable{
	boolean runing = true;
	@Override
	public void run() {
		while (runing) {
			for (int i = 0;runing &&i < 300; i++) {
				System.out.println(Thread.currentThread().getName()+"-->"+i);
			}	
		}
	}
	public void zhongzhi() {
		this.runing = false;
	}
	
}