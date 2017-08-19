/**   
* @Title: MyThreadDemo.java 
* @Package cn.itcast_02 
* @Description: TODO(用一句话描述该文件做什么) 
* @author A18ccms A18ccms_gmail_com   
* @date 2017年8月15日 下午5:21:41 
* @version V1.0   
*/
package cn.itcast_02;

/** 
* @ClassName: MyThreadDemo 
* @Description: TODO(这里用一句话描述这个类的作用) 
* @author A18ccms a18ccms_gmail_com 
* @date 2017年8月15日 下午5:21:41 
*  
*/
public class MyThreadDemo {

	public static void main(String[] args) {
		//无参构造方法给线程设置名称
	/*	MyThread my1=new MyThread();
		MyThread my2=new MyThread();
		
		//调用方法设置名称
		my1.setName("线程1");
		my2.setName("线程2");
		
		my1.start();
		my2.start();*/
		
		//带参构造方法给线程设置名称
	/*	MyThread my1=new MyThread("线程1");
		MyThread my2=new MyThread("线程2");
		my1.start();
		my2.start();*/
		
		//获取main方法所在的线程名称
		System.out.println(Thread.currentThread().getName());
		
	}

}
