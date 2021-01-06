package presentacion;

import java.awt.EventQueue;
import javax.swing.JFrame;
import java.awt.Rectangle;
import java.awt.Color;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.border.LineBorder;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;

import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.ActionEvent;
import java.awt.Component;
import javax.swing.border.BevelBorder;
import javax.swing.border.Border;
import javax.swing.border.SoftBevelBorder;
import javax.swing.text.MaskFormatter;

import java.awt.SystemColor;
import javax.swing.UIManager;
import javax.swing.border.EtchedBorder;
import javax.swing.border.MatteBorder;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.ParseException;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.Cursor;

public class P_Login {

	private JFrame frmLogin;
	private JTextField txtFormattedDNI;
	private JLabel lblDNI;
	private JPasswordField pwdIntroduzcaContrasea;
	private JButton btnBorrarLogin;
	private JButton btnEntrarLogin;
	private JLabel lblIncorrectDNI;
	private JLabel lblIncorrectPassword;
	private JLabel lblEstado;
	private JLabel lblLink;

	private Color colorBlanco = new Color(255, 255, 255);
	private Color colorResaltado = new Color(255, 255, 209);

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					P_Login window = new P_Login();
					window.frmLogin.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public P_Login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmLogin = new JFrame();
		frmLogin.getContentPane().setForeground(new Color(248, 248, 255));
		frmLogin.getContentPane().setFont(new Font("Verdana", Font.BOLD, 60));
		frmLogin.setTitle("Login");
		frmLogin.setIconImage(
				Toolkit.getDefaultToolkit().getImage(P_Login.class.getResource("/presentacion/tienda-de-campana.png")));
		frmLogin.getContentPane().setBackground(new Color(255, 228, 196));

		JPanel pnlHeader = new JPanel();
		pnlHeader.setBackground(new Color(255, 228, 196));
		frmLogin.getContentPane().add(pnlHeader, BorderLayout.NORTH);
		GridBagLayout gbl_pnlHeader = new GridBagLayout();
		gbl_pnlHeader.columnWidths = new int[] { 100, 44, 64, 300, 0, 0, 498, 50, 64, 64, 64, 0, 0 };
		gbl_pnlHeader.rowHeights = new int[] { 50, 0, 17, 0, 0 };
		gbl_pnlHeader.columnWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
				Double.MIN_VALUE };
		gbl_pnlHeader.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
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

		JLabel lblTraductor = new JLabel("");
		lblTraductor.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblTraductor.setToolTipText("Traductor");
		lblTraductor.setIcon(new ImageIcon(P_Login.class.getResource("/presentacion/traductor.png")));
		GridBagConstraints gbc_lblTraductor = new GridBagConstraints();
		gbc_lblTraductor.anchor = GridBagConstraints.SOUTHEAST;
		gbc_lblTraductor.insets = new Insets(0, 0, 5, 5);
		gbc_lblTraductor.gridx = 9;
		gbc_lblTraductor.gridy = 1;
		pnlHeader.add(lblTraductor, gbc_lblTraductor);

		JLabel lblLeftLine = new JLabel("");
		lblLeftLine.setAlignmentX(Component.CENTER_ALIGNMENT);
		lblLeftLine.setVerticalAlignment(SwingConstants.BOTTOM);
		lblLeftLine.setHorizontalAlignment(SwingConstants.LEFT);
		lblLeftLine.setBorder(new LineBorder(new Color(210, 105, 30), 2, true));
		GridBagConstraints gbc_lblLeftLine = new GridBagConstraints();
		gbc_lblLeftLine.anchor = GridBagConstraints.SOUTH;
		gbc_lblLeftLine.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblLeftLine.gridwidth = 10;
		gbc_lblLeftLine.insets = new Insets(0, 0, 5, 5);
		gbc_lblLeftLine.gridx = 1;
		gbc_lblLeftLine.gridy = 2;
		pnlHeader.add(lblLeftLine, gbc_lblLeftLine);

		JPanel pnlContenido = new JPanel();
		pnlContenido.setToolTipText("Introduzca contrase�a");
		pnlContenido.setBackground(new Color(255, 228, 196));
		frmLogin.getContentPane().add(pnlContenido, BorderLayout.SOUTH);
		GridBagLayout gbl_pnlContenido = new GridBagLayout();
		gbl_pnlContenido.columnWidths = new int[] { 413, 0, 457, 0, 0 };
		gbl_pnlContenido.rowHeights = new int[] { 0, 455, 75, 0 };
		gbl_pnlContenido.columnWeights = new double[] { 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
		gbl_pnlContenido.rowWeights = new double[] { 0.0, 0.0, 0.0, Double.MIN_VALUE };
		pnlContenido.setLayout(gbl_pnlContenido);

		JPanel pnlLogin = new JPanel();
		pnlLogin.setBorder(new LineBorder(new Color(253, 245, 230), 9, true));
		pnlLogin.setBackground(new Color(211, 211, 211));
		GridBagConstraints gbc_pnlLogin = new GridBagConstraints();
		gbc_pnlLogin.gridwidth = 2;
		gbc_pnlLogin.gridheight = 2;
		gbc_pnlLogin.anchor = GridBagConstraints.SOUTH;
		gbc_pnlLogin.insets = new Insets(0, 0, 5, 5);
		gbc_pnlLogin.fill = GridBagConstraints.HORIZONTAL;
		gbc_pnlLogin.gridx = 2;
		gbc_pnlLogin.gridy = 0;
		pnlContenido.add(pnlLogin, gbc_pnlLogin);
		GridBagLayout gbl_pnlLogin = new GridBagLayout();
		gbl_pnlLogin.columnWidths = new int[] { 85, 10, 80, 0, 113, 30, 75, 0 };
		gbl_pnlLogin.rowHeights = new int[] { 72, 48, 0, 30, 52, 0, 31, 26, 25, 23, 22, 45, 0 };
		gbl_pnlLogin.columnWeights = new double[] { 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
		gbl_pnlLogin.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
				Double.MIN_VALUE };
		pnlLogin.setLayout(gbl_pnlLogin);

		JLabel lblIconUsuario = new JLabel("");
		lblIconUsuario.setIcon(new ImageIcon(P_Login.class.getResource("/presentacion/usuario.png")));
		GridBagConstraints gbc_lblIconUsuario = new GridBagConstraints();
		gbc_lblIconUsuario.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblIconUsuario.anchor = GridBagConstraints.SOUTH;
		gbc_lblIconUsuario.insets = new Insets(0, 0, 5, 5);
		gbc_lblIconUsuario.gridx = 1;
		gbc_lblIconUsuario.gridy = 1;
		pnlLogin.add(lblIconUsuario, gbc_lblIconUsuario);

		lblDNI = new JLabel("Usuario");
		lblDNI.setFont(new Font("Verdana", Font.BOLD, 20));
		GridBagConstraints gbc_lblDNI = new GridBagConstraints();
		gbc_lblDNI.anchor = GridBagConstraints.SOUTHEAST;
		gbc_lblDNI.insets = new Insets(0, 0, 5, 5);
		gbc_lblDNI.gridx = 2;
		gbc_lblDNI.gridy = 1;
		pnlLogin.add(lblDNI, gbc_lblDNI);

		// txtFormattedDNI = new JTextField();
		MaskFormatter formatoDNI;
		try {
			formatoDNI = new MaskFormatter("########'-U");
			formatoDNI.setPlaceholderCharacter('X');
			txtFormattedDNI = new JFormattedTextField(formatoDNI);
			txtFormattedDNI.setToolTipText("Introduzca DNI");
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		txtFormattedDNI.setBackground(Color.WHITE);
		txtFormattedDNI.addFocusListener(new TxtDNIFocusListener());
		txtFormattedDNI.setFont(new Font("Verdana", Font.PLAIN, 16));
		txtFormattedDNI.setForeground(new Color(169, 169, 169));
		txtFormattedDNI.setText("Introduzca DNI");
		txtFormattedDNI.setHorizontalAlignment(SwingConstants.CENTER);
		txtFormattedDNI.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		GridBagConstraints gbc_txtFormattedDNI = new GridBagConstraints();
		gbc_txtFormattedDNI.gridwidth = 4;
		gbc_txtFormattedDNI.insets = new Insets(0, 0, 5, 5);
		gbc_txtFormattedDNI.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtFormattedDNI.gridx = 1;
		gbc_txtFormattedDNI.gridy = 2;
		pnlLogin.add(txtFormattedDNI, gbc_txtFormattedDNI);
		txtFormattedDNI.setColumns(10);

		lblIncorrectDNI = new JLabel("");
		lblIncorrectDNI.setVisible(false);
		lblIncorrectDNI.setIcon(new ImageIcon(P_Login.class.getResource("/presentacion/cancel.png")));
		GridBagConstraints gbc_lblIncorrectDNI = new GridBagConstraints();
		gbc_lblIncorrectDNI.insets = new Insets(0, 0, 5, 5);
		gbc_lblIncorrectDNI.gridx = 5;
		gbc_lblIncorrectDNI.gridy = 2;
		pnlLogin.add(lblIncorrectDNI, gbc_lblIncorrectDNI);

		JLabel lblIconPassword = new JLabel("");
		lblIconPassword.setIcon(new ImageIcon(P_Login.class.getResource("/presentacion/IconContrasena.png")));
		GridBagConstraints gbc_lblIconPassword = new GridBagConstraints();
		gbc_lblIconPassword.anchor = GridBagConstraints.SOUTH;
		gbc_lblIconPassword.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblIconPassword.insets = new Insets(0, 0, 5, 5);
		gbc_lblIconPassword.gridx = 1;
		gbc_lblIconPassword.gridy = 4;
		pnlLogin.add(lblIconPassword, gbc_lblIconPassword);

		JLabel lblContrasena = new JLabel("Contraseña");
		lblContrasena.setFont(new Font("Verdana", Font.BOLD, 20));
		GridBagConstraints gbc_lblContrasena = new GridBagConstraints();
		gbc_lblContrasena.gridwidth = 2;
		gbc_lblContrasena.anchor = GridBagConstraints.SOUTHEAST;
		gbc_lblContrasena.insets = new Insets(0, 0, 5, 5);
		gbc_lblContrasena.gridx = 2;
		gbc_lblContrasena.gridy = 4;
		pnlLogin.add(lblContrasena, gbc_lblContrasena);

		pwdIntroduzcaContrasea = new JPasswordField();
		pwdIntroduzcaContrasea.addFocusListener(new PwdIntroduzcaContraseaFocusListener());
		// pwdIntroduzcaContrasea.addFocusListener(new
		// PwdIntroduzcaContraseaFocusListener());
		pwdIntroduzcaContrasea.setHorizontalAlignment(SwingConstants.CENTER);
		pwdIntroduzcaContrasea.setFont(new Font("Verdana", Font.PLAIN, 16));
		pwdIntroduzcaContrasea.setToolTipText("");
		pwdIntroduzcaContrasea.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		GridBagConstraints gbc_pwdIntroduzcaContrasea = new GridBagConstraints();
		gbc_pwdIntroduzcaContrasea.gridwidth = 4;
		gbc_pwdIntroduzcaContrasea.fill = GridBagConstraints.BOTH;
		gbc_pwdIntroduzcaContrasea.insets = new Insets(0, 0, 5, 5);
		gbc_pwdIntroduzcaContrasea.gridx = 1;
		gbc_pwdIntroduzcaContrasea.gridy = 5;
		pnlLogin.add(pwdIntroduzcaContrasea, gbc_pwdIntroduzcaContrasea);

		lblIncorrectPassword = new JLabel("");
		lblIncorrectPassword.setVisible(false);
		lblIncorrectPassword.setIcon(new ImageIcon(P_Login.class.getResource("/presentacion/cancel.png")));
		GridBagConstraints gbc_lblInocrrectPassword = new GridBagConstraints();
		gbc_lblInocrrectPassword.insets = new Insets(0, 0, 5, 5);
		gbc_lblInocrrectPassword.gridx = 5;
		gbc_lblInocrrectPassword.gridy = 5;
		pnlLogin.add(lblIncorrectPassword, gbc_lblInocrrectPassword);

		lblEstado = new JLabel("");
		lblEstado.setLabelFor(lblEstado);
		lblEstado.setFont(new Font("Verdana", Font.BOLD, 12));
		lblEstado.setHorizontalAlignment(SwingConstants.LEFT);
		lblEstado.setForeground(new Color(255, 0, 0));
		GridBagConstraints gbc_lblEstado = new GridBagConstraints();
		gbc_lblEstado.fill = GridBagConstraints.BOTH;
		gbc_lblEstado.gridwidth = 4;
		gbc_lblEstado.insets = new Insets(0, 0, 5, 5);
		gbc_lblEstado.gridx = 1;
		gbc_lblEstado.gridy = 6;
		pnlLogin.add(lblEstado, gbc_lblEstado);

		JLabel lblLink = new JLabel("Crear cuenta");
		lblLink.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblLink.addKeyListener(new LblLinkKeyListener());
		lblLink.setForeground(new Color(0, 0, 255));
		lblLink.setFont(new Font("Verdana", Font.ITALIC, 14));
		GridBagConstraints gbc_lblLink = new GridBagConstraints();
		gbc_lblLink.gridwidth = 2;
		gbc_lblLink.anchor = GridBagConstraints.WEST;
		gbc_lblLink.insets = new Insets(0, 0, 5, 5);
		gbc_lblLink.gridx = 1;
		gbc_lblLink.gridy = 7;
		pnlLogin.add(lblLink, gbc_lblLink);
		lblLink.addMouseListener(new LblLinkListener());

		btnEntrarLogin = new JButton("Entrar");
		btnEntrarLogin.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnEntrarLogin.setIcon(new ImageIcon(P_Login.class.getResource("/presentacion/IconoEntrarLogin.png")));
		btnEntrarLogin.setForeground(new Color(0, 0, 0));
		btnEntrarLogin.addActionListener(new BtnAceptarLoginActionListener());
		btnEntrarLogin.setBackground(new Color(244, 164, 96));
		btnEntrarLogin.setToolTipText("Confirmar para acceder");
		btnEntrarLogin.setBorder(new RoundedBorder(10));
		btnEntrarLogin.setFont(new Font("Verdana", Font.BOLD, 16));
		GridBagConstraints gbc_btnEntrarLogin = new GridBagConstraints();
		gbc_btnEntrarLogin.gridheight = 2;
		gbc_btnEntrarLogin.gridwidth = 2;
		gbc_btnEntrarLogin.fill = GridBagConstraints.BOTH;
		gbc_btnEntrarLogin.insets = new Insets(0, 0, 5, 5);
		gbc_btnEntrarLogin.gridx = 4;
		gbc_btnEntrarLogin.gridy = 9;
		pnlLogin.add(btnEntrarLogin, gbc_btnEntrarLogin);

		btnBorrarLogin = new JButton("Borrar");
		btnBorrarLogin.addActionListener(new BtnBorrarLoginActionListener());
		btnBorrarLogin.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnBorrarLogin.setIcon(new ImageIcon(P_Login.class.getResource("/presentacion/IconoBorrar.png")));
		btnBorrarLogin.setForeground(Color.BLACK);
		btnBorrarLogin.setToolTipText("Borrar datos");
		btnBorrarLogin.setFont(new Font("Verdana", Font.BOLD, 16));
		btnBorrarLogin.setBackground(new Color(244, 164, 96));
		btnBorrarLogin.setBorder(new RoundedBorder(10));
		GridBagConstraints gbc_btnBorrarLogin = new GridBagConstraints();
		gbc_btnBorrarLogin.gridheight = 2;
		gbc_btnBorrarLogin.gridwidth = 2;
		gbc_btnBorrarLogin.fill = GridBagConstraints.BOTH;
		gbc_btnBorrarLogin.insets = new Insets(0, 0, 5, 5);
		gbc_btnBorrarLogin.gridx = 1;
		gbc_btnBorrarLogin.gridy = 9;
		pnlLogin.add(btnBorrarLogin, gbc_btnBorrarLogin);

		JLabel lblIngreseDatos = new JLabel("Introduzca sus datos");
		lblIngreseDatos.setHorizontalAlignment(SwingConstants.CENTER);
		frmLogin.getContentPane().add(lblIngreseDatos, BorderLayout.CENTER);
		lblIngreseDatos.setFont(new Font("Verdana", Font.BOLD, 40));
		lblIngreseDatos.setForeground(new Color(210, 105, 30));
		frmLogin.setResizable(false);
		frmLogin.setBackground(Color.WHITE);
		// frame.setForeground(new Color(255, 204, 102));
		frmLogin.setBounds(new Rectangle(0, 0, 1375, 800));
		// frame.setBounds(100, 100, 450, 300);
		frmLogin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	private class BtnAceptarLoginActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if ((txtFormattedDNI.getText().equals("00000016-A") && pwdIntroduzcaContrasea.getText().equals("man123"))
					|| (txtFormattedDNI.getText().equals("00000011-M")
							&& pwdIntroduzcaContrasea.getText().equals("man123"))
					|| (txtFormattedDNI.getText().equals("00000018-M")
							&& pwdIntroduzcaContrasea.getText().equals("man123"))) {
				P_Principal principal = new P_Principal();
				principal.getFrame().setVisible(true);
				frmLogin.dispose();
			} else if (txtFormattedDNI.getText().equals("XXXXXXXXX-X") || pwdIntroduzcaContrasea.getText().equals("")) {
				lblIncorrectDNI.setVisible(true);
				lblIncorrectPassword.setVisible(true);
				lblEstado.setText("Por favor, introduzca datos");
			} else {
				lblIncorrectDNI.setVisible(true);
				lblIncorrectPassword.setVisible(true);
				lblEstado.setText("Datos incorrectos,inténtelo de nuevo");
			}

		}
	}

	private class BtnBorrarLoginActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			txtFormattedDNI.setText(null);
			pwdIntroduzcaContrasea.setText(null);
			lblIncorrectDNI.setVisible(false);
			lblIncorrectPassword.setVisible(false);
			lblEstado.setText("");
			lblEstado.setText("");

		}
	}

	/*
	 * private class LblAyudaMouseListener extends MouseAdapter {
	 * 
	 * @Override public void mouseClicked(MouseEvent e) {
	 * lblAyuda.setBackground(Color.ORANGE);
	 * 
	 * } }
	 */
	private class LblLinkListener extends MouseAdapter {
		@Override
		public void mouseClicked(MouseEvent e) {
			P_Registro frmRegistro = new P_Registro();
			frmRegistro.getFrame().setVisible(true);
			frmLogin.dispose();
		}

	}

	private class TxtDNIFocusListener extends FocusAdapter {
		@Override
		public void focusGained(FocusEvent e) {
			txtFormattedDNI.setBackground(colorResaltado);
		}

		@Override
		public void focusLost(FocusEvent e) {
			txtFormattedDNI.setBackground(colorBlanco);
		}
	}

	private class PwdIntroduzcaContraseaFocusListener extends FocusAdapter {
		@Override
		public void focusGained(FocusEvent e) {
			pwdIntroduzcaContrasea.setBackground(colorResaltado);
		}

		@Override
		public void focusLost(FocusEvent e) {
			pwdIntroduzcaContrasea.setBackground(colorBlanco);
		}
	}

	private class LblLinkKeyListener extends KeyAdapter {
		@Override
		public void keyTyped(KeyEvent e) {
			lblLink.setForeground(new Color(0, 0, 400));
		}
	}

	class RoundedBorder implements Border {

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

	public JFrame getFrame() {
		return frmLogin;
	}

}