/**   
* @Title: ExecutorsDemo.java 
* @Package cn.itcast_17 
* @Description: TODO(用一句话描述该文件做什么) 
* @author A18ccms A18ccms_gmail_com   
* @date 2017年8月24日 下午5:54:03 
* @version V1.0   
*/
package cn.itcast_17;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/** 
* @ClassName: ExecutorsDemo 
* @Description: TODO(这里用一句话描述这个类的作用) 
* @author A18ccms a18ccms_gmail_com 
* @date 2017年8月24日 下午5:54:03 
*  
*  线程池的好处：线程池里的每一个线程代码结束后，并不会死亡，而是再次回到线程池中成为空闲状态，等待下一个对象来使用。
*/
public class ExecutorsDemo {
	public static void main(String[] args) {
		//创建一个线程池对象，控制要创建几个线程对象。
		ExecutorService pool=Executors.newFixedThreadPool(2);
		
		//可执行Runnable对象或者Callable对象代表的线程
		pool.submit(new MyRunnable());
		pool.submit(new MyRunnable());
		
		//结束线程池
		pool.shutdown();
	}
	

}
