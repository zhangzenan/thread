/**   
* @Title: ThreadPriorityDemo.java 
* @Package cn.itcast_04 
* @Description: TODO(��һ�仰�������ļ���ʲô) 
* @author A18ccms A18ccms_gmail_com   
* @date 2017��8��16�� ����11:10:41 
* @version V1.0   
*/
package cn.itcast_04;

/**
 * @ClassName: ThreadPriorityDemo
 * @Description: TODO(������һ�仰��������������)
 * @author A18ccms a18ccms_gmail_com
 * @date 2017��8��16�� ����11:10:41
 * 
 * ע�⣺
 * 		�߳�Ĭ�ϵ����ȼ���5.
 * 		�߳����ȼ��ķ�Χ�ǣ�1-10.
 * 		�߳����ȼ��߽�����ʾ�̻߳�ȡCPUʱ��Ƭ�ļ��ʸߣ�����Ҫ�ڴ����Ƚ϶࣬���߶�����е�ʱ����ܿ����ȽϺõĶ�Ч����
 */
public class ThreadPriorityDemo {
	public static void main(String[] args) {
		ThreadPriority tp1 = new ThreadPriority();
		ThreadPriority tp2 = new ThreadPriority();
		ThreadPriority tp3 = new ThreadPriority();
		
		tp1.setName("�߳�1");
		tp2.setName("�߳�2");
		tp3.setName("�߳�3");
		
		tp1.setPriority(10);
		tp2.setPriority(1);
		
		tp1.start();
		tp2.start();
		tp3.start();

	}

}
