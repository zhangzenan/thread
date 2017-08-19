/**   
* @Title: MyThread.java 
* @Package cn.itcast_02 
* @Description: TODO(用一句话描述该文件做什么) 
* @author A18ccms A18ccms_gmail_com   
* @date 2017年8月15日 下午5:22:13 
* @version V1.0   
*/
package cn.itcast_02;

/**
 * @ClassName: MyThread
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author A18ccms a18ccms_gmail_com
 * @date 2017年8月15日 下午5:22:13
 * 
 */
public class MyThread extends Thread {
	
	public MyThread(){
		
	}
	
	public MyThread(String name){
		super(name);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Thread#run()
	 */
	@Override
	public void run() {
		for (int i = 0; i < 3000; i++) {
			System.out.println(getName() + ":" + i);
		}
	}

}
