package week3.Day2.Assignments;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class PrintDuplicatesInArray {

	public static void main(String[] args) {

		int[] arr = { 14, 12, 13, 11, 15, 14, 18, 16, 17, 19, 18, 17, 20 };

		Set<Integer> AllValue = new LinkedHashSet<Integer>();
		Set<Integer> DuplicateValue = new LinkedHashSet<Integer>();

		for (int value1 : arr) {
			boolean add = AllValue.add(value1);

			if (add == false) {
				DuplicateValue.add(value1);

			}
		}

		System.out.println(" All Values in the Array " + AllValue);
		System.out.println(" Duplicate Values in the Array " + DuplicateValue);
	}
}