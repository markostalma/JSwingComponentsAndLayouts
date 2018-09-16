import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class JComboBoxTutorial {
	JFrame frame = new JFrame("JComboBox Demo");
	JPanel panel = new JPanel();
	//JLabel label = new JLabel();
	JComboBox<String> comboBox =  new JComboBox<String>();
	//JComboBox<ImageIcon> comboBox =  new JComboBox<ImageIcon>();
	
	DefaultComboBoxModel<String> model = new DefaultComboBoxModel<String>();
	JTextField txtAdd = new JTextField(15);
	JButton btnAdd = new JButton("Add");
	JButton btnRemove = new JButton("Remove");
	String selectedValue;
	
	public JComboBoxTutorial() {
		//comboBox.addItem("China");
		//comboBox.addItem("Russia");
		//comboBox.addItem("USA");
		//comboBox.addItem(new ImageIcon(this.getClass().getResource("/com/icon/add.png")));
		//comboBox.addItem(new ImageIcon(this.getClass().getResource("/com/icon/cancel.png")));
		//comboBox.addItem(new ImageIcon(this.getClass().getResource("/com/icon/refresh.png")));
		
		comboBox.setModel(model);
		
		comboBox.addItemListener(new ItemListener(){
			@Override
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange() == ItemEvent.SELECTED) {
					//ImageIcon icon = (ImageIcon) e.getItem();
					//label.setIcon(icon);
					
					selectedValue = model.getSelectedItem().toString();					
				}
			}
		});
		
		btnAdd.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				model.addElement(txtAdd.getText());
			}
		});
		
		btnRemove.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				model.removeElement(selectedValue);
			}
		});
		
		
		
		//panel.add(label);
		panel.add(txtAdd);
		panel.add(btnRemove);
		panel.add(btnAdd);
		
		panel.add(comboBox);
		frame.add(panel);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				new JComboBoxTutorial();
			}
		});

	}

}
