package week3.day2.assignments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SortingUsingCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> list1 =new ArrayList<String>();
		
		list1.add("HCL");
		list1.add("Wipro");
		list1.add("Aspire Systems");
		list1.add("CTS");
		
		System.out.println(list1);
		System.out.println("Size is"+list1.size());

		Collections.sort(list1, Collections.reverseOrder());
		System.out.println(list1);
		
		
		
		System.out.println("-------------------------------------------------");
		
		
		
		String[] input = {"HCL","Wipro","Aspire Systems","CTS"};
		
		Arrays.sort(input);
		System.out.print("{");
		for (int i = input.length-1; i>=0; i--) 
		{
			System.out.print(input[i]+" ");
		}
		System.out.println("}");
		
		
		

		System.out.println("-------------------------------------------------");

		
		
		List<String> list=new ArrayList<String>(); 
		for (String string : input) 
		{
			list.add(string);
		}
		System.out.println("Before Sorting :"+list);
		Collections.sort(list, Collections.reverseOrder());
		System.out.println("After Sorting :"+list);
		
		
		
		System.out.println("--------------------------------------------------");
		
		

	}

}


