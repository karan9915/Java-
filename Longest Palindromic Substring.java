class Main
{

	static void printSubstring(String str, int start, int end)
	{
		System.out.println("Longest Palindromic SubString is: " + str.substring(start,end+1));
	}

	static int longestPalindromicSubstring(String str)
	{
		int size = str.length();
		int low,high;
		int start = 0;
		int end = 0;

		for(int i=1;i<size;i++)
		{
			low = i-1;
			high = i;
			while(low>=0 && high<size && str.charAt(low)==str.charAt(high))
			{
				if(end < high-low+1)
				{
					start = low;
					end = high - low + 1;
				}

				low--;
				high++;
			}

		    low = i-1;
			high = i+1;
			while(low>=0 && high<size && str.charAt(low)==str.charAt(high))
			{
				if(end < high-low+1)
				{
					start = low;
					end = high - low + 1;
				}

				low--;
				high++;
			}
		}

		printSubstring(str,start,start+end-1);
		return end;
	}

	public static void main(String[] args)
	{
		String str1 = "fabcddcbag";
		String str2 = "faracecarsl";

		System.out.println("The length of Longest Palindromic Substring is: " + longestPalindromicSubstring(str1));
		System.out.println();
		System.out.println("The length of Longest Palindromic Substring is: " + longestPalindromicSubstring(str2));
	}
}