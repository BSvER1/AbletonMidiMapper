package com.abletonMidiMapper.obj;

import javax.swing.JPanel;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;
import javax.swing.JTextPane;

public class MidiWidget extends JPanel {
	
	Canvas background;
	JLabel lblVal;
	JTextPane txtpnNotes;
	JLabel lblCC_num;
	
	int currentMidiVal = 0;
	/**
	 * Create the panel.
	 */
	public MidiWidget() {
		setLayout(null);
		setForeground(getBackground());
		
		setPreferredSize(new Dimension(100, 100));
		setSize(getPreferredSize());
		setMinimumSize(getPreferredSize());
		setMaximumSize(getPreferredSize());
		
		background = new Canvas();
		background.setBounds(0, 0, getWidth(), getHeight());
		background.setBackground(new Color(10,10,10,10));
		add(background);
		
		lblCC_num = new JLabel("CC##");
		lblCC_num.setHorizontalAlignment(SwingConstants.CENTER);
		lblCC_num.setBounds(0, 11, getWidth(), 14);
		add(lblCC_num);
		
		lblVal = new JLabel("Val");
		lblVal.setHorizontalAlignment(SwingConstants.CENTER);
		lblVal.setBounds(0, 28, getWidth(), 14);
		lblVal.setText("Val: "+currentMidiVal);
		add(lblVal);
		
		txtpnNotes = new JTextPane();
		txtpnNotes.setEditable(false);
		setNotesText("Notes");
		txtpnNotes.setBackground(new Color(0,0,0,0)); //set background to be transparent
		int notesYPos = 53;
		txtpnNotes.setBounds(0, notesYPos, getWidth(), getHeight()-notesYPos);
		add(txtpnNotes);
		txtpnNotes.setVisible(true);
		
		
		revalidate();
		setVisible(true);
	}
	
	private void updateCurrentValueDisplay() {
		//set as full width
		int x = 0;
		int width = getWidth();
		
		//set height to be amount of signal
		int y = getHeight() - currentMidiVal;
		int height = getHeight() - y;
		background.setBounds(x, y, width, height);
		
		lblVal.setText("Val: "+currentMidiVal);
	}
	
	private void setNotesText(String text) {
		txtpnNotes.setText(text);
		
		StyledDocument doc = txtpnNotes.getStyledDocument();
		SimpleAttributeSet center = new SimpleAttributeSet();
		StyleConstants.setAlignment(center, StyleConstants.ALIGN_CENTER);
		doc.setParagraphAttributes(0, doc.getLength(), center, false);
	}
}
