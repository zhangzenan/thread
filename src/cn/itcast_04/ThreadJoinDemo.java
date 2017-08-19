/**   
* @Title: ThreadJoinDemo.java 
* @Package cn.itcast_04 
* @Description: TODO(用一句话描述该文件做什么) 
* @author A18ccms A18ccms_gmail_com   
* @date 2017年8月16日 下午3:09:12 
* @version V1.0   
*/
package cn.itcast_04;

/** 
* @ClassName: ThreadJoinDemo 
* @Description: TODO(这里用一句话描述这个类的作用) 
* @author A18ccms a18ccms_gmail_com 
* @date 2017年8月16日 下午3:09:12 
*  
*  join()是让某些线程执行完毕其他线程才能执行
*/
public class ThreadJoinDemo {
	
	public static void main(String[] args) {
		ThreadJoin tj1=new ThreadJoin();
		ThreadJoin tj2=new ThreadJoin();
		ThreadJoin tj3=new ThreadJoin();

		tj1.setName("线程1");
		tj2.setName("线程2");
		tj3.setName("线程3");
		
		tj1.start();
		try {
			tj1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		tj2.start();
		tj3.start();
		
	}
}
