package cn.itcast_11; 
/** 
* @ClassName: SellTicketDemo 
* @Description: TODO(������һ�仰��������������) 
* @author A18ccms a18ccms_gmail_com 
* @date 2017��8��19�� ����11:19:14 
* 
* A:ͬ����������������˭�أ�
* 		�������
* B:ͬ�������ĸ�ʽ�����������⡿
* 	��ͬ���ؼ��ּ��ڷ�����
* 
* 	ͬ��������˭�أ�
* 		this
* C:��̬�����������⣿
* 	��̬��������������˭�أ�
* 		����ֽ����ļ�����
*/
public class SellTicketDemo {
	public static void main(String[] args) {
		SellTicket st=new SellTicket();
		
		Thread t1=new Thread(st,"����1");
		Thread t2=new Thread(st,"����2");
		Thread t3=new Thread(st,"����3");
		
		//�����߳�
		t1.start();
		t2.start();
		t3.start();
	}

}
 