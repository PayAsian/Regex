package regex.view;

import regex.controller.*;
import javax.swing.JFrame;
import java.awt.Dimension;


public class Frame extends JFrame
{
	private Controller baseController;
	private	Panel appPanel;
	
	public Frame(Controller baseController)
	{
		super();
		this.baseController = baseController;
		this.appPanel = new Panel(baseController);
		
		this.setupFrame();
	}
	
	public void setupFrame()
	{
		this.setContentPane(appPanel);
		this.setTitle(" ");
		this.setSize(new Dimension(700, 700));
		this.setVisible(true);
		
	}
}
	
