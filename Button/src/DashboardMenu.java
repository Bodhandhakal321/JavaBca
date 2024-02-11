import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class DashboardMenu {

	public DashboardMenu() {
		JFrame jf = new JFrame("Dashboard");
		
		JMenuBar jb = new JMenuBar(); //Create Menubar
		jf.add(jb);
		
		
		//decalare menu items
		JMenu file = new JMenu("File");
		JMenu account = new JMenu("Account");
		JMenu logout = new JMenu("Logout");
		
		
		// add memnu to the menubar
		jb.add(file);
		jb.add(account);
		jb.add(logout);
		
//		JLabel jl = new JLabel("Welcome to dashboard");
//		jl.setBounds(300, 150, 300, 80);
//		jf.add(jl);
		
		//add menu item to the file menu
		JMenuItem  item1 = new JMenuItem("Edit");
		JMenuItem  item2 = new JMenuItem("Copy");
		JMenuItem  item3 = new JMenuItem("PAte");
		
		file.add(item1);
		file.add(item2);
		file.add(item3);
		
		//add menu item to account menu
		JMenuItem account1   = new JMenuItem("Account info");
		JMenuItem account2   = new JMenuItem("Payroll");
		JMenuItem account3   = new JMenuItem("Salary");
		
		account.add(account1);
		account.add(account2);
		account.add(account3);
		
		
		
		jf.setJMenuBar(jb);
		jf.setSize(400,400);
		jf.setVisible(true);
		jf.setLayout(null);
	}

	public static void main(String[] args) {
		
		new DashboardMenu();
		

	}

}
