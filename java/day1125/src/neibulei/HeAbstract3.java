package neibulei;
/*
 * ���������ڲ���Ϊ�ӿ�
 */
public abstract class HeAbstract3 {
	private String name="������";
	public abstract void out();
	public interface Inner6{
		String type1="�ӿ��ڲ���";
		void in();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
