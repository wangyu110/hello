package test2;
import javax.activation.DataContentHandler;

import test2.demo1.*;
/**
 * 家庭类：
 * 		属性：grandpa  grandma  father mather baby
 * 		方法：intro  dayStart  work  play  dayEnd day 
 */
public class Family {
	//属性
	private Grandpa grandpa;
	private Grandma grandma;
	private Father father;
	private Mother mother;
	private Baby baby;
	//构造方法
	public Family(){
		
	}

	public Family(Grandpa grandpa, Grandma grandma, Father father, Mother mother, Baby baby) {
		super();
		this.grandpa = grandpa;
		this.grandma = grandma;
		this.father = father;
		this.mother = mother;
		this.baby = baby;
	}
	//方法
	//自我介绍
	public void intro(){
		grandpa.intro();
		grandma.intro();
		father.intro();
		mother.intro();
		baby.intro();
	}
	//daystart方法
	public void dayStart(){
		grandpa.getup();
		grandma.getup();
		father.getup();
		mother.getup();
		baby.getup();
	}
	//工作
	public void work(){
		grandma.work();
		grandpa.work();
		father.work();
		mother.work();
		baby.work();
	}
	//play
	public void play(){
		grandma.play();
		grandpa.play();
		father.play();
		mother.play();
		baby.play();
	}
	//dayend方法
	public void dayend(){
		grandma.sleep();
		grandpa.sleep();
		father.sleep();
		mother.sleep();
		baby.sleep();
	}
	public void day(){
		intro();
		dayStart();
		work();
		play();
		dayend();
		
	}








	public Grandpa getGrandpa() {
		return grandpa;
	}
	public void setGrandpa(Grandpa grandpa) {
		this.grandpa = grandpa;
	}
	public Grandma getGrandma() {
		return grandma;
	}
	public void setGrandma(Grandma grandma) {
		this.grandma = grandma;
	}
	public Father getFather() {
		return father;
	}
	public void setFather(Father father) {
		this.father = father;
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
