package presentacion;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


@SuppressWarnings("serial")
public class P_About extends JFrame {

	private JPanel contentPane;
	JFrame frmAbout;


	/**
	 * Create the frame.
	 */
	public P_About() {
		frmAbout = new JFrame();
		frmAbout.setIconImage(Toolkit.getDefaultToolkit().getImage(P_About.class.getResource("/presentacion/informacion.png")));
		frmAbout.setTitle("Sobre nosotros");
		//Propiedades generales de todos los frames
		frmAbout.setBounds(new Rectangle(0, 0, 1300, 1000));
		frmAbout.setResizable(false);
		frmAbout.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(248, 248, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		frmAbout.getContentPane().add(contentPane);
		
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
		lblLogoZorro.setIcon(new ImageIcon(P_About.class.getResource("/presentacion/fox.png")));
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
		lblAyuda.addMouseListener(new LblAyudaMouseListener());
		lblAyuda.setToolTipText("Ayuda");
		lblAyuda.setIcon(new ImageIcon(P_About.class.getResource("/presentacion/signo-de-interrogacion-dibujar.png")));
		GridBagConstraints gbc_lblAyuda = new GridBagConstraints();
		gbc_lblAyuda.anchor = GridBagConstraints.SOUTH;
		gbc_lblAyuda.insets = new Insets(0, 0, 5, 5);
		gbc_lblAyuda.gridx = 10;
		gbc_lblAyuda.gridy = 1;
		pnlHeader.add(lblAyuda, gbc_lblAyuda);

		JLabel lblTraductor = new JLabel("");
		lblTraductor.setToolTipText("Traductor");
		lblTraductor.setIcon(new ImageIcon(P_About.class.getResource("/presentacion/traductor.png")));
		GridBagConstraints gbc_lblTraductor = new GridBagConstraints();
		gbc_lblTraductor.anchor = GridBagConstraints.SOUTH;
		gbc_lblTraductor.insets = new Insets(0, 0, 5, 5);
		gbc_lblTraductor.gridx = 11;
		gbc_lblTraductor.gridy = 1;
		pnlHeader.add(lblTraductor, gbc_lblTraductor);
		
		JLabel lblPerfil = new JLabel("");
		lblPerfil.setIcon(new ImageIcon(P_About.class.getResource("/presentacion/usuario.png")));
		GridBagConstraints gbc_lblPerfil = new GridBagConstraints();
		gbc_lblPerfil.anchor = GridBagConstraints.SOUTH;
		gbc_lblPerfil.insets = new Insets(0, 0, 5, 5);
		gbc_lblPerfil.gridx = 12;
		gbc_lblPerfil.gridy = 1;
		pnlHeader.add(lblPerfil, gbc_lblPerfil);
		
		JLabel lblFlechaPerfil = new JLabel("");
		lblFlechaPerfil.setIcon(new ImageIcon(P_About.class.getResource("/presentacion/flecha-hacia-abajo-del-angulo.png")));
		GridBagConstraints gbc_lblFlechaPerfil = new GridBagConstraints();
		gbc_lblFlechaPerfil.anchor = GridBagConstraints.SOUTHWEST;
		gbc_lblFlechaPerfil.insets = new Insets(0, 0, 5, 5);
		gbc_lblFlechaPerfil.gridx = 13;
		gbc_lblFlechaPerfil.gridy = 1;
		pnlHeader.add(lblFlechaPerfil, gbc_lblFlechaPerfil);
		JPopupMenu pmFlecha = new JPopupMenu();
		addPopup(lblFlechaPerfil, pmFlecha);
		
		JLabel lblPerfilOption = new JLabel("    Adrian Ruiz");
		lblPerfilOption.setIcon(new ImageIcon(P_About.class.getResource("/presentacion/PerfilAdri.png")));
		pmFlecha.add(lblPerfilOption);
		
		JButton btnAjustes = new JButton("   Ajustes               ");
		btnAjustes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				P_Perfil frmPerfil = new P_Perfil();
				frmPerfil.getFrame().setVisible(true);
				frmAbout.dispose();
			}
		});
		btnAjustes.setIcon(new ImageIcon(P_About.class.getResource("/presentacion/configuraciones.png")));
		pmFlecha.add(btnAjustes);
		
		JButton btnDesconectar = new JButton("   Salir                     ");
		btnDesconectar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				P_Login frmLogin = new P_Login();
				frmLogin.getFrame().setVisible(true);
				frmAbout.dispose();
			}
		});
		btnDesconectar.setIcon(new ImageIcon(P_About.class.getResource("/presentacion/desconectar.png")));
		pmFlecha.add(btnDesconectar);
		
		lblFlechaPerfil.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				pmFlecha.show(e.getComponent(), e.getX(), e.getY());
			}
		});
		
		

		JLabel lblLeftLine = new JLabel("");
		lblLeftLine.setAlignmentX(Component.CENTER_ALIGNMENT);
		lblLeftLine.setVerticalAlignment(SwingConstants.BOTTOM);
		lblLeftLine.setHorizontalAlignment(SwingConstants.LEFT);
		lblLeftLine.setBorder(new LineBorder(new Color(210, 105, 30), 2, true));
		GridBagConstraints gbc_lblLeftLine = new GridBagConstraints();
		gbc_lblLeftLine.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblLeftLine.gridwidth = 12;
		gbc_lblLeftLine.insets = new Insets(0, 0, 0, 5);
		gbc_lblLeftLine.gridx = 1;
		gbc_lblLeftLine.gridy = 2;
		pnlHeader.add(lblLeftLine, gbc_lblLeftLine);
		
		JPanel pnlContenido = new JPanel();
		pnlContenido.setBackground(new Color(255, 228, 196));
		contentPane.add(pnlContenido, BorderLayout.CENTER);
		pnlContenido.setLayout(null);
		
		JLabel lblMaria = new JLabel("");
		lblMaria.setFont(new Font("Tahoma", Font.PLAIN, 95));
		lblMaria.setVerticalAlignment(SwingConstants.BOTTOM);
		lblMaria.setIcon(new ImageIcon(P_About.class.getResource("/presentacion/Maria.png")));
		lblMaria.setBounds(93, 175, 300, 300);
		pnlContenido.add(lblMaria);
		
		JLabel lblAdri = new JLabel("");
		lblAdri.setIcon(new ImageIcon(P_About.class.getResource("/presentacion/adrian.png")));
		lblAdri.setBounds(499, 175, 300, 300);
		pnlContenido.add(lblAdri);
		
		JLabel lblMJ = new JLabel("");
		lblMJ.setIcon(new ImageIcon(P_About.class.getResource("/presentacion/mj.png")));
		lblMJ.setBounds(899, 175, 300, 300);
		pnlContenido.add(lblMJ);
		
		JLabel lblMariaB = new JLabel("Maria Blanco Gónzalez-Mohíno");
		lblMariaB.setHorizontalAlignment(SwingConstants.CENTER);
		lblMariaB.setFont(new Font("Verdana", Font.BOLD, 16));
		lblMariaB.setBounds(93, 488, 300, 14);
		pnlContenido.add(lblMariaB);
		
		JLabel lblAdrianR = new JLabel("Adrián Ruiz Esteban");
		lblAdrianR.setHorizontalAlignment(SwingConstants.CENTER);
		lblAdrianR.setFont(new Font("Verdana", Font.BOLD, 16));
		lblAdrianR.setBounds(499, 491, 300, 14);
		pnlContenido.add(lblAdrianR);
		
		JLabel lblMjessD = new JLabel("MªJesús Dueñas Recuero");
		lblMjessD.setHorizontalAlignment(SwingConstants.CENTER);
		lblMjessD.setFont(new Font("Verdana", Font.BOLD, 16));
		lblMjessD.setBounds(899, 491, 300, 14);
		pnlContenido.add(lblMjessD);
		
		JLabel lblMiembros = new JLabel("Miembros del equipo");
		lblMiembros.setHorizontalAlignment(SwingConstants.CENTER);
		lblMiembros.setForeground(new Color(210, 105, 30));
		lblMiembros.setFont(new Font("Verdana", Font.BOLD, 46));
		lblMiembros.setBounds(93, 63, 1106, 50);
		pnlContenido.add(lblMiembros);
		
		JLabel lblSalir = new JLabel("");
		lblSalir.setIcon(new ImageIcon(P_About.class.getResource("/presentacion/exit.png")));
		lblSalir.setBounds(46, 618, 70, 70);
		pnlContenido.add(lblSalir);
		
		

	}
	
	private class LblAyudaMouseListener extends MouseAdapter {
		@Override
		public void mouseClicked(MouseEvent e) {
			P_Ayuda frmAyuda = new P_Ayuda();
			frmAyuda.getFrame().setVisible(true);
			frmAbout.dispose();
		}
	}
	
	public JFrame getFrame() {
		return frmAbout;
	}
	
	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {

		});
	}
	
}