package neibulei;
/*
 * �ӿ����ڲ���Ϊ��ͨ��
 */
public interface HeInterface1 {
	String name3="�ӿ�";
	void out();
	
	public class Inner7{
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
}
