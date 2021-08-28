package week3.Day2.Assignments;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class Intersection {

	public static void main(String[] args) {

		int[] arr1 = { 3, 2, 11, 4, 6, 7 };
		int[] arr2 = { 1, 2, 8, 4, 9, 7 };

		Set<Integer> UniqueValue = new LinkedHashSet<Integer>();
		Set<Integer> DuplicateValue = new LinkedHashSet<Integer>();

		for (Integer integer : arr1) {
			UniqueValue.add(integer);
		}
		for (Integer integer1 : arr2) {
			DuplicateValue.add(integer1);

		}
		UniqueValue.retainAll(DuplicateValue);
		System.out.println(" Intersection Value is " + UniqueValue);

	}
}
