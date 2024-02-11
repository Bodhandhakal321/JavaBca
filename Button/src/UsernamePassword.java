


import java.awt.Color;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
//import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class UsernamePassword {
	
    public static void main(String []args) {
    	
    	JFrame j=new JFrame();
        //final ImageIcon icon = new ImageIcon("day.png");
        //j.setBackground(new Color(0, 255, 0));
        j.setBackground(new Color(153, 102, 153));
    	j.setSize(480, 588);
    	j.setTitle("LOGIN FORM");
    	//j.setLocationRelativetTo(null);
    	j.dispose();
    	JLabel l=new JLabel("username ");
    	l.setBounds(30, 100, 200, 40);
    	
    	JTextField t=new JTextField();
    	t.setBounds(100, 100, 200, 40);
		
    	JLabel b=new JLabel("password");
    	b.setBounds(30, 200, 200, 40);
    	
    	JPasswordField p=new JPasswordField(15);
    	p.setBounds(100, 200, 200, 40);
 		
		//String text=t.getText(); // this text come in text field
		//JLabel jl= new JLabel("your text is ");
				
		//jl.setBounds(100, 250, 200, 40);

    	JButton u= new JButton ("Login"); 
		u.setBounds(140, 300, 100, 48);
		u.setBackground(new Color(153, 102, 153));

        j.add(l);
        j.add(t);
        j.add(b);
        j.add(p);
        j.add(u);
        //j.add(jl);
    	
    	
    	u.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
		
				
				String username =t.getText();
//				String txt =username.length()>0? text:"empty";
				String password =p.getText();
				if (username.equals("bodhan")&& password.equals("bodhan")) {
				
					this.dasboard();
				}
				else {
					JOptionPane.showMessageDialog(b,"login failed");
				}
				
//			jl.setText("your text is :"+txt);
			
			}

			private void dasboard() {
				JFrame a=new JFrame();
				a.setSize(480, 588);
				a.setTitle("DASBOARD");
				
				JLabel e=new JLabel("Welcome to Dasboard ");
				e.setBounds(100, 50,300 , 40);
				
				
				TextArea v=new TextArea();
				v.setBounds(70,100,350,200);
				
				
				JButton w= new JButton("Click me");
				w.setBounds(140, 400, 100, 40);
				
				//JLabel z1=new JLabel("cords :");
				//z1.setBounds(100, 350,300 , 40);
				
				//JLabel z2=new JLabel("Characters :");
				//z2.setBounds(320, 350,300 , 40);
				
				//JLabel z3=new JLabel("Characters :");
				//z2.setBounds(320, 270,300 , 40);
				
				a.add(e);
				a.add(v);
				a.add(w);
				//a.add(z1);
				//a.add(z2);
				//a.add(z3);
				
				w.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						
						String str =v.getText();
						String words[] =str.split("\\s");
						 z1.setText("cords "+ words.length);
						 z2.setText("Characters: "+ str.length());
						 
					}	
				});
				
				a.setLocationRelativeTo(null); 
				a.setLayout(null);
				a.setVisible(true);
			}
    		
    	});
    	j.setLocationRelativeTo(null); 	
    	j.setLayout(null);
    	j.setVisible(true);
    	
    }

}