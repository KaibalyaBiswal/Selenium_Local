package customexceptionapp1;

import java.util.Arrays;
import java.util.List;

public class ForEach 
{

	public static void main(String[] args) 
	{
		
		List<Integer> data = Arrays.asList(1,2,3);
		
//External loop
		/*
		 * for (int i = 0; i < data.size(); i++) { System.out.println(i);
		 * System.out.println(data.get(i)); }
		 */
		
		
//this loop is faster than for loop
		/*
		 * for(int i:data) {
		 * 
		 * //for each loop never store the index System.out.println(i); }
		 */
		
//this is internal loop which is faster and this is for each method
//it dont store the index
		data.forEach(i->System.out.println(i));
		
	}
	
	
}

