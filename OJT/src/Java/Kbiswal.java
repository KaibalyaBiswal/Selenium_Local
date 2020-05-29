package Java;

public class Kbiswal implements Kaibalya,Biswal
{
public void method1()
{
	System.out.println("Method1 Executed");
	
	}
public static void main(String[] args) 
{
	
Kaibalya k=new Kbiswal();
k.method1();

Biswal b=new Kbiswal();
b.method1();
}
}
