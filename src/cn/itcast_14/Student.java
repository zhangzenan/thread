/**   
* @Title: Student.java 
* @Package cn.itcast_13 
* @Description: TODO(用一句话描述该文件做什么) 
* @author A18ccms A18ccms_gmail_com   
* @date 2017年8月21日 下午3:59:22 
* @version V1.0   
*/
package cn.itcast_14;

/** 
* @ClassName: Student 
* @Description: TODO(这里用一句话描述这个类的作用) 
* @author A18ccms a18ccms_gmail_com 
* @date 2017年8月21日 下午3:59:22 
*  
*/
public class Student {
	
	private String name;
	private int age;
	private boolean flag;
	
	public String getName() {
		return name;
	}
	public boolean isFlag() {
		return flag;
	}
	public void setFlag(boolean flag) {
		this.flag = flag;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	

}
