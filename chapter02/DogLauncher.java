//call makenoise method in Dog.java from DogLauncher. This is OO

public class DogLauncher{
	public static void main(String[] args){
		Dog.makeNoise();
	}
}


public class Dog{
	public static void makeNoise(){
		System.out.println("Bark!");
	}
}
