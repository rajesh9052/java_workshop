package Fact_Prog;

public class java_concepts 
{  public void even(int k)
	{
	int a =10;
    if(a%2==0)
    { System.out.println("given number is even number");
    
    }
    else
    { System.out.println("not even number");
    
    }

}
  public void odd(int l)
  { int a = 34;
     if(a%2!=0)
     {  System.out.println("odd number");
     
     }
     else
     { System.out.println("not a odd number");
     
     }
  }
  public void prime(int m)
  {  int a= 77,count=0;
    for(int i=1; i<=a; i++)
    {   if(a%i==0)
    {   count++;
    
    }
    
    }
      if(count==2)
    	  System.out.println("Given number is a prime number");
      else
    	  System.out.println("Given number is not a prime number");
      
     
  }
   public void palindrome(int n)
   {  int a = 888, rev=0, rem, num =a;
         while(a>0)
         {  rem = a%10;
            rev= rev*10+rem;
            a = a/10;
            
         }
         if(rev==num)
        	 System.out.println("given number is a palindrome number");
         else
        	 System.out.println("given number is not a palindrome number");
         
         
   }
   
   public void armstrong(int o)
   { int a =153, arm=0, rem, num = a;
       while(a>0)
       {  rem = a%10;
          arm = arm+rem*rem*rem;
          a = a/10;
       }
       if(arm==num)
    	   System.out.println("given number is a Armstrong number");
       else
    	   System.out.println("givern number is not a Armstrong number");
       
   }
   
   public void Fibonacci(int p)
   { int  i=0 , j=1, k;
         System.out.print(i+" "+j);
         for(int a =1; a<=20; a++)
         {  
        	  k=i+j;
        	  System.out.print(""+ k);
        	  j=i;
        	  k=j;
         }
         
        	 
         }
   public static void main(String[] args) 
   { java_concepts z = new java_concepts();
      z.armstrong(1);
      z.palindrome(2);
      z.prime(3);
      //z.Fibonacci(4);
      z.odd(5);
      z.even(6);
      
	
}
         
   }
  
  
  

