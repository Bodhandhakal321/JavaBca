package Instantiation;

public class ConstructerTest {
	private int age;
	//create a constructer creating same as class name
 public ConstructerTest() {
	 System.out.println("Constructer Testing....");
 }
 public ConstructerTest(int a) {
	 System.out.println("Constructer with argument is calling");
 }
 
 public int setAge(int age) {
	 this.age=age;
	 return this.age;
 }
 
 public int getAge() {
	 return this.age;
 }
	public static void main(String[] args) {
		int age =10;
		ConstructerTest ct = new ConstructerTest(); 
		//new ConstruterTest in creating object is the constructer
		
	//System.out.println("This is ConstructerTest();
		ConstructerTest ct1 = new ConstructerTest(age);

	}

}
