/**   
* @Title: SetThread.java 
* @Package cn.itcast_13 
* @Description: TODO(��һ�仰�������ļ���ʲô) 
* @author A18ccms A18ccms_gmail_com   
* @date 2017��8��21�� ����4:00:20 
* @version V1.0   
*/
package cn.itcast_14;

/**
 * @ClassName: SetThread
 * @Description: TODO(������һ�仰��������������)
 * @author A18ccms a18ccms_gmail_com
 * @date 2017��8��21�� ����4:00:20
 * 
 */
public class SetThread implements Runnable {

	private Student s;
	private int x = 0;

	public SetThread(Student s) {
		this.s = s;
	}

	@Override
	public void run() {
		while (true) {
			synchronized (s) {
				if(s.isFlag()){
					try {
						s.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				if (x % 2 == 0) {
					s.setName("����");
					s.setAge(20);
				} else {
					s.setName("����");
					s.setAge(40);
				}
				x++;
				
				//�޸ı��
				s.setFlag(true);
				//�����߳�
				s.notify();//����t2,���Ѳ�����ʾ���������ִ�У����뻹����CPU��ִ��Ȩ��
			}		
			
		}

	}

}
