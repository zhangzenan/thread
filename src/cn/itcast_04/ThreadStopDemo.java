/**   
* @Title: ThreadStopDemo.java 
* @Package cn.itcast_04 
* @Description: TODO(��һ�仰�������ļ���ʲô) 
* @author A18ccms A18ccms_gmail_com   
* @date 2017��8��16�� ����4:58:48 
* @version V1.0   
*/
package cn.itcast_04;

/** 
* @ClassName: ThreadStopDemo 
* @Description: TODO(������һ�仰��������������) 
* @author A18ccms a18ccms_gmail_com 
* @date 2017��8��16�� ����4:58:48 
*  
*/
public class ThreadStopDemo {

	/** 
	* @Title: main 
	* @Description:  
	* @param @param args    �趨�ļ� 
	* @return void    �������� 
	* @throws 
	*/
	public static void main(String[] args) {
		ThreadStop ts=new ThreadStop();
		ts.start();
		
		try {
			ts.sleep(3000);
			//ts.stop();
			ts.interrupt();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
