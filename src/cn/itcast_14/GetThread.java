/**   
* @Title: GetThread.java 
* @Package cn.itcast_13 
* @Description: TODO(用一句话描述该文件做什么) 
* @author A18ccms A18ccms_gmail_com   
* @date 2017年8月21日 下午4:31:07 
* @version V1.0   
*/
package cn.itcast_14;

/** 
* @ClassName: GetThread 
* @Description: TODO(这里用一句话描述这个类的作用) 
* @author A18ccms a18ccms_gmail_com 
* @date 2017年8月21日 下午4:31:07 
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
			synchronized (s) {
				if(!s.isFlag()){
					try {
						s.wait();//t2就等待了，立即释放锁，将来醒过来的时候，是从这里醒过来。
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}					
				}
				System.out.println(s.getName()+"-----"+s.getAge());	
				
				//修改标记
				s.setFlag(false);
				//唤醒线程
				s.notify();
			}	
			
		}		
				
	}

}
