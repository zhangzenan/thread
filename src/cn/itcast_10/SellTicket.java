package cn.itcast_10;

/**
 * @ClassName: SellTicket
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author A18ccms a18ccms_gmail_com
 * @date 2017年8月19日 上午11:11:51
 */
public class SellTicket implements Runnable {

	// 定义100张票
	private int tickets = 100;

	// 定义同一把锁
	private Object obj = new Object();

	@Override
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

	}

}
