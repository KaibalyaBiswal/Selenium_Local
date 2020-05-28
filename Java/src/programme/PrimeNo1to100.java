package programme;

public class PrimeNo1to100 
{
public static void main(String[] args) 
{
//int temp=0;
//
//for (int i = 1; i <=100; i++) 
//{
//for (int j = 2; j <=100-1; j++) 
//{
//if (i%2==0) 
//{
//temp=temp+1;	
//}	
//}
//if (temp==0) 
//{
//System.out.println(i);
//}
//}	

int temp=0;
for (int i = 1; i < 100; i++) 
{
for (int j = 2; j < 100-1; j++) 
{
if (i%2==0) 
{
temp=temp+1;	
}	
}	
System.out.println(i);
}
}
}