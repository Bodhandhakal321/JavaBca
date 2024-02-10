import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;

public class JavaList implements ActionListener {

	JLabel jl;
	JList<String> list;
	public JavaList() {
		
		
		JFrame f = new JFrame();
		
		DefaultListModel<String> l = new DefaultListModel();
		
		l.addElement("Item 1");
		l.addElement("Item 2");
		l.addElement("Item 3");
		l.addElement("Item 4");
		
		
		list = new JList(l);
		list.setBounds(100, 100, 75, 75);
		
		f.add(list);
		
		JButton jb = new JButton("select");
		jb.setBounds(90, 200, 80, 20);
		f.add(jb); 
		
		jb.addActionListener(this);
		
		
		 jl = new JLabel();
		jl.setBounds(90, 250, 200, 20);
		f.add(jl);
		
		
		
		
		
		
		f.setSize(400,400);
		f.setLayout(null);
		f.setVisible(true);
		
	}

	public static void main(String[] args) {
		new JavaList();
	

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(list.getSelectedIndex()!=-1) {
		jl.setText("selected value"+list.getSelectedValue());
		
	
	}
	}
}
