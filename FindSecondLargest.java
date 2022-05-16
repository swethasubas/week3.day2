package week3Day2JavaCollections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FindSecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> arraylist= new ArrayList<Integer>(Arrays.asList(3,2,11,4,6,7));
		Collections.sort(arraylist);
		System.out.println("Sorted list : " +arraylist);
		System.out.println("The Second Largest element is " +arraylist.get(arraylist.size()-2));
		}
}
