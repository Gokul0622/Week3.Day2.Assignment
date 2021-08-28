package week3.Day2.Assignments;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {

		String text = "We learn java basics as part of java sessions in java week1";
		//String text1 = text.toLowerCase();
		String[] Splitwords = text.split(" ");

		Set<String> Uniquewords = new LinkedHashSet<String>();
		Set<String> Duplicatewords = new LinkedHashSet<String>();

		for (String string1 : Splitwords) {
			Uniquewords.add(string1);

		}
		System.out.println(Uniquewords);
//		
//		int count = 0;
//		String[] Str = text.split(" ");
//		for(int i=0;i<Str.length;i++) {
//			for(int j=i+1;j<Str.length;j++) {
//				if((Str[i]).equals(Str[j])) {
//					count++;
//					
//				}
//				if(count>=1) {
//					Str[j]=(Str)[j].replace(Str[i], " ");
//				}
//				
//			}
//				System.out.println( Str [i]);
//			
//		}
	}

}
