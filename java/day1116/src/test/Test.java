package test;

public class Test {

	public static void main(String[] args) {
		Student s1 =new Student("张三","男",59,70,90);
		Student s2 =new Student("李四","男",69,77,94);
		Student s3 =new Student("张五","男",79,76,92);
		Student s4 =new Student("王六","男",89,74,98);
		Student s5 =new Student("赵七","男",79,76,91);
		
		Student students[]={s1,s2,s3,s4,s5};
		MyClass m=new MyClass("三班","王老师",students);
		m.intro();
		System.out.println(m.max());
		System.out.println("我班总成绩为："+m.total()+"平均总分数为："+m.avg()+"最高分"+m.max()+"最低分："+m.min());
		
		

	}

}
