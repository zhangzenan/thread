/**   
* @Title: ThreadYieldDemo.java 
* @Package cn.itcast_04 
* @Description: TODO(用一句话描述该文件做什么) 
* @author A18ccms A18ccms_gmail_com   
* @date 2017年8月16日 下午4:12:01 
* @version V1.0   
*/
package cn.itcast_04;

/** 
* @ClassName: ThreadYieldDemo 
* @Description: TODO(这里用一句话描述这个类的作用) 
* @author A18ccms a18ccms_gmail_com 
* @date 2017年8月16日 下午4:12:01 
*  
*/
public class ThreadYieldDemo {
	public static void main(String[] args) {
		ThreadYield ty1=new ThreadYield();
		ThreadYield ty2=new ThreadYield();
		ThreadYield ty3=new ThreadYield();
		
		ty1.setName("线程1");
		ty2.setName("线程2");
		ty3.setName("线程3");
		
		ty1.start();
		ty2.start();
		ty3.start();
	}

}
