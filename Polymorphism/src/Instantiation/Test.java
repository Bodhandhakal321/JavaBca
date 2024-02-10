package Instantiation;

public class Test {
	private int age;
	
	public void setAge(int a){

		this.age=a;
	}
	public int getAge() {
		return this.age;
	}

	public static void main(String[] args) {

		Test test = new Test();

		
		test.setAge(20);
		
		System.out.println("THE AGE IS "+test.getAge());
	}
	

}
