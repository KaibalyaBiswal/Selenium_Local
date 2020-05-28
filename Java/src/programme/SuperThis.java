package programme;

public class SuperThis 
{
SuperThis(int i)
{
System.out.println("Print i");

}

SuperThis(int i,int j)
{
	System.out.println("Print i and j");
}

SuperThis()
{
System.out.println("Super Constructor");	
}
public static void main(String[] args) {

	SuperThis test = new SuperThis(10);
	SuperThis test2 = new SuperThis(10,20);
	SuperThis test3=new SuperThis();
	
	System.out.println("Print Test");
}
}
