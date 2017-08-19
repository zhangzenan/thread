/**   
* @Title: ThreadStopDemo.java 
* @Package cn.itcast_04 
* @Description: TODO(用一句话描述该文件做什么) 
* @author A18ccms A18ccms_gmail_com   
* @date 2017年8月16日 下午4:58:48 
* @version V1.0   
*/
package cn.itcast_04;

/** 
* @ClassName: ThreadStopDemo 
* @Description: TODO(这里用一句话描述这个类的作用) 
* @author A18ccms a18ccms_gmail_com 
* @date 2017年8月16日 下午4:58:48 
*  
*/
public class ThreadStopDemo {

	/** 
	* @Title: main 
	* @Description:  
	* @param @param args    设定文件 
	* @return void    返回类型 
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
