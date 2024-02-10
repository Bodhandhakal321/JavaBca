

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;


public class RadiobuttonExample extends JFrame implements ActionListener{
	JFrame f;
	JLabel l ;
	JRadioButton male , female;
	JButton b;
	

	
	public RadiobuttonExample() {
		
		
	{
			
			 l =new JLabel("Select gender");
			l.setBounds(100, 50, 100, 70);
			f = new JFrame();
			f.add(l);
			
			 male = new JRadioButton("Male");
			male.setBounds(100, 100, 100, 70);
			f.add(male);
			
			 female = new JRadioButton("Female");
			female.setBounds(100, 150, 120, 60);
			f.add(female);
			ButtonGroup g = new ButtonGroup();
			g.add(male);
			g.add(female);
			
			b= new JButton("click me");
			b.setBounds(100,250,100 ,40 );
			b.addActionListener(this);
			
			
			f.setSize(400,500);
			f.setLayout(null);
			f.setVisible(true);
			f.add(b);
			f.setLocationRelativeTo(null);
			
			
			
			
			
		}
	}

	public static void main(String[] args) {
		 new RadiobuttonExample();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (male.isSelected()) {
			JOptionPane.showMessageDialog(male, "Male is selected");
		}
		if (female.isSelected()) {
			JOptionPane.showMessageDialog(female,"Female is selected");
		}
	}
	
	

}
