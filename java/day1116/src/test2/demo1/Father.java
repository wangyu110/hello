package test2.demo1;
/**
 * 父亲类。
 * 
 * 属性：姓名，年龄。
 * 
 * 方法：起床，工作，娱乐，睡觉。
 * 
 */
public class Father {
	// 属性
		private String name = "";
		private int age = 0;

		// 构造
		public Father(String name, int age) {
			this.name = name;
			this.age = age;
		}

		// 方法
		public void getup() {

			System.out.println(getName() + ":起床啦");
		}

		public void work() {
			System.out.println(getName() + ":打工挣钱");
		}

		public void play() {

			System.out.println(getName() + ":加班干活");
		}

		public void sleep() {

			System.out.println(getName() + ":睡觉休息");
		}
		
		//自我介绍
		public void intro(){
			System.out.println("name:" + getName() + ",age:" + getAge());
		}

		// getter setter
		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			this.age = age;
		}
}
