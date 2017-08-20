package cn.itcast_11; 
/** 
* @ClassName: SellTicketDemo 
* @Description: TODO(这里用一句话描述这个类的作用) 
* @author A18ccms a18ccms_gmail_com 
* @date 2017年8月19日 上午11:19:14 
* 
* A:同步代码块的锁对象是谁呢？
* 		任意对象
* B:同步方法的格式及锁对象问题】
* 	把同步关键字加在方法上
* 
* 	同步方法是谁呢？
* 		this
* C:静态方法及锁问题？
* 	静态方法的锁对象是谁呢？
* 		类的字节码文件对象。
*/
public class SellTicketDemo {
	public static void main(String[] args) {
		SellTicket st=new SellTicket();
		
		Thread t1=new Thread(st,"窗口1");
		Thread t2=new Thread(st,"窗口2");
		Thread t3=new Thread(st,"窗口3");
		
		//启动线程
		t1.start();
		t2.start();
		t3.start();
	}

}
 