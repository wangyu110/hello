package neibulei;
/*
 * ��ͨ�����ڲ���Ϊ�ӿ�
 */
public class HeClass3 {
	private String name ="��ͨ��";
	public void out(){
		System.out.println(getName());
	}
	
	public interface Inner3{
		String type="�ӿ��ڲ���";
		void in();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
