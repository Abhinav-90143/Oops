package Scope;

public class Assignment_oper {
    public static void main(String[] args)
  {
    int a=4,b=1;
	System.out.println(a);//4
	System.out.println(b);//1
	a = a * b;
   	b = a / b;
	a = a / b;
	System.out.println(a);//1
	System.out.println(b);//4
}

}
