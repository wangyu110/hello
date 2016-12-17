package test;

public class Test5 {

	public static void main(String[] args) {
		Student s1 = new Student();
		s1.setName("李四");
		s1.setScore(99);
		Student s2 = new Student("张三",96);
		System.out.println(s1.getName());
		System.out.println(s1.getScore());

	}

}
