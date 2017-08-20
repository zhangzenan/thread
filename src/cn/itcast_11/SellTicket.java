package cn.itcast_11;

/**
 * @ClassName: SellTicket
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author A18ccms a18ccms_gmail_com
 * @date 2017年8月19日 上午11:11:51
 */
public class SellTicket implements Runnable {

	// 定义100张票
	private int tickets = 100;
	
	private int x=0;

	// 定义同一把锁
	private Object obj = new Object();
	private Demo d=new Demo();

/*	@Override
	public void run() {
		while (true) {
			synchronized (obj) {
				if (tickets > 0) {
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.println(Thread.currentThread().getName() + "正在出售第：" + (tickets--) + "张票");
				}
			}
		}
	}*/
	
/*	@Override
	public void run() {
		while (true) {
			synchronized (d) {
				if (tickets > 0) {
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.println(Thread.currentThread().getName() + "正在出售第：" + (tickets--) + "张票");
				}
			}
		}
	}*/
	
	@Override
	public void run() {
		while (true) {
			if(x%2==0){
				synchronized (this) {
					if (tickets > 0) {
						try {
							Thread.sleep(100);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						System.out.println(Thread.currentThread().getName() + "正在出售第：" + (tickets--) + "张票");
					}
				}
			}else{
				sellTicket();
			}
		
		}
	}
	
	private synchronized void sellTicket(){
		if (tickets > 0) {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName() + "正在出售第：" + (tickets--) + "张票");
		}
	}

}

class Demo{
	
}
