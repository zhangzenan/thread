package cn.itcast_18;

import java.util.concurrent.Callable;

/** 
* @ClassName: MyCallable 
* @Description: TODO(这里用一句话描述这个类的作用) 
* @author A18ccms a18ccms_gmail_com 
* @date 2017年8月26日 下午4:53:53 
*/
public class MyCallable implements Callable<Integer> {

	private int number;
	
	public MyCallable(int number){
		this.number=number;
	}
	
	@Override
	public Integer call() throws Exception {
		int sum=0;
		for (int i = 0; i <=number; i++) {
			sum+=i;
		}
		return sum;
	}

}
 