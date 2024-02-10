
public class Child extends Parent {
	public void show() {
		System.out.println("This is from child class");
	}

	public static void main(String[] args) {
		Child child = new Child();
		child.show();
	}

}
