package test;
/**
 * �༶�ࣺ
 * 		���ԣ�name boss student[]
 * 		������intro(),max(),total(),min(),avg(),sort();
 *
 */
public class MyClass {
	//����
	private String name;
	private String boss;
	private Student students[];
	//���췽��
	public MyClass(){
		
	}
	
	public MyClass(String name, String boss, Student[] students) {
		super();
		this.name = name;
		this.boss = boss;
		this.students = students;
	}

	//������
	//���ҽ���intro
	public void intro(){
		String intro="������"+name+"��������"+boss;
		System.out.println(intro);
		for(Student s:students){
			s.intro();
		}
	}
	//�ܷ�total
	public int total(){
		int total=0;
		for(Student s:students){
			 total+=s.total();
		}
		return total;
	}
	//���ֵmax
	public int max(){
		int max=0;
		for(Student s:students){
			if(max<s.total()){
				max=s.total();
			}
		}
		return max;
	}
	//��Сֵmin
	public int min(){
		int min=300;
		for(Student s:students){
			if(min>s.total()){
				min=s.total();
			}
		}
		return min;
	}
	//ƽ��ֵ
	public int avg(){
		int avg=0;
		for(Student s:students){
			avg=total()/students.length;
		}
		return avg;
	}
	//����
	public void sort(){
		for (int i = 0; i < students.length-1; i++) {
			
			for (int j = 0; j < students.length-i-1; j++) {
				Student temp=null;
				if(students[j].total()<students[j+1].total()){
					temp=students[j];
					students[j]=students[j+1];
					students [j+1]=temp;
				}
			}
		}
		for(Student s:students){
			System.out.println(s.myName()+s.total());
		}
	}
}
