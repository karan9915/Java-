import java.util.*;
import java.io.*;

class Main
{
	public static void main(String[] args)
	{
       Scanner scan = new Scanner(System.in);
       int n=scan.nextInt();
       for(int i=2;i<n;i++)
        {
      	    boolean flag = true;
      	    for(int j=2;j<i;j++)
      	    {
                if(i%j==0)
                    {
          	            flag = false;
          	            break;
                    }
      	    }
      	    if(flag==true)
      	    {
      		    System.out.println(i);
      	    }
        }
    }	
}