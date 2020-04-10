import java.util.*;
import java.io.*;

class Main
{
	void fromTo(Map<String,String> map)
	{
		Map<String,String> revMap = new HashMap<>();
		Set<Map.Entry<String,String>> hmap = map.entrySet();
		for(Map.Entry<String,String> data: hmap)
		{
			revMap.put(data.getValue(),data.getKey());
		}

		String start = null;
		for(Map.Entry<String,String> data:hmap)
		{
			if(!revMap.containsKey(data.getKey()))
			{
				start = data.getKey();
				break;
			}
		}

		if(start==null)
			System.out.println("Invalid Data");
		
		String to = map.get(start);
		while(to!=null)
		{
			System.out.print(start + "-->" + to + ",");
			start = to;
			to = map.get(to);
		}
	}

	public static void main(String[] args)
	{
		Map<String,String> map = new HashMap<>();
		map.put("Chennai", "Banglore"); 
                map.put("Bombay", "Delhi"); 
                map.put("Goa", "Chennai"); 
                map.put("Delhi", "Goa"); 
                Main m = new Main();  
                m.fromTo(map);
    }
}