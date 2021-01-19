import java.util.*;

public class Pangram
{
	public static void main(String[] args)
	{
		String st = "the quick brown fox jumps over the lazy dog";
		isPangram(st);
	}
	
	// isPangram() uses a map to store 
	// the English alphabets
	public static void isPangram(String st)
	{
		
		Map<Character, Boolean> myMap = new HashMap<>();
		
		for(Character i = 97; i <= 122; ++i)
		{
			myMap.put(i, false);
		}
		
		for(int i = 0; i < st.length(); ++i)
		{
			myMap.put(st.charAt(i), true);
		}
			
			
			
		int [] arr = {0};	
		myMap.forEach((k,v) ->
		{
			if(v == false)
			{
				arr[0] = 1;
			}
			System.out.println(k + " " + v);
		}
		);
		
		if(arr[0] == 0)
		{
			System.out.println("Yes, it is a pangram");
		}
		else
			System.out.println("No, it is not a pangram.");

			
			
			
	}
}