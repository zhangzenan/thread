/**   
* @Title: MyThread.java 
* @Package cn.itcast_02 
* @Description: TODO(��һ�仰�������ļ���ʲô) 
* @author A18ccms A18ccms_gmail_com   
* @date 2017��8��15�� ����5:22:13 
* @version V1.0   
*/
package cn.itcast_02;

/**
 * @ClassName: MyThread
 * @Description: TODO(������һ�仰��������������)
 * @author A18ccms a18ccms_gmail_com
 * @date 2017��8��15�� ����5:22:13
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
