package com.abletonMidiMapper.obj;

import javax.swing.JFrame;

public class DispWindow {
	private JFrame f;
	
	public DispWindow() {
		f = new JFrame();
		f.setTitle("Ableton Virtual Midi Mapper");
		
		f.setBounds(200, 200, 500, 500);
		
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
		
		
	}
}
