/**   
* @Title: GetThread.java 
* @Package cn.itcast_13 
* @Description: TODO(��һ�仰�������ļ���ʲô) 
* @author A18ccms A18ccms_gmail_com   
* @date 2017��8��21�� ����4:31:07 
* @version V1.0   
*/
package cn.itcast_16;

/** 
* @ClassName: GetThread 
* @Description: TODO(������һ�仰��������������) 
* @author A18ccms a18ccms_gmail_com 
* @date 2017��8��21�� ����4:31:07 
*  
*/
public class GetThread implements Runnable {

	private Student s;
	public GetThread(Student s){
		this.s=s;
	}
	
	@Override
	public void run() {
		while(true){
			s.get();			
		}		
				
	}

}
