/**   
* @Title: StudentDemo.java 
* @Package cn.itcast_13 
* @Description: TODO(��һ�仰�������ļ���ʲô) 
* @author A18ccms A18ccms_gmail_com   
* @date 2017��8��21�� ����4:33:14 
* @version V1.0   
*/
package cn.itcast_16;

/**
 * @ClassName: StudentDemo
 * @Description: TODO(������һ�仰��������������)
 * @author A18ccms a18ccms_gmail_com
 * @date 2017��8��21�� ����4:33:14
 * 
 */
public class StudentDemo {
	public static void main(String[] args) {
		// ������Դ
		Student s = new Student();

		// ���û��ȡ����
		SetThread st = new SetThread(s);
		GetThread gt = new GetThread(s);

		// �߳���
		Thread t1 = new Thread(st);
		Thread t2 = new Thread(gt);

		// �����߳�		
		t1.start();
		t2.start();
		
	}

}
