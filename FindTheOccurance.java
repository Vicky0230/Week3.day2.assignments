package week3.day2.assignments;


import java.util.LinkedHashMap;
import java.util.Map;

public class FindTheOccurance {

	public static void main(String[] args) {

		String input = "welcome to Selenium automation";

		char[] charArray = input.toCharArray();

		Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();

		for (int i = 0; i < charArray.length; i++) 
		{
			if (map.containsKey(charArray[i])) 
			{
				Integer value = map.get(charArray[i]);
				int newValue = value + 1;
				map.put(charArray[i], newValue);
			}
			else 
			{
				map.put(charArray[i], 1);
			}
		}

		System.out.println(map);
	}

}
