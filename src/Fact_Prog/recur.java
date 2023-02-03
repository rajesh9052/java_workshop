package Fact_Prog;

public class recur 
{ public static void rec(int i)
	{  if(i<=100)
	{  System.out.println(i);
	  i++;
	  rec(i);
	}
	}
  public static void main(String[] args) {
	  rec(1);
}

}
