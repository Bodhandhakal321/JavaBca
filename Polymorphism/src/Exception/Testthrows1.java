package Exception;

import java.io.IOException;

public class Testthrows1 {
	void m()throws IOException{
		throw new IOException("device error");
	}
	void n()throws IOException{
		m();
	}
	void p() {
		try {
			n();
		}catch(Exception e) {
			System.out.println("Exception handeled");
		}
		
	}

	public static void main(String[] args) {
		Testthrows1 obj = new Testthrows1();

		obj.p();
		System.out.println("normal flow...");
		
	}

}
