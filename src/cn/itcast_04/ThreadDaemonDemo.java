/**   
* @Title: ThreadDaemonDemo.java 
* @Package cn.itcast_04 
* @Description: TODO(��һ�仰�������ļ���ʲô) 
* @author A18ccms A18ccms_gmail_com   
* @date 2017��8��16�� ����4:29:56 
* @version V1.0   
*/
package cn.itcast_04;

/** 
* @ClassName: ThreadDaemonDemo 
* @Description: TODO(������һ�仰��������������) 
* @author A18ccms a18ccms_gmail_com 
* @date 2017��8��16�� ����4:29:56 
*  
*/
public class ThreadDaemonDemo {
	public static void main(String[] args) {
		ThreadDaemon td1=new ThreadDaemon();
		ThreadDaemon td2=new ThreadDaemon();
		
		td1.setName("�߳�1");
		td2.setName("�߳�2");
		
		td1.setDaemon(true);
		td2.setDaemon(true);
		
		td1.start();
		td2.start();
		
		Thread.currentThread().setName("���߳�");
		
		for (int i = 0; i < 5; i++) {
			System.out.println(Thread.currentThread().getName()+":"+i);
		}
	}

}
