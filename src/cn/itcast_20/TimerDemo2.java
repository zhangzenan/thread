package cn.itcast_20;

import java.util.Timer;
import java.util.TimerTask;

/** 
* @ClassName: TimerDemo 
* @Description: TODO(������һ�仰��������������) 
* @author A18ccms a18ccms_gmail_com 
* @date 2017��8��26�� ����5:44:39 
*/
public class TimerDemo2 {
	public static void main(String[] args) {
		//������ʱ������
		Timer t=new Timer();
		
		//3���ִ�б�ը��һ�Σ�ÿ��2��ִ��һ��
		t.schedule(new MyTask2(), 3000,2000);
	}

}

//��һ������
class MyTask2 extends TimerTask{

	@Override
	public void run() {
		System.out.println("�ģ���ը��");
		
	}
	
}
 