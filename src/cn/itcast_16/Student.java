/**   
* @Title: Student.java 
* @Package cn.itcast_16 
* @Description: TODO(用一句话描述该文件做什么) 
* @author A18ccms A18ccms_gmail_com   
* @date 2017年8月24日 下午5:32:39 
* @version V1.0   
*/
package cn.itcast_16;

/** 
* @ClassName: Student 
* @Description: TODO(这里用一句话描述这个类的作用) 
* @author A18ccms a18ccms_gmail_com 
* @date 2017年8月24日 下午5:32:39 
*  
*/
public class Student {
	private String name;
	private int age;
	private boolean flag;
	
	public synchronized void set(String name,int age){
		//如果有数据，就等待
		if(this.flag){
			try {
				this.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		//设置数据
		this.name=name;
		this.age=age;
		
		//修改标记
		this.flag=true;
		this.notify();
	}
	
	public synchronized void get(){
		//如果没有数据就等待
		if(!this.flag){
			try {
				this.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println(this.name+"-----"+this.age);	
		
		//修改标记
		this.flag=false;
		//唤醒线程
		this.notify();
	}

}
