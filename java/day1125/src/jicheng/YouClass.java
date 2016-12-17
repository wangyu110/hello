package jicheng;
/*
 * 普通类继承
 *  普通类  可以继承
 *  抽象类  可以继承
 *   接口   可以实现
 */
public class YouClass extends Abstract1 implements Interface1 {

	@Override
	public void test3() {
		System.out.println(name);
		
	}

	@Override
	public void test1() {
		System.out.println(getName());
		
	}


}
