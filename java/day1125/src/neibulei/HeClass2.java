package neibulei;
/*
 * ��ͨ�����ڲ���Ϊ������
 */
public class HeClass2 {
	private String name="��ͨ��";
	public void out(){
		System.out.println(getName());
	}
	public abstract class Inner2{
		private String type="�����ڲ���";
		public abstract void in();
		public String getType() {
			return type;
		}
		public void setType(String type) {
			this.type = type;
		}
		
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
