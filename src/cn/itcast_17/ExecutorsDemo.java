/**   
* @Title: ExecutorsDemo.java 
* @Package cn.itcast_17 
* @Description: TODO(��һ�仰�������ļ���ʲô) 
* @author A18ccms A18ccms_gmail_com   
* @date 2017��8��24�� ����5:54:03 
* @version V1.0   
*/
package cn.itcast_17;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/** 
* @ClassName: ExecutorsDemo 
* @Description: TODO(������һ�仰��������������) 
* @author A18ccms a18ccms_gmail_com 
* @date 2017��8��24�� ����5:54:03 
*  
*  �̳߳صĺô����̳߳����ÿһ���̴߳�������󣬲����������������ٴλص��̳߳��г�Ϊ����״̬���ȴ���һ��������ʹ�á�
*/
public class ExecutorsDemo {
	public static void main(String[] args) {
		//����һ���̳߳ض��󣬿���Ҫ���������̶߳���
		ExecutorService pool=Executors.newFixedThreadPool(2);
		
		//��ִ��Runnable�������Callable���������߳�
		pool.submit(new MyRunnable());
		pool.submit(new MyRunnable());
		
		//�����̳߳�
		pool.shutdown();
	}
	

}
