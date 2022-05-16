package week3Day2JavaCollections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PrintDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        List<Integer> arraylist= new ArrayList<Integer>(Arrays.asList(14,12,13,11,15,14,18,16,17,19,18,17,20));
		List<Integer> outputlist= new ArrayList<Integer>();
		System.out.print("Duplicate Values are : ");
		for(Integer eachvalue : arraylist)
		{
		   if(outputlist.contains(eachvalue)) 
		   {
			   
			   System.out.print(eachvalue +" ");
		   }   
		   else
		   {
			   outputlist.add(eachvalue);
		   }
		}
     }
}
