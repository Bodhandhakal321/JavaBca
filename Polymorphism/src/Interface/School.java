package Interface;

public class School implements Building {
	
	public void door() {
		System.out.println("door is calling from school");
	
	}
	public void window() {
		System.out.println("window is calling from school");
		
	}
	public static void main(String[] args) {
		
	Building building = new School();
	//School school = new School();
	building.window();
		

	}

}
