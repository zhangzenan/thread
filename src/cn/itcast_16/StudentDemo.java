/**   
* @Title: StudentDemo.java 
* @Package cn.itcast_13 
* @Description: TODO(用一句话描述该文件做什么) 
* @author A18ccms A18ccms_gmail_com   
* @date 2017年8月21日 下午4:33:14 
* @version V1.0   
*/
package cn.itcast_16;

/**
 * @ClassName: StudentDemo
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author A18ccms a18ccms_gmail_com
 * @date 2017年8月21日 下午4:33:14
 * 
 */
public class StudentDemo {
	public static void main(String[] args) {
		// 创建资源
		Student s = new Student();

		// 设置或获取的类
		SetThread st = new SetThread(s);
		GetThread gt = new GetThread(s);

		// 线程类
		Thread t1 = new Thread(st);
		Thread t2 = new Thread(gt);

		// 启动线程		
		t1.start();
		t2.start();
		
	}

}
