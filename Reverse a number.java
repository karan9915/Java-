import java.util.*;
import java.io.*;

class Main
{

	void reverse(int num)
	{
	   int rev = 0;
	   int n;
	   while(num!=0)
	   {
	   	    n = num%10;
	   	    rev = rev*10 + n;
	   	    num = num/10;
	   }
	   System.out.println(rev);
	}

       public static void main(String[] args)
       {
       int num = 12345;
       Main m = new Main();
       m.reverse(num);  
       }	
}