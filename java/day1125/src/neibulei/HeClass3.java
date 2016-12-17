package neibulei;
/*
 * 普通类中内部类为接口
 */
public class HeClass3 {
	private String name ="普通类";
	public void out(){
		System.out.println(getName());
	}
	
	public interface Inner3{
		String type="接口内部类";
		void in();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
