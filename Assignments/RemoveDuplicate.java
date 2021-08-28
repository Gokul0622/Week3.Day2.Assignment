package week3.Day2.Assignments;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicate {

	public static void main(String[] args) {

		String str = "PayPal";
		char[] Str = str.toCharArray();
		// TODO Auto-generated method stub
		Set<Character> Uniquewords = new LinkedHashSet<Character>();
		Set<Character> Duplicatewords = new LinkedHashSet<Character>();
		for (char C : Str) {

			Uniquewords.add(C);
		}
		System.out.println(Uniquewords);

	}

}
