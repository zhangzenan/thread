/**   
* @Title: ThreadStop.java 
* @Package cn.itcast_04 
* @Description: TODO(用一句话描述该文件做什么) 
* @author A18ccms A18ccms_gmail_com   
* @date 2017年8月16日 下午4:54:54 
* @version V1.0   
*/
package cn.itcast_04;

import java.util.Date;

/** 
* @ClassName: ThreadStop 
* @Description: TODO(这里用一句话描述这个类的作用) 
* @author A18ccms a18ccms_gmail_com 
* @date 2017年8月16日 下午4:54:54 
*  
*/
public class ThreadStop extends Thread {
	
	/* (non-Javadoc)
	 * @see java.lang.Thread#run()
	 */
	@Override
	public void run() {
		System.out.println("开始执行："+new Date());
		
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("结束执行："+new Date());
	}

}
