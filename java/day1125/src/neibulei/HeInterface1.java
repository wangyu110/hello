package neibulei;
/*
 * 接口中内部类为普通类
 */
public interface HeInterface1 {
	String name3="接口";
	void out();
	
	public class Inner7{
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
}
