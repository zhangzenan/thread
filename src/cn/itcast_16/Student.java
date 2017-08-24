/**   
* @Title: Student.java 
* @Package cn.itcast_16 
* @Description: TODO(��һ�仰�������ļ���ʲô) 
* @author A18ccms A18ccms_gmail_com   
* @date 2017��8��24�� ����5:32:39 
* @version V1.0   
*/
package cn.itcast_16;

/** 
* @ClassName: Student 
* @Description: TODO(������һ�仰��������������) 
* @author A18ccms a18ccms_gmail_com 
* @date 2017��8��24�� ����5:32:39 
*  
*/
public class Student {
	private String name;
	private int age;
	private boolean flag;
	
	public synchronized void set(String name,int age){
		//��������ݣ��͵ȴ�
		if(this.flag){
			try {
				this.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		//��������
		this.name=name;
		this.age=age;
		
		//�޸ı��
		this.flag=true;
		this.notify();
	}
	
	public synchronized void get(){
		//���û�����ݾ͵ȴ�
		if(!this.flag){
			try {
				this.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println(this.name+"-----"+this.age);	
		
		//�޸ı��
		this.flag=false;
		//�����߳�
		this.notify();
	}

}
