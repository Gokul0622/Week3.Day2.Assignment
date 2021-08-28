package week3.Day2.Assignments;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicatesInArray {

	public static void main(String[] args) {
		int[] arr = { 14, 12, 13, 11, 15, 14, 18, 16, 17, 19, 18, 17, 20 };
		int Length = arr.length;
		System.out.println(" Length of the Array Length is " + Length);

		Set<Integer> UniqueValue = new LinkedHashSet<Integer>();

		for (Integer integer : arr) {
			UniqueValue.add(integer);

		}

		System.out.println(" Removed Array and Unique Values OF Array " + UniqueValue);
		int unique = UniqueValue.size();
		System.out.println(" Length of the Unique Array Length is " + unique);

	}

}
