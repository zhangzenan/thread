package lock.cn.itcast_01;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/** 
* @ClassName: SellTicket 
* @Description: TODO(������һ�仰��������������) 
* @author A18ccms a18ccms_gmail_com 
* @date 2017��8��20�� ����4:23:02 
*/
public class SellTicket implements Runnable {
	
	//����Ʊ
	private int tickets=100;
	
	//����������
	private Lock lock=new ReentrantLock();

	@Override
	public void run() {
		while(true){
			try{
				//����
				lock.lock();
				
				if (tickets > 0) {
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {						
						e.printStackTrace();
					}
					System.out.println(Thread.currentThread().getName() + "���ڳ��۵ڣ�" + (tickets--) + "��Ʊ");
				}
			}finally{
				//�ͷ���
				lock.unlock();				
			}
		}
		
		
	}

}
 