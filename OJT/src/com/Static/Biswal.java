package com.Static;

public class Biswal 						//     METHOD IN ANTHOR CLASS
{ 											//*******************************
public static void main(String[] args) 
{
//non static stuff
	Kaibalya k=new Kaibalya();
	k.night();
	System.out.println(k.i);          //can access variable by object reference 
	
//static stuff	
	Kaibalya.day();
	System.out.println(Kaibalya.j);   //can access variable by class name
	
}
}
