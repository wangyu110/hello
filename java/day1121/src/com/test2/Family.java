package com.test2;

public class Family {
	//属性：家庭成员
	private Grandma grandma=null;
	private Mother mother=null;
	private Baby baby=null;
	//构造
	public Family(Grandma grandma, Mother mother, Baby baby) {
		super();
		this.grandma = grandma;
		this.mother = mother;
		this.baby = baby;
	}
	
	
	//方法
	public void daystar(){
		grandma.getup();
		mother.getup();
		baby.getup();
	}
	public void work(){
		grandma.work();
		mother.work();
		baby.work();
	}
	public void dayend(){
		grandma.sleep();
		mother.sleep();
		baby.sleep();
	}
	
	
	
	
	
	//getter setter
	public Grandma getGrandma() {
		return grandma;
	}
	public void setGrandma(Grandma grandma) {
		this.grandma = grandma;
	}
	public Mother getMother() {
		return mother;
	}
	public void setMother(Mother mother) {
		this.mother = mother;
	}
	public Baby getBaby() {
		return baby;
	}
	public void setBaby(Baby baby) {
		this.baby = baby;
	}
}
