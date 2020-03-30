import java.util.*;
import java.io.*;

class Main
{
        void reverseString(String str)
	{
	   String rev = "";
	   for(int i=str.length()-1;i>=0;i--)
	   {
	   	    rev = rev + str.charAt(i);
	   }
	   System.out.println(rev);
	}

     public static void main(String[] args)
     {
      String str = "abcde";
      Main m = new Main();
      m.reverseString(str);  
     }	
}