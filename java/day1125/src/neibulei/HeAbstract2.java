package neibulei;
/*
 * ���������ڲ���Ϊ������
 */
public abstract class HeAbstract2 {
	private String name="������";
	public abstract void out();
	
	public abstract class Inner5{
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
