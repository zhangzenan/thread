package lock.cn.itcast_01; 
/** 
* @ClassName: SellTicketDemo 
* @Description: TODO(这里用一句话描述这个类的作用) 
* @author A18ccms a18ccms_gmail_com 
* @date 2017年8月19日 上午11:19:14 
* 

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
 