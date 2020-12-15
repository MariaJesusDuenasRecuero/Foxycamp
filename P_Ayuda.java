package presentacion;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.Rectangle;
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
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.Insets;

import javax.swing.border.Border;

import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class P_Ayuda extends JFrame {

	private JPanel contentPane;
	private JButton btnContactos;
	private JButton btnManual;
	private JButton btnVideo;
	private JFrame frmAyuda;


	/**
	 * Create the frame.
	 */
	public P_Ayuda() {
		frmAyuda = new JFrame();
		frmAyuda.setBackground(Color.WHITE);
		frmAyuda.setIconImage(Toolkit.getDefaultToolkit()
				.getImage(P_Ayuda.class.getResource("/presentacion/servicio-al-cliente.png")));
		frmAyuda.setTitle("Ayuda");
		frmAyuda.setResizable(false);
		frmAyuda.setBounds(new Rectangle(0, 0, 1375, 800));
		frmAyuda.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(255, 153, 0));
		contentPane.setBackground(new Color(255, 228, 196));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		frmAyuda.getContentPane().add(contentPane);

		JPanel pnlHeader = new JPanel();
		pnlHeader.setBackground(new Color(255, 228, 196));
		contentPane.add(pnlHeader, BorderLayout.NORTH);
		GridBagLayout gbl_pnlHeader = new GridBagLayout();
		gbl_pnlHeader.columnWidths = new int[] { 50, 44, 64, 300, 0, 0, 358, 92, 50, 50, 64, 64, 0, 28, 0, 0 };
		gbl_pnlHeader.rowHeights = new int[] { 50, 0, 50, 0 };
		gbl_pnlHeader.columnWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
				0.0, 0.0, Double.MIN_VALUE };
		gbl_pnlHeader.rowWeights = new double[] { 0.0, 0.0, 0.0, Double.MIN_VALUE };
		pnlHeader.setLayout(gbl_pnlHeader);

		JLabel lblLogoZorro = new JLabel("");
		lblLogoZorro.setIcon(new ImageIcon(P_Principal.class.getResource("/presentacion/fox.png")));
		lblLogoZorro.setBackground(new Color(255, 228, 181));
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
		lblAyuda.setIcon(
				new ImageIcon(P_Principal.class.getResource("/presentacion/signo-de-interrogacion-dibujar.png")));
		lblAyuda.setToolTipText("Ayuda");
		GridBagConstraints gbc_lblAyuda = new GridBagConstraints();
		gbc_lblAyuda.anchor = GridBagConstraints.SOUTH;
		gbc_lblAyuda.insets = new Insets(0, 0, 5, 5);
		gbc_lblAyuda.gridx = 10;
		gbc_lblAyuda.gridy = 1;
		pnlHeader.add(lblAyuda, gbc_lblAyuda);
		lblAyuda.addMouseListener(new LblAyudaMouseListener());

		JLabel lblTraductor = new JLabel("");
		lblTraductor.setIcon(new ImageIcon(P_Principal.class.getResource("/presentacion/traductor.png")));
		lblTraductor.setToolTipText("Traductor");
		GridBagConstraints gbc_lblTraductor = new GridBagConstraints();
		gbc_lblTraductor.anchor = GridBagConstraints.SOUTH;
		gbc_lblTraductor.insets = new Insets(0, 0, 5, 5);
		gbc_lblTraductor.gridx = 11;
		gbc_lblTraductor.gridy = 1;
		pnlHeader.add(lblTraductor, gbc_lblTraductor);

		JLabel lblPerfil = new JLabel("");
		lblPerfil.setIcon(new ImageIcon(P_Principal.class.getResource("/presentacion/usuario.png")));
		GridBagConstraints gbc_lblPerfil = new GridBagConstraints();
		gbc_lblPerfil.anchor = GridBagConstraints.SOUTH;
		gbc_lblPerfil.insets = new Insets(0, 0, 5, 5);
		gbc_lblPerfil.gridx = 12;
		gbc_lblPerfil.gridy = 1;
		pnlHeader.add(lblPerfil, gbc_lblPerfil);

		JLabel lblFlecha = new JLabel("");

		lblFlecha.setIcon(
				new ImageIcon(P_Principal.class.getResource("/presentacion/flecha-hacia-abajo-del-angulo.png")));

		JPopupMenu pmFlecha = new JPopupMenu();
		addPopup(lblFlecha, pmFlecha);

		JLabel lblPerfilOption = new JLabel("    Adrián Ruiz");
		lblPerfilOption.setFont(new Font("Verdana", Font.PLAIN, 14));
		lblPerfilOption.setIcon(new ImageIcon(P_Ayuda.class.getResource("/presentacion/PerfilAdri.png")));
		pmFlecha.add(lblPerfilOption);

		JSeparator separator = new JSeparator();
		separator.setBorder(new LineBorder(new Color(255, 200, 0), 10));
		pmFlecha.add(separator);

		JButton btnAbout = new JButton("   Sobre nosotros");
		btnAbout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				P_About frmAbout = new P_About();
				frmAbout.getFrame().setVisible(true);
				frmAyuda.dispose();
			}
		});
		btnAbout.setBounds(new Rectangle(0, 0, 50, 0));
		btnAbout.setIcon(new ImageIcon(P_Principal.class.getResource("/presentacion/informacion.png")));
		pmFlecha.add(btnAbout);

		JSeparator separator_1 = new JSeparator();
		separator_1.setBorder(new LineBorder(Color.ORANGE, 10));
		pmFlecha.add(separator_1);

		JButton btnAjustes = new JButton("   Ajustes               ");
		btnAjustes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				P_Perfil frmPerfil = new P_Perfil();
				frmPerfil.getFrame().setVisible(true);
				frmAyuda.dispose();
			}
		});
		btnAjustes.setIcon(new ImageIcon(P_Principal.class.getResource("/presentacion/configuraciones.png")));
		pmFlecha.add(btnAjustes);

		JButton btnDesconectar = new JButton("   Salir                     ");
		btnDesconectar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				P_Login frmLogin = new P_Login(); 
				frmLogin.getFrame().setVisible(true);
				frmAyuda.dispose();
			}
		});
		btnDesconectar.setIcon(new ImageIcon(P_Principal.class.getResource("/presentacion/desconectar.png")));
		pmFlecha.add(btnDesconectar);

		lblFlecha.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				pmFlecha.show(e.getComponent(), e.getX(), e.getY());
			}
		});
		GridBagConstraints gbc_lblFlecha = new GridBagConstraints();
		gbc_lblFlecha.anchor = GridBagConstraints.SOUTH;
		gbc_lblFlecha.insets = new Insets(0, 0, 5, 5);
		gbc_lblFlecha.gridx = 13;
		gbc_lblFlecha.gridy = 1;
		pnlHeader.add(lblFlecha, gbc_lblFlecha);

		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setVerticalAlignment(SwingConstants.BOTTOM);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1.setBorder(new LineBorder(new Color(210, 105, 30), 2, true));
		lblNewLabel_1.setAlignmentX(0.5f);
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblNewLabel_1.gridwidth = 14;
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 0, 5);
		gbc_lblNewLabel_1.gridx = 1;
		gbc_lblNewLabel_1.gridy = 2;
		pnlHeader.add(lblNewLabel_1, gbc_lblNewLabel_1);

		JPanel pnlContenido = new JPanel();
		pnlContenido.setBackground(new Color(255, 228, 181));
		contentPane.add(pnlContenido, BorderLayout.WEST);
		GridBagLayout gbl_pnlContenido = new GridBagLayout();
		gbl_pnlContenido.columnWidths = new int[] { 75, 200, 225, 200, 335, 100, 0 };
		gbl_pnlContenido.rowHeights = new int[] { 75, 0, 77, 0, 50, 39, 75, 0, 50, 0 };
		gbl_pnlContenido.columnWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
		gbl_pnlContenido.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
		pnlContenido.setLayout(gbl_pnlContenido);

		JLabel lblFoxycamp_1 = new JLabel("FOXYCAMP");
		lblFoxycamp_1.setForeground(new Color(210, 105, 30));
		lblFoxycamp_1.setFont(new Font("Verdana", Font.BOLD, 40));
		GridBagConstraints gbc_lblFoxycamp_1 = new GridBagConstraints();
		gbc_lblFoxycamp_1.anchor = GridBagConstraints.SOUTHWEST;
		gbc_lblFoxycamp_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblFoxycamp_1.gridx = 1;
		gbc_lblFoxycamp_1.gridy = 2;
		pnlContenido.add(lblFoxycamp_1, gbc_lblFoxycamp_1);

		JLabel lblAtencionCliente = new JLabel("");
		lblAtencionCliente.setIcon(new ImageIcon(P_Ayuda.class.getResource("/presentacion/servicio-al-cliente.png")));
		GridBagConstraints gbc_lblAtencionCliente = new GridBagConstraints();
		gbc_lblAtencionCliente.fill = GridBagConstraints.VERTICAL;
		gbc_lblAtencionCliente.gridwidth = 2;
		gbc_lblAtencionCliente.gridheight = 9;
		gbc_lblAtencionCliente.insets = new Insets(0, 0, 0, 5);
		gbc_lblAtencionCliente.gridx = 2;
		gbc_lblAtencionCliente.gridy = 0;
		pnlContenido.add(lblAtencionCliente, gbc_lblAtencionCliente);

		btnContactos = new JButton("Contáctenos");
		btnContactos.setBackground(new Color(255, 140, 0));
		btnContactos.setIcon(new ImageIcon(P_Ayuda.class.getResource("/presentacion/llamada-telefonica.png")));
		btnContactos.setFont(new Font("Verdana", Font.BOLD, 20));
		GridBagConstraints gbc_btnContactos = new GridBagConstraints();
		gbc_btnContactos.fill = GridBagConstraints.BOTH;
		gbc_btnContactos.insets = new Insets(0, 0, 5, 5);
		gbc_btnContactos.gridx = 4;
		gbc_btnContactos.gridy = 2;
		pnlContenido.add(btnContactos, gbc_btnContactos);

		JLabel lblAtencionC = new JLabel("Atención al cliente");
		lblAtencionC.setForeground(new Color(255, 165, 0));
		lblAtencionC.setFont(new Font("Verdana", Font.BOLD, 30));
		GridBagConstraints gbc_lblAtencionC = new GridBagConstraints();
		gbc_lblAtencionC.anchor = GridBagConstraints.NORTH;
		gbc_lblAtencionC.insets = new Insets(0, 0, 5, 5);
		gbc_lblAtencionC.gridx = 1;
		gbc_lblAtencionC.gridy = 3;
		pnlContenido.add(lblAtencionC, gbc_lblAtencionC);

		btnManual = new JButton("Manual de usuario");
		btnManual.setIcon(new ImageIcon(P_Ayuda.class.getResource("/presentacion/instrucciones.png")));
		btnManual.setFont(new Font("Verdana", Font.BOLD, 20));
		btnManual.setBackground(new Color(255, 140, 0));
		GridBagConstraints gbc_btnManual = new GridBagConstraints();
		gbc_btnManual.fill = GridBagConstraints.BOTH;
		gbc_btnManual.insets = new Insets(0, 0, 5, 5);
		gbc_btnManual.gridx = 4;
		gbc_btnManual.gridy = 4;
		pnlContenido.add(btnManual, gbc_btnManual);

		btnVideo = new JButton(" Video ayuda");
		btnVideo.setBackground(new Color(255, 140, 0));
		btnVideo.setIcon(new ImageIcon(P_Ayuda.class.getResource("/presentacion/boton-de-play.png")));
		btnVideo.setFont(new Font("Verdana", Font.BOLD, 20));
		btnVideo.setBorder(new RoundedBorder(12));
		GridBagConstraints gbc_btnVideo = new GridBagConstraints();
		gbc_btnVideo.fill = GridBagConstraints.BOTH;
		gbc_btnVideo.insets = new Insets(0, 0, 5, 5);
		gbc_btnVideo.gridx = 4;
		gbc_btnVideo.gridy = 6;
		pnlContenido.add(btnVideo, gbc_btnVideo);

	}

	public class RoundedBorder implements Border {

		private int radius;

		RoundedBorder(int radius) {
			this.radius = radius;
		}

		public Insets getBorderInsets(Component c) {
			return new Insets(this.radius + 1, this.radius + 1, this.radius + 2, this.radius);
		}

		public boolean isBorderOpaque() {
			return true;
		}

		public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
			g.drawRoundRect(x, y, width - 1, height - 1, radius, radius);
		}
	}

	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {

		});
	}
	
	public JFrame getFrame() {
		return frmAyuda;
	}
	
	private class LblAyudaMouseListener extends MouseAdapter {
		@Override
		public void mouseClicked(MouseEvent e) {
			P_Ayuda frmAyuda2 = new P_Ayuda();
			frmAyuda2.getFrame().setVisible(true);
			frmAyuda.dispose();

		}
	}

}
