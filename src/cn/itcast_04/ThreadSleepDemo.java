/**   
* @Title: ThreadSleepDemo.java 
* @Package cn.itcast_04 
* @Description: TODO(用一句话描述该文件做什么) 
* @author A18ccms A18ccms_gmail_com   
* @date 2017年8月16日 下午2:57:02 
* @version V1.0   
*/
package cn.itcast_04;

/** 
* @ClassName: ThreadSleepDemo 
* @Description: TODO(这里用一句话描述这个类的作用) 
* @author A18ccms a18ccms_gmail_com 
* @date 2017年8月16日 下午2:57:02 
*  
*/
public class ThreadSleepDemo {
	public static void main(String[] args) {
		ThreadSleep ts1=new ThreadSleep();
		ThreadSleep ts2=new ThreadSleep();
		ThreadSleep ts3=new ThreadSleep();
		
		ts1.setName("线程1");
		ts2.setName("线程2");
		ts3.setName("线程3");
		
		ts1.start();
		ts2.start();
		ts3.start();
	}

}
