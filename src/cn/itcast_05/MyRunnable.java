/**   
* @Title: MyRunnable.java 
* @Package cn.itcast_05 
* @Description: TODO(��һ�仰�������ļ���ʲô) 
* @author A18ccms A18ccms_gmail_com   
* @date 2017��8��16�� ����5:27:10 
* @version V1.0   
*/
package cn.itcast_05;

/**
 * @ClassName: MyRunnable
 * @Description: TODO(������һ�仰��������������)
 * @author A18ccms a18ccms_gmail_com
 * @date 2017��8��16�� ����5:27:10
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
			//����ʵ�ֽӿڵķ�ʽ�Ͳ���ֱ��ʹ��Thread��ķ��������ǿ��Լ��ʹ��
			System.out.println(Thread.currentThread().getName() + ":" + i);
		}

	}

}
