package cn.itcast_20;

import java.util.Timer;
import java.util.TimerTask;

/** 
* @ClassName: TimerDemo 
* @Description: TODO(这里用一句话描述这个类的作用) 
* @author A18ccms a18ccms_gmail_com 
* @date 2017年8月26日 下午5:44:39 
*/
public class TimerDemo2 {
	public static void main(String[] args) {
		//创建定时器对象
		Timer t=new Timer();
		
		//3秒后执行爆炸第一次，每隔2秒执行一次
		t.schedule(new MyTask2(), 3000,2000);
	}

}

//做一个任务
class MyTask2 extends TimerTask{

	@Override
	public void run() {
		System.out.println("蹦，爆炸了");
		
	}
	
}
 