package test;

public class TeacherTest {

	public static void main(String[] args) {
		Teacher tea=new Teacher();//构造方法
		tea.setAge(14);
		tea.setName("小明");
		System.out.println(tea.getAge());
		System.out.println(tea.getName());
		Teacher teacher=new Teacher("小红",12);
	}

}
