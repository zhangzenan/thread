package cn.itcast_12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Hashtable;
import java.util.List;
import java.util.Vector;

/** 
* @ClassName: ThreadDemo 
* @Description: TODO(这里用一句话描述这个类的作用) 
* @author A18ccms a18ccms_gmail_com 
* @date 2017年8月19日 上午11:59:58 
*/
public class ThreadDemo {
	public static void main(String[] args) {
		//线程安全的类
		StringBuffer sb=new StringBuffer();
		Vector<String> v=new Vector<String>();
		Hashtable<String,String> h=new Hashtable<String,String>();
		
		//Vector是线程安全的时候才会考虑使用，但是即使安全也不用
		//那么到底用谁呢？
		List<String> list1=new ArrayList<String>();//线程不安全
		List<String> list2=Collections.synchronizedList(new ArrayList<String>());//线程安全
		
		
	}

}
 