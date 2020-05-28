package programme;


public class PallindromeNumber 
{
public static void main(String[] args) 
{
	int n=121,r,s=0;
	int temp=n;
while(n>0)
	{
	r=n%10;		//reminder		1
	n=n/10;		//quontient		12
	s=s*10+r;
}
if (temp==s) {
	System.out.println("pallindrome no");
} else {
System.out.println("not pallindrome no");
}

	
//2nd method	
//Scanner	sc=new Scanner(System.in);
//System.out.println("Enter Number :");
//	int n=sc.nextInt();
//	int temp=n;		
//	int rev=0,rem;
//	while (temp!=0) 
//	{
//	rem=temp%10;		//1 ->  3 ->  1
//	rev=rev*10+rem;		//1 ->  13 -> 131
//	temp=temp/10;		//13 -> 1 ->  1
//	}
//if (n==rev) 
//{
//	System.out.println("Number is Pallindrome Number");
//} else {
//System.out.println("Number is Not Pallindrome Number");
//}
}
}
