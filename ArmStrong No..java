import java.util.*;

class ll
{
	public static void main(String[] args)
	{
          Scanner scan = new Scanner(System.in);
          int num = scan.nextInt();
          int n = num;
          int b = 0;
          while(n!=0)
        {
     	  int a = n%10;
     	  b+=a*a*a;
      
       	  n=n/10;
     	}
     	if(num==b)
     	{
     	 System.out.println("Armstrong No.");
     	}
     	else
     	{
     	System.out.println("Not");
     	}
    
    }	
}	
