package Scope;

public class While {
	public static void main(String[] args) 
	 {
	 int fact = 1;
	 int x = 5;
	 while(x>=1) 
	  {
	 fact = fact * x; 
	 x--;
	 }
	 System.out.println("Factorial of the given number is:: "+fact);
	} 
}
