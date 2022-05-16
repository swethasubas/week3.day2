package week3Day2JavaCollections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String text = "We learn java basics as part of java sessions in java week1";
	    //String[] split = text.split(" ");	
	    List<String> stringlist = Arrays.asList(text.split(" "));
	    List<String> outputlist = new ArrayList<String>();
	    for(String eachvalue : stringlist) 
	    {
	        if(!outputlist.contains(eachvalue))
	    	{
	    		outputlist.add(eachvalue);
	    	}
	    }
	    for(String output : outputlist) 
	    {
	    	System.out.print(output + " ");
	    }
	    
    }

}
