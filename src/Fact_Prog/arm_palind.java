package Fact_Prog;

public class arm_palind 
{
   public static void arm(int n, int count_a)
   {     int num =n, arm=0, rem, fp = num;
         while(num>0)
         {   rem = num%10;
             arm = arm+rem*rem*rem;
             num = num/10;
         }
         if(arm==fp)
         { System.out.println(n+" is a armstron number");
           count_a++;
         }
         n++;
         if(count_a<=4)
         { arm(n, count_a);
        	 
         }
   }
   public static void palin(int n1, int count_b)
   {    int num =n1, rem, p= num, rev=0;
         while(num>0)
         {  rem= num%10;
            num = num/10;
            rev  = rev*10+rem;
            
         }
         if(rev==p)
         {  System.out.println(n1+" is a palindrome number");
             count_b++;
         }
         n1++;
         if(count_b<=100)
         {  palin(n1, count_b);
         }
         
   }
   public static void main(String[] args) 
   {   arm(1, 0);
       palin(1,0);
       
	
}
}
