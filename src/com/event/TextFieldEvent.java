package com.event;

// import java.awt.event.ActionEvent;
// import java.awt.event.ActionListener;
// import java.awt.event.FocusEvent;
// import java.awt.event.FocusListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;


public class TextFieldEvent {

	JFrame frame = new JFrame("Text Field Demo");
	JPanel panel = new JPanel();
	JTextField textField = new JTextField("", 20);
	JButton button = new JButton("Ok");
	
	public TextFieldEvent() {	
		
		// Action Listener
		/*
		textField.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField.setText("This is a text");
			}
		});
		
		*/
		
		// Focus Listener
		/*
		textField.addFocusListener(new FocusListener() {
			
			public void focusGained(FocusEvent arg0) {
				textField.setText("");
			}
			
			public void focusLost(FocusEvent arg0) {
				textField.setText("Please enter some text");
			}
		});
		*/
		
		// Document Listener
		textField.getDocument().addDocumentListener(new DocumentListener() {
			
			
			@Override
			public void changedUpdate(DocumentEvent arg0) {
				warn();
			}
			@Override
			public void insertUpdate(DocumentEvent arg0) {
				warn();
			}
			@Override
			public void removeUpdate(DocumentEvent arg0) {
				warn();
			}
			
			public void warn() {
				button.setText(textField.getText());
			}
		});
		
		
		panel.add(textField);
		panel.add(button);
		frame.add(panel);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
	}
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable(){
			public void run() {
				new TextFieldEvent();
			}
		});
	}

}
