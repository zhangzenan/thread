/**   
* @Title: ThreadStop.java 
* @Package cn.itcast_04 
* @Description: TODO(��һ�仰�������ļ���ʲô) 
* @author A18ccms A18ccms_gmail_com   
* @date 2017��8��16�� ����4:54:54 
* @version V1.0   
*/
package cn.itcast_04;

import java.util.Date;

/** 
* @ClassName: ThreadStop 
* @Description: TODO(������һ�仰��������������) 
* @author A18ccms a18ccms_gmail_com 
* @date 2017��8��16�� ����4:54:54 
*  
*/
public class ThreadStop extends Thread {
	
	/* (non-Javadoc)
	 * @see java.lang.Thread#run()
	 */
	@Override
	public void run() {
		System.out.println("��ʼִ�У�"+new Date());
		
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("����ִ�У�"+new Date());
	}

}
