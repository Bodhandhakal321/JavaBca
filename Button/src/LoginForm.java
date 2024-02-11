

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginForm {
	
	
	
	
    public static void main(String []args) {
    	
    	JFrame j=new JFrame();
    	j.setSize(480, 588);
    	j.setTitle("LOGIN FORM");
    	
    	
    	JLabel l=new JLabel("username ");
    	l.setBounds(30, 100, 200, 40);
    	
    	JTextField t=new JTextField();
    	t.setBounds(100, 100, 200, 40);
		
    	
    	JLabel b=new JLabel("password");
    	b.setBounds(30, 200, 200, 40);
    	
    	JPasswordField p=new JPasswordField(15);
    	p.setBounds(100, 200, 200, 40);
    	
    	
    	
    			
    			String text=t.getText(); // this text come in text field
    			JLabel jl= new JLabel("your text is ");
    					
    			jl.setBounds(100, 250, 200, 40);

    					
    	
    	JButton u= new JButton ("Login"); 
		u.setBounds(140, 300, 100, 48);
		
		
		
        j.add(l);
        j.add(t);
        j.add(b);
        j.add(p);
        j.add(u);
        j.add(jl);
    	
    	
    	u.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
		
				String username = t.getText();
				//String text =t.getText();
				String txt =text.length()>0? text:"empty";
				String password = p.getText();
				
				if(username.equals("test") && password.equals("test")) {
					
					JOptionPane.showMessageDialog(b, "login successfully");
				}
				else {
					JOptionPane.showMessageDialog(b, "login failed");
					
					
					
					
		
					
				}
				
				
			//char[] pass= p.getPassword();
			jl.setText("your text is :"+txt);
			//b.setBackground(new color(0,255,0));
			//b.setText("clicled");
			}
    		
    	});
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	j.setLayout(null);
    	j.setVisible(true);
    }


     
     }