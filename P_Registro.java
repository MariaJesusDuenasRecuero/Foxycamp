package presentacion;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JPopupMenu;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import javax.swing.text.MaskFormatter;

import java.awt.Toolkit;
import java.awt.GridBagLayout;
import java.awt.Font;
import java.awt.Graphics;

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
import java.awt.Cursor;

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
	private JLabel lblContrasena;
	private JLabel lblInformacion;
	private JLabel lblNombre;
	private JTextField textEmail;
	private JTextField textTelefono;
	private JLabel lblImagenCV;
	private JLabel lblTelefono;
	private JLabel lblImagenCarga;
	private JLabel lblImagen;
	private JLabel lblConfirmarContrasena;
	private JPasswordField textContrasena;
	private JPasswordField textConfirmarContrasena;
	private JFrame frmRegistro;
	private JTextField textNombre;
	
	
	private Color colorResaltado = new Color (255,255,210);
	private Color naranja = new Color(255, 228, 196);
	private Color colorBlanco = new Color (255,255,255);
	private JLabel lblDNI;
	private JTextField txtDNI;
	private JTextField textConfirmarMail;
	private JLabel lblNewLabel;
	private JButton btnVolver;
	private JLabel lblAviso;
	private JLabel lblFichero;
	private JPopupMenu pmFlecha;

	/**
	 * Create the frame.
	 */
	public P_Registro() {
		frmRegistro = new JFrame();
		frmRegistro.setFont(new Font("Verdana", Font.BOLD, 16)); //$NON-NLS-1$
		frmRegistro.setIconImage(Toolkit.getDefaultToolkit().getImage(P_Registro.class.getResource("/presentacion/usuario.png"))); //$NON-NLS-1$
		frmRegistro.setBackground(naranja);
		frmRegistro.setBounds(new Rectangle(0, 0, 1350, 850));
		frmRegistro.setTitle(MessagesP_Registro.getString("P_Registro.frmRegistro.title")); //$NON-NLS-1$
		frmRegistro.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		contentPane.setBackground(Color.WHITE);
		frmRegistro.getContentPane().add(contentPane);
		
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
		
		JButton btnEspanol = new JButton(MessagesP_Registro.getString("P_Registro.btnEspanol.text")); //$NON-NLS-1$ //$NON-NLS-1$ //$NON-NLS-1$
		btnEspanol.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MessagesP_About.setIdioma("español"); //$NON-NLS-1$
				MessagesP_Ayuda.setIdioma("español");
				MessagesP_Login.setIdioma("español");
				MessagesP_Perfil.setIdioma("español");
				MessagesP_Registro.setIdioma("español");
				MessagesPrincipal.setIdioma("español");
				P_Registro frm = new P_Registro();
				frmRegistro.dispose();
				frm.getFrame().setVisible(true);
			}
		});
		pmFlecha = new JPopupMenu();
		
		pmFlecha.add(btnEspanol);
		
		JButton btnIngles = new JButton(MessagesP_Registro.getString("P_Registro.btnIngles.text")); //$NON-NLS-1$ //$NON-NLS-1$ //$NON-NLS-1$
		btnIngles.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MessagesP_About.setIdioma("inglés"); //$NON-NLS-1$
				MessagesP_Ayuda.setIdioma("inglés");
				MessagesP_Login.setIdioma("inglés");
				MessagesP_Perfil.setIdioma("inglés");
				MessagesP_Registro.setIdioma("inglés");
				MessagesPrincipal.setIdioma("inglés");
				P_Registro frm = new P_Registro();
				frmRegistro.dispose();
				frm.getFrame().setVisible(true);
			}
		});
		pmFlecha.add(btnIngles);
		
		
		addPopup(lblFlechaTraductor, pmFlecha);
		GridBagConstraints gbc_lblFlechaTraductor = new GridBagConstraints();
		gbc_lblFlechaTraductor.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblFlechaTraductor.anchor = GridBagConstraints.SOUTH;
		gbc_lblFlechaTraductor.insets = new Insets(0, 0, 5, 5);
		gbc_lblFlechaTraductor.gridx = 12;
		gbc_lblFlechaTraductor.gridy = 1;
		pnlHeader.add(lblFlechaTraductor, gbc_lblFlechaTraductor);
		
		
		lblFlechaTraductor.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				pmFlecha.show(e.getComponent(), e.getX(), e.getY());
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

		pnlContenido = new JPanel();
		pnlContenido.setBackground(new Color(255, 228, 196));
		GridBagLayout gbl_pnlContenido = new GridBagLayout();
		gbl_pnlContenido.columnWidths = new int[] { 300, 429, 300, 0 };
		gbl_pnlContenido.rowHeights = new int[] { 84, 440, 0, 0 };
		gbl_pnlContenido.columnWeights = new double[] { 0.0, 0.0, 0.0, Double.MIN_VALUE };
		gbl_pnlContenido.rowWeights = new double[] { 0.0, 0.0, 0.0, Double.MIN_VALUE };
		pnlContenido.setLayout(gbl_pnlContenido);
		contentPane.add(pnlContenido);

		lblIngreseDatos = new JLabel(MessagesP_Registro.getString("P_Registro.lblIngreseDatos.text")); //$NON-NLS-1$
		lblIngreseDatos.setFont(new Font("Verdana", Font.BOLD, 36)); //$NON-NLS-1$
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
		gbc_pnlLogin.anchor = GridBagConstraints.EAST;
		gbc_pnlLogin.insets = new Insets(0, 0, 5, 5);
		gbc_pnlLogin.gridx = 1;
		gbc_pnlLogin.gridy = 1;
		pnlContenido.add(pnlLogin, gbc_pnlLogin);
		GridBagLayout gbl_pnlLogin = new GridBagLayout();
		gbl_pnlLogin.columnWidths = new int[] { 20, 0, 20, 115, 101, 20, 20, 20, 35, 145, 0, 20, 0 };
		gbl_pnlLogin.rowHeights = new int[] { 35, 35, 35, 35, 35, 35, 35, 35, 35, 34, 39, 10, 20, 0 };
		gbl_pnlLogin.columnWeights = new double[] { 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
		gbl_pnlLogin.rowWeights = new double[] { 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0,
				Double.MIN_VALUE };
		pnlLogin.setLayout(gbl_pnlLogin);
		
		lblNombre = new JLabel(MessagesP_Registro.getString("P_Registro.lblNombre.text")); //$NON-NLS-1$
		lblNombre.setToolTipText(MessagesP_Registro.getString("P_Registro.lblNombre.toolTipText")); //$NON-NLS-1$
		lblNombre.setFont(new Font("Verdana", Font.BOLD, 16)); //$NON-NLS-1$
		GridBagConstraints gbc_lblNombre = new GridBagConstraints();
		gbc_lblNombre.gridwidth = 2;
		gbc_lblNombre.anchor = GridBagConstraints.EAST;
		gbc_lblNombre.insets = new Insets(0, 0, 5, 5);
		gbc_lblNombre.gridx = 1;
		gbc_lblNombre.gridy = 1;
		pnlLogin.add(lblNombre, gbc_lblNombre);
		
		textNombre = new JTextField();
		textNombre.addActionListener(new TextNombreActionListener());
		textNombre.addFocusListener(new TextNombreFocusListener());
		GridBagConstraints gbc_textNombre = new GridBagConstraints();
		gbc_textNombre.insets = new Insets(0, 0, 5, 5);
		gbc_textNombre.fill = GridBagConstraints.HORIZONTAL;
		gbc_textNombre.gridx = 3;
		gbc_textNombre.gridy = 1;
		pnlLogin.add(textNombre, gbc_textNombre);
		textNombre.setColumns(10);
		
		scrollFoto = new JScrollPane();
		scrollFoto.setBorder(new TitledBorder(null, MessagesP_Registro.getString("P_Registro.scrollFoto.borderTitle"), TitledBorder.LEADING, TitledBorder.TOP, null, null)); //$NON-NLS-1$
		GridBagConstraints gbc_scrollFoto = new GridBagConstraints();
		gbc_scrollFoto.gridheight = 6;
		gbc_scrollFoto.gridwidth = 3;
		gbc_scrollFoto.insets = new Insets(0, 0, 5, 5);
		gbc_scrollFoto.fill = GridBagConstraints.BOTH;
		gbc_scrollFoto.gridx = 7;
		gbc_scrollFoto.gridy = 1;
		pnlLogin.add(scrollFoto, gbc_scrollFoto);
		
		lblFoto = new JLabel(""); //$NON-NLS-1$
		lblFoto.setHorizontalAlignment(SwingConstants.CENTER);
		scrollFoto.setViewportView(lblFoto);
		
		lblApellidos = new JLabel(MessagesP_Registro.getString("P_Registro.lblApellidos.text")); //$NON-NLS-1$
		lblApellidos.setFont(new Font("Verdana", Font.BOLD, 16)); //$NON-NLS-1$
		GridBagConstraints gbc_lblApellidos = new GridBagConstraints();
		gbc_lblApellidos.gridwidth = 2;
		gbc_lblApellidos.anchor = GridBagConstraints.ABOVE_BASELINE_TRAILING;
		gbc_lblApellidos.insets = new Insets(0, 0, 5, 5);
		gbc_lblApellidos.gridx = 1;
		gbc_lblApellidos.gridy = 2;
		pnlLogin.add(lblApellidos, gbc_lblApellidos);
		
		textApellidos = new JTextField();
		textApellidos.setEnabled(false);
		textApellidos.addFocusListener(new TextApellidosFocusListener());
		GridBagConstraints gbc_textApellidos = new GridBagConstraints();
		gbc_textApellidos.gridwidth = 2;
		gbc_textApellidos.insets = new Insets(0, 0, 5, 5);
		gbc_textApellidos.fill = GridBagConstraints.HORIZONTAL;
		gbc_textApellidos.gridx = 3;
		gbc_textApellidos.gridy = 2;
		pnlLogin.add(textApellidos, gbc_textApellidos);
		textApellidos.setColumns(10);
		
	
		textEmail = new JTextField();
		textEmail.setEnabled(false);
		textEmail.setFont(new Font("Tahoma", Font.PLAIN, 11)); //$NON-NLS-1$
		textEmail.addActionListener(new TxtMailActionListener());
		textEmail.addFocusListener(new TextEmailFocusListener());
		
		lblDNI = new JLabel(MessagesP_Registro.getString("P_Registro.lblDNI.text")); //$NON-NLS-1$
		lblDNI.setToolTipText(MessagesP_Registro.getString("P_Registro.lblDNI.toolTipText")); //$NON-NLS-1$
		lblDNI.setFont(new Font("Verdana", Font.BOLD, 16)); //$NON-NLS-1$
		GridBagConstraints gbc_lblDNI = new GridBagConstraints();
		gbc_lblDNI.gridwidth = 2;
		gbc_lblDNI.anchor = GridBagConstraints.EAST;
		gbc_lblDNI.insets = new Insets(0, 0, 5, 5);
		gbc_lblDNI.gridx = 1;
		gbc_lblDNI.gridy = 3;
		pnlLogin.add(lblDNI, gbc_lblDNI);
		
		//txtDNI = new JTextField();
		MaskFormatter formatoDNI;
		try {
			formatoDNI= new MaskFormatter("########'-U"); //$NON-NLS-1$
			formatoDNI.setPlaceholderCharacter('X');
			txtDNI= new JFormattedTextField(formatoDNI);
			txtDNI.setEnabled(false);
			txtDNI.addActionListener(new TxtDNIActionListener());
			txtDNI.addFocusListener(new TxtDNIFocusListener());
		} catch (ParseException e) {
			e.printStackTrace();
		}

		GridBagConstraints gbc_txtDNI = new GridBagConstraints();
		gbc_txtDNI.insets = new Insets(0, 0, 5, 5);
		gbc_txtDNI.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtDNI.gridx = 3;
		gbc_txtDNI.gridy = 3;
		pnlLogin.add(txtDNI, gbc_txtDNI);
		txtDNI.setColumns(10);
		
		lblEmail = new JLabel(MessagesP_Registro.getString("P_Registro.lblEmail.text")); //$NON-NLS-1$
		lblEmail.setToolTipText(MessagesP_Registro.getString("P_Registro.lblEmail.toolTipText")); //$NON-NLS-1$
		lblEmail.setFont(new Font("Verdana", Font.BOLD, 16)); //$NON-NLS-1$
		GridBagConstraints gbc_lblEmail = new GridBagConstraints();
		gbc_lblEmail.gridwidth = 2;
		gbc_lblEmail.anchor = GridBagConstraints.EAST;
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
		textConfirmarMail.setEnabled(false);
		textConfirmarMail.addActionListener(new TxtConfirmarMailActionListener());
		textConfirmarMail.addFocusListener(new TextConfirmarMailFocusListener());
		
		lblNewLabel = new JLabel(MessagesP_Registro.getString("P_Registro.lblNewLabel.text")); //$NON-NLS-1$
		lblNewLabel.setToolTipText(MessagesP_Registro.getString("P_Registro.lblNewLabel.toolTipText")); //$NON-NLS-1$
		lblNewLabel.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel.setHorizontalTextPosition(SwingConstants.LEFT);
		lblNewLabel.setFont(new Font("Verdana", Font.BOLD, 16)); //$NON-NLS-1$
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.gridwidth = 2;
		gbc_lblNewLabel.anchor = GridBagConstraints.EAST;
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
		
		lblTelefono = new JLabel(MessagesP_Registro.getString("P_Registro.lblTelefono.text")); //$NON-NLS-1$
		lblTelefono.setFont(new Font("Verdana", Font.BOLD, 16)); //$NON-NLS-1$
		GridBagConstraints gbc_lblTelefono = new GridBagConstraints();
		gbc_lblTelefono.gridwidth = 2;
		gbc_lblTelefono.anchor = GridBagConstraints.EAST;
		gbc_lblTelefono.insets = new Insets(0, 0, 5, 5);
		gbc_lblTelefono.gridx = 1;
		gbc_lblTelefono.gridy = 6;
		pnlLogin.add(lblTelefono, gbc_lblTelefono);
		
		txtInfoAdicional = new JTextArea();
		txtInfoAdicional.setEnabled(false);
		txtInfoAdicional.addFocusListener(new TxtInfoAdicionalFocusListener());
		
		lblImagenCV = new JLabel(MessagesP_Registro.getString("P_Registro.lblImagenCV.text")); //$NON-NLS-1$
		lblImagenCV.setEnabled(false);
		lblImagenCV.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
	
		lblImagenCV.addMouseListener(new LblImagenCVMouseListener());
		
		MaskFormatter formatoTlfno;
		try {
			formatoTlfno= new MaskFormatter("'(###')' ###' ###' ###"); //$NON-NLS-1$
			formatoTlfno.setPlaceholderCharacter('*');
			textTelefono= new JFormattedTextField(formatoTlfno);
			textTelefono.setEnabled(false);
		}catch (ParseException e) {
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
		
		lblContrasena = new JLabel(MessagesP_Registro.getString("P_Registro.lblContrasena.text")); //$NON-NLS-1$
		lblContrasena.setToolTipText(MessagesP_Registro.getString("P_Registro.lblContrasena.toolTipText")); //$NON-NLS-1$
		lblContrasena.setFont(new Font("Verdana", Font.BOLD, 16)); //$NON-NLS-1$
		GridBagConstraints gbc_lblContrasena = new GridBagConstraints();
		gbc_lblContrasena.gridwidth = 2;
		gbc_lblContrasena.anchor = GridBagConstraints.EAST;
		gbc_lblContrasena.insets = new Insets(0, 0, 5, 5);
		gbc_lblContrasena.gridx = 1;
		gbc_lblContrasena.gridy = 7;
		pnlLogin.add(lblContrasena, gbc_lblContrasena);
		
		textContrasena = new JPasswordField();
		textContrasena.setEnabled(false);
		textContrasena.addActionListener(new PressContraseñaActionListener());
		textContrasena.addFocusListener(new TextContrasenaFocusListener());
		GridBagConstraints gbc_textContrasena = new GridBagConstraints();
		gbc_textContrasena.insets = new Insets(0, 0, 5, 5);
		gbc_textContrasena.fill = GridBagConstraints.HORIZONTAL;
		gbc_textContrasena.gridx = 3;
		gbc_textContrasena.gridy = 7;
		pnlLogin.add(textContrasena, gbc_textContrasena);
		textContrasena.setColumns(10);
		
		//textTelefono = new JTextField();
		
		lblImagenCarga = new JLabel(""); //$NON-NLS-1$
		lblImagenCarga.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblImagenCarga.addMouseListener(new LblImagenCargaMouseListener());
		lblImagenCarga.setIcon(new ImageIcon(P_Registro.class.getResource("/presentacion/uploadImage.png"))); //$NON-NLS-1$
		lblImagenCarga.setToolTipText(MessagesP_Registro.getString("P_Registro.lblImagenCarga.toolTipText")); //$NON-NLS-1$
		GridBagConstraints gbc_lblImagenCarga = new GridBagConstraints();
		gbc_lblImagenCarga.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblImagenCarga.insets = new Insets(0, 0, 5, 5);
		gbc_lblImagenCarga.gridx = 7;
		gbc_lblImagenCarga.gridy = 7;
		pnlLogin.add(lblImagenCarga, gbc_lblImagenCarga);
		
		lblImagen = new JLabel(MessagesP_Registro.getString("P_Registro.lblImagen.text")); //$NON-NLS-1$
		lblImagen.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblImagen.setFont(new Font("Verdana", Font.PLAIN, 13)); //$NON-NLS-1$
		GridBagConstraints gbc_lblImagen = new GridBagConstraints();
		gbc_lblImagen.insets = new Insets(0, 0, 5, 5);
		gbc_lblImagen.gridx = 8;
		gbc_lblImagen.gridy = 7;
		pnlLogin.add(lblImagen, gbc_lblImagen);
		
		lblConfirmarContrasena = new JLabel(MessagesP_Registro.getString("P_Registro.lblConfirmarContrasena.text")); //$NON-NLS-1$
		lblConfirmarContrasena.setToolTipText(MessagesP_Registro.getString("P_Registro.lblConfirmarContrasena.toolTipText")); //$NON-NLS-1$
		lblConfirmarContrasena.setFont(new Font("Verdana", Font.BOLD, 16)); //$NON-NLS-1$
		GridBagConstraints gbc_lblConfirmarContrasena = new GridBagConstraints();
		gbc_lblConfirmarContrasena.gridwidth = 2;
		gbc_lblConfirmarContrasena.anchor = GridBagConstraints.EAST;
		gbc_lblConfirmarContrasena.insets = new Insets(0, 0, 5, 5);
		gbc_lblConfirmarContrasena.gridx = 1;
		gbc_lblConfirmarContrasena.gridy = 8;
		pnlLogin.add(lblConfirmarContrasena, gbc_lblConfirmarContrasena);
		
		textConfirmarContrasena = new JPasswordField();
		textConfirmarContrasena.setEnabled(false);
		textConfirmarContrasena.addActionListener(new TextConfirmarContrasenaActionListener());
		textConfirmarContrasena.addFocusListener(new TextConfirmarContrasenaFocusListener());
		GridBagConstraints gbc_textConfirmarContrasena = new GridBagConstraints();
		gbc_textConfirmarContrasena.insets = new Insets(0, 0, 5, 5);
		gbc_textConfirmarContrasena.fill = GridBagConstraints.HORIZONTAL;
		gbc_textConfirmarContrasena.gridx = 3;
		gbc_textConfirmarContrasena.gridy = 8;
		pnlLogin.add(textConfirmarContrasena, gbc_textConfirmarContrasena);
		textConfirmarContrasena.setColumns(10);
		
		lblCV = new JLabel(MessagesP_Registro.getString("P_Registro.lblCV.text")); //$NON-NLS-1$
		lblCV.setToolTipText(MessagesP_Registro.getString("P_Registro.lblCV.toolTipText")); //$NON-NLS-1$
		lblCV.setFont(new Font("Verdana", Font.BOLD, 16)); //$NON-NLS-1$
		GridBagConstraints gbc_lblCV = new GridBagConstraints();
		gbc_lblCV.gridwidth = 2;
		gbc_lblCV.anchor = GridBagConstraints.EAST;
		gbc_lblCV.insets = new Insets(0, 0, 5, 5);
		gbc_lblCV.gridx = 1;
		gbc_lblCV.gridy = 9;
		pnlLogin.add(lblCV, gbc_lblCV);
		lblImagenCV.setToolTipText(MessagesP_Registro.getString("P_Registro.lblImagenCV.toolTipText")); //$NON-NLS-1$
		lblImagenCV.setIcon(new ImageIcon(P_Registro.class.getResource("/presentacion/uploadFile.png"))); //$NON-NLS-1$
		GridBagConstraints gbc_lblImagenCV = new GridBagConstraints();
		gbc_lblImagenCV.insets = new Insets(0, 0, 5, 5);
		gbc_lblImagenCV.gridx = 3;
		gbc_lblImagenCV.gridy = 9;
		pnlLogin.add(lblImagenCV, gbc_lblImagenCV);
		
		lblFichero = new JLabel(""); //$NON-NLS-1$
		GridBagConstraints gbc_lblFichero = new GridBagConstraints();
		gbc_lblFichero.gridwidth = 8;
		gbc_lblFichero.insets = new Insets(0, 0, 5, 0);
		gbc_lblFichero.gridx = 4;
		gbc_lblFichero.gridy = 9;
		pnlLogin.add(lblFichero, gbc_lblFichero);
		
		lblInformacion = new JLabel(MessagesP_Registro.getString("P_Registro.lblInformacion.text")); //$NON-NLS-1$
		lblInformacion.setFont(new Font("Verdana", Font.BOLD, 16)); //$NON-NLS-1$
		GridBagConstraints gbc_lblInformacion = new GridBagConstraints();
		gbc_lblInformacion.gridwidth = 2;
		gbc_lblInformacion.anchor = GridBagConstraints.EAST;
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
		
		lblAviso = new JLabel(""); //$NON-NLS-1$
		lblAviso.setOpaque(true);
		GridBagConstraints gbc_lblAviso = new GridBagConstraints();
		gbc_lblAviso.gridwidth = 10;
		gbc_lblAviso.insets = new Insets(0, 0, 0, 5);
		gbc_lblAviso.gridx = 1;
		gbc_lblAviso.gridy = 12;
		pnlLogin.add(lblAviso, gbc_lblAviso);
		
		btnVolver = new JButton(MessagesP_Registro.getString("P_Registro.btnVolver.text")); //$NON-NLS-1$
		btnVolver.addActionListener(new BtnVolverActionListener());
		btnVolver.setIcon(new ImageIcon(P_Registro.class.getResource("/presentacion/volver-flecha (1).png"))); //$NON-NLS-1$
		btnVolver.setFont(new Font("Verdana", Font.BOLD, 20)); //$NON-NLS-1$
		btnVolver.setBackground(new Color(244, 164, 96));
		btnVolver.setBorder(new RoundedBorder(6));
		GridBagConstraints gbc_btnVolver = new GridBagConstraints();
		gbc_btnVolver.anchor = GridBagConstraints.EAST;
		gbc_btnVolver.insets = new Insets(0, 0, 0, 5);
		gbc_btnVolver.gridx = 0;
		gbc_btnVolver.gridy = 2;
		pnlContenido.add(btnVolver, gbc_btnVolver);
		
		btnConfirmar = new JButton(MessagesP_Registro.getString("P_Registro.btnConfirmar.text")); //$NON-NLS-1$
		btnConfirmar.setEnabled(false);
		btnConfirmar.addActionListener(new BtnConfirmarActionListener());
		GridBagConstraints gbc_btnConfirmar = new GridBagConstraints();
		gbc_btnConfirmar.fill = GridBagConstraints.VERTICAL;
		gbc_btnConfirmar.anchor = GridBagConstraints.EAST;
		gbc_btnConfirmar.insets = new Insets(0, 0, 0, 5);
		gbc_btnConfirmar.gridx = 1;
		gbc_btnConfirmar.gridy = 2;
		pnlContenido.add(btnConfirmar, gbc_btnConfirmar);
		btnConfirmar.setBounds(new Rectangle(0, 0, -3, 15));
		btnConfirmar.setFont(new Font("Verdana", Font.BOLD, 16)); //$NON-NLS-1$
		btnConfirmar.setBorder(new RoundedBorder(10));
		btnConfirmar.setForeground(new Color(0,0,0));
		btnConfirmar.setBackground(new Color(244, 164, 96));
		
		
	}

	private class LblImagenCargaMouseListener extends MouseAdapter {
		@Override
		public void mouseClicked(MouseEvent e) {
			JFileChooser fcAbrir = new JFileChooser();
			int valorDevuelto = fcAbrir.showOpenDialog(contentPane);
			//Recoger el nombre del fichero seleccionado por el usuario
			if (valorDevuelto == JFileChooser.APPROVE_OPTION) {
				File file = fcAbrir.getSelectedFile();
				//En este punto la aplicaci�n se deber�a encargar de realizar la operaci�n sobre el fichero
				System.out.println(file.getName());
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
				//En este punto la aplicaci�n se deber�a encargar de realizar la operaci�n sobre el fichero
				lblFichero.setText(MessagesP_Registro.getString("P_Registro.26") + file.getName()); //$NON-NLS-1$
				lblFoto.setIcon(new ImageIcon(file.getAbsolutePath()));
				btnConfirmar.setEnabled(true);
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
	private class TextContrasenaFocusListener extends FocusAdapter {
		@Override
		public void focusGained(FocusEvent e) {
			e.getComponent().setBackground(colorResaltado);
		}
		@Override
		public void focusLost(FocusEvent e) {
			e.getComponent().setBackground(colorBlanco);
		}
	}
	private class TextConfirmarContrasenaFocusListener extends FocusAdapter {
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
	private class TextConfirmarContrasenaActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if(textContrasena.getText().equals(textConfirmarContrasena.getText())){
				lblAviso.setBackground(Color.GREEN);
				lblAviso.setText(MessagesP_Registro.getString("P_Registro.27")); //$NON-NLS-1$
				lblAviso.setVisible(true);
				lblImagenCV.setEnabled(true);
				txtInfoAdicional.setEnabled(true);
				} else{
					lblAviso.setBackground(Color.RED);
					lblAviso.setText(MessagesP_Registro.getString("P_Registro.28")); //$NON-NLS-1$
					lblAviso.setVisible(true);
					btnConfirmar.setEnabled(false);
				}
		}
	}
	private class TxtConfirmarMailActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if(textEmail.getText().equals(textConfirmarMail.getText())){
				lblAviso.setBackground(Color.GREEN);
				lblAviso.setText(MessagesP_Registro.getString("P_Registro.29")); //$NON-NLS-1$
				lblAviso.setVisible(true);
				textTelefono.setEnabled(true);
				textContrasena.setEnabled(true);
				textContrasena.requestFocus();
				} else{
					lblAviso.setBackground(Color.RED);
					lblAviso.setText(MessagesP_Registro.getString("P_Registro.30")); //$NON-NLS-1$
					lblAviso.setVisible(true);
				}
		}
	}
	
	private class TxtMailActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			textConfirmarMail.setEnabled(true);
			textConfirmarMail.requestFocus();
		}
	}
	private class TxtDNIActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			textEmail.setEnabled(true);
			textEmail.requestFocus();
		}
	}
	private class TextNombreActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			textApellidos.setEnabled(true);
			txtDNI.setEnabled(true);
			txtDNI.requestFocus();
		}
	}
	private class PressContraseñaActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			textConfirmarContrasena.setEnabled(true);
			textConfirmarContrasena.requestFocus();
		}
	}
	private class BtnConfirmarActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			P_Principal principal = new P_Principal(textNombre.getText());
			principal.getFrame().setVisible(true);
			frmRegistro.dispose();
		}
	}
	private class BtnVolverActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			P_Login frmLogin = new P_Login();
			frmLogin.getFrame().setVisible(true);
			frmRegistro.dispose();
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
	
	public JFrame getFrame() {
		return frmRegistro;
	}
	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}
}