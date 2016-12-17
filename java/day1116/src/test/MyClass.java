package test;
/**
 * 班级类：
 * 		属性：name boss student[]
 * 		方法：intro(),max(),total(),min(),avg(),sort();
 *
 */
public class MyClass {
	//属性
	private String name;
	private String boss;
	private Student students[];
	//构造方法
	public MyClass(){
		
	}
	
	public MyClass(String name, String boss, Student[] students) {
		super();
		this.name = name;
		this.boss = boss;
		this.students = students;
	}

	//方法：
	//自我介绍intro
	public void intro(){
		String intro="我来自"+name+"班主任是"+boss;
		System.out.println(intro);
		for(Student s:students){
			s.intro();
		}
	}
	//总分total
	public int total(){
		int total=0;
		for(Student s:students){
			 total+=s.total();
		}
		return total;
	}
	//最大值max
	public int max(){
		int max=0;
		for(Student s:students){
			if(max<s.total()){
				max=s.total();
			}
		}
		return max;
	}
	//最小值min
	public int min(){
		int min=300;
		for(Student s:students){
			if(min>s.total()){
				min=s.total();
			}
		}
		return min;
	}
	//平均值
	public int avg(){
		int avg=0;
		for(Student s:students){
			avg=total()/students.length;
		}
		return avg;
	}
	//排序
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
