package neibulei;
/*
 * 接口中内部类为抽象类类
 */
public interface HeInterface2 {
	String name4="接口";
	void out();
	public abstract class Inner8{
		private String type="抽象内部类";
		public abstract void in();
		public String getType() {
			return type;
		}
		public void setType(String type) {
			this.type = type;
		}
		
	}
}
