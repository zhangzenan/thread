/**   
* @Title: ThreadJoinDemo.java 
* @Package cn.itcast_04 
* @Description: TODO(��һ�仰�������ļ���ʲô) 
* @author A18ccms A18ccms_gmail_com   
* @date 2017��8��16�� ����3:09:12 
* @version V1.0   
*/
package cn.itcast_04;

/** 
* @ClassName: ThreadJoinDemo 
* @Description: TODO(������һ�仰��������������) 
* @author A18ccms a18ccms_gmail_com 
* @date 2017��8��16�� ����3:09:12 
*  
*  join()����ĳЩ�߳�ִ����������̲߳���ִ��
*/
public class ThreadJoinDemo {
	
	public static void main(String[] args) {
		ThreadJoin tj1=new ThreadJoin();
		ThreadJoin tj2=new ThreadJoin();
		ThreadJoin tj3=new ThreadJoin();

		tj1.setName("�߳�1");
		tj2.setName("�߳�2");
		tj3.setName("�߳�3");
		
		tj1.start();
		try {
			tj1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		tj2.start();
		tj3.start();
		
	}
}
