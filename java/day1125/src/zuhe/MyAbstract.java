package zuhe;
/*
 * ����������ͨ��  ������ �ӿ����
 */
public abstract class MyAbstract {
	//��ͨ��
	private String a2="";
	//������
	private MyAbstract m2=null;
	//�ӿ�
	private MyInterface interface2=null;
	
	public abstract void in();

	public String getA2() {
		return a2;
	}

	public void setA2(String a2) {
		this.a2 = a2;
	}

	public MyAbstract getM2() {
		return m2;
	}

	public void setM2(MyAbstract m2) {
		this.m2 = m2;
	}

	public MyInterface getInterface2() {
		return interface2;
	}

	public void setInterface2(MyInterface interface2) {
		this.interface2 = interface2;
	}
	
}
