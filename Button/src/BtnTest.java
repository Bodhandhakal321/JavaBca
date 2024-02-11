import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class BtnTest extends JFrame implements ActionListener{
	JTextField t;
	JLabel jl,l,m;
	JFrame j,j1;
	JButton b;
	JPasswordField p;
	BtnTest() {
		
		j = new JFrame();
		j.setSize(400, 500);
		
		l = new JLabel("Enter your username");
		l.setBounds(100, 70, 200, 40);
		j.add(l);
		
		t = new JTextField();
		t.setBounds(100, 100, 200, 40);
		j.add(t);
		
		jl = new JLabel("Enter Password");
		jl.setBounds(100, 130, 200, 40);
		j.add(jl);
		
		p = new JPasswordField();
		p.setBounds(100, 160, 200, 40);
		j.add(p);
		
		b = new JButton("submit");
		b.setBounds(140, 210, 100, 40);
		j.add(b);
		
		m = new JLabel("");
		m.setBounds(100, 250, 250, 40);
		j.add(m);
	 
		b.addActionListener(this);
//		b.addActionListener(new ActionListener() {
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				String text  = t.getText();	
//				jl.setText("Your text is " + text);
//				
//			}});
		j.setLayout(null);
		j.setVisible(true);
	}
	
	public boolean checkAuth(String user, String pass) {
		
		if(user.equals("admin") && pass.equals("admin"))
			return true;
		
		return false;
	}
	
	public static void main(String[] args) {
		new BtnTest();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String user = t.getText();
		String pass = p.getText();
		if(this.checkAuth(user, pass)) {
//			j1 = new JFrame();
//			j1.setSize(400, 500);
//			jl = new JLabel("Welcome to dashboard");
//			jl.setBounds(100, 130, 200, 40);
//			j1.add(jl);
//			j1.setLayout(null);
//			j1.setVisible(true);
			new DashboardMenu();
			j.dispose();
		}else {
			m.setText("Invalid username or password!!!");
			m.setForeground(Color.red);
		}
		
		 
	}

}