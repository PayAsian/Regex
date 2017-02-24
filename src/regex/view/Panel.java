package regex.view;

import regex.controller.*;
import javax.swing.*;
import javax.swing.JPanel;

public class Panel extends JPanel
{
	private Controller baseController;
	private SpringLayout baseLayout;
	private JTextArea DisplayOne;
	private JTextArea DisplayTwo;
	private JTextArea DisplayThree;
	private JTextArea DisplayFour;
	private JLabel LabelOne;
	private JLabel LabelTwo;
	private JLabel LabelThree;
	private JLabel LabelFour;
	private JButton Button;
	
	public Panel(Controller baseController)
	{
		super();
		this.baseController = baseController;
		baseLayout = new SpringLayout();
		DisplayOne = new JTextArea(25,25);
		DisplayTwo = new JTextArea(25,25);
		DisplayThree = new JTextArea(25,25);
		DisplayFour = new JTextArea(25,25);
		LabelOne = new JLabel("First Name");
		LabelTwo = new JLabel("Last Name");
		LabelThree = new JLabel("Phone Number");
		LabelFour = new JLabel("Email");
		Button = new JButton("Submit");
		
		setupRegexDisplay();
		setupRegexPanel();
		setupRegexLayout();
	}
	
	private void setupRegexDisplay()
	{
		DisplayOne.setEditable(false);
		DisplayTwo.setEditable(false);
		DisplayThree.setEditable(false);
		DisplayFour.setEditable(false);
		
	}
	
	private void setupRegexPanel()
	{
		
	}
	
	private void setupRegexLayout()
	{
		
	}
	
}
