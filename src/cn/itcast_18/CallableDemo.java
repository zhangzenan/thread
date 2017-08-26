package cn.itcast_18;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/** 
* @ClassName: CallableDemo 
* @Description: TODO(这里用一句话描述这个类的作用) 
* @author A18ccms a18ccms_gmail_com 
* @date 2017年8月26日 下午4:56:53 
*/
public class CallableDemo {
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		//创建线程池对象
		ExecutorService pool=Executors.newFixedThreadPool(2);
		
		Future<Integer> f1= pool.submit(new MyCallable(100));
		Future<Integer> f2=pool.submit(new MyCallable(200));
		
		Integer i1=f1.get();
		Integer i2=f2.get();
		
		System.out.println(i1);
		System.out.println(i2);
		pool.shutdown();
	}

}
 