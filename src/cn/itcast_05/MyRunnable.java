/**   
* @Title: MyRunnable.java 
* @Package cn.itcast_05 
* @Description: TODO(用一句话描述该文件做什么) 
* @author A18ccms A18ccms_gmail_com   
* @date 2017年8月16日 下午5:27:10 
* @version V1.0   
*/
package cn.itcast_05;

/**
 * @ClassName: MyRunnable
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author A18ccms a18ccms_gmail_com
 * @date 2017年8月16日 下午5:27:10
 * 
 */
public class MyRunnable implements Runnable {

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Runnable#run()
	 */
	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			//由于实现接口的方式就不能直接使用Thread类的方法，但是可以间接使用
			System.out.println(Thread.currentThread().getName() + ":" + i);
		}

	}

}
