package cn.itcast_12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Hashtable;
import java.util.List;
import java.util.Vector;

/** 
* @ClassName: ThreadDemo 
* @Description: TODO(������һ�仰��������������) 
* @author A18ccms a18ccms_gmail_com 
* @date 2017��8��19�� ����11:59:58 
*/
public class ThreadDemo {
	public static void main(String[] args) {
		//�̰߳�ȫ����
		StringBuffer sb=new StringBuffer();
		Vector<String> v=new Vector<String>();
		Hashtable<String,String> h=new Hashtable<String,String>();
		
		//Vector���̰߳�ȫ��ʱ��Żῼ��ʹ�ã����Ǽ�ʹ��ȫҲ����
		//��ô������˭�أ�
		List<String> list1=new ArrayList<String>();//�̲߳���ȫ
		List<String> list2=Collections.synchronizedList(new ArrayList<String>());//�̰߳�ȫ
		
		
	}

}
 