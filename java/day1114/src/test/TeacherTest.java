package test;

public class TeacherTest {

	public static void main(String[] args) {
		Teacher tea=new Teacher();//���췽��
		tea.setAge(14);
		tea.setName("С��");
		System.out.println(tea.getAge());
		System.out.println(tea.getName());
		Teacher teacher=new Teacher("С��",12);
	}

}
