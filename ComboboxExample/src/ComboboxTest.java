import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ComboboxTest implements ActionListener{
	JLabel l;
	JComboBox cb;

	public ComboboxTest() {
		JFrame f = new JFrame("Combo Box Example");
		
		String[] sports = {"football", "Volleyball","Cricket","Baseball","Hockey"};
		
		cb = new JComboBox(sports);
		cb.setBounds(50, 60, 90, 20);
		f.add(cb);
		
		JButton btn = new JButton("select");
		btn.setBounds(50,120, 90, 20);
		f.add(btn);
		
		l = new JLabel();
		l.setBounds(50, 150, 200, 20);
		f.add(l);
		
		btn.addActionListener(this);
		
		
		f.setLayout(null);
		f.setSize(400,400);
		f.setVisible(true);
	}

	public static void main(String[] args) {
		new ComboboxTest();
	 

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		l.setText("What i love is "+cb.getItemAt(cb.getSelectedIndex()));
		
		
		
		
		
	}

}
