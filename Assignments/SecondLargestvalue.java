package week3.Day2.Assignments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class SecondLargestvalue {

	public static void main(String[] args) {

		int[] data = { 3, 2, 11, 4, 6, 7 };
		List<Integer> List = new ArrayList<Integer>();
		for (Integer integer : data) {
			List.add(integer);

		}
		int size = List.size();

		Collections.sort(List);
		System.out.println("Sorting the Value is " + List);

		System.out.println("Second Largest Value is " + List.get(size - 2));
	}
}