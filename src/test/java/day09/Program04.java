package day09;

public class Program04 {
	int a=1;
	int b=2;
	
	public Program04()
	{
		System.out.println("Program4 is Started");
	}
	
	private Program04(int a, int b)
	{
		this.a=a;
		this.b=b;
	}

	public static void main(String[] args) {//using constructor
		
		Program04 pro1 = new Program04();
		System.out.println(pro1.a+pro1.b);
		
		Program04 pro2 = new Program04(20,30);
		System.out.println(pro2.a+pro2.b);

	}


	


	}


