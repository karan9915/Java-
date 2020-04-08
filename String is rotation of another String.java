import java.util.*;
import java.io.*;

class Main
{
	void ratationOfEachOther(String s1, String s2)
	{
		String str = s1.concat(s2);
		if(str.contains(s2))
		{
			System.out.println("Yes");
		}
		else
		{
			System.out.println("No");
		}
	}

	public static void main(String[] args)
	{
	  String s1 = "ARADHYA";
      String s2 = "RAADHYA";
      Main m = new Main();
      m.ratationOfEachOther(s1,s2);
    }	
}