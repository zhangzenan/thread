/**   
* @Title: ThreadSleepDemo.java 
* @Package cn.itcast_04 
* @Description: TODO(��һ�仰�������ļ���ʲô) 
* @author A18ccms A18ccms_gmail_com   
* @date 2017��8��16�� ����2:57:02 
* @version V1.0   
*/
package cn.itcast_04;

/** 
* @ClassName: ThreadSleepDemo 
* @Description: TODO(������һ�仰��������������) 
* @author A18ccms a18ccms_gmail_com 
* @date 2017��8��16�� ����2:57:02 
*  
*/
public class ThreadSleepDemo {
	public static void main(String[] args) {
		ThreadSleep ts1=new ThreadSleep();
		ThreadSleep ts2=new ThreadSleep();
		ThreadSleep ts3=new ThreadSleep();
		
		ts1.setName("�߳�1");
		ts2.setName("�߳�2");
		ts3.setName("�߳�3");
		
		ts1.start();
		ts2.start();
		ts3.start();
	}

}
