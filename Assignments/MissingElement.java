package week3.Day2.Assignments;

import java.util.ArrayList;
import java.util.List;

public class MissingElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 0, 1, 2, 3, 4, 7, 6, 8 };

		List<Integer> List = new ArrayList<Integer>();
		for (int i : arr) {
			List.add(i);

		}
		System.out.println(List);
		for (int j = 0; j < List.size() - 1; j++) {
			if (List.get(j) != j) {
				System.out.println(" Missing value is " + j);

			}

		}
	}

}
