package exceptions;

import java.awt.Component;

import javax.swing.JOptionPane;

public class WrongInputException extends Exception 
{
	String errortext;
	
	public WrongInputException(String error) 
	{
		errortext = error;
	}
	
	public void showOptionPane(Component parent) 
	{
		JOptionPane.showMessageDialog(parent, errortext, "Falsche Eingabe", JOptionPane.OK_OPTION, null);
	}
}
