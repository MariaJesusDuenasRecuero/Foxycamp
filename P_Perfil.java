package presentacion;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Rectangle;
import java.awt.Color;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.Font;
import java.awt.Graphics;
import javax.swing.border.LineBorder;

import presentacion.P_Perfil.RoundedBorder;

import javax.swing.SwingConstants;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JPopupMenu;
import javax.swing.JScrollPane;

import java.awt.Component;
import java.awt.Cursor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import javax.swing.border.Border;
import javax.swing.JSeparator;
import javax.swing.JTextField;

import java.awt.Toolkit;
import javax.swing.border.TitledBorder;


public class P_Perfil extends JFrame {

	private JPanel contentPane;
	private JButton btnInformacion;
	private JButton  btnContrasena;
	private JButton btnFormacion;
	private JButton btnCerrarCuenta;
	private JButton btnVolver;
	private JTextField textNombre;
	private JTextField textApellidos;
	private JTextField textCiudad;
	private JTextField textEmail;
	private JTextField textCodigoPostal;
	private JTextField textTelefono;
	JButton btnCargarImagen;
	JFrame frmPerfil;
	V_PerfilContrasena panelContrasena;
	V_Informacion panelInformacion;
	JPanel panel;
	V_Formacion panelFormacion;
	V_PerfilCerrarCuenta panelCerrarCuenta;
	private String nombreAux;
	private Icon iconAux;
	/**
	 * Create the frame.
	 */
	public P_Perfil(String nombre, Icon icon) {
		nombreAux = nombre;
		iconAux = icon;
		frmPerfil = new JFrame();
		frmPerfil.setBackground(Color.WHITE);
		frmPerfil.getContentPane().setBackground(Color.WHITE);
		frmPerfil.setTitle(MessagesP_Perfil.getString("P_Perfil.frmPerfil.title")); //$NON-NLS-1$
		frmPerfil.setIconImage(Toolkit.getDefaultToolkit().getImage(P_Perfil.class.getResource("/presentacion/usuario.png"))); //$NON-NLS-1$
		frmPerfil.setBounds(new Rectangle(0, 0, 1375, 800));
		frmPerfil.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(255, 153, 0));
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		frmPerfil.getContentPane().add(contentPane);

		JPanel pnlHeader = new JPanel();
		pnlHeader.setBackground(new Color(255, 228, 196));
		contentPane.add(pnlHeader, BorderLayout.NORTH);
		
		GridBagLayout gbl_pnlHeader = new GridBagLayout();
		gbl_pnlHeader.columnWidths = new int[] { 50, 44, 64, 300, 0, 0, 358, 55, 50, 50, 64, 46, 18, 0, 0, 0, 0 };
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
		
		JButton btnEspanol = new JButton(MessagesP_Perfil.getString("P_Perfil.btnEspanol.text")); //$NON-NLS-1$ //$NON-NLS-1$
		btnEspanol.setIcon(new ImageIcon(P_Perfil.class.getResource("/presentacion/lengua-espanola.png")));
		btnEspanol.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MessagesP_About.setIdioma("español"); //$NON-NLS-1$
				MessagesP_Ayuda.setIdioma("español");
				MessagesP_Login.setIdioma("español");
				MessagesP_Perfil.setIdioma("español");
				MessagesP_Registro.setIdioma("español");
				MessagesPrincipal.setIdioma("español");
				
				MessagesV_ActHistorial.setIdioma("español"); //$NON-NLS-1$
				MessagesV_Actividades.setIdioma("español");
				MessagesV_Bungalows.setIdioma("español");
				MessagesV_BungalowsPromociones.setIdioma("español");
				MessagesV_Formacion.setIdioma("español");
				MessagesV_Informacion.setIdioma("español");
				MessagesV_Inscribirse.setIdioma("español"); //$NON-NLS-1$
				MessagesV_Inscritos.setIdioma("español");
				MessagesV_Parcela.setIdioma("español");
				MessagesV_PerfilCerrarCuenta.setIdioma("español");
				MessagesV_PerfilContrasena.setIdioma("español");
				MessagesV_PromocionesActividades.setIdioma("español");
				MessagesV_Reservas.setIdioma("español"); //$NON-NLS-1$
				MessagesV_Ruta.setIdioma("español");
				MessagesV_RutaCrear.setIdioma("español");
				MessagesV_RutaElegida.setIdioma("español");
				MessagesV_RutaInscribirse.setIdioma("español");
				MessagesV_RutaInscritos.setIdioma("español");
				MessagesV_VerReservasBungalows.setIdioma("español");
				MessagesV_VerReservasParcelas.setIdioma("español");
				
				P_Perfil frm = new P_Perfil(nombre, icon);
				frmPerfil.dispose();
				frm.getFrame().setVisible(true);
			}
		});
		pmFlecha2.add(btnEspanol);
		
		JButton btnIngles = new JButton(MessagesP_Perfil.getString("P_Perfil.btnIngles.text")); //$NON-NLS-1$ //$NON-NLS-1$
		btnIngles.setIcon(new ImageIcon(P_Perfil.class.getResource("/presentacion/idioma-en-ingles.png")));
		btnIngles.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MessagesP_About.setIdioma("inglés"); //$NON-NLS-1$
				MessagesP_Ayuda.setIdioma("inglés");
				MessagesP_Login.setIdioma("inglés");
				MessagesP_Perfil.setIdioma("inglés");
				MessagesP_Registro.setIdioma("inglés");
				MessagesPrincipal.setIdioma("inglés");
				
				MessagesV_ActHistorial.setIdioma("inglés"); //$NON-NLS-1$
				MessagesV_Actividades.setIdioma("inglés");
				MessagesV_Bungalows.setIdioma("inglés");
				MessagesV_BungalowsPromociones.setIdioma("inglés");
				MessagesV_Formacion.setIdioma("inglés");
				MessagesV_Informacion.setIdioma("inglés");
				MessagesV_Inscribirse.setIdioma("inglés"); //$NON-NLS-1$
				MessagesV_Inscritos.setIdioma("inglés");
				MessagesV_Parcela.setIdioma("inglés");
				MessagesV_PerfilCerrarCuenta.setIdioma("inglés");
				MessagesV_PerfilContrasena.setIdioma("inglés");
				MessagesV_PromocionesActividades.setIdioma("inglés");
				MessagesV_Reservas.setIdioma("inglés"); //$NON-NLS-1$
				MessagesV_Ruta.setIdioma("inglés");
				MessagesV_RutaCrear.setIdioma("inglés");
				MessagesV_RutaElegida.setIdioma("inglés");
				MessagesV_RutaInscribirse.setIdioma("inglés");
				MessagesV_RutaInscritos.setIdioma("inglés");
				MessagesV_VerReservasBungalows.setIdioma("inglés");
				MessagesV_VerReservasParcelas.setIdioma("inglés");
				
				P_Perfil frm = new P_Perfil(nombre, icon);
				frmPerfil.dispose();
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
		
		LocalDate date = LocalDate.now(); // Gets the current date
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		String date_cu = date.format(formatter);
		JLabel lblUltimaFecha = new JLabel("Última fecha: " + date_cu);
		lblUltimaFecha.setFont(new Font("Verdana", Font.PLAIN, 9));
		pmFlecha.add(lblUltimaFecha);
		
		JButton btnAbout = new JButton(MessagesP_Perfil.getString("P_Perfil.btnAbout.text_1")); //$NON-NLS-1$
        btnAbout.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                P_About frmAbout = new P_About(nombre, icon);
                frmAbout.getFrame().setVisible(true);
                frmPerfil.dispose();
            }
        });
        btnAbout.setBounds(new Rectangle(0, 0, 70, 0));
        btnAbout.setIcon(new ImageIcon(P_Principal.class.getResource("/presentacion/IconAboutUs.png")));
        pmFlecha.add(btnAbout);
		
		JButton btnDesconectar = new JButton(MessagesP_Perfil.getString("P_Perfil.btnDesconectar.text")); //$NON-NLS-1$ //$NON-NLS-1$
		btnDesconectar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				P_Login frmLogin = new P_Login();
				frmLogin.getFrame().setVisible(true);
				frmPerfil.dispose();
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

		JLabel lblNewLabel_1 = new JLabel(""); //$NON-NLS-1$
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

		JPanel pnlPerfil = new JPanel();
		pnlPerfil.setBackground(new Color(255, 228, 196));
		contentPane.add(pnlPerfil, BorderLayout.CENTER);
		pnlPerfil.setLayout(null);

		JPanel pnlBotones = new JPanel();
		pnlBotones.setBackground(new Color(255, 228, 196));
		pnlBotones.setBounds(new Rectangle(0, 0, 293, 575));
		pnlPerfil.add(pnlBotones);
		pnlBotones.setLayout(null);

		btnInformacion = new JButton(MessagesP_Perfil.getString("P_Perfil.btnInformacion.text")); //$NON-NLS-1$
		
		btnInformacion.setBounds(37, 11, 242, 65);
		pnlBotones.add(btnInformacion);
		btnInformacion.setHorizontalTextPosition(SwingConstants.RIGHT);
		btnInformacion.setIcon(new ImageIcon(P_Perfil.class.getResource("/presentacion/info.png"))); //$NON-NLS-1$
		btnInformacion.setFont(new Font("Verdana", Font.BOLD, 20)); //$NON-NLS-1$
		btnInformacion.setBackground(Color.WHITE);
		btnInformacion.setBorder(new RoundedBorder(12));
		btnInformacion.addActionListener(new BtnInformacionActionListener());

		btnContrasena = new JButton(MessagesP_Perfil.getString("P_Perfil.btnContrasena.text")); //$NON-NLS-1$
		btnContrasena.addActionListener(new BtnContrasenaActionListener());
		btnContrasena.setBounds(37, 118, 242, 65);
		pnlBotones.add(btnContrasena);
		btnContrasena.setIcon(new ImageIcon(P_Perfil.class.getResource("/presentacion/vintage-key-outline.png"))); //$NON-NLS-1$
		btnContrasena.setBackground(Color.WHITE);
		btnContrasena.setFont(new Font("Verdana", Font.BOLD, 20)); //$NON-NLS-1$
		btnContrasena.setBorder(new RoundedBorder(12));

		btnFormacion = new JButton(MessagesP_Perfil.getString("P_Perfil.btnFormacion.text")); //$NON-NLS-1$
		btnFormacion.addActionListener(new BtnFormacionActionListener());
		btnFormacion.setBounds(37, 229, 242, 65);
		pnlBotones.add(btnFormacion);
		btnFormacion.setIcon(new ImageIcon(P_Perfil.class.getResource("/presentacion/document.png"))); //$NON-NLS-1$
		btnFormacion.setFont(new Font("Verdana", Font.BOLD, 20)); //$NON-NLS-1$
		btnFormacion.setBackground(Color.WHITE);
		btnFormacion.setBorder(new RoundedBorder(12));

		btnCerrarCuenta = new JButton(MessagesP_Perfil.getString("P_Perfil.btnCerrarCuenta.text")); //$NON-NLS-1$
		btnCerrarCuenta.setBounds(37, 342, 242, 65);
		pnlBotones.add(btnCerrarCuenta);
		btnCerrarCuenta.setIcon(new ImageIcon(P_Perfil.class.getResource("/presentacion/unfollow (1).png"))); //$NON-NLS-1$
		btnCerrarCuenta.setFont(new Font("Verdana", Font.BOLD, 20)); //$NON-NLS-1$
		btnCerrarCuenta.setBackground(Color.WHITE);
		btnCerrarCuenta.setBorder(new RoundedBorder(12));
		btnCerrarCuenta.addActionListener(new BtnCerrarCuentaActionListener());

		btnVolver = new JButton(MessagesP_Perfil.getString("P_Perfil.btnVolver.text")); //$NON-NLS-1$
		btnVolver.addActionListener(new BtnVolverActionListener());
		btnVolver.setBounds(37, 498, 242, 33);
		pnlBotones.add(btnVolver);
		btnVolver.setIcon(new ImageIcon(P_Perfil.class.getResource("/presentacion/volver-flecha (1).png"))); //$NON-NLS-1$
		btnVolver.setFont(new Font("Verdana", Font.BOLD, 20)); //$NON-NLS-1$
		btnVolver.setBackground(new Color(255, 165, 0));
		btnVolver.setBorder(new RoundedBorder(12));

		panel = new JPanel();
		setBackground(Color.LIGHT_GRAY);
		panel.setBounds(313, 11, 978, 521);
		pnlPerfil.add(panel);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{50, 210, 50, 78, 0, 0, 0, 0, 130, 68, 0, 110, 50, 20, 0, 30, 20, 0};
		gbl_panel.rowHeights = new int[]{25, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 3, 115, 0, 37, 0};
		gbl_panel.columnWeights = new double[]{0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 2.0, 1.0, 0.0, 1.0, 1.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 1.0, Double.MIN_VALUE};
		panel.setLayout(new CardLayout(5,25));

		JLabel lblInformacion = new JLabel(""); //$NON-NLS-1$
		lblInformacion.setFont(new Font("Verdana", Font.BOLD, 20)); //$NON-NLS-1$
		GridBagConstraints gbc_lblInformacion = new GridBagConstraints();
		gbc_lblInformacion.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblInformacion.insets = new Insets(0, 0, 5, 5);
		gbc_lblInformacion.gridx = 1;
		gbc_lblInformacion.gridy = 1;
		panel.add(lblInformacion, "lblInformacion"); //$NON-NLS-1$

		JLabel lblNombre = new JLabel(MessagesP_Perfil.getString("P_Perfil.lblNombre.text")); //$NON-NLS-1$
		GridBagConstraints gbc_lblNombre = new GridBagConstraints();
		gbc_lblNombre.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblNombre.insets = new Insets(0, 0, 5, 5);
		gbc_lblNombre.gridx = 1;
		gbc_lblNombre.gridy = 3;
		panel.add(lblNombre, "lblNombre"); //$NON-NLS-1$
		
		JLabel lblCargarFoto = new JLabel(MessagesP_Perfil.getString("P_Perfil.lblCargarFoto.text")); //$NON-NLS-1$
		GridBagConstraints gbc_lblCargarFoto = new GridBagConstraints();
		gbc_lblCargarFoto.gridwidth = 4;
		gbc_lblCargarFoto.insets = new Insets(0, 0, 5, 5);
		gbc_lblCargarFoto.gridx = 8;
		gbc_lblCargarFoto.gridy = 3;
		panel.add(lblCargarFoto, "lblCargarFoto"); //$NON-NLS-1$

		textNombre = new JTextField();
		GridBagConstraints gbc_textNombre = new GridBagConstraints();
		gbc_textNombre.insets = new Insets(0, 0, 5, 5);
		gbc_textNombre.fill = GridBagConstraints.HORIZONTAL;
		gbc_textNombre.gridx = 1;
		gbc_textNombre.gridy = 4;
		panel.add(textNombre, "lblNombre"); //$NON-NLS-1$
		textNombre.setColumns(10);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBorder(new TitledBorder(null, MessagesP_Perfil.getString("P_Perfil.scrollPane.borderTitle"), TitledBorder.LEADING, TitledBorder.TOP, null, null)); //$NON-NLS-1$
		GridBagConstraints gbc_scrollPane = new GridBagConstraints();
		gbc_scrollPane.gridwidth = 4;
		gbc_scrollPane.gridheight = 10;
		gbc_scrollPane.insets = new Insets(0, 0, 5, 5);
		gbc_scrollPane.fill = GridBagConstraints.BOTH;
		gbc_scrollPane.gridx = 8;
		gbc_scrollPane.gridy = 4;
		panel.add(scrollPane, "scrollPane"); //$NON-NLS-1$
			
		JLabel lblFoto = new JLabel(""); //$NON-NLS-1$
		scrollPane.setViewportView(lblFoto);

		JLabel lblApellidos = new JLabel(MessagesP_Perfil.getString("P_Perfil.lblApellidos.text")); //$NON-NLS-1$
		GridBagConstraints gbc_lblApellidos = new GridBagConstraints();
		gbc_lblApellidos.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblApellidos.insets = new Insets(0, 0, 5, 5);
		gbc_lblApellidos.gridx = 1;
		gbc_lblApellidos.gridy = 6;
		panel.add(lblApellidos, "lblApellidos"); //$NON-NLS-1$

		textApellidos = new JTextField();
		GridBagConstraints gbc_textApellidos = new GridBagConstraints();
		gbc_textApellidos.gridwidth = 2;
		gbc_textApellidos.insets = new Insets(0, 0, 5, 5);
		gbc_textApellidos.fill = GridBagConstraints.HORIZONTAL;
		gbc_textApellidos.gridx = 1;
		gbc_textApellidos.gridy = 7;
		panel.add(textApellidos, "txtApellidos"); //$NON-NLS-1$
		textApellidos.setColumns(10);

		JLabel lblCiudad = new JLabel(MessagesP_Perfil.getString("P_Perfil.lblCiudad.text")); //$NON-NLS-1$
		GridBagConstraints gbc_lblCiudad = new GridBagConstraints();
		gbc_lblCiudad.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblCiudad.insets = new Insets(0, 0, 5, 5);
		gbc_lblCiudad.gridx = 1;
		gbc_lblCiudad.gridy = 8;
		panel.add(lblCiudad, "lblCiudad"); //$NON-NLS-1$

		textCiudad = new JTextField();
		GridBagConstraints gbc_textCiudad = new GridBagConstraints();
		gbc_textCiudad.insets = new Insets(0, 0, 5, 5);
		gbc_textCiudad.fill = GridBagConstraints.HORIZONTAL;
		gbc_textCiudad.gridx = 1;
		gbc_textCiudad.gridy = 9;
		panel.add(textCiudad, "txtCiudad"); //$NON-NLS-1$
		textCiudad.setColumns(10);

		JLabel lblEmail = new JLabel(MessagesP_Perfil.getString("P_Perfil.lblEmail.text")); //$NON-NLS-1$
		GridBagConstraints gbc_lblEmail = new GridBagConstraints();
		gbc_lblEmail.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblEmail.insets = new Insets(0, 0, 5, 5);
		gbc_lblEmail.gridx = 1;
		gbc_lblEmail.gridy = 10;
		panel.add(lblEmail, "lblEmail"); //$NON-NLS-1$

		textEmail = new JTextField();
		GridBagConstraints gbc_textEmail = new GridBagConstraints();
		gbc_textEmail.gridwidth = 2;
		gbc_textEmail.insets = new Insets(0, 0, 5, 5);
		gbc_textEmail.fill = GridBagConstraints.HORIZONTAL;
		gbc_textEmail.gridx = 1;
		gbc_textEmail.gridy = 11;
		panel.add(textEmail, "txtEmeail"); //$NON-NLS-1$
		textEmail.setColumns(10);

		JLabel lblCodigoPostal = new JLabel(MessagesP_Perfil.getString("P_Perfil.lblCodigoPostal.text")); //$NON-NLS-1$
		GridBagConstraints gbc_lblCodigoPostal = new GridBagConstraints();
		gbc_lblCodigoPostal.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblCodigoPostal.insets = new Insets(0, 0, 5, 5);
		gbc_lblCodigoPostal.gridx = 1;
		gbc_lblCodigoPostal.gridy = 12;
		panel.add(lblCodigoPostal, "lblCodigoPostal"); //$NON-NLS-1$

		textCodigoPostal = new JTextField();
		GridBagConstraints gbc_textCodigoPostal = new GridBagConstraints();
		gbc_textCodigoPostal.insets = new Insets(0, 0, 5, 5);
		gbc_textCodigoPostal.fill = GridBagConstraints.HORIZONTAL;
		gbc_textCodigoPostal.gridx = 1;
		gbc_textCodigoPostal.gridy = 13;
		panel.add(textCodigoPostal, "txtCodigoPostal"); //$NON-NLS-1$
		textCodigoPostal.setColumns(10);

		JLabel lblTelefono = new JLabel(MessagesP_Perfil.getString("P_Perfil.lblTelefono.text")); //$NON-NLS-1$
		GridBagConstraints gbc_lblTelefono = new GridBagConstraints();
		gbc_lblTelefono.insets = new Insets(0, 0, 5, 5);
		gbc_lblTelefono.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblTelefono.gridx = 1;
		gbc_lblTelefono.gridy = 14;
		panel.add(lblTelefono, "lblTelefono"); //$NON-NLS-1$

		textTelefono = new JTextField();
		GridBagConstraints gbc_textTelefono = new GridBagConstraints();
		gbc_textTelefono.insets = new Insets(0, 0, 5, 5);
		gbc_textTelefono.fill = GridBagConstraints.HORIZONTAL;
		gbc_textTelefono.gridx = 1;
		gbc_textTelefono.gridy = 15;
		panel.add(textTelefono, "txtTelefono"); //$NON-NLS-1$
		textTelefono.setColumns(10);
						
		btnCargarImagen = new JButton(MessagesP_Perfil.getString("P_Perfil.btnCargarImagen.text")); //$NON-NLS-1$
		btnCargarImagen.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				JFileChooser fcAbrir = new JFileChooser();
				int valorDevuelto = fcAbrir.showOpenDialog(contentPane);
				//Recoger el nombre del fichero seleccionado por el usuario
				if (valorDevuelto == JFileChooser.APPROVE_OPTION) {
					File file = fcAbrir.getSelectedFile();
					//En este punto la aplicaci�n se deber�a encargar de realizar la operaci�n sobre el fichero
					System.out.println(MessagesP_Perfil.getString("P_Perfil.0") + file.getName()); //$NON-NLS-1$
					lblFoto.setIcon(new ImageIcon(file.getAbsolutePath()));
				}
			}
		});
		btnCargarImagen.setBounds(37, 498, 242, 33);
		GridBagConstraints gbc_btnCargarImagen = new GridBagConstraints();
		gbc_btnCargarImagen.gridwidth = 4;
		gbc_btnCargarImagen.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnCargarImagen.insets = new Insets(0, 0, 5, 5);
		gbc_btnCargarImagen.gridx = 8;
		gbc_btnCargarImagen.gridy = 15;
		panel.add(btnCargarImagen, "btnCargarImagen"); //$NON-NLS-1$
		btnCargarImagen.setFont(new Font("Verdana", Font.BOLD, 20)); //$NON-NLS-1$
		btnCargarImagen.setBackground(new Color(255, 165, 0));
		btnCargarImagen.setBorder(new RoundedBorder(4));

		JButton btnGuardarCambios = new JButton(MessagesP_Perfil.getString("P_Perfil.btnGuardarCambios.text")); //$NON-NLS-1$

		GridBagConstraints gbc_btnGuardarCambios = new GridBagConstraints();
		gbc_btnGuardarCambios.gridwidth = 4;
		gbc_btnGuardarCambios.insets = new Insets(0, 0, 5, 5);
		gbc_btnGuardarCambios.gridx = 4;
		gbc_btnGuardarCambios.gridy = 17;
		panel.add(btnGuardarCambios, "GridbafConstraints"); //$NON-NLS-1$
		btnGuardarCambios.setBackground(new Color(255, 175, 0));
		btnGuardarCambios.setBorder(new RoundedBorder(2));
		
		
		
		panelContrasena = new V_PerfilContrasena();
		panel.add(panelContrasena, MessagesP_Perfil.getString("P_Perfil.52")); //$NON-NLS-1$
		
		panelInformacion = new V_Informacion();
		panel.add(panelInformacion, MessagesP_Perfil.getString("P_Perfil.1")); //$NON-NLS-1$
		
		panelFormacion = new V_Formacion();
		panel.add(panelFormacion, MessagesP_Perfil.getString("P_Perfil.54")); //$NON-NLS-1$
		
		panelCerrarCuenta = new V_PerfilCerrarCuenta(frmPerfil);
		panel.add(panelCerrarCuenta, MessagesP_Perfil.getString("P_Perfil.55")); //$NON-NLS-1$
	}
	private Icon nuevoIcono(String nombre) {
        Icon icon = null;

        if(MessagesP_Login.getString("P_Login.48") == nombre) icon = new ImageIcon(P_Principal.class.getResource("/presentacion/PerfilMj.png")); //$NON-NLS-1$ //$NON-NLS-2$
        if(MessagesP_Login.getString("P_Login.46") == nombre) icon = new ImageIcon(P_Principal.class.getResource("/presentacion/PerfilAdri.png")); //$NON-NLS-1$ //$NON-NLS-2$
        if(MessagesP_Login.getString("P_Login.50") == nombre) icon = new ImageIcon(P_Principal.class.getResource("/presentacion/PerfilMaria.png"));; //$NON-NLS-1$ //$NON-NLS-2$
        if(MessagesP_Login.getString("P_Login.48") != nombre && 
                MessagesP_Login.getString("P_Login.46") != nombre &&
                MessagesP_Login.getString("P_Login.50") != nombre) icon = iconAux;
        return icon;
    }
	
	private class BtnInformacionActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			CardLayout c1 = (CardLayout)(panel.getLayout());
			c1.show(panel, MessagesP_Perfil.getString("P_Perfil.62")); //$NON-NLS-1$
		}
	}
	
	private class BtnContrasenaActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			CardLayout c1 = (CardLayout)(panel.getLayout());
			c1.show(panel, MessagesP_Perfil.getString("P_Perfil.63")); //$NON-NLS-1$
		}
	}
	
	private class BtnFormacionActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			CardLayout c1 = (CardLayout)(panel.getLayout());
			c1.show(panel, MessagesP_Perfil.getString("P_Perfil.64")); //$NON-NLS-1$
		}
	}
	
	private class BtnCerrarCuentaActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			CardLayout c1 = (CardLayout)(panel.getLayout());
			c1.show(panel, MessagesP_Perfil.getString("P_Perfil.65")); //$NON-NLS-1$
		}
	}
	
	
	public class RoundedBorder implements Border {

		private int radius;

		RoundedBorder(int radius) {
			this.radius = radius;
		}

		public Insets getBorderInsets(Component c) {
			return new Insets(this.radius+1, this.radius+1, this.radius+2, this.radius);
		}

		public boolean isBorderOpaque() {
			return true;
		}

		public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
			g.drawRoundRect(x, y, width-1, height-1, radius, radius);
		}
	}

	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {

		});
	}
	
	public JFrame getFrame() {
		return frmPerfil;
	}
	
	private class LblAyudaMouseListener extends MouseAdapter {
		@Override
		public void mouseClicked(MouseEvent e) {
			P_Ayuda frmAyuda = new P_Ayuda(nombreAux, iconAux);
			frmAyuda.getFrame().setVisible(true);
			frmPerfil.dispose();
		}
	}
	private class BtnVolverActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			P_Principal frmPrincipal = new P_Principal(nombreAux, iconAux);
			frmPrincipal.getFrame().setVisible(true);
			frmPerfil.dispose();
		}
	}
	
	
	
}