package neibulei;
/*
 * ��ͨ�����ڲ���Ϊ��ͨ��
 */
public class HeClass1 {
	private String name="��ͨ��";
	
	public void out(){
		System.out.println(getName());
	}
	
	public class Inner1{
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
