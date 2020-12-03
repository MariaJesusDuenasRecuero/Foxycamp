package presentacion;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.SwingConstants;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import javax.swing.text.MaskFormatter;

import java.awt.Toolkit;
import java.awt.GridBagLayout;
import java.awt.Font;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.Rectangle;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFormattedTextField;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.io.File;
import java.text.ParseException;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JScrollPane;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

public class P_Registro extends JFrame {

	private JPanel contentPane;
	
	private JPanel pnlHeader;
	private JLabel lblLogoZorro;
	private JLabel lblFoxycamp;
	private JLabel lblLeftLine;
	private JPanel pnlContenido;
	private JPanel pnlLogin;
	private JLabel lblIngreseDatos;
	private JLabel lblApellidos;
	private JTextField textApellidos;
	private JScrollPane scrollFoto;
	private JLabel lblFoto;
	private JButton btnConfirmar;
	private JTextArea txtInfoAdicional;
	private JLabel lblCV;
	private JLabel lblEmail;
	private JLabel lblContraseña;
	private JLabel lblInformacion;
	private JLabel lblNombre;
	private JTextField textEmail;
	private JTextField textTelefono;
	private JLabel lblImagenCV;
	private JLabel lblTelefono;
	private JLabel lblImagenCarga;
	private JLabel lblImagen;
	private JLabel lblConfirmarContraseña;
	private JPasswordField textContraseña;
	private JPasswordField textConfirmarContraseña;
	
	
	private Color colorResaltado = new Color (255,255,210);
	private Color naranja = new Color(255, 228, 196);
	private Color colorBlanco = new Color (255,255,255);
	private JLabel lblDNI;
	private JTextField txtDNI;
	private JTextField textConfirmarMail;
	private JLabel lblNewLabel;
	//private Color botones = new Color(244, 164, 96);
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					P_Registro frame = new P_Registro();
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
	public P_Registro() {
		setFont(new Font("Verdana", Font.BOLD, 16));
		setIconImage(Toolkit.getDefaultToolkit().getImage(P_Registro.class.getResource("/presentacion/usuario.png")));
		setBackground(naranja);
		setBounds(new Rectangle(0, 0, 1350, 850));
		setTitle("Registro");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		contentPane.setBackground(naranja);
		setContentPane(contentPane);
		
		pnlHeader = new JPanel();
		pnlHeader.setBackground(naranja);
		contentPane.add(pnlHeader, BorderLayout.NORTH);
		GridBagLayout gbl_pnlHeader = new GridBagLayout();
		gbl_pnlHeader.columnWidths = new int[] { 50, 44, 64, 300, 0, 0, 358, 92, 50, 50, 64, 64, 64, 0, 0 };
		gbl_pnlHeader.rowHeights = new int[] { 50, 54, 50, 0 };
		gbl_pnlHeader.columnWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
				0.0, Double.MIN_VALUE };
		gbl_pnlHeader.rowWeights = new double[] { 0.0, 0.0, 0.0, Double.MIN_VALUE };
		pnlHeader.setLayout(gbl_pnlHeader);
		
		lblLogoZorro = new JLabel("");
		lblLogoZorro.setIcon(new ImageIcon(P_Registro.class.getResource("/presentacion/fox.png")));
		lblLogoZorro.setBackground(new Color(255, 228, 181));
		GridBagConstraints gbc_lblLogoZorro = new GridBagConstraints();
		gbc_lblLogoZorro.insets = new Insets(0, 0, 5, 5);
		gbc_lblLogoZorro.gridx = 2;
		gbc_lblLogoZorro.gridy = 1;
		pnlHeader.add(lblLogoZorro, gbc_lblLogoZorro);
		
		lblFoxycamp = new JLabel("FOXYCAMP");
		lblFoxycamp.setFont(new Font("Verdana", Font.BOLD, 40));
		lblFoxycamp.setForeground(new Color(210, 105, 30));
		GridBagConstraints gbc_lblFoxycamp = new GridBagConstraints();
		gbc_lblFoxycamp.insets = new Insets(0, 0, 5, 5);
		gbc_lblFoxycamp.gridx = 3;
		gbc_lblFoxycamp.gridy = 1;
		pnlHeader.add(lblFoxycamp, gbc_lblFoxycamp);
		
		
		lblLeftLine = new JLabel("");
		lblLeftLine.setAlignmentX(Component.CENTER_ALIGNMENT);
		lblLeftLine.setVerticalAlignment(SwingConstants.BOTTOM);
		lblLeftLine.setHorizontalAlignment(SwingConstants.LEFT);
		lblLeftLine.setBorder(new LineBorder(new Color(210, 105, 30), 2, true));
		GridBagConstraints gbc_lblLeftLine = new GridBagConstraints();
		gbc_lblLeftLine.anchor = GridBagConstraints.SOUTH;
		gbc_lblLeftLine.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblLeftLine.gridwidth = 10;
		gbc_lblLeftLine.insets = new Insets(0, 0, 0, 5);
		gbc_lblLeftLine.gridx = 1;
		gbc_lblLeftLine.gridy = 2;
		pnlHeader.add(lblLeftLine, gbc_lblLeftLine);

		pnlContenido = new JPanel();
		pnlContenido.setBackground(new Color(255, 228, 196));
		getContentPane().add(pnlContenido, BorderLayout.SOUTH);
		GridBagLayout gbl_pnlContenido = new GridBagLayout();
		gbl_pnlContenido.columnWidths = new int[] { 300, 429, 300, 0 };
		gbl_pnlContenido.rowHeights = new int[] { 84, 440, 0 };
		gbl_pnlContenido.columnWeights = new double[] { 0.0, 0.0, 0.0, Double.MIN_VALUE };
		gbl_pnlContenido.rowWeights = new double[] { 0.0, 0.0, Double.MIN_VALUE };
		pnlContenido.setLayout(gbl_pnlContenido);

		lblIngreseDatos = new JLabel("Introduzca sus datos para el registro");
		lblIngreseDatos.setFont(new Font("Verdana", Font.BOLD, 36));
		lblIngreseDatos.setForeground(new Color(210, 105, 30));
		GridBagConstraints gbc_lblIngreseDatos = new GridBagConstraints();
		gbc_lblIngreseDatos.insets = new Insets(0, 0, 5, 5);
		gbc_lblIngreseDatos.gridx = 1;
		gbc_lblIngreseDatos.gridy = 0;
		pnlContenido.add(lblIngreseDatos, gbc_lblIngreseDatos);

		pnlLogin = new JPanel();
		pnlLogin.setBorder(new LineBorder(new Color(253, 245, 230), 4));
		pnlLogin.setBackground(new Color(211, 211, 211));
		GridBagConstraints gbc_pnlLogin = new GridBagConstraints();
		gbc_pnlLogin.anchor = GridBagConstraints.WEST;
		gbc_pnlLogin.insets = new Insets(0, 0, 0, 5);
		gbc_pnlLogin.gridx = 1;
		gbc_pnlLogin.gridy = 1;
		pnlContenido.add(pnlLogin, gbc_pnlLogin);
		GridBagLayout gbl_pnlLogin = new GridBagLayout();
		gbl_pnlLogin.columnWidths = new int[] { 20, 0, 20, 115, 101, 20, 20, 20, 35, 35, 0, 20, 0 };
		gbl_pnlLogin.rowHeights = new int[] { 35, 35, 35, 35, 35, 35, 35, 35, 35, 34, 39, 0, 20, 0 };
		gbl_pnlLogin.columnWeights = new double[] { 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
		gbl_pnlLogin.rowWeights = new double[] { 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0,
				Double.MIN_VALUE };
		pnlLogin.setLayout(gbl_pnlLogin);
		
		lblNombre = new JLabel("Nombre*");
		lblNombre.setToolTipText("Campo obligatorio");
		lblNombre.setFont(new Font("Verdana", Font.BOLD, 16));
		GridBagConstraints gbc_lblNombre = new GridBagConstraints();
		gbc_lblNombre.anchor = GridBagConstraints.WEST;
		gbc_lblNombre.insets = new Insets(0, 0, 5, 5);
		gbc_lblNombre.gridx = 1;
		gbc_lblNombre.gridy = 1;
		pnlLogin.add(lblNombre, gbc_lblNombre);
		
		JTextField textNombre = new JTextField();
		textNombre.addFocusListener(new TextNombreFocusListener());
		GridBagConstraints gbc_textNombre = new GridBagConstraints();
		gbc_textNombre.insets = new Insets(0, 0, 5, 5);
		gbc_textNombre.fill = GridBagConstraints.HORIZONTAL;
		gbc_textNombre.gridx = 3;
		gbc_textNombre.gridy = 1;
		pnlLogin.add(textNombre, gbc_textNombre);
		textNombre.setColumns(10);
		
		scrollFoto = new JScrollPane();
		scrollFoto.setBorder(new TitledBorder(null, "Foto", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		GridBagConstraints gbc_scrollFoto = new GridBagConstraints();
		gbc_scrollFoto.gridheight = 4;
		gbc_scrollFoto.gridwidth = 3;
		gbc_scrollFoto.insets = new Insets(0, 0, 5, 5);
		gbc_scrollFoto.fill = GridBagConstraints.BOTH;
		gbc_scrollFoto.gridx = 7;
		gbc_scrollFoto.gridy = 1;
		pnlLogin.add(scrollFoto, gbc_scrollFoto);
		
		lblFoto = new JLabel("");
		lblFoto.setHorizontalAlignment(SwingConstants.CENTER);
		scrollFoto.setViewportView(lblFoto);
		
		lblApellidos = new JLabel("Apellidos");
		lblApellidos.setFont(new Font("Verdana", Font.BOLD, 16));
		GridBagConstraints gbc_lblApellidos = new GridBagConstraints();
		gbc_lblApellidos.anchor = GridBagConstraints.ABOVE_BASELINE_LEADING;
		gbc_lblApellidos.insets = new Insets(0, 0, 5, 5);
		gbc_lblApellidos.gridx = 1;
		gbc_lblApellidos.gridy = 2;
		pnlLogin.add(lblApellidos, gbc_lblApellidos);
		
		textApellidos = new JTextField();
		textApellidos.addFocusListener(new TextApellidosFocusListener());
		GridBagConstraints gbc_textApellidos = new GridBagConstraints();
		gbc_textApellidos.gridwidth = 2;
		gbc_textApellidos.insets = new Insets(0, 0, 5, 5);
		gbc_textApellidos.fill = GridBagConstraints.HORIZONTAL;
		gbc_textApellidos.gridx = 3;
		gbc_textApellidos.gridy = 2;
		pnlLogin.add(textApellidos, gbc_textApellidos);
		textApellidos.setColumns(10);
		
		//textTelefono = new JTextField();
		
		lblImagenCarga = new JLabel("");
		lblImagenCarga.addMouseListener(new LblImagenCargaMouseListener());
		
	
		textEmail = new JTextField();
		textEmail.setFont(new Font("Verdana", Font.BOLD, 11));
		textEmail.addFocusListener(new TextEmailFocusListener());
		
		lblDNI = new JLabel("DNI*");
		lblDNI.setToolTipText("Campo obligatorio");
		lblDNI.setFont(new Font("Verdana", Font.BOLD, 16));
		GridBagConstraints gbc_lblDNI = new GridBagConstraints();
		gbc_lblDNI.anchor = GridBagConstraints.WEST;
		gbc_lblDNI.insets = new Insets(0, 0, 5, 5);
		gbc_lblDNI.gridx = 1;
		gbc_lblDNI.gridy = 3;
		pnlLogin.add(lblDNI, gbc_lblDNI);
		
		//txtDNI = new JTextField();
		MaskFormatter formatoDNI;
		try {
			formatoDNI= new MaskFormatter("########'-U");
			formatoDNI.setPlaceholderCharacter('X');
			txtDNI= new JFormattedTextField(formatoDNI);
			txtDNI.addFocusListener(new TxtDNIFocusListener());
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		GridBagConstraints gbc_txtDNI = new GridBagConstraints();
		gbc_txtDNI.insets = new Insets(0, 0, 5, 5);
		gbc_txtDNI.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtDNI.gridx = 3;
		gbc_txtDNI.gridy = 3;
		pnlLogin.add(txtDNI, gbc_txtDNI);
		txtDNI.setColumns(10);
		
		lblEmail = new JLabel("Email*");
		lblEmail.setToolTipText("Campo obligatorio");
		lblEmail.setFont(new Font("Verdana", Font.BOLD, 16));
		GridBagConstraints gbc_lblEmail = new GridBagConstraints();
		gbc_lblEmail.anchor = GridBagConstraints.WEST;
		gbc_lblEmail.insets = new Insets(0, 0, 5, 5);
		gbc_lblEmail.gridx = 1;
		gbc_lblEmail.gridy = 4;
		pnlLogin.add(lblEmail, gbc_lblEmail);
		GridBagConstraints gbc_textEmail = new GridBagConstraints();
		gbc_textEmail.gridwidth = 2;
		gbc_textEmail.insets = new Insets(0, 0, 5, 5);
		gbc_textEmail.fill = GridBagConstraints.HORIZONTAL;
		gbc_textEmail.gridx = 3;
		gbc_textEmail.gridy = 4;
		pnlLogin.add(textEmail, gbc_textEmail);
		textEmail.setColumns(10);
		
		textConfirmarMail = new JTextField();
		textConfirmarMail.addFocusListener(new TextConfirmarMailFocusListener());
		
		lblNewLabel = new JLabel("Confirmar email*");
		lblNewLabel.setToolTipText("Campo obligatorio");
		lblNewLabel.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel.setHorizontalTextPosition(SwingConstants.LEFT);
		lblNewLabel.setFont(new Font("Verdana", Font.BOLD, 16));
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 1;
		gbc_lblNewLabel.gridy = 5;
		pnlLogin.add(lblNewLabel, gbc_lblNewLabel);
		GridBagConstraints gbc_textConfirmarMail = new GridBagConstraints();
		gbc_textConfirmarMail.gridwidth = 2;
		gbc_textConfirmarMail.insets = new Insets(0, 0, 5, 5);
		gbc_textConfirmarMail.fill = GridBagConstraints.HORIZONTAL;
		gbc_textConfirmarMail.gridx = 3;
		gbc_textConfirmarMail.gridy = 5;
		pnlLogin.add(textConfirmarMail, gbc_textConfirmarMail);
		textConfirmarMail.setColumns(10);
		lblImagenCarga.setIcon(new ImageIcon(P_Registro.class.getResource("/presentacion/uploadImage.png")));
		lblImagenCarga.setToolTipText("Pincha encima para subir archivo");
		GridBagConstraints gbc_lblImagenCarga = new GridBagConstraints();
		gbc_lblImagenCarga.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblImagenCarga.insets = new Insets(0, 0, 5, 5);
		gbc_lblImagenCarga.gridx = 7;
		gbc_lblImagenCarga.gridy = 5;
		pnlLogin.add(lblImagenCarga, gbc_lblImagenCarga);
		
		lblImagen = new JLabel("Image");
		lblImagen.setFont(new Font("Verdana", Font.PLAIN, 13));
		GridBagConstraints gbc_lblImagen = new GridBagConstraints();
		gbc_lblImagen.insets = new Insets(0, 0, 5, 5);
		gbc_lblImagen.gridx = 8;
		gbc_lblImagen.gridy = 5;
		pnlLogin.add(lblImagen, gbc_lblImagen);
		
		lblTelefono = new JLabel("Teléfono de contacto");
		lblTelefono.setFont(new Font("Verdana", Font.BOLD, 16));
		GridBagConstraints gbc_lblTelefono = new GridBagConstraints();
		gbc_lblTelefono.anchor = GridBagConstraints.WEST;
		gbc_lblTelefono.insets = new Insets(0, 0, 5, 5);
		gbc_lblTelefono.gridx = 1;
		gbc_lblTelefono.gridy = 6;
		pnlLogin.add(lblTelefono, gbc_lblTelefono);
		
		txtInfoAdicional = new JTextArea();
		txtInfoAdicional.addFocusListener(new TxtInfoAdicionalFocusListener());
		
		lblImagenCV = new JLabel("Cargar");
		lblImagenCV.addMouseListener(new LblImagenCVMouseListener());
		
		MaskFormatter formatoTlfno;
		try {
			formatoTlfno= new MaskFormatter("'(###')' ###' ###' ###");
			formatoTlfno.setPlaceholderCharacter('*');
			textTelefono= new JFormattedTextField(formatoTlfno);
		}catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		textTelefono.addFocusListener(new TextTelefonoFocusListener());
		GridBagConstraints gbc_textTelefono = new GridBagConstraints();
		gbc_textTelefono.insets = new Insets(0, 0, 5, 5);
		gbc_textTelefono.fill = GridBagConstraints.HORIZONTAL;
		gbc_textTelefono.gridx = 3;
		gbc_textTelefono.gridy = 6;
		pnlLogin.add(textTelefono, gbc_textTelefono);
		textTelefono.setColumns(10);
		
		lblContraseña = new JLabel("Contraseña*");
		lblContraseña.setToolTipText("Campo obligatorio");
		lblContraseña.setFont(new Font("Verdana", Font.BOLD, 16));
		GridBagConstraints gbc_lblContraseña = new GridBagConstraints();
		gbc_lblContraseña.anchor = GridBagConstraints.WEST;
		gbc_lblContraseña.insets = new Insets(0, 0, 5, 5);
		gbc_lblContraseña.gridx = 1;
		gbc_lblContraseña.gridy = 7;
		pnlLogin.add(lblContraseña, gbc_lblContraseña);
		
		textContraseña = new JPasswordField();
		textContraseña.addFocusListener(new TextContraseñaFocusListener());
		GridBagConstraints gbc_textContraseña = new GridBagConstraints();
		gbc_textContraseña.insets = new Insets(0, 0, 5, 5);
		gbc_textContraseña.fill = GridBagConstraints.HORIZONTAL;
		gbc_textContraseña.gridx = 3;
		gbc_textContraseña.gridy = 7;
		pnlLogin.add(textContraseña, gbc_textContraseña);
		textContraseña.setColumns(10);
		
		lblConfirmarContraseña = new JLabel("Confirmar contraseña*");
		lblConfirmarContraseña.setToolTipText("Campo obligatorio");
		lblConfirmarContraseña.setFont(new Font("Verdana", Font.BOLD, 16));
		GridBagConstraints gbc_lblConfirmarContraseña = new GridBagConstraints();
		gbc_lblConfirmarContraseña.insets = new Insets(0, 0, 5, 5);
		gbc_lblConfirmarContraseña.gridx = 1;
		gbc_lblConfirmarContraseña.gridy = 8;
		pnlLogin.add(lblConfirmarContraseña, gbc_lblConfirmarContraseña);
		
		textConfirmarContraseña = new JPasswordField();
		textConfirmarContraseña.addActionListener(new TextConfirmarContraseñaActionListener());
		textConfirmarContraseña.addFocusListener(new TextConfirmarContraseñaFocusListener());
		GridBagConstraints gbc_textConfirmarContraseña = new GridBagConstraints();
		gbc_textConfirmarContraseña.insets = new Insets(0, 0, 5, 5);
		gbc_textConfirmarContraseña.fill = GridBagConstraints.HORIZONTAL;
		gbc_textConfirmarContraseña.gridx = 3;
		gbc_textConfirmarContraseña.gridy = 8;
		pnlLogin.add(textConfirmarContraseña, gbc_textConfirmarContraseña);
		textConfirmarContraseña.setColumns(10);
		
		lblCV = new JLabel("CV*");
		lblCV.setToolTipText("Campo obligatorio");
		lblCV.setFont(new Font("Verdana", Font.BOLD, 16));
		GridBagConstraints gbc_lblCV = new GridBagConstraints();
		gbc_lblCV.anchor = GridBagConstraints.WEST;
		gbc_lblCV.insets = new Insets(0, 0, 5, 5);
		gbc_lblCV.gridx = 1;
		gbc_lblCV.gridy = 9;
		pnlLogin.add(lblCV, gbc_lblCV);
		lblImagenCV.setToolTipText("Pincha encima para subir archivo");
		lblImagenCV.setIcon(new ImageIcon(P_Registro.class.getResource("/presentacion/uploadFile.png")));
		GridBagConstraints gbc_lblImagenCV = new GridBagConstraints();
		gbc_lblImagenCV.insets = new Insets(0, 0, 5, 5);
		gbc_lblImagenCV.gridx = 3;
		gbc_lblImagenCV.gridy = 9;
		pnlLogin.add(lblImagenCV, gbc_lblImagenCV);
		
		lblInformacion = new JLabel("Información adicional");
		lblInformacion.setFont(new Font("Verdana", Font.BOLD, 16));
		GridBagConstraints gbc_lblInformacion = new GridBagConstraints();
		gbc_lblInformacion.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblInformacion.insets = new Insets(0, 0, 5, 5);
		gbc_lblInformacion.gridx = 1;
		gbc_lblInformacion.gridy = 10;
		pnlLogin.add(lblInformacion, gbc_lblInformacion);
		txtInfoAdicional.setLineWrap(true);
		GridBagConstraints gbc_txtInfoAdicional = new GridBagConstraints();
		gbc_txtInfoAdicional.gridwidth = 2;
		gbc_txtInfoAdicional.gridheight = 2;
		gbc_txtInfoAdicional.insets = new Insets(0, 0, 5, 5);
		gbc_txtInfoAdicional.fill = GridBagConstraints.BOTH;
		gbc_txtInfoAdicional.gridx = 3;
		gbc_txtInfoAdicional.gridy = 10;
		pnlLogin.add(txtInfoAdicional, gbc_txtInfoAdicional);
		
		btnConfirmar = new JButton("Confirmar suscripción");
		btnConfirmar.setFont(new Font("Verdana", Font.BOLD, 9));
		GridBagConstraints gbc_btnConfirmar = new GridBagConstraints();
		gbc_btnConfirmar.insets = new Insets(0, 0, 5, 5);
		gbc_btnConfirmar.gridx = 9;
		gbc_btnConfirmar.gridy = 11;
		btnConfirmar.setBorder(new RoundedBorder(4));
		btnConfirmar.setForeground(new Color(0,0,0));
		btnConfirmar.setBackground(new Color(244, 164, 96));
		pnlLogin.add(btnConfirmar, gbc_btnConfirmar);
		
		
	}
	

	private class LblImagenCargaMouseListener extends MouseAdapter {
		@Override
		public void mouseClicked(MouseEvent e) {
			JFileChooser fcAbrir = new JFileChooser();
			int valorDevuelto = fcAbrir.showOpenDialog(contentPane);
			//Recoger el nombre del fichero seleccionado por el usuario
			if (valorDevuelto == JFileChooser.APPROVE_OPTION) {
				File file = fcAbrir.getSelectedFile();
				//En este punto la aplicación se debería encargar de realizar la operación sobre el fichero
				System.out.println("Fichero seleccionado: " + file.getName());
				lblFoto.setIcon(new ImageIcon(file.getAbsolutePath()));
			}
		}
	}
	private class LblImagenCVMouseListener extends MouseAdapter {
		@Override
		public void mouseClicked(MouseEvent e) {
			JFileChooser fcAbrir = new JFileChooser();
			int valorDevuelto = fcAbrir.showOpenDialog(contentPane);
			//Recoger el nombre del fichero seleccionado por el usuario
			if (valorDevuelto == JFileChooser.APPROVE_OPTION) {
				File file = fcAbrir.getSelectedFile();
				//En este punto la aplicación se debería encargar de realizar la operación sobre el fichero
				System.out.println("Fichero seleccionado: " + file.getName());
				lblFoto.setIcon(new ImageIcon(file.getAbsolutePath()));
			}
		}
	}
	private class TextNombreFocusListener extends FocusAdapter {
		@Override
		public void focusGained(FocusEvent e) {
			e.getComponent().setBackground(colorResaltado);
		}
		@Override
		public void focusLost(FocusEvent e) {
			e.getComponent().setBackground(colorBlanco);
		}
	}
	private class TextApellidosFocusListener extends FocusAdapter {
		@Override
		public void focusGained(FocusEvent e) {
			e.getComponent().setBackground(colorResaltado);
		}
		@Override
		public void focusLost(FocusEvent e) {
			e.getComponent().setBackground(colorBlanco);
		}
	}
	private class TextEmailFocusListener extends FocusAdapter {
		@Override
		public void focusGained(FocusEvent e) {
			e.getComponent().setBackground(colorResaltado);
		}
		@Override
		public void focusLost(FocusEvent e) {
			e.getComponent().setBackground(colorBlanco);
		}
	}
	private class TextTelefonoFocusListener extends FocusAdapter {
		@Override
		public void focusGained(FocusEvent e) {
			e.getComponent().setBackground(colorResaltado);
		}
		@Override
		public void focusLost(FocusEvent e) {
			e.getComponent().setBackground(colorBlanco);
		}
	}
	private class TextContraseñaFocusListener extends FocusAdapter {
		@Override
		public void focusGained(FocusEvent e) {
			e.getComponent().setBackground(colorResaltado);
		}
		@Override
		public void focusLost(FocusEvent e) {
			e.getComponent().setBackground(colorBlanco);
		}
	}
	private class TextConfirmarContraseñaFocusListener extends FocusAdapter {
		@Override
		public void focusGained(FocusEvent e) {
			e.getComponent().setBackground(colorResaltado);
		}
		@Override
		public void focusLost(FocusEvent e) {
			e.getComponent().setBackground(colorBlanco);
		}
	}
	private class TxtInfoAdicionalFocusListener extends FocusAdapter {
		@Override
		public void focusGained(FocusEvent e) {
			e.getComponent().setBackground(colorResaltado);
		}
		@Override
		public void focusLost(FocusEvent e) {
			e.getComponent().setBackground(colorBlanco);
		}
	}
	private class TxtDNIFocusListener extends FocusAdapter {
		@Override
		public void focusGained(FocusEvent e) {
			e.getComponent().setBackground(colorResaltado);
		}
		@Override
		public void focusLost(FocusEvent e) {
			e.getComponent().setBackground(colorBlanco);
		}
	}
	private class TextConfirmarMailFocusListener extends FocusAdapter {
		@Override
		public void focusGained(FocusEvent e) {
			e.getComponent().setBackground(colorResaltado);
		}
		@Override
		public void focusLost(FocusEvent e) {
			e.getComponent().setBackground(colorBlanco);
		}
	}
	private class TextConfirmarContraseñaActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			//obtenemos la contraseña introducida
		/* Para dar funcionalidad
			if(String.valueOf(pwdPassword.getPassword()).equals(password)){
				lblAviso.setBackground(Color.GREEN);
				lblAviso.setText("Contraseña correcta. Puede entrar");
				lblAviso.setVisible(true);
				btnEntrar.setEnabled(true);
				lblContraseña.setEnabled(false);
				pwdPassword.setEnabled(false);
				} else{
					lblAviso.setBackground(Color.RED);
					lblAviso.setText("Contraseña incorrecta. Vuelva a intentarlo");
					lblAviso.setVisible(true);
					btnEntrar.setEnabled(false);}
		*/
		}
	}
}
