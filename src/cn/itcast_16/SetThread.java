/**   
* @Title: SetThread.java 
* @Package cn.itcast_13 
* @Description: TODO(用一句话描述该文件做什么) 
* @author A18ccms A18ccms_gmail_com   
* @date 2017年8月21日 下午4:00:20 
* @version V1.0   
*/
package cn.itcast_16;

/**
 * @ClassName: SetThread
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author A18ccms a18ccms_gmail_com
 * @date 2017年8月21日 下午4:00:20
 * 
 */
public class SetThread implements Runnable {

	private Student s;
	private int x = 0;

	public SetThread(Student s) {
		this.s = s;
	}

	@Override
	public void run() {
		while (true) {
			if (x % 2 == 0) {
				s.set("张三",25);
			} else {
				s.set("李四", 28);
			}
			x++;		
			
		}

	}

}
