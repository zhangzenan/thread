/**   
* @Title: MyRunnable.java 
* @Package cn.itcast_15 
* @Description: TODO(��һ�仰�������ļ���ʲô) 
* @author A18ccms A18ccms_gmail_com   
* @date 2017��8��24�� ����3:13:47 
* @version V1.0   
*/
package cn.itcast_15;

/** 
* @ClassName: MyRunnable 
* @Description: TODO(������һ�仰��������������) 
* @author A18ccms a18ccms_gmail_com 
* @date 2017��8��24�� ����3:13:47 
*  
*/
public class MyRunnable implements Runnable {

	/* (non-Javadoc)
	 * @see java.lang.Runnable#run()
	 */
	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println(Thread.currentThread().getName()+":"+i);
		}
		
	}

}
