
public class ChildTest {

	public int add(int a, int b) {
		return a+b;

	}
	public int add(int a , int b, int c) {
		return a+b+c;
	}
	public static void main(String[] args) {
		ChildTest childTest=new ChildTest();
		System.out.println(childTest.add(10, 20));
		System.out.println( childTest.add(10, 20, 30));
	}

}
