/**   
* @Title: MyRunnableDemo.java 
* @Package cn.itcast_05 
* @Description: TODO(��һ�仰�������ļ���ʲô) 
* @author A18ccms A18ccms_gmail_com   
* @date 2017��8��16�� ����5:32:50 
* @version V1.0   
*/
package cn.itcast_05;

/**
 * @ClassName: MyRunnableDemo
 * @Description: TODO(������һ�仰��������������)
 * @author A18ccms a18ccms_gmail_com
 * @date 2017��8��16�� ����5:32:50
 * 
 */
public class MyRunnableDemo {
	public static void main(String[] args) {
		// ����MyRunnable��Ķ���
		MyRunnable my = new MyRunnable();

		// ����Thread��Ķ��󣬲������洴���Ķ�����Ϊ�����������
		/*Thread t1 = new Thread(my);
		Thread t2 = new Thread(my);

		t1.setName("�߳�1");
		t2.setName("�߳�2");*/
		
		Thread t1 = new Thread(my,"�߳�1");
		Thread t2 = new Thread(my,"�߳�2");	
		
		t1.start();
		t2.start();
	}

}
