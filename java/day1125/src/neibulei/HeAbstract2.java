package neibulei;
/*
 * 抽象类中内部类为抽象类
 */
public abstract class HeAbstract2 {
	private String name="抽象类";
	public abstract void out();
	
	public abstract class Inner5{
		private String type="抽象内部类";
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
