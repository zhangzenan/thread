package cn.itcast_20;

import java.util.Timer;
import java.util.TimerTask;

/** 
* @ClassName: TimerDemo 
* @Description: TODO(������һ�仰��������������) 
* @author A18ccms a18ccms_gmail_com 
* @date 2017��8��26�� ����5:44:39 
*/
public class TimerDemo {
	public static void main(String[] args) {
		//������ʱ������
		Timer t=new Timer();
		//3���ִ�б�ը����
		//t.schedule(new MyTask(), 3000);
		//��������
		t.schedule(new MyTask(t), 3000);
	}

}

//��һ������
class MyTask extends TimerTask{
	private Timer t;
	public MyTask(){}
	
	public MyTask(Timer t){
		this.t=t;
	}

	@Override
	public void run() {
		System.out.println("�ģ���ը��");
		t.cancel();
		
	}
	
}
 