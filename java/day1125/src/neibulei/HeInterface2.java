package neibulei;
/*
 * �ӿ����ڲ���Ϊ��������
 */
public interface HeInterface2 {
	String name4="�ӿ�";
	void out();
	public abstract class Inner8{
		private String type="�����ڲ���";
		public abstract void in();
		public String getType() {
			return type;
		}
		public void setType(String type) {
			this.type = type;
		}
		
	}
}
