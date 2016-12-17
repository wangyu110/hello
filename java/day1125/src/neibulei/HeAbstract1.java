package neibulei;
/*
 * 抽象类中内部类为普通类
 */
public abstract class HeAbstract1 {
	private String name="抽象类";
	public abstract void out();
	
	public class Inner4{
		private String type="普通内部类";
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
