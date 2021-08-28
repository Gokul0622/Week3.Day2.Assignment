package week3.Day2.Assignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortUsingCollections {

	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();

// 1.Declare a String array and add the Strings values as
// (Google,Microsoft,TestLeaf,Maverick)
		list.add("Aspire System");
		list.add("HCL");
		list.add("CTS");
		list.add("Wipro");

//2.Get the length of the array
		int Size = list.size();
		System.out.println(" Length of the Array is " + Size);
		System.out.println("***************************************");

//3. sort the array
		Collections.sort(list);

		for (String string : list) {
			System.out.println(" Sorting of the Array is  " + string);
		}
		System.out.println("****************************************");

//4. Iterate it in the reverse order

		for (int i = list.size() - 1; i >= 0; i--) {
			System.out.println(" Reverse Order of the Array is "+ list.get(i));
		}

	}
}
