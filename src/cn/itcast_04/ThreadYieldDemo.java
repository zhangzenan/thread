/**   
* @Title: ThreadYieldDemo.java 
* @Package cn.itcast_04 
* @Description: TODO(��һ�仰�������ļ���ʲô) 
* @author A18ccms A18ccms_gmail_com   
* @date 2017��8��16�� ����4:12:01 
* @version V1.0   
*/
package cn.itcast_04;

/** 
* @ClassName: ThreadYieldDemo 
* @Description: TODO(������һ�仰��������������) 
* @author A18ccms a18ccms_gmail_com 
* @date 2017��8��16�� ����4:12:01 
*  
*/
public class ThreadYieldDemo {
	public static void main(String[] args) {
		ThreadYield ty1=new ThreadYield();
		ThreadYield ty2=new ThreadYield();
		ThreadYield ty3=new ThreadYield();
		
		ty1.setName("�߳�1");
		ty2.setName("�߳�2");
		ty3.setName("�߳�3");
		
		ty1.start();
		ty2.start();
		ty3.start();
	}

}
