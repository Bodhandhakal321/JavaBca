package Exception;

public class FinallyTest {

	public static void main(String[] args) {
		 try {
			 int a = 2/0;
			 
		 }catch(Exception e){
			 System.out.println("Exception occurs"+e.getMessage());
			 
		 }finally {
			 System.out.println("Finally block is ececuted");
			 
		 }

	}

}
