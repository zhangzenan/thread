/**   
* @Title: MyThreadDemo.java 
* @Package cn.itcast_02 
* @Description: TODO(��һ�仰�������ļ���ʲô) 
* @author A18ccms A18ccms_gmail_com   
* @date 2017��8��15�� ����5:21:41 
* @version V1.0   
*/
package cn.itcast_02;

/** 
* @ClassName: MyThreadDemo 
* @Description: TODO(������һ�仰��������������) 
* @author A18ccms a18ccms_gmail_com 
* @date 2017��8��15�� ����5:21:41 
*  
*/
public class MyThreadDemo {

	public static void main(String[] args) {
		//�޲ι��췽�����߳���������
	/*	MyThread my1=new MyThread();
		MyThread my2=new MyThread();
		
		//���÷�����������
		my1.setName("�߳�1");
		my2.setName("�߳�2");
		
		my1.start();
		my2.start();*/
		
		//���ι��췽�����߳���������
	/*	MyThread my1=new MyThread("�߳�1");
		MyThread my2=new MyThread("�߳�2");
		my1.start();
		my2.start();*/
		
		//��ȡmain�������ڵ��߳�����
		System.out.println(Thread.currentThread().getName());
		
	}

}
