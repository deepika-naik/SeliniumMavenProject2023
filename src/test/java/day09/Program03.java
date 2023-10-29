package day09;

public class Program03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=10;
		 int y=0;
		 
		 System.out.println(x+y);
		 System.out.println(x-y);
		 try
		 {
		 System.out.println(x/y);
		 } 
		 finally
		 {
			 System.out.println("Finally Block");
			 x=5;
			 y=2;
		 }
		 System.out.println(x*y);
		 System.out.println((x*x)+(y*y));

	}

	}


