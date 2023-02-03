package Fact_Prog;

public class factorial_program
{
 public static void main(String[] args) {
	 int num = Integer.parseInt(args[0]), fact =1;
	 for(int i= num; i>=1; i--)
	 {  fact = fact*i;
	 
	 }
	 System.out.println(fact);
	 
	 
	   
}
}
