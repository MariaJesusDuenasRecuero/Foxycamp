package presentacion;

import java.awt.BorderLayout; 
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.Rectangle;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Cursor;

public class P_Ayuda extends JFrame {

	private JPanel contentPane;
	private JButton btnContactos;
	private JButton btnManual;
	private JButton btnVideo;
	private JFrame frmAyuda;
	private String nombreAux;

	public P_Ayuda(String nombre) {
		nombreAux = nombre;
		frmAyuda = new JFrame();
		frmAyuda.setBackground(Color.WHITE);
		frmAyuda.setIconImage(Toolkit.getDefaultToolkit()
				.getImage(P_Ayuda.class.getResource("/presentacion/servicio-al-cliente.png"))); //$NON-NLS-1$
		frmAyuda.setTitle(MessagesP_Ayuda.getString("P_Ayuda.frmAyuda.title")); //$NON-NLS-1$
		frmAyuda.setResizable(false);
		frmAyuda.setBounds(new Rectangle(0, 0, 1375, 800));
		frmAyuda.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(255, 153, 0));
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		frmAyuda.getContentPane().add(contentPane);

		JPanel pnlHeader = new JPanel();
		pnlHeader.setBackground(new Color(255, 228, 196));
		contentPane.add(pnlHeader, BorderLayout.NORTH);
		
		GridBagLayout gbl_pnlHeader = new GridBagLayout();
		gbl_pnlHeader.columnWidths = new int[] { 50, 44, 64, 300, 0, 0, 358, 92, 50, 50, 64, 46, 18, 0, 0, 0, 0 };
		gbl_pnlHeader.rowHeights = new int[] { 50, 0, 50, 0 };
		gbl_pnlHeader.columnWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
				0.0, 0.0, Double.MIN_VALUE };
		gbl_pnlHeader.rowWeights = new double[] { 0.0, 1.0, 0.0, Double.MIN_VALUE };
		pnlHeader.setLayout(gbl_pnlHeader);

		JLabel lblLogoZorro = new JLabel(""); //$NON-NLS-1$
		lblLogoZorro.setBackground(new Color(255, 228, 181));
		lblLogoZorro.setIcon(new ImageIcon(P_About.class.getResource("/presentacion/fox.png"))); //$NON-NLS-1$
		GridBagConstraints gbc_lblLogoZorro = new GridBagConstraints();
		gbc_lblLogoZorro.insets = new Insets(0, 0, 5, 5);
		gbc_lblLogoZorro.gridx = 2;
		gbc_lblLogoZorro.gridy = 1;
		pnlHeader.add(lblLogoZorro, gbc_lblLogoZorro);

		JLabel lblFoxycamp = new JLabel("FOXYCAMP"); //$NON-NLS-1$
		lblFoxycamp.setForeground(new Color(210, 105, 30));
		lblFoxycamp.setFont(new Font("Verdana", Font.BOLD, 40)); //$NON-NLS-1$
		GridBagConstraints gbc_lblFoxycamp = new GridBagConstraints();
		gbc_lblFoxycamp.insets = new Insets(0, 0, 5, 5);
		gbc_lblFoxycamp.gridx = 3;
		gbc_lblFoxycamp.gridy = 1;
		pnlHeader.add(lblFoxycamp, gbc_lblFoxycamp);

		JLabel lblAyuda = new JLabel(""); //$NON-NLS-1$
		lblAyuda.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblAyuda.addMouseListener(new LblAyudaMouseListener());
		lblAyuda.setToolTipText(""); //$NON-NLS-1$
		lblAyuda.setIcon(new ImageIcon(P_About.class.getResource("/presentacion/signo-de-interrogacion-dibujar.png"))); //$NON-NLS-1$
		GridBagConstraints gbc_lblAyuda = new GridBagConstraints();
		gbc_lblAyuda.anchor = GridBagConstraints.SOUTH;
		gbc_lblAyuda.insets = new Insets(0, 0, 5, 5);
		gbc_lblAyuda.gridx = 10;
		gbc_lblAyuda.gridy = 1;
		pnlHeader.add(lblAyuda, gbc_lblAyuda);
		
				JLabel lblTraductor = new JLabel(""); //$NON-NLS-1$
				lblTraductor.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
				lblTraductor.setToolTipText(""); //$NON-NLS-1$
				lblTraductor.setIcon(new ImageIcon(P_About.class.getResource("/presentacion/traductor.png"))); //$NON-NLS-1$
				GridBagConstraints gbc_lblTraductor = new GridBagConstraints();
				gbc_lblTraductor.anchor = GridBagConstraints.SOUTH;
				gbc_lblTraductor.insets = new Insets(0, 0, 5, 5);
				gbc_lblTraductor.gridx = 11;
				gbc_lblTraductor.gridy = 1;
				pnlHeader.add(lblTraductor, gbc_lblTraductor);
		
		JLabel lblFlechaTraductor = new JLabel(""); //$NON-NLS-1$
		lblFlechaTraductor.setIcon(new ImageIcon(P_About.class.getResource("/presentacion/flecha-hacia-abajo-del-angulo.png"))); //$NON-NLS-1$
		
		JPopupMenu pmFlecha2 = new JPopupMenu();
		addPopup(lblFlechaTraductor, pmFlecha2);
		
		JButton btnEspanol = new JButton(MessagesP_Ayuda.getString("P_Ayuda.btnEspanol.text")); //$NON-NLS-1$ //$NON-NLS-1$
		btnEspanol.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MessagesP_About.setIdioma("español"); //$NON-NLS-1$
				MessagesP_Ayuda.setIdioma("español");
				MessagesP_Login.setIdioma("español");
				MessagesP_Perfil.setIdioma("español");
				MessagesP_Registro.setIdioma("español");
				MessagesPrincipal.setIdioma("español");
				P_Ayuda frm = new P_Ayuda(nombre);
				frmAyuda.dispose();
				frm.getFrame().setVisible(true);
			}
		});
		pmFlecha2.add(btnEspanol);
		
		JButton btnIngles = new JButton(MessagesP_Ayuda.getString("P_Ayuda.btnIngles.text")); //$NON-NLS-1$ //$NON-NLS-1$
		btnIngles.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MessagesP_About.setIdioma("inglés"); //$NON-NLS-1$
				MessagesP_Ayuda.setIdioma("inglés");
				MessagesP_Login.setIdioma("inglés");
				MessagesP_Perfil.setIdioma("inglés");
				MessagesP_Registro.setIdioma("inglés");
				MessagesPrincipal.setIdioma("inglés");
				P_Ayuda frm = new P_Ayuda(nombre);
				frmAyuda.dispose();
				frm.getFrame().setVisible(true);
			}
		});
		pmFlecha2.add(btnIngles);
		GridBagConstraints gbc_lblFlechaTraductor = new GridBagConstraints();
		gbc_lblFlechaTraductor.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblFlechaTraductor.anchor = GridBagConstraints.SOUTH;
		gbc_lblFlechaTraductor.insets = new Insets(0, 0, 5, 5);
		gbc_lblFlechaTraductor.gridx = 12;
		gbc_lblFlechaTraductor.gridy = 1;
		pnlHeader.add(lblFlechaTraductor, gbc_lblFlechaTraductor);
		
		JLabel lblPerfil = new JLabel(""); //$NON-NLS-1$
		lblPerfil.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblPerfil.setIcon(new ImageIcon(P_About.class.getResource("/presentacion/usuario.png"))); //$NON-NLS-1$
		GridBagConstraints gbc_lblPerfil = new GridBagConstraints();
		gbc_lblPerfil.anchor = GridBagConstraints.SOUTH;
		gbc_lblPerfil.insets = new Insets(0, 0, 5, 5);
		gbc_lblPerfil.gridx = 13;
		gbc_lblPerfil.gridy = 1;
		pnlHeader.add(lblPerfil, gbc_lblPerfil);
		
		JLabel lblFlechaPerfil = new JLabel(""); //$NON-NLS-1$
		lblFlechaPerfil.setIcon(new ImageIcon(P_About.class.getResource("/presentacion/flecha-hacia-abajo-del-angulo.png"))); //$NON-NLS-1$
		GridBagConstraints gbc_lblFlechaPerfil = new GridBagConstraints();
		gbc_lblFlechaPerfil.anchor = GridBagConstraints.SOUTHWEST;
		gbc_lblFlechaPerfil.insets = new Insets(0, 0, 5, 5);
		gbc_lblFlechaPerfil.gridx = 14;
		gbc_lblFlechaPerfil.gridy = 1;
		pnlHeader.add(lblFlechaPerfil, gbc_lblFlechaPerfil);
		JPopupMenu pmFlecha = new JPopupMenu();
		pmFlecha.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		addPopup(lblFlechaPerfil, pmFlecha);
		
		JLabel lblPerfilOption = new JLabel(nombre);
		lblPerfilOption.setIcon(nuevoIcono(nombre));
		pmFlecha.add(lblPerfilOption);
		
		JButton btnAjustes = new JButton(MessagesP_Ayuda.getString("P_Ayuda.btnAjustes.text_1")); //$NON-NLS-1$ //$NON-NLS-1$
		btnAjustes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				P_Perfil frmPerfil = new P_Perfil(nombre);
				frmPerfil.getFrame().setVisible(true);
				frmAyuda.dispose();
			}
		});
		btnAjustes.setIcon(new ImageIcon(P_About.class.getResource("/presentacion/configuraciones.png"))); //$NON-NLS-1$
		pmFlecha.add(btnAjustes);
		
		JButton btnDesconectar = new JButton(MessagesP_Ayuda.getString("P_Ayuda.btnDesconectar.text_1")); //$NON-NLS-1$ //$NON-NLS-1$
		btnDesconectar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				P_Login frmLogin = new P_Login();
				frmLogin.getFrame().setVisible(true);
				frmAyuda.dispose();
			}
		});
		btnDesconectar.setIcon(new ImageIcon(P_About.class.getResource("/presentacion/desconectar.png"))); //$NON-NLS-1$
		pmFlecha.add(btnDesconectar);
		
		lblFlechaPerfil.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				pmFlecha.show(e.getComponent(), e.getX(), e.getY());
			}
		});
		
		lblFlechaTraductor.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				pmFlecha2.show(e.getComponent(), e.getX(), e.getY());
			}
		});

		JLabel lblLeftLine = new JLabel(""); //$NON-NLS-1$
		lblLeftLine.setAlignmentX(Component.CENTER_ALIGNMENT);
		lblLeftLine.setVerticalAlignment(SwingConstants.BOTTOM);
		lblLeftLine.setHorizontalAlignment(SwingConstants.LEFT);
		lblLeftLine.setBorder(new LineBorder(new Color(210, 105, 30), 2, true));
		GridBagConstraints gbc_lblLeftLine = new GridBagConstraints();
		gbc_lblLeftLine.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblLeftLine.gridwidth = 13;
		gbc_lblLeftLine.insets = new Insets(0, 0, 0, 5);
		gbc_lblLeftLine.gridx = 1;
		gbc_lblLeftLine.gridy = 2;
		pnlHeader.add(lblLeftLine, gbc_lblLeftLine);

		JPanel pnlContenido = new JPanel();
		pnlContenido.setBackground(new Color(255, 228, 181));
		contentPane.add(pnlContenido, BorderLayout.WEST);
		GridBagLayout gbl_pnlContenido = new GridBagLayout();
		gbl_pnlContenido.columnWidths = new int[] { 75, 200, 225, 200, 335, 100, 0 };
		gbl_pnlContenido.rowHeights = new int[] { 75, 0, 77, 0, 50, 39, 75, 0, 50, 0, 0, 0 };
		gbl_pnlContenido.columnWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
		gbl_pnlContenido.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
		pnlContenido.setLayout(gbl_pnlContenido);

		JLabel lblFoxycamp_1 = new JLabel("FOXYCAMP"); //$NON-NLS-1$
		lblFoxycamp_1.setForeground(new Color(210, 105, 30));
		lblFoxycamp_1.setFont(new Font("Verdana", Font.BOLD, 40)); //$NON-NLS-1$
		GridBagConstraints gbc_lblFoxycamp_1 = new GridBagConstraints();
		gbc_lblFoxycamp_1.anchor = GridBagConstraints.SOUTHWEST;
		gbc_lblFoxycamp_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblFoxycamp_1.gridx = 1;
		gbc_lblFoxycamp_1.gridy = 2;
		pnlContenido.add(lblFoxycamp_1, gbc_lblFoxycamp_1);

		JLabel lblAtencionCliente = new JLabel(""); //$NON-NLS-1$
		lblAtencionCliente.setIcon(new ImageIcon(P_Ayuda.class.getResource("/presentacion/servicio-al-cliente.png"))); //$NON-NLS-1$
		GridBagConstraints gbc_lblAtencionCliente = new GridBagConstraints();
		gbc_lblAtencionCliente.fill = GridBagConstraints.VERTICAL;
		gbc_lblAtencionCliente.gridwidth = 2;
		gbc_lblAtencionCliente.gridheight = 9;
		gbc_lblAtencionCliente.insets = new Insets(0, 0, 5, 5);
		gbc_lblAtencionCliente.gridx = 2;
		gbc_lblAtencionCliente.gridy = 0;
		pnlContenido.add(lblAtencionCliente, gbc_lblAtencionCliente);

		btnContactos = new JButton(MessagesP_Ayuda.getString("P_Ayuda.btnContactos.text")); //$NON-NLS-1$
		btnContactos.addActionListener(new BtnContactarActionListener());
		btnContactos.setBackground(new Color(255, 140, 0));
		btnContactos.setIcon(new ImageIcon(P_Ayuda.class.getResource("/presentacion/llamada-telefonica.png"))); //$NON-NLS-1$
		btnContactos.setFont(new Font("Verdana", Font.BOLD, 20)); //$NON-NLS-1$
		GridBagConstraints gbc_btnContactos = new GridBagConstraints();
		gbc_btnContactos.fill = GridBagConstraints.BOTH;
		gbc_btnContactos.insets = new Insets(0, 0, 5, 5);
		gbc_btnContactos.gridx = 4;
		gbc_btnContactos.gridy = 2;
		btnContactos.setBorder(new RoundedBorder(10));
		pnlContenido.add(btnContactos, gbc_btnContactos);

		JLabel lblAtencionC = new JLabel(MessagesP_Ayuda.getString("P_Ayuda.lblAtencionC.text")); //$NON-NLS-1$
		lblAtencionC.setForeground(new Color(255, 165, 0));
		lblAtencionC.setFont(new Font("Verdana", Font.BOLD, 30)); //$NON-NLS-1$
		GridBagConstraints gbc_lblAtencionC = new GridBagConstraints();
		gbc_lblAtencionC.anchor = GridBagConstraints.NORTH;
		gbc_lblAtencionC.insets = new Insets(0, 0, 5, 5);
		gbc_lblAtencionC.gridx = 1;
		gbc_lblAtencionC.gridy = 3;
		pnlContenido.add(lblAtencionC, gbc_lblAtencionC);

		btnManual = new JButton(MessagesP_Ayuda.getString("P_Ayuda.btnManual.text")); //$NON-NLS-1$
		btnManual.setIcon(new ImageIcon(P_Ayuda.class.getResource("/presentacion/instrucciones.png"))); //$NON-NLS-1$
		btnManual.setFont(new Font("Verdana", Font.BOLD, 20)); //$NON-NLS-1$
		btnManual.setBackground(new Color(255, 140, 0));
		btnManual.addActionListener(new BtnManualActionListener());
		GridBagConstraints gbc_btnManual = new GridBagConstraints();
		gbc_btnManual.fill = GridBagConstraints.BOTH;
		gbc_btnManual.insets = new Insets(0, 0, 5, 5);
		gbc_btnManual.gridx = 4;
		gbc_btnManual.gridy = 4;
		btnManual.setBorder(new RoundedBorder(10));
		pnlContenido.add(btnManual, gbc_btnManual);

		btnVideo = new JButton(MessagesP_Ayuda.getString("P_Ayuda.btnVideo.text")); //$NON-NLS-1$
		btnVideo.setBackground(new Color(255, 140, 0));
		btnVideo.setIcon(new ImageIcon(P_Ayuda.class.getResource("/presentacion/boton-de-play.png"))); //$NON-NLS-1$
		btnVideo.setFont(new Font("Verdana", Font.BOLD, 20)); //$NON-NLS-1$
		btnVideo.setBorder(new RoundedBorder(12));
		btnVideo.addActionListener(new BtnVideoActionListener());
		GridBagConstraints gbc_btnVideo = new GridBagConstraints();
		gbc_btnVideo.fill = GridBagConstraints.BOTH;
		gbc_btnVideo.insets = new Insets(0, 0, 5, 5);
		gbc_btnVideo.gridx = 4;
		gbc_btnVideo.gridy = 6;
		btnVideo.setBorder(new RoundedBorder(10));
		pnlContenido.add(btnVideo, gbc_btnVideo);
		
		JButton btnVolver = new JButton(MessagesP_Ayuda.getString("P_Ayuda.btnVolver.text")); //$NON-NLS-1$
		btnVolver.addActionListener(new BtnVolverActionListener());
		btnVolver.setIcon(new ImageIcon(P_Ayuda.class.getResource("/presentacion/volver-flecha (1).png"))); //$NON-NLS-1$
		btnVolver.setFont(new Font("Verdana", Font.BOLD, 20)); //$NON-NLS-1$
		
		btnVolver.setBackground(new Color(255, 165, 0));
		btnVolver.setBorder(new RoundedBorder(10));
		GridBagConstraints gbc_btnVolver = new GridBagConstraints();
		gbc_btnVolver.anchor = GridBagConstraints.WEST;
		gbc_btnVolver.insets = new Insets(0, 0, 0, 5);
		gbc_btnVolver.gridx = 1;
		gbc_btnVolver.gridy = 10;
		pnlContenido.add(btnVolver, gbc_btnVolver);

	}
	private Icon nuevoIcono(String nombre) {
		Icon icon = null;
		if(nombre == "Adrián Ruiz")icon = new ImageIcon(P_Principal.class.getResource("/presentacion/PerfilAdri.png")); //$NON-NLS-1$ //$NON-NLS-2$
		if(nombre == "María Jesús") icon = new ImageIcon(P_Principal.class.getResource("/presentacion/PerfilMj.png")); //$NON-NLS-1$ //$NON-NLS-2$
		if(nombre == "María Blanco") icon = new ImageIcon(P_Principal.class.getResource("/presentacion/PerfilMaria.png")); //$NON-NLS-1$ //$NON-NLS-2$
		
		return icon;
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
			P_Ayuda frmAyuda2 = new P_Ayuda(nombreAux);
			frmAyuda2.getFrame().setVisible(true);
			frmAyuda.dispose();

		}
	}
	
	private class BtnVideoActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			//TODO : Poner aqui la dir del videeo
			String direccion = " "; //$NON-NLS-1$
			try {
				String osName = System.getProperty("os.name"); //$NON-NLS-1$
				 if(osName.contains("Windows")) { //$NON-NLS-1$
				 	Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler " + direccion); //$NON-NLS-1$
				 }else if(osName.contains("Linux")) { //$NON-NLS-1$
					 Runtime.getRuntime().exec("open " + direccion); //$NON-NLS-1$
				 }else if(osName.contains("Mac OS X")) { //$NON-NLS-1$
					 Runtime.getRuntime().exec("open " + direccion); //$NON-NLS-1$
			} else{ 
					 System.out.println("Sistema no soportado"); //$NON-NLS-1$
				 }
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		}
	}
	 	
	
	private class BtnManualActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			String direccion = "https://docs.google.com/document/d/1IZFfm1B2IFfjRn9QCIsnC97dpqEssj0fT-w4kyYJeAY/edit?usp=sharing"; //$NON-NLS-1$
			try {
				String osName = System.getProperty("os.name"); //$NON-NLS-1$
				 if(osName.contains("Windows")) { //$NON-NLS-1$
				 	Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler " + direccion); //$NON-NLS-1$
				 }else if(osName.contains("Linux")) { //$NON-NLS-1$
					 Runtime.getRuntime().exec("open " + direccion); //$NON-NLS-1$
				 }else if(osName.contains("Mac OS X")) { //$NON-NLS-1$
					 Runtime.getRuntime().exec("open " + direccion); //$NON-NLS-1$
			} else{ 
					JOptionPane.showMessageDialog(null, "OS no soportado"); //$NON-NLS-1$
				 }
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		}
	}
	private class BtnContactarActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			String formato = MessagesP_Ayuda.getString("P_Ayuda.56") //$NON-NLS-1$
					+ MessagesP_Ayuda.getString("P_Ayuda.57") //$NON-NLS-1$
					+ MessagesP_Ayuda.getString("P_Ayuda.58"); //$NON-NLS-1$

			JOptionPane.showMessageDialog(null, formato, MessagesP_Ayuda.getString("P_Ayuda.59"), JOptionPane.INFORMATION_MESSAGE); //$NON-NLS-1$
		}
	}
	private class BtnVolverActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			P_Principal frmPrincipal = new P_Principal(nombreAux);
			frmPrincipal.getFrame().setVisible(true);
			frmAyuda.dispose();
		}
	}

}