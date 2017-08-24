/**   
* @Title: ThreadGroupDemo.java 
* @Package cn.itcast_15 
* @Description: TODO(��һ�仰�������ļ���ʲô) 
* @author A18ccms A18ccms_gmail_com   
* @date 2017��8��24�� ����3:15:40 
* @version V1.0   
*/
package cn.itcast_15;

/**
 * @ClassName: ThreadGroupDemo
 * @Description: TODO(������һ�仰��������������)
 * @author A18ccms a18ccms_gmail_com
 * @date 2017��8��24�� ����3:15:40
 * 
 */
public class ThreadGroupDemo {
	public static void main(String[] args) {		
		//method1();
		method2();	
	}
	
	private static void method2() {
		ThreadGroup tg=new ThreadGroup("����һ���µ��߳���");
		
		MyRunnable my = new MyRunnable();
		Thread t1 = new Thread(tg,my, "�߳�1");
		Thread t2 = new Thread(tg,my, "�߳�2");
		
		System.out.println(t1.getThreadGroup().getName());
		System.out.println(t2.getThreadGroup().getName());
		
	}


	private static void method1() {
		MyRunnable my = new MyRunnable();
		Thread t1 = new Thread(my, "�߳�1");
		Thread t2 = new Thread(my, "�߳�2");

		ThreadGroup tg1 = t1.getThreadGroup();
		ThreadGroup tg2 = t2.getThreadGroup();

		String name1 = tg1.getName();
		String name2 = tg2.getName();

		System.out.println(name1);
		System.out.println(name2);

		//ͨ���������֪�����߳�Ĭ�����������main�߳���
		System.out.println(Thread.currentThread().getThreadGroup().getName());
		
	}
	
	

}
