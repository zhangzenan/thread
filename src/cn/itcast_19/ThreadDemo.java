package cn.itcast_19; 
/** 
* @ClassName: ThreadDemo 
* @Description: TODO(������һ�仰��������������) 
* @author A18ccms a18ccms_gmail_com 
* @date 2017��8��26�� ����5:16:25 
*/
public class ThreadDemo {
	public static void main(String[] args) {
		//�̳�Thread����ʵ�ֶ��߳�
		new Thread(){
			public void run(){
				for (int i = 0; i < 100; i++) {
					System.out.println(Thread.currentThread().getName()+":"+i);
				}
			}
		}.start();
		
		//ʵ��Runnable�ӿ���ʵ�ֶ��߳�
		new Thread(new Runnable(){
			@Override
			public void run() {
				for (int i = 0; i < 100; i++) {
					System.out.println(Thread.currentThread().getName()+":"+i);
				}				
			}
			
		}){}.start();
		
		//�����Ѷȵ�
		new Thread(new Runnable(){
			@Override
			public void run() {
				for (int i = 0; i < 100; i++) {
					System.out.println("hello"+":"+i);
				}				
			}
			
		}){
			//�ߵ�������߳�
			public void run() {
				for (int i = 0; i < 100; i++) {
					System.out.println("world"+":"+i);
				}				
			}
		}.start();
	}

}
 