package programme;

public class PrimeNo 
{		
public static void main(String[] args) 
{
//	int no=7;
//	int temp=0;
//	
//for (int i = 2; i <=no-1; i++) 
//	{
//if (no%i==0) 
//{
//temp=temp+1;
//}
//}
//
//if (temp>0) 
//{
//	System.out.println("It is not a prime number");
//}
//else {
//	System.out.println("It is a prime number");
//	
//}
//System.out.println(no);


int n=3;
int temp=0;
for (int i = 2; i < n-1; i++) 
{
if (i%2==0) 
{
temp=temp+1;	
}	
}
if (temp>0) 
{
System.out.println("It is Not a Prime Number");	
}
else {
	System.out.println("It is a Prime Number");
}
}
}

