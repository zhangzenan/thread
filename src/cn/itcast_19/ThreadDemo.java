package cn.itcast_19; 
/** 
* @ClassName: ThreadDemo 
* @Description: TODO(这里用一句话描述这个类的作用) 
* @author A18ccms a18ccms_gmail_com 
* @date 2017年8月26日 下午5:16:25 
*/
public class ThreadDemo {
	public static void main(String[] args) {
		//继承Thread类来实现多线程
		new Thread(){
			public void run(){
				for (int i = 0; i < 100; i++) {
					System.out.println(Thread.currentThread().getName()+":"+i);
				}
			}
		}.start();
		
		//实现Runnable接口来实现多线程
		new Thread(new Runnable(){
			@Override
			public void run() {
				for (int i = 0; i < 100; i++) {
					System.out.println(Thread.currentThread().getName()+":"+i);
				}				
			}
			
		}){}.start();
		
		//更有难度的
		new Thread(new Runnable(){
			@Override
			public void run() {
				for (int i = 0; i < 100; i++) {
					System.out.println("hello"+":"+i);
				}				
			}
			
		}){
			//走的是这个线程
			public void run() {
				for (int i = 0; i < 100; i++) {
					System.out.println("world"+":"+i);
				}				
			}
		}.start();
	}

}
 