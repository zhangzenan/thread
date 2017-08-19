/**   
* @Title: ThreadPriorityDemo.java 
* @Package cn.itcast_04 
* @Description: TODO(用一句话描述该文件做什么) 
* @author A18ccms A18ccms_gmail_com   
* @date 2017年8月16日 上午11:10:41 
* @version V1.0   
*/
package cn.itcast_04;

/**
 * @ClassName: ThreadPriorityDemo
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author A18ccms a18ccms_gmail_com
 * @date 2017年8月16日 上午11:10:41
 * 
 * 注意：
 * 		线程默认的优先级是5.
 * 		线程优先级的范围是：1-10.
 * 		线程优先级高仅仅表示线程获取CPU时间片的几率高，但是要在次数比较多，或者多次运行的时候才能看到比较好的额效果。
 */
public class ThreadPriorityDemo {
	public static void main(String[] args) {
		ThreadPriority tp1 = new ThreadPriority();
		ThreadPriority tp2 = new ThreadPriority();
		ThreadPriority tp3 = new ThreadPriority();
		
		tp1.setName("线程1");
		tp2.setName("线程2");
		tp3.setName("线程3");
		
		tp1.setPriority(10);
		tp2.setPriority(1);
		
		tp1.start();
		tp2.start();
		tp3.start();

	}

}
