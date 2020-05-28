package Questions;

abstract class Animal 
{
abstract void soundOfAnimal();
}

class Cat extends Animal
{
	void soundOfAnimal()
	{
		System.out.println("meoh");
	}
}

class dog extends Animal
{
	void soundOfAnimal()
	{
		System.out.println("bow");
	}
}