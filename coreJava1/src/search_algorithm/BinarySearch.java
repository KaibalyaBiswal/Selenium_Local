package search_algorithm;

public class BinarySearch 
{

	public static void main(String[] args) 
	{
	
		int arr[]= {3,5,7,9,40,50};
		int n = arr.length;
		System.out.println("array lengths is "+n);
		int x=7;
		int result = search(arr, x, 0, n-1);
		if (result==x) 
		{
		System.out.println("element not found");	
		}
		else 
		{
		System.out.println("element found in index "+ result);
		}
	}
		
public static int search(int arr[],int x,int low,int high)
{
	while (low<=high) 
	{
	int mid=low+(high-low)/2;
	
	if (arr[mid]==x) 
	{
	return mid;	
	}
	if (arr[mid]<x) 
	{
	low=mid+1;	
	}else 
	{
	high=mid-1;
	}
	}
	
	return -1;//if nothing is satishfied
	
	
	
	
}
		
	
	
	
	
}
