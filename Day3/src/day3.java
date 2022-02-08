
class A
{
	public int a=10;
	public void printA()
	{
		System.out.println("I am class A");
	}

}
class B extends A{
	public int b2=20;
	
	public void printB()
{
		System.out.println("I am class B");
		}


		{
			B b1=new B();
			b1.printB();
			b1.printA();
			System.out.println("B Belongs to A class"+b1.a);
			System.out.println("B Belongs to B class"+b1.b2);
			}
		
		
	}
	

