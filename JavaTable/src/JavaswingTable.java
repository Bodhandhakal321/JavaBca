import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class JavaswingTable {

	public JavaswingTable() {
		JFrame f = new JFrame();
		
		String data[][]={
				
						{
							"12",
							" Saroj",
							"23"
						},
						
						{
							"34",
							"Bodhan",
							"21"
						},
						
						{

							"35",
							"Aashwin",
							"60"
							
						},
		};
		
		String[] columns = {"ROll NO","Name","Marks"};










		JTable t = new JTable(data,columns);
		t.setBounds(30,40,200,300);
		
		JScrollPane jp = new JScrollPane(t);
		f.add(jp);
		
		
		f.setSize(400,400);
		f.setVisible(true);
		f.setLayout(null);
		
		
	}

	public static void main(String[] args) {
		new JavaswingTable();

	}

}
