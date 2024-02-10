package Exception;

public class Exceptiontest {
	
	public static int division (int a ,int b) {
		int c = 0;	
		try {	
		 c= a/b;
		 System.out.println(c);
		}catch(Exception e) {
			System.out.println("DIvide by Zero is not allowed");
		}
		return c;
		
	}

	public static void main(String[] args) {
		
		division(20,5);
		

	}

}

