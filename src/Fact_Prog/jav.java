package Fact_Prog;
import java.util.Scanner;
public class jav 
{ public static void swap(int s) {
	  int a=10, b=40, c;
	     System.out.println("Before Swapping"+ a+"-"+b);
	     c=a;
	     a=b;
	     b=c;
	     System.out.println("After swapping"+a+"-"+b);
	     
}
  public static void fib(int t)
  {  int i=0, j=1,k;
       System.out.print(i+" "+j);
       for(int a=1; a<=8; a++)
       {  k=i+j;
          System.out.print(" "+k+" ");
          i=j;
          j=k;
       }
       
  }
  public static void mul(int o)
  {    int a = 10;
     for(int i=1; i<=10; i++)
     {    System.out.println(a+"*"+i+"="+a*i);
     
     }
  }
  public static void fact(int p)
  {  int i = 5, fac=1;
     for(int a=i; a>=1; a--)
     {   fac=fac*a;
     
     }
     System.out.println(fac);
  }
  public static void main(String[] args) 
  { Scanner sc = new Scanner(System.in);
      
      
 
     int met= sc.nextInt();
     switch(met)
     { case 1 :swap(1);
                break;
       
       case 2:fib(2);
                break;
       case 3: mul(3);
                break;
       case 4: fact(4);
                break;
      default: System.out.println("No Logic Found");
                               
                        
     
     }
	
}

}
