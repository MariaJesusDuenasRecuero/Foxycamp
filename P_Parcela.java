package presentacion;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import java.awt.Rectangle;
import javax.swing.JButton;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class P_Parcela extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					P_Parcela frame = new P_Parcela();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public P_Parcela() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(P_Parcela.class.getResource("/presentacion/casa-de-perro.png")));
		setTitle("Parcelas");
		//Propiedades generales de todos los frames
		setBounds(new Rectangle(0, 0, 1300, 1000));
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(248, 248, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel pnlHeader = new JPanel();
		pnlHeader.setBackground(new Color(255, 228, 196));
		contentPane.add(pnlHeader, BorderLayout.NORTH);
		
		GridBagLayout gbl_pnlHeader = new GridBagLayout();
		gbl_pnlHeader.columnWidths = new int[] { 50, 44, 64, 300, 0, 0, 358, 92, 50, 50, 64, 64, 0, 0, 0, 0 };
		gbl_pnlHeader.rowHeights = new int[] { 50, 0, 50, 0 };
		gbl_pnlHeader.columnWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
				0.0, 0.0, Double.MIN_VALUE };
		gbl_pnlHeader.rowWeights = new double[] { 0.0, 0.0, 0.0, Double.MIN_VALUE };
		pnlHeader.setLayout(gbl_pnlHeader);

		JLabel lblLogoZorro = new JLabel("");
		lblLogoZorro.setBackground(new Color(255, 228, 181));
		lblLogoZorro.setIcon(new ImageIcon(P_Login.class.getResource("/presentacion/fox.png")));
		GridBagConstraints gbc_lblLogoZorro = new GridBagConstraints();
		gbc_lblLogoZorro.insets = new Insets(0, 0, 5, 5);
		gbc_lblLogoZorro.gridx = 2;
		gbc_lblLogoZorro.gridy = 1;
		pnlHeader.add(lblLogoZorro, gbc_lblLogoZorro);

		JLabel lblFoxycamp = new JLabel("FOXYCAMP");
		lblFoxycamp.setForeground(new Color(210, 105, 30));
		lblFoxycamp.setFont(new Font("Verdana", Font.BOLD, 40));
		GridBagConstraints gbc_lblFoxycamp = new GridBagConstraints();
		gbc_lblFoxycamp.insets = new Insets(0, 0, 5, 5);
		gbc_lblFoxycamp.gridx = 3;
		gbc_lblFoxycamp.gridy = 1;
		pnlHeader.add(lblFoxycamp, gbc_lblFoxycamp);

		JLabel lblAyuda = new JLabel("");
		lblAyuda.setToolTipText("Ayuda");
		lblAyuda.setIcon(new ImageIcon(P_Login.class.getResource("/presentacion/signo-de-interrogacion-dibujar.png")));
		GridBagConstraints gbc_lblAyuda = new GridBagConstraints();
		gbc_lblAyuda.anchor = GridBagConstraints.SOUTH;
		gbc_lblAyuda.insets = new Insets(0, 0, 5, 5);
		gbc_lblAyuda.gridx = 10;
		gbc_lblAyuda.gridy = 1;
		pnlHeader.add(lblAyuda, gbc_lblAyuda);

		JLabel lblTraductor = new JLabel("");
		lblTraductor.setToolTipText("Traductor");
		lblTraductor.setIcon(new ImageIcon(P_Login.class.getResource("/presentacion/traductor.png")));
		GridBagConstraints gbc_lblTraductor = new GridBagConstraints();
		gbc_lblTraductor.anchor = GridBagConstraints.SOUTH;
		gbc_lblTraductor.insets = new Insets(0, 0, 5, 5);
		gbc_lblTraductor.gridx = 11;
		gbc_lblTraductor.gridy = 1;
		pnlHeader.add(lblTraductor, gbc_lblTraductor);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(P_Parcela.class.getResource("/presentacion/usuario.png")));
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.anchor = GridBagConstraints.SOUTH;
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 12;
		gbc_lblNewLabel.gridy = 1;
		pnlHeader.add(lblNewLabel, gbc_lblNewLabel);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(P_Parcela.class.getResource("/presentacion/flecha-hacia-abajo-del-angulo.png")));
		GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
		gbc_lblNewLabel_2.anchor = GridBagConstraints.SOUTHWEST;
		gbc_lblNewLabel_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_2.gridx = 13;
		gbc_lblNewLabel_2.gridy = 1;
		pnlHeader.add(lblNewLabel_2, gbc_lblNewLabel_2);

		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setAlignmentX(Component.CENTER_ALIGNMENT);
		lblNewLabel_1.setVerticalAlignment(SwingConstants.BOTTOM);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1.setBorder(new LineBorder(new Color(210, 105, 30), 2, true));
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblNewLabel_1.gridwidth = 5;
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 0, 5);
		gbc_lblNewLabel_1.gridx = 1;
		gbc_lblNewLabel_1.gridy = 2;
		pnlHeader.add(lblNewLabel_1, gbc_lblNewLabel_1);

		JLabel lblPerfil = new JLabel("");
		lblPerfil.setVerticalAlignment(SwingConstants.BOTTOM);
		lblPerfil.setHorizontalAlignment(SwingConstants.LEFT);
		lblPerfil.setBorder(new LineBorder(new Color(210, 105, 30), 2, true));
		lblPerfil.setAlignmentX(0.5f);
		GridBagConstraints gbc_lblPerfil = new GridBagConstraints();
		gbc_lblPerfil.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblPerfil.gridwidth = 6;
		gbc_lblPerfil.insets = new Insets(0, 0, 0, 5);
		gbc_lblPerfil.gridx = 7;
		gbc_lblPerfil.gridy = 2;
		pnlHeader.add(lblPerfil, gbc_lblPerfil);
		
		JPanel pnlContenido = new JPanel();
		pnlContenido.setBackground(new Color(255, 228, 196));
		contentPane.add(pnlContenido, BorderLayout.CENTER);
		pnlContenido.setLayout(null);
		
		JButton btnParcela = new JButton("Parcelas");
		btnParcela.setHorizontalAlignment(SwingConstants.RIGHT);
		btnParcela.setFont(new Font("Verdana", Font.PLAIN, 30));
		btnParcela.setBackground(new Color(248, 248, 255));
		btnParcela.setBounds(74, 195, 257, 76);
		pnlContenido.add(btnParcela);
		
		JLabel lblParcela = new JLabel("");
		lblParcela.setHorizontalAlignment(SwingConstants.CENTER);
		lblParcela.setIcon(new ImageIcon(P_Parcela.class.getResource("/presentacion/casa.png")));
		lblParcela.setBounds(89, 209, 71, 49);
		pnlContenido.add(lblParcela);

		
		
		
		
	}
}
