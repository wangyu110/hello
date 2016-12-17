package neibulei;
/*
 * 抽象类中内部类为接口
 */
public abstract class HeAbstract3 {
	private String name="抽象类";
	public abstract void out();
	public interface Inner6{
		String type1="接口内部类";
		void in();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
