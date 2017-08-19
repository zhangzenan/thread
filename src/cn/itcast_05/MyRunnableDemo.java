/**   
* @Title: MyRunnableDemo.java 
* @Package cn.itcast_05 
* @Description: TODO(用一句话描述该文件做什么) 
* @author A18ccms A18ccms_gmail_com   
* @date 2017年8月16日 下午5:32:50 
* @version V1.0   
*/
package cn.itcast_05;

/**
 * @ClassName: MyRunnableDemo
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author A18ccms a18ccms_gmail_com
 * @date 2017年8月16日 下午5:32:50
 * 
 */
public class MyRunnableDemo {
	public static void main(String[] args) {
		// 创建MyRunnable类的对象
		MyRunnable my = new MyRunnable();

		// 创建Thread类的对象，并把上面创建的对象作为构造参数传递
		/*Thread t1 = new Thread(my);
		Thread t2 = new Thread(my);

		t1.setName("线程1");
		t2.setName("线程2");*/
		
		Thread t1 = new Thread(my,"线程1");
		Thread t2 = new Thread(my,"线程2");	
		
		t1.start();
		t2.start();
	}

}
