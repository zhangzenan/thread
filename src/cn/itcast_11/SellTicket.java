package cn.itcast_11;

/**
 * @ClassName: SellTicket
 * @Description: TODO(������һ�仰��������������)
 * @author A18ccms a18ccms_gmail_com
 * @date 2017��8��19�� ����11:11:51
 */
public class SellTicket implements Runnable {

	// ����100��Ʊ
	private int tickets = 100;
	
	private int x=0;

	// ����ͬһ����
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
					System.out.println(Thread.currentThread().getName() + "���ڳ��۵ڣ�" + (tickets--) + "��Ʊ");
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
					System.out.println(Thread.currentThread().getName() + "���ڳ��۵ڣ�" + (tickets--) + "��Ʊ");
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
						System.out.println(Thread.currentThread().getName() + "���ڳ��۵ڣ�" + (tickets--) + "��Ʊ");
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
			System.out.println(Thread.currentThread().getName() + "���ڳ��۵ڣ�" + (tickets--) + "��Ʊ");
		}
	}

}

class Demo{
	
}
