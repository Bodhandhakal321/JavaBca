package AbstractclassTest;

public class Cow extends Animal {
	
	public void sound() {
		System.out.println("WOOOOOOW");
		
	}
	
	public void color() {
	
		System.out.println("White");
	}

	public static void main(String[] args) {
		Animal animal = new Cow();
		animal.sound();

	}

}
