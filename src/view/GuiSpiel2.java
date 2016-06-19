package view;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import control.SSPcontrol;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GuiSpiel2 extends JFrame {

	private JPanel contentPane;
	public static JTextField tfWahl;
	public static JTextField tfNotiz;
	public static JTextField tfSs1;
	public static JTextField tfSs2;
	public static int playernumber;

	public GuiSpiel2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(400, 400, 700, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.setBackground(Color.lightGray);
		
		JLabel lblDuBistAn = new JLabel("Du bist an der Reihe:");
		lblDuBistAn.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblDuBistAn.setBounds(10, 11, 142, 23);
		contentPane.add(lblDuBistAn);
		
		JButton btnSchere = new JButton("Schere");
		btnSchere.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				playernumber = 1;
				SSPcontrol.createRandomNumber();
			}
		});
		btnSchere.setBackground(Color.RED);
		btnSchere.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnSchere.setBounds(10, 45, 89, 23);
		contentPane.add(btnSchere);
		
		JButton btnStein = new JButton("Stein");
		btnStein.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				playernumber = 2;
				SSPcontrol.createRandomNumber();
			}
		});
		btnStein.setBackground(Color.ORANGE);
		btnStein.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnStein.setBounds(109, 45, 89, 23);
		contentPane.add(btnStein);
		
		JButton btnPapier = new JButton("Papier");
		btnPapier.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				playernumber = 3;
				SSPcontrol.createRandomNumber();
			}
		});
		btnPapier.setBackground(Color.YELLOW);
		btnPapier.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnPapier.setBounds(208, 45, 89, 23);
		contentPane.add(btnPapier);
		
		JButton btnEchse = new JButton("Echse");
		btnEchse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				playernumber = 4;
				SSPcontrol.createRandomNumber();
			}
		});
		btnEchse.setBackground(Color.GREEN);
		btnEchse.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnEchse.setBounds(307, 45, 89, 23);
		contentPane.add(btnEchse);
		
		JButton btnSpock = new JButton("Spock");
		btnSpock.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				playernumber = 5;
				SSPcontrol.createRandomNumber();
			}
		});
		btnSpock.setBackground(Color.CYAN);
		btnSpock.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnSpock.setBounds(404, 45, 89, 23);
		contentPane.add(btnSpock);
		
		JLabel lblDeinGegnerHat = new JLabel("Dein Gegner hat gew\u00E4hlt:");
		lblDeinGegnerHat.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblDeinGegnerHat.setBounds(10, 167, 188, 23);
		contentPane.add(lblDeinGegnerHat);
		
		tfWahl = new JTextField();
		tfWahl.setEditable(false);
		tfWahl.setVisible(true);
		tfWahl.setBounds(208, 169, 86, 23);
		contentPane.add(tfWahl);
		tfWahl.setColumns(10);
		
		tfNotiz = new JTextField();
		tfNotiz.setEditable(false);
		tfNotiz.setVisible(true);
		tfNotiz.setColumns(10);
		tfNotiz.setBounds(10, 201, 483, 23);
		contentPane.add(tfNotiz);
		
		JLabel lblSpielstand = new JLabel("Spielstand:");
		lblSpielstand.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblSpielstand.setBounds(10, 327, 89, 23);
		contentPane.add(lblSpielstand);
		
		tfSs1 = new JTextField();
		tfSs1.setEditable(false);
		tfSs1.setVisible(true);
		tfSs1.setColumns(10);
		tfSs1.setBounds(121, 329, 40, 23);
		contentPane.add(tfSs1);
		
		tfSs2 = new JTextField();
		tfSs2.setEditable(false);
		tfSs2.setVisible(true);
		tfSs2.setColumns(10);
		tfSs2.setBounds(185, 329, 40, 23);
		contentPane.add(tfSs2);
		
		JLabel label = new JLabel(":");
		label.setFont(new Font("Tahoma", Font.BOLD, 14));
		label.setBounds(169, 331, 15, 14);
		contentPane.add(label);
	}
}
