package cn.itcast_10;

/**
 * @ClassName: SellTicket
 * @Description: TODO(������һ�仰��������������)
 * @author A18ccms a18ccms_gmail_com
 * @date 2017��8��19�� ����11:11:51
 */
public class SellTicket implements Runnable {

	// ����100��Ʊ
	private int tickets = 100;

	// ����ͬһ����
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
					System.out.println(Thread.currentThread().getName() + "���ڳ��۵ڣ�" + (tickets--) + "��Ʊ");
				}
			}
		}

	}

}
