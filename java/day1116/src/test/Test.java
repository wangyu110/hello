package test;

public class Test {

	public static void main(String[] args) {
		Student s1 =new Student("����","��",59,70,90);
		Student s2 =new Student("����","��",69,77,94);
		Student s3 =new Student("����","��",79,76,92);
		Student s4 =new Student("����","��",89,74,98);
		Student s5 =new Student("����","��",79,76,91);
		
		Student students[]={s1,s2,s3,s4,s5};
		MyClass m=new MyClass("����","����ʦ",students);
		m.intro();
		System.out.println(m.max());
		System.out.println("�Ұ��ܳɼ�Ϊ��"+m.total()+"ƽ���ܷ���Ϊ��"+m.avg()+"��߷�"+m.max()+"��ͷ֣�"+m.min());
		
		

	}

}
