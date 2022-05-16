package week3Day2JavaCollections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MissingElement {

	public static void main(String[] args) {
	    
		 List<Integer> arraylist= new ArrayList<Integer>(Arrays.asList(1,2,3,4,7,6,8));
		 Collections.sort(arraylist);
		 System.out.print("Missing element is : ");
		 for(int i=0; i<arraylist.size(); i++)
		 {
			 if(i+1!=arraylist.get(i))
			 {
				 System.out.print(i+1);
				 break;
			 }
         }
	}
}



