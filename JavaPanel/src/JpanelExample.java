import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class JpanelExample {

	public JpanelExample() {
		
		JFrame f = new JFrame("JpanelExample");
		
		JPanel jp = new JPanel();
		jp.setBounds(40, 80, 200, 200);
		jp.setBackground(Color.gray);
		
		JButton btn1 = new JButton("Reset");
		btn1.setBounds(40, 120, 50, 50);
		btn1.setBackground(Color.MAGENTA);
		jp.add(btn1);
		
		JButton btn2 = new JButton("Submit");
		btn2.setBounds(40, 120, 50, 50);
		btn2.setBackground(Color.pink);
		jp.add(btn2);
		
		f.add(jp);
		f.setSize(400,400);
		f.setLayout(null);
		f.setVisible(true);
		
	}

	public static void main(String[] args) {
		 new  JpanelExample();

	}

}
