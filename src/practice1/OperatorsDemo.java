package practice1;

public class OperatorsDemo {

	public static void main(String[] args) 
	{
		
		int a=20, b=10;
		
		//Arithmetic operators   + - * / % 
		
		System.out.println("Sum of a and b is:"+(a+b));
		System.out.println("Diff of a and b is:"+(a-b));
		System.out.println("Muliplication of a and b is:"+(a*b));
		System.out.println("Division of a and b is:"+(a/b));  // 20/10=2
		System.out.println("Modulo division a and b is:"+(a%b)); //  20%10  =0
				
		
		//Relational/comparison operators  >  >=  <  <=  !=  == 
		// returns true/false ( boolean) 
		
		a=100;
		b=100;
		
		System.out.println(a>b);  //false
		System.out.println(a<b);  //false
		System.out.println(a<=b); //true
		System.out.println(a>=b); //true
		System.out.println(a!=b); //false
		System.out.println(a==b); //true
		

		//Logical operators   &&   ||  !
		//works between 2 boolean variables
		//returns true/false  - boolean
		
		boolean x=true;
		boolean y=false;
		
		
		System.out.println(x && y); //false
		System.out.println(x || y); //true
		System.out.println(!x); //false
		
		
		boolean b1=10>20;  //false
		boolean b2=20>10;   //true
		
		System.out.println(b1 && b2); //false
		System.out.println(b1 || b2); //true
		
		
	}

}
