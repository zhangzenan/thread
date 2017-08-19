/**   
* @Title: ThreadJoin.java 
* @Package cn.itcast_04 
* @Description: TODO(用一句话描述该文件做什么) 
* @author A18ccms A18ccms_gmail_com   
* @date 2017年8月16日 下午3:08:37 
* @version V1.0   
*/
package cn.itcast_04;

/** 
* @ClassName: ThreadJoin 
* @Description: TODO(这里用一句话描述这个类的作用) 
* @author A18ccms a18ccms_gmail_com 
* @date 2017年8月16日 下午3:08:37 
*  
*/
public class ThreadJoin extends Thread {
	/* (non-Javadoc)
	 * @see java.lang.Thread#run()
	 */
	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println(getName()+":"+i);
		}
	}

}
