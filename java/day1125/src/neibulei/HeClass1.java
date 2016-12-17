package neibulei;
/*
 * 普通类中内部类为普通类
 */
public class HeClass1 {
	private String name="普通类";
	
	public void out(){
		System.out.println(getName());
	}
	
	public class Inner1{
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
