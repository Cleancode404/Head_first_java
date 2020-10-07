public class Dog {
	int size;
	String name;
	
	void bark(){
		if (size < 60){
			System.out.print("Wooof! Wooof!");
		} else if (size > 14){
			System.out.print("Ruff! Ruff!");
		} else{
			System.out.print("Yip! Yip!");
		}
	}
	
}