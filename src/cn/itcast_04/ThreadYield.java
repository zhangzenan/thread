/**   
* @Title: ThreadYield.java 
* @Package cn.itcast_04 
* @Description: TODO(��һ�仰�������ļ���ʲô) 
* @author A18ccms A18ccms_gmail_com   
* @date 2017��8��16�� ����3:29:31 
* @version V1.0   
*/
package cn.itcast_04;

import java.util.Date;

/** 
* @ClassName: ThreadYield 
* @Description: TODO(������һ�仰��������������) 
* @author A18ccms a18ccms_gmail_com 
* @date 2017��8��16�� ����3:29:31 
*  
*/
public class ThreadYield extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println(getName()+":"+i+",����:"+new Date());		
			Thread.yield();		
		}
	}

}
