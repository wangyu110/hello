package com.test;

import jicheng.YouAbstract;
import jicheng.YouClass;
import jicheng.YouInterface;
import neibulei.HeAbstract1.Inner4;
import neibulei.HeAbstract2;
import neibulei.HeAbstract2.Inner5;
import neibulei.HeAbstract3.Inner6;
import neibulei.HeAbstract1;
import neibulei.HeClass1;
import neibulei.HeClass1.Inner1;
import neibulei.HeClass2;
import neibulei.HeInterface1;
import neibulei.HeClass2.Inner2;
import neibulei.HeClass3.Inner3;
import neibulei.HeInterface1.Inner7;
import neibulei.HeInterface2.Inner8;
import neibulei.HeInterface3.Inner9;
import zuhe.MyAbstract;
import zuhe.MyClass;
import zuhe.MyInterface;

public class Test {

	public static void main(String[] args) {
		//组合
		MyClass mc1=new MyClass();
//		mc1.in();
		MyAbstract ma1=new MyAbstract() {
			
			@Override
			public void in() {
				System.out.println(getA2()+getM2()+getInterface2());
				
			}
		};
//		ma1.in();
		MyInterface mi1=new MyInterface() {
			
			@Override
			public void in() {
				System.out.println(a3+m3+interface3);
				
			}
		};
//		mi1.in();
		
		//继承
		
		YouClass yc1=new YouClass();
//		yc1.test1();
//		yc1.test3();
		
		
		//抽象类继承普通类
//		YouAbstract ya1=new YouAbstract() {
//		};
//		ya1.test2();
		
		//抽象类继承抽象类实现接口
//		YouAbstract ya2=new YouAbstract() {
//			
//			@Override
//			public void test1() {
//				System.out.println(getName());
//				
//			}
//
//			@Override
//			public void test3() {
//				System.out.println(name);
//				
//			}
//		};
//		ya2.test1();
//		ya2.test3();
		
		//接口继承接口
		YouInterface yi1=new YouInterface() {
			
			@Override
			public void test3() {
				System.out.println(name);
				
			}
		};
//		yi1.test3();
		
		
		
		//普通类中内部类
			//普通类
		Inner1 i1=new HeClass1().new Inner1();
//		i1.in();
			//抽象类
		Inner2 i2=new HeClass2().new Inner2() {
			
			@Override
			public void in() {
				System.out.println(getType());
				
			}
		};
//		i2.in();
			//接口
		Inner3 i3=new Inner3() {
			
			@Override
			public void in() {
				System.out.println(type);
				
			}
		};
//		i3.in();
		//抽象类中内部类
			//普通类
		Inner4 i4=new HeAbstract1() {
			
			@Override
			public void out() {
				System.out.println(getName());
				
			}
		}.new Inner4();
//		i4.in()
			//抽象类
		HeAbstract2 ha2=new HeAbstract2() {
			
			@Override
			public void out() {
				System.out.println(getName());
				
			}
		};
		Inner5 inner5=ha2.new Inner5() {
			
			@Override
			public void in() {
				System.out.println(getType());
				
			}
		};
		inner5.in();
			//接口
		Inner6 i6=new Inner6() {
			
			@Override
			public void in() {
				System.out.println(type1);
				
			}
		};
//		i6.in();
		//接口中内部类   接口中内容默认为静态  所以实例时按照内部类类型实例化方法直接实例就可以
//			//普通类
		Inner7 i7=new Inner7();
//		i7.in();
			//抽象类
		Inner8 i8=new Inner8() {
			
			@Override
			public void in() {
				System.out.println(getType());
				
			}
		};
//		i8.in();
			//接口
		Inner9 i9=new Inner9() {
			
			@Override
			public void in() {
				System.out.println(type4);
			}
		};
//		i9.in();
		
		
		
	}

}
