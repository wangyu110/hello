package zuhe;
/*
 * 普通类与普通类 抽象类  接口组合
 */
public class MyClass {
	//普通类
	private String a1="";
	//抽象类
	private MyAbstract m1=null;
	//接口
	private MyInterface interface1=null;
	
	public void in(){
		System.out.println(a1+m1+interface1);
	}
}
