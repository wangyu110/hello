package neibulei;
/*
 * ���������ڲ���Ϊ��ͨ��
 */
public abstract class HeAbstract1 {
	private String name="������";
	public abstract void out();
	
	public class Inner4{
		private String type="��ͨ�ڲ���";
		public void in(){
			System.out.println(getType());
		}
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
