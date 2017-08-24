/**   
* @Title: MyRunnable.java 
* @Package cn.itcast_17 
* @Description: TODO(用一句话描述该文件做什么) 
* @author A18ccms A18ccms_gmail_com   
* @date 2017年8月24日 下午6:04:08 
* @version V1.0   
*/
package cn.itcast_17;

/** 
* @ClassName: MyRunnable 
* @Description: TODO(这里用一句话描述这个类的作用) 
* @author A18ccms a18ccms_gmail_com 
* @date 2017年8月24日 下午6:04:08 
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
