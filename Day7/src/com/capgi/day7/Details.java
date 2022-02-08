package com.capgi.day7;

class car{
	private String name;
	private int model;
	private String color;
	
	//default constructor
	
	public car() {}
	
	//parameterized 
	public car(String name, int model,String color) {
		
		this.name=name;
		this.model=model;
		this.color=color;
	}
	public void printdata()
	{
		System.out.println("car name is "+this.name +"model number is "+this.model +"the color is "+this.color);
	}
}



public class Details {
	public static void mail(String args[])
	{
		car c1 = new car("Ferrari",777,"Red");
		c1.printdata();
		
		car c2 = new car("lamborgini",111,"yellow");
		c2.printdata();
	}

}
