package com.practice.demo;

public class Demo01 {
//	String name;
//	int IdNo;
	Demo01(String name,int IdNo)
	{
		
	
//		this.name=name;
//		this.IdNo=IdNo;
		
		System.out.println(name+" "+IdNo);
	}
	public static void main(String[] args) {
		Demo01 u1=new Demo01("Sumant",10);
		Demo01 u2=new Demo01("Vikas",11);
		Demo01 u3=new Demo01("a",12);
		Demo01 u5=new Demo01("b",13);
		Demo01 u4=new Demo01("c",14);
		System.out.println(" "+u1+u2+u3+u4+u5);}
	

}
