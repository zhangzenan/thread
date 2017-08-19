/**   
* @Title: ThreadDaemonDemo.java 
* @Package cn.itcast_04 
* @Description: TODO(用一句话描述该文件做什么) 
* @author A18ccms A18ccms_gmail_com   
* @date 2017年8月16日 下午4:29:56 
* @version V1.0   
*/
package cn.itcast_04;

/** 
* @ClassName: ThreadDaemonDemo 
* @Description: TODO(这里用一句话描述这个类的作用) 
* @author A18ccms a18ccms_gmail_com 
* @date 2017年8月16日 下午4:29:56 
*  
*/
public class ThreadDaemonDemo {
	public static void main(String[] args) {
		ThreadDaemon td1=new ThreadDaemon();
		ThreadDaemon td2=new ThreadDaemon();
		
		td1.setName("线程1");
		td2.setName("线程2");
		
		td1.setDaemon(true);
		td2.setDaemon(true);
		
		td1.start();
		td2.start();
		
		Thread.currentThread().setName("主线程");
		
		for (int i = 0; i < 5; i++) {
			System.out.println(Thread.currentThread().getName()+":"+i);
		}
	}

}
