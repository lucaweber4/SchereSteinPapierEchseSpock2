package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import exceptions.ExceptionHandler;
import exceptions.WrongInputException;

import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GuiStart2 extends JFrame {

	private JPanel contentPane;
	public static JTextField textField;
	ImageIcon image = new ImageIcon(view.GuiStart2.class.getResource("stein.png")); //Bild kann auch auf anderen Computern angezeigt werden
	private JTextField textField_1;
	String rundenS;
	public static int runden;
	
	/*
	 * Bild wird nur am eigenen PC angezeigt
	 * 
	String bild = "C:\\Users\\Luc\\Desktop\\stein.png";
	ImageIcon image = new ImageIcon(bild);
	*/

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GuiStart2 start = new GuiStart2();
					start.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public GuiStart2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(400, 400, 700, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("", image, SwingConstants.CENTER);
		lblNewLabel.setBounds(72, 123, 562, 427);
		contentPane.add(lblNewLabel);
		
		imageSkalieren();
		
		JLabel lblWillkommenBeiScheresteinpapierechsespock = new JLabel("Willkommen bei Schere-Stein-Papier-Echse-Spock:");
		lblWillkommenBeiScheresteinpapierechsespock.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblWillkommenBeiScheresteinpapierechsespock.setBounds(10, 11, 664, 23);
		contentPane.add(lblWillkommenBeiScheresteinpapierechsespock);
		
		JLabel lblBbtteGibDeinen = new JLabel("Bitte gib deinen Namen ein:");
		lblBbtteGibDeinen.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblBbtteGibDeinen.setBounds(10, 45, 176, 23);
		contentPane.add(lblBbtteGibDeinen);
		
		textField = new JTextField();
		textField.setBounds(196, 46, 231, 23);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblRegeln = new JLabel("Regeln:");
		lblRegeln.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblRegeln.setBounds(10, 117, 52, 23);
		contentPane.add(lblRegeln);
		
		JButton btnStart = new JButton("Start");
		btnStart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				btnStartPressed();
			}
		});
		btnStart.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnStart.setBackground(Color.GREEN);
		btnStart.setBounds(545, 45, 89, 23);
		contentPane.add(btnStart);
		
		JLabel lblWievieleRundenMchtest = new JLabel("Wieviele Runden m\u00F6chtest du spielen?");
		lblWievieleRundenMchtest.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblWievieleRundenMchtest.setBounds(10, 79, 252, 23);
		contentPane.add(lblWievieleRundenMchtest);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(258, 82, 169, 23);
		contentPane.add(textField_1);
	}
	
	public void btnStartPressed()
	{
		try
		{
			ExceptionHandler.checkName(textField.getText());
			rundenS = textField_1.getText();
			//runden = Integer.parseInt(rundenS);
			ExceptionHandler.checkRunden(rundenS);
			GuiSpiel2 spiel = new GuiSpiel2();
			spiel.setVisible(true);
			//dispose();
		}
		catch(WrongInputException ex)
		{
			ex.showOptionPane(GuiStart2.this);
		}
	}
	
	public void imageSkalieren()
	{
		image.setImage(image.getImage().getScaledInstance(420, 420, Image.SCALE_DEFAULT));
	}
}
