package neibulei;
/*
 * 普通类中内部类为抽象类
 */
public class HeClass2 {
	private String name="普通类";
	public void out(){
		System.out.println(getName());
	}
	public abstract class Inner2{
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
