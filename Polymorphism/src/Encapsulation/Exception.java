package Encapsulation;

public class Exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		
		EncapTest encapTest = new EncapTest();
		encapTest.setRollNo(10);
		encapTest.getRollNo();
		System.out.println(encapTest.getRollNo());
		
		
		encapTest.setName("Rohan");
		encapTest.getName();
		System.out.println();
		
		
		EncapTest encapTest1 = new EncapTest();
		encapTest1.setRollNo(30);
		encapTest1.getRollNo();
		System.out.println(encapTest1.getRollNo());
		 
	}

}
