package presentacion;

import java.awt.BorderLayout; 
import java.awt.CardLayout;
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


import javax.swing.SwingConstants;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JPopupMenu;
import javax.swing.JScrollPane;

import java.awt.Component;
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
		frmPerfil.setTitle("Perfil");
		frmPerfil.setIconImage(Toolkit.getDefaultToolkit().getImage(P_Perfil.class.getResource("/presentacion/usuario.png")));
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
		gbl_pnlHeader.columnWidths = new int[]{50, 44, 64, 300, 0, 0, 358, 92, 50, 50, 64, 64, 0, 28, 0, 0};
		gbl_pnlHeader.rowHeights = new int[]{50, 0, 50, 0};
		gbl_pnlHeader.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_pnlHeader.rowWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
		pnlHeader.setLayout(gbl_pnlHeader);

		JLabel lblLogoZorro = new JLabel("");
		lblLogoZorro.setIcon(new ImageIcon(P_Perfil.class.getResource("/presentacion/fox.png")));
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
		lblAyuda.setIcon(new ImageIcon(P_Perfil.class.getResource("/presentacion/signo-de-interrogacion-dibujar.png")));
		lblAyuda.setToolTipText("Ayuda");
		GridBagConstraints gbc_lblAyuda = new GridBagConstraints();
		gbc_lblAyuda.anchor = GridBagConstraints.SOUTH;
		gbc_lblAyuda.insets = new Insets(0, 0, 5, 5);
		gbc_lblAyuda.gridx = 10;
		gbc_lblAyuda.gridy = 1;
		pnlHeader.add(lblAyuda, gbc_lblAyuda);
		lblAyuda.addMouseListener(new LblAyudaMouseListener());

		JLabel lblTraductor = new JLabel("");
		lblTraductor.setIcon(new ImageIcon(P_Perfil.class.getResource("/presentacion/traductor.png")));
		lblTraductor.setToolTipText("Traductor");
		GridBagConstraints gbc_lblTraductor = new GridBagConstraints();
		gbc_lblTraductor.anchor = GridBagConstraints.SOUTH;
		gbc_lblTraductor.insets = new Insets(0, 0, 5, 5);
		gbc_lblTraductor.gridx = 11;
		gbc_lblTraductor.gridy = 1;
		pnlHeader.add(lblTraductor, gbc_lblTraductor);

		JLabel lblPerfil = new JLabel("");
		lblPerfil.setIcon(new ImageIcon(P_Perfil.class.getResource("/presentacion/usuario.png")));
		GridBagConstraints gbc_lblPerfil = new GridBagConstraints();
		gbc_lblPerfil.anchor = GridBagConstraints.SOUTH;
		gbc_lblPerfil.insets = new Insets(0, 0, 5, 5);
		gbc_lblPerfil.gridx = 12;
		gbc_lblPerfil.gridy = 1;
		pnlHeader.add(lblPerfil, gbc_lblPerfil);

		JLabel lblFlecha = new JLabel("");

		lblFlecha.setIcon(new ImageIcon(P_Perfil.class.getResource("/presentacion/flecha-hacia-abajo-del-angulo.png")));

		JPopupMenu pmFlecha = new JPopupMenu();
		addPopup(lblFlecha, pmFlecha);
		
	
		
		JLabel lblPerfilOption = new JLabel(nombre);
		lblPerfilOption.setFont(new Font("Verdana", Font.PLAIN, 14));
		lblPerfilOption.setIcon(nuevoIcono(nombre));
		pmFlecha.add(lblPerfilOption);

		LocalDate date = LocalDate.now(); // Gets the current date
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		String date_cu = date.format(formatter);
		JLabel lblUltimaFecha = new JLabel("Última fecha: " + date_cu);
		pmFlecha.add(lblUltimaFecha);
		
		JSeparator separator = new JSeparator();
		separator.setBorder(new LineBorder(new Color(255, 200, 0), 10));
		pmFlecha.add(separator);

		JButton btnAbout = new JButton("   Sobre nosotros");
		btnAbout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				P_About frmAbout = new P_About(nombre, iconAux);
				frmAbout.getFrame().setVisible(true);
				frmPerfil.dispose();
			}
		});
		btnAbout.setBounds(new Rectangle(0, 0, 50, 0));
		btnAbout.setIcon(new ImageIcon(P_Perfil.class.getResource("/presentacion/informacion.png")));
		pmFlecha.add(btnAbout);

		JSeparator separator_1 = new JSeparator();
		separator_1.setBorder(new LineBorder(Color.ORANGE, 10));
		pmFlecha.add(separator_1);

		JButton btnDesconectar = new JButton("   Salir                     ");
		btnDesconectar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				P_Login frmLogin = new P_Login();
				frmLogin.getFrame().setVisible(true);
				frmPerfil.dispose();
			}
		});
		btnDesconectar.setIcon(new ImageIcon(P_Perfil.class.getResource("/presentacion/desconectar.png")));
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

		JPanel pnlPerfil = new JPanel();
		pnlPerfil.setBackground(new Color(255, 228, 196));
		contentPane.add(pnlPerfil, BorderLayout.CENTER);
		pnlPerfil.setLayout(null);

		JPanel pnlBotones = new JPanel();
		pnlBotones.setBackground(new Color(255, 228, 196));
		pnlBotones.setBounds(new Rectangle(0, 0, 293, 575));
		pnlPerfil.add(pnlBotones);
		pnlBotones.setLayout(null);

		btnInformacion = new JButton(" Información");
		
		btnInformacion.setBounds(37, 11, 242, 65);
		pnlBotones.add(btnInformacion);
		btnInformacion.setHorizontalTextPosition(SwingConstants.RIGHT);
		btnInformacion.setIcon(new ImageIcon(P_Perfil.class.getResource("/presentacion/info.png")));
		btnInformacion.setFont(new Font("Verdana", Font.BOLD, 20));
		btnInformacion.setBackground(Color.WHITE);
		btnInformacion.setBorder(new RoundedBorder(12));
		btnInformacion.addActionListener(new BtnInformacionActionListener());

		btnContrasena = new JButton(" Contraseña");
		btnContrasena.addActionListener(new BtnContrasenaActionListener());
		btnContrasena.setBounds(37, 118, 242, 65);
		pnlBotones.add(btnContrasena);
		btnContrasena.setIcon(new ImageIcon(P_Perfil.class.getResource("/presentacion/vintage-key-outline.png")));
		btnContrasena.setBackground(Color.WHITE);
		btnContrasena.setFont(new Font("Verdana", Font.BOLD, 20));
		btnContrasena.setBorder(new RoundedBorder(12));

		btnFormacion = new JButton(" Formación");
		btnFormacion.addActionListener(new BtnFormacionActionListener());
		btnFormacion.setBounds(37, 229, 242, 65);
		pnlBotones.add(btnFormacion);
		btnFormacion.setIcon(new ImageIcon(P_Perfil.class.getResource("/presentacion/document.png")));
		btnFormacion.setFont(new Font("Verdana", Font.BOLD, 20));
		btnFormacion.setBackground(Color.WHITE);
		btnFormacion.setBorder(new RoundedBorder(12));

		btnCerrarCuenta = new JButton("Cerrar cuenta");
		btnCerrarCuenta.setBounds(37, 342, 242, 65);
		pnlBotones.add(btnCerrarCuenta);
		btnCerrarCuenta.setIcon(new ImageIcon(P_Perfil.class.getResource("/presentacion/unfollow (1).png")));
		btnCerrarCuenta.setFont(new Font("Verdana", Font.BOLD, 20));
		btnCerrarCuenta.setBackground(Color.WHITE);
		btnCerrarCuenta.setBorder(new RoundedBorder(12));
		btnCerrarCuenta.addActionListener(new BtnCerrarCuentaActionListener());

		btnVolver = new JButton("Volver");
		btnVolver.addActionListener(new BtnVolverActionListener());
		btnVolver.setBounds(37, 498, 242, 33);
		pnlBotones.add(btnVolver);
		btnVolver.setIcon(new ImageIcon(P_Perfil.class.getResource("/presentacion/volver-flecha (1).png")));
		btnVolver.setFont(new Font("Verdana", Font.BOLD, 20));
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

		JLabel lblInformacion = new JLabel("");
		lblInformacion.setFont(new Font("Verdana", Font.BOLD, 20));
		GridBagConstraints gbc_lblInformacion = new GridBagConstraints();
		gbc_lblInformacion.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblInformacion.insets = new Insets(0, 0, 5, 5);
		gbc_lblInformacion.gridx = 1;
		gbc_lblInformacion.gridy = 1;
		panel.add(lblInformacion, "lblInformacion");

		JLabel lblNombre = new JLabel("Nombre");
		GridBagConstraints gbc_lblNombre = new GridBagConstraints();
		gbc_lblNombre.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblNombre.insets = new Insets(0, 0, 5, 5);
		gbc_lblNombre.gridx = 1;
		gbc_lblNombre.gridy = 3;
		panel.add(lblNombre, "lblNombre");
		
		JLabel lblCargarFoto = new JLabel("Cargar foto de perfil");
		GridBagConstraints gbc_lblCargarFoto = new GridBagConstraints();
		gbc_lblCargarFoto.gridwidth = 4;
		gbc_lblCargarFoto.insets = new Insets(0, 0, 5, 5);
		gbc_lblCargarFoto.gridx = 8;
		gbc_lblCargarFoto.gridy = 3;
		panel.add(lblCargarFoto, "lblCargarFoto");

		textNombre = new JTextField();
		GridBagConstraints gbc_textNombre = new GridBagConstraints();
		gbc_textNombre.insets = new Insets(0, 0, 5, 5);
		gbc_textNombre.fill = GridBagConstraints.HORIZONTAL;
		gbc_textNombre.gridx = 1;
		gbc_textNombre.gridy = 4;
		panel.add(textNombre, "lblNombre");
		textNombre.setColumns(10);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBorder(new TitledBorder(null, "Foto", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		GridBagConstraints gbc_scrollPane = new GridBagConstraints();
		gbc_scrollPane.gridwidth = 4;
		gbc_scrollPane.gridheight = 10;
		gbc_scrollPane.insets = new Insets(0, 0, 5, 5);
		gbc_scrollPane.fill = GridBagConstraints.BOTH;
		gbc_scrollPane.gridx = 8;
		gbc_scrollPane.gridy = 4;
		panel.add(scrollPane, "scrollPane");
			
		JLabel lblFoto = new JLabel("");
		scrollPane.setViewportView(lblFoto);

		JLabel lblApellidos = new JLabel("Apellidos");
		GridBagConstraints gbc_lblApellidos = new GridBagConstraints();
		gbc_lblApellidos.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblApellidos.insets = new Insets(0, 0, 5, 5);
		gbc_lblApellidos.gridx = 1;
		gbc_lblApellidos.gridy = 6;
		panel.add(lblApellidos, "lblApellidos");

		textApellidos = new JTextField();
		GridBagConstraints gbc_textApellidos = new GridBagConstraints();
		gbc_textApellidos.gridwidth = 2;
		gbc_textApellidos.insets = new Insets(0, 0, 5, 5);
		gbc_textApellidos.fill = GridBagConstraints.HORIZONTAL;
		gbc_textApellidos.gridx = 1;
		gbc_textApellidos.gridy = 7;
		panel.add(textApellidos, "txtApellidos");
		textApellidos.setColumns(10);

		JLabel lblCiudad = new JLabel("Ciudad");
		GridBagConstraints gbc_lblCiudad = new GridBagConstraints();
		gbc_lblCiudad.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblCiudad.insets = new Insets(0, 0, 5, 5);
		gbc_lblCiudad.gridx = 1;
		gbc_lblCiudad.gridy = 8;
		panel.add(lblCiudad, "lblCiudad");

		textCiudad = new JTextField();
		GridBagConstraints gbc_textCiudad = new GridBagConstraints();
		gbc_textCiudad.insets = new Insets(0, 0, 5, 5);
		gbc_textCiudad.fill = GridBagConstraints.HORIZONTAL;
		gbc_textCiudad.gridx = 1;
		gbc_textCiudad.gridy = 9;
		panel.add(textCiudad, "txtCiudad");
		textCiudad.setColumns(10);

		JLabel lblEmail = new JLabel("Email");
		GridBagConstraints gbc_lblEmail = new GridBagConstraints();
		gbc_lblEmail.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblEmail.insets = new Insets(0, 0, 5, 5);
		gbc_lblEmail.gridx = 1;
		gbc_lblEmail.gridy = 10;
		panel.add(lblEmail, "lblEmail");

		textEmail = new JTextField();
		GridBagConstraints gbc_textEmail = new GridBagConstraints();
		gbc_textEmail.gridwidth = 2;
		gbc_textEmail.insets = new Insets(0, 0, 5, 5);
		gbc_textEmail.fill = GridBagConstraints.HORIZONTAL;
		gbc_textEmail.gridx = 1;
		gbc_textEmail.gridy = 11;
		panel.add(textEmail, "txtEmeail");
		textEmail.setColumns(10);

		JLabel lblCodigoPostal = new JLabel("Codigo postal");
		GridBagConstraints gbc_lblCodigoPostal = new GridBagConstraints();
		gbc_lblCodigoPostal.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblCodigoPostal.insets = new Insets(0, 0, 5, 5);
		gbc_lblCodigoPostal.gridx = 1;
		gbc_lblCodigoPostal.gridy = 12;
		panel.add(lblCodigoPostal, "lblCodigoPostal");

		textCodigoPostal = new JTextField();
		GridBagConstraints gbc_textCodigoPostal = new GridBagConstraints();
		gbc_textCodigoPostal.insets = new Insets(0, 0, 5, 5);
		gbc_textCodigoPostal.fill = GridBagConstraints.HORIZONTAL;
		gbc_textCodigoPostal.gridx = 1;
		gbc_textCodigoPostal.gridy = 13;
		panel.add(textCodigoPostal, "txtCodigoPostal");
		textCodigoPostal.setColumns(10);

		JLabel lblTelefono = new JLabel("Telefono");
		GridBagConstraints gbc_lblTelefono = new GridBagConstraints();
		gbc_lblTelefono.insets = new Insets(0, 0, 5, 5);
		gbc_lblTelefono.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblTelefono.gridx = 1;
		gbc_lblTelefono.gridy = 14;
		panel.add(lblTelefono, "lblTelefono");

		textTelefono = new JTextField();
		GridBagConstraints gbc_textTelefono = new GridBagConstraints();
		gbc_textTelefono.insets = new Insets(0, 0, 5, 5);
		gbc_textTelefono.fill = GridBagConstraints.HORIZONTAL;
		gbc_textTelefono.gridx = 1;
		gbc_textTelefono.gridy = 15;
		panel.add(textTelefono, "txtTelefono");
		textTelefono.setColumns(10);
						
		btnCargarImagen = new JButton("Cargar imagen");
		btnCargarImagen.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				JFileChooser fcAbrir = new JFileChooser();
				int valorDevuelto = fcAbrir.showOpenDialog(contentPane);
				//Recoger el nombre del fichero seleccionado por el usuario
				if (valorDevuelto == JFileChooser.APPROVE_OPTION) {
					File file = fcAbrir.getSelectedFile();
					//En este punto la aplicaci�n se deber�a encargar de realizar la operaci�n sobre el fichero
					System.out.println("Fichero seleccionado: " + file.getName());
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
		panel.add(btnCargarImagen, "btnCargarImagen");
		btnCargarImagen.setFont(new Font("Verdana", Font.BOLD, 20));
		btnCargarImagen.setBackground(new Color(255, 165, 0));
		btnCargarImagen.setBorder(new RoundedBorder(4));

		JButton btnGuardarCambios = new JButton("Guardar cambios");

		GridBagConstraints gbc_btnGuardarCambios = new GridBagConstraints();
		gbc_btnGuardarCambios.gridwidth = 4;
		gbc_btnGuardarCambios.insets = new Insets(0, 0, 5, 5);
		gbc_btnGuardarCambios.gridx = 4;
		gbc_btnGuardarCambios.gridy = 17;
		panel.add(btnGuardarCambios, "GridbafConstraints");
		btnGuardarCambios.setBackground(new Color(255, 175, 0));
		btnGuardarCambios.setBorder(new RoundedBorder(2));
		
		
		
		panelContrasena = new V_PerfilContrasena();
		panel.add(panelContrasena, "Contrase�a");
		
		panelInformacion = new V_Informacion();
		panel.add(panelInformacion, "Informacion");
		
		panelFormacion = new V_Formacion();
		panel.add(panelFormacion, "Formacion");
		
		panelCerrarCuenta = new V_PerfilCerrarCuenta();
		panel.add(panelCerrarCuenta, "CerrarCuenta");
	}
	private Icon nuevoIcono(String nombre) {
		Icon icon = null;
		if(nombre == "Adrián Ruiz")icon = new ImageIcon(P_Principal.class.getResource("/presentacion/PerfilAdri.png"));
		if(nombre == "María Jesús") icon = new ImageIcon(P_Principal.class.getResource("/presentacion/PerfilMj.png"));
		if(nombre == "María Blanco") icon = new ImageIcon(P_Principal.class.getResource("/presentacion/PerfilMaria.png"));
		
		return icon;
	}
	
	private class BtnInformacionActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			CardLayout c1 = (CardLayout)(panel.getLayout());
			c1.show(panel, "Informacion");
		}
	}
	
	private class BtnContrasenaActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			CardLayout c1 = (CardLayout)(panel.getLayout());
			c1.show(panel, "Contrase�a");
		}
	}
	
	private class BtnFormacionActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			CardLayout c1 = (CardLayout)(panel.getLayout());
			c1.show(panel, "Formacion");
		}
	}
	
	private class BtnCerrarCuentaActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			CardLayout c1 = (CardLayout)(panel.getLayout());
			c1.show(panel, "CerrarCuenta");
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