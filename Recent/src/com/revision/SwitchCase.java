package com.revision;

public class SwitchCase {

	public static void main(String[] args) 
	{
int week=3;

		switch (week) {
		case 1:
			System.out.println("Sunday");
			break;
		case 2:
			System.out.println("Monday");
			break;
		case 3:
			System.out.println("Tuesday");
			break;
		case 4:
			System.out.println("Wednesday");
		case 5:
			System.out.println("Thusday");
			break;
		case 6:
			System.out.println("Friday");
		case 7:
			System.out.println("Saturday");
			break;
			
			default:
		System.out.println("Invalid week");
		}
	}
}
