/**   
* @Title: MyRunnable.java 
* @Package cn.itcast_17 
* @Description: TODO(��һ�仰�������ļ���ʲô) 
* @author A18ccms A18ccms_gmail_com   
* @date 2017��8��24�� ����6:04:08 
* @version V1.0   
*/
package cn.itcast_17;

/** 
* @ClassName: MyRunnable 
* @Description: TODO(������һ�仰��������������) 
* @author A18ccms a18ccms_gmail_com 
* @date 2017��8��24�� ����6:04:08 
*  
*/
public class MyRunnable implements Runnable {

	
	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println(Thread.currentThread().getName()+":"+i);
		}

	}

}
