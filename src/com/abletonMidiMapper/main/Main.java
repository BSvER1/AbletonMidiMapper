package com.abletonMidiMapper.main;

import com.abletonMidiMapper.obj.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String osName = System.getProperty("os.name").toLowerCase();
		boolean isMacOs = osName.startsWith("mac os x");
		if (isMacOs) 
		{
			System.setProperty("apple.laf.useScreenMenuBar", "true");
		}
		
		AppFrame f = new AppFrame();
	}

}
