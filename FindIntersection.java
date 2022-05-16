package week3Day2JavaCollections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class FindIntersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Integer> set1= new HashSet<Integer>(Arrays.asList(3,2,11,4,6,7)); 
		Set<Integer> set2= new HashSet<Integer>(Arrays.asList(1,2,8,4,9,7)); 
		System.out.print("Intersection number is :");
		for(Integer eachvalue1 : set1)
		{
			for(Integer eachvalue2 : set2)
			{
				if(eachvalue1==eachvalue2)
					System.out.print(eachvalue1 +" " );
			}
		}
    }
}

//Using Array
/* int[] array1 = {3,2,11,4,6,7};
int[] array2 = {1,2,8,4,9,7};

for(int i=0; i<array1.length; i++)
{
   for(int j=0; j<array2.length; j++)
   {
	   if(array1[i]==array2[j])
	   {
		   System.out.println(array1[i]);
	   }
   }
} */