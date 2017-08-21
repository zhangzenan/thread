package lock.cn.itcast_01;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/** 
* @ClassName: SellTicket 
* @Description: TODO(这里用一句话描述这个类的作用) 
* @author A18ccms a18ccms_gmail_com 
* @date 2017年8月20日 下午4:23:02 
*/
public class SellTicket implements Runnable {
	
	//定义票
	private int tickets=100;
	
	//定义锁对象
	private Lock lock=new ReentrantLock();

	@Override
	public void run() {
		while(true){
			try{
				//枷锁
				lock.lock();
				
				if (tickets > 0) {
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {						
						e.printStackTrace();
					}
					System.out.println(Thread.currentThread().getName() + "正在出售第：" + (tickets--) + "张票");
				}
			}finally{
				//释放锁
				lock.unlock();				
			}
		}
		
		
	}

}
 