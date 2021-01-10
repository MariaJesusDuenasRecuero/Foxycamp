package presentacion;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JProgressBar;
import java.awt.Font;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;

public class Splashz extends JFrame  {

	private JPanel contentPane;
	private JLabel lblCargando;
	private JProgressBar progressBar;

	/**
	 * Launch the application.
	 */
	
	/**
	 * Create the frame.
	 */
	public Splashz() {
		setUndecorated(true);
		setBounds(100, 100, 897, 508);
		contentPane = new JPanel();
		contentPane.setBorder(new LineBorder(Color.WHITE, 5, true));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel pnlcontenido = new JPanel();
		pnlcontenido.setBorder(null);
		pnlcontenido.setBackground(new Color(255, 153, 102));
		contentPane.add(pnlcontenido, BorderLayout.CENTER);
		pnlcontenido.setLayout(null);
		
		lblCargando = new JLabel("");
		lblCargando.setIcon(new ImageIcon(Splashz.class.getResource("/presentacion/Vanilla-1.7s-267px.gif")));
		lblCargando.setHorizontalAlignment(SwingConstants.CENTER);
		lblCargando.setBounds(183, 363, 520, 71);
		pnlcontenido.add(lblCargando);
		
		progressBar = new JProgressBar();
		progressBar.setBorderPainted(false);
		progressBar.setOpaque(true);
		progressBar.setIgnoreRepaint(true);
		progressBar.setStringPainted(true);
		progressBar.setFont(new Font("Verdana", Font.PLAIN, 16));
		progressBar.setBackground(new Color(255, 228, 196));
		progressBar.setForeground(new Color(255, 153, 102));
		progressBar.setBounds(183, 431, 520, 45);
		pnlcontenido.add(progressBar);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBorder(null);
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Verdana", Font.BOLD, 22));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setIcon(new ImageIcon(Splashz.class.getResource("/presentacion/SplashFoxycamp.png")));
		lblNewLabel.setBounds(0, -20, 874, 518);
		pnlcontenido.add(lblNewLabel);
		
	}
	
	public static void main(String[] args) {
		Splashz splash = new Splashz ();
		splash.setVisible(true);
		try {
			
			for(int i=0;i<=100;i++) {
				Thread.sleep(50);
				splash.progressBar.setValue(i);
				if(i==100) {
					P_Login login = new P_Login();
					splash.setVisible(false);
					login.setVisible(true);
					
				}
			}
		}catch(Exception e){
			
		}
	}
	
}
