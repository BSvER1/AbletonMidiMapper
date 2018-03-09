package com.abletonMidiMapper.obj;

import java.awt.Color;

import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTextPane;
import javax.swing.UIManager;

import net.miginfocom.swing.MigLayout;
import javax.swing.JPanel;
import java.awt.GridLayout;
import java.awt.Canvas;

public class AppFrame extends JFrame {
	/**
	 * Create the frame.
	 */
	public AppFrame() {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		setTitle("Ableton Virtual Midi Mapper v0.1");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 984, 525);
		getContentPane().setLayout(new MigLayout("", "[grow]", "[grow][growprio 99,grow,shrinkprio 101]"));
		
		JScrollPane scrollPane = new JScrollPane();
		getContentPane().add(scrollPane, "cell 0 0,grow");
		
		JPanel midiWidgetHolder = new JPanel();
		scrollPane.setViewportView(midiWidgetHolder);
		midiWidgetHolder.setLayout(new GridLayout(10, 10, 1, 1));
		
		MidiWidget m1 = new MidiWidget();
		midiWidgetHolder.add(m1);
		
		JTextPane txtpnHelpText = new JTextPane();
		//set background to be transparent
		txtpnHelpText.setBackground(new Color(0,0,0,0));
		txtpnHelpText.setEditable(false);
		txtpnHelpText.setText("This is help text.");
		getContentPane().add(txtpnHelpText, "cell 0 1,grow");
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnFile = new JMenu("File");
		menuBar.add(mnFile);
		
		JMenuItem mntmNew = new JMenuItem("New");
		mnFile.add(mntmNew);
		
		JMenuItem mntmLoad = new JMenuItem("Load");
		mnFile.add(mntmLoad);
		
		JMenuItem mntmSave = new JMenuItem("Save");
		mnFile.add(mntmSave);
		
		JMenuItem mntmSaveAs = new JMenuItem("Save As..");
		mnFile.add(mntmSaveAs);
		
		JSeparator separator = new JSeparator();
		mnFile.add(separator);
		
		JMenuItem mntmQuit = new JMenuItem("Quit");
		mnFile.add(mntmQuit);
		
		JMenu mnEdit = new JMenu("Edit");
		menuBar.add(mnEdit);
		
		JCheckBoxMenuItem chckbxmntmLiveEditMode = new JCheckBoxMenuItem("Live Edit Mode");
		mnEdit.add(chckbxmntmLiveEditMode);
		
		JCheckBoxMenuItem chckbxmntmAssignMode = new JCheckBoxMenuItem("Assign Mode");
		mnEdit.add(chckbxmntmAssignMode);
		
		JMenu mnHelp = new JMenu("Help");
		menuBar.add(mnHelp);
		
		JMenuItem mntmAbout = new JMenuItem("About");
		mnHelp.add(mntmAbout);
		
		setVisible(true);
	}

}
