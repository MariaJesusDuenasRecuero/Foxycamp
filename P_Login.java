package presentacion;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Rectangle;
import java.awt.Color;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Toolkit;
import java.awt.Window;

import javax.swing.JLabel;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.Font;
import javax.swing.border.LineBorder;
import java.awt.SystemColor;
import java.awt.GridLayout;
import javax.swing.UIManager;
import javax.swing.JTextField;
import java.awt.FlowLayout;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.ActionEvent;
import java.awt.Component;
import javax.swing.border.BevelBorder;
import javax.swing.border.Border;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class P_Login {

	private JFrame frmLogin;
	private JTextField txtCorreoElectronico;
	private JPasswordField passwordField;
	private JLabel lblCheck;
	private JLabel lblCheck1;
	private JLabel lblEstado;

	private Border bordeRojo = BorderFactory.createLineBorder(Color.RED);
	private Border bordeVerde = BorderFactory.createLineBorder(Color.GREEN);
	private ImageIcon imagTick = new ImageIcon(P_Login.class.getResource("/presentacion/checked.png"));
	private ImageIcon imagCross = new ImageIcon(P_Login.class.getResource("/presentacion/cancel.png"));

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
		frmLogin.getContentPane().setBackground(Color.WHITE);

		JPanel pnlHeader = new JPanel();
		pnlHeader.setBackground(new Color(255, 228, 196));
		frmLogin.getContentPane().add(pnlHeader, BorderLayout.NORTH);
		GridBagLayout gbl_pnlHeader = new GridBagLayout();
		gbl_pnlHeader.columnWidths = new int[] { 50, 44, 64, 300, 0, 0, 358, 92, 50, 50, 64, 64, 64, 0, 0 };
		gbl_pnlHeader.rowHeights = new int[] { 50, 0, 50, 0 };
		gbl_pnlHeader.columnWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
				0.0, Double.MIN_VALUE };
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

		JLabel lblLeftLine = new JLabel("");
		lblLeftLine.setAlignmentX(Component.CENTER_ALIGNMENT);
		lblLeftLine.setVerticalAlignment(SwingConstants.BOTTOM);
		lblLeftLine.setHorizontalAlignment(SwingConstants.LEFT);
		lblLeftLine.setBorder(new LineBorder(new Color(210, 105, 30), 2, true));
		GridBagConstraints gbc_lblLeftLine = new GridBagConstraints();
		gbc_lblLeftLine.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblLeftLine.gridwidth = 5;
		gbc_lblLeftLine.insets = new Insets(0, 0, 0, 5);
		gbc_lblLeftLine.gridx = 1;
		gbc_lblLeftLine.gridy = 2;
		pnlHeader.add(lblLeftLine, gbc_lblLeftLine);

		JLabel lblRightLine = new JLabel("");
		lblRightLine.setVerticalAlignment(SwingConstants.BOTTOM);
		lblRightLine.setHorizontalAlignment(SwingConstants.LEFT);
		lblRightLine.setBorder(new LineBorder(new Color(210, 105, 30), 2, true));
		lblRightLine.setAlignmentX(0.5f);
		GridBagConstraints gbc_lblRightLine = new GridBagConstraints();
		gbc_lblRightLine.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblRightLine.gridwidth = 6;
		gbc_lblRightLine.insets = new Insets(0, 0, 0, 5);
		gbc_lblRightLine.gridx = 7;
		gbc_lblRightLine.gridy = 2;
		pnlHeader.add(lblRightLine, gbc_lblRightLine);

		JPanel pnlContenido = new JPanel();
		pnlContenido.setBackground(new Color(255, 228, 196));
		frmLogin.getContentPane().add(pnlContenido, BorderLayout.CENTER);
		GridBagLayout gbl_pnlContenido = new GridBagLayout();
		gbl_pnlContenido.columnWidths = new int[] { 430, 429, 0 };
		gbl_pnlContenido.rowHeights = new int[] { 90, 435, 0 };
		gbl_pnlContenido.columnWeights = new double[] { 0.0, 0.0, Double.MIN_VALUE };
		gbl_pnlContenido.rowWeights = new double[] { 0.0, 0.0, Double.MIN_VALUE };
		pnlContenido.setLayout(gbl_pnlContenido);

		JLabel lblIngreseDatos = new JLabel("Introduzca sus datos");
		lblIngreseDatos.setFont(new Font("Verdana", Font.BOLD, 36));
		lblIngreseDatos.setForeground(new Color(210, 105, 30));
		GridBagConstraints gbc_lblIngreseDatos = new GridBagConstraints();
		gbc_lblIngreseDatos.insets = new Insets(0, 0, 5, 0);
		gbc_lblIngreseDatos.gridx = 1;
		gbc_lblIngreseDatos.gridy = 0;
		pnlContenido.add(lblIngreseDatos, gbc_lblIngreseDatos);

		JPanel pnlLogin = new JPanel();
		pnlLogin.setBorder(new LineBorder(new Color(253, 245, 230), 4));
		pnlLogin.setBackground(new Color(211, 211, 211));
		GridBagConstraints gbc_pnlLogin = new GridBagConstraints();
		gbc_pnlLogin.fill = GridBagConstraints.BOTH;
		gbc_pnlLogin.gridx = 1;
		gbc_pnlLogin.gridy = 1;
		pnlContenido.add(pnlLogin, gbc_pnlLogin);
		GridBagLayout gbl_pnlLogin = new GridBagLayout();
		gbl_pnlLogin.columnWidths = new int[] { 44, 0, 0, 20, 0 };
		gbl_pnlLogin.rowHeights = new int[] { 56, 59, 24, 0, 0, 0, 0, 47, 34, 39, 0, 0 };
		gbl_pnlLogin.columnWeights = new double[] { 0.0, 1.0, 0.0, 0.0, Double.MIN_VALUE };
		gbl_pnlLogin.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
				Double.MIN_VALUE };
		pnlLogin.setLayout(gbl_pnlLogin);

		JLabel lblCElectronico = new JLabel("Correo electrónico");
		lblCElectronico.setFont(new Font("Verdana", Font.BOLD, 16));
		GridBagConstraints gbc_lblCElectronico = new GridBagConstraints();
		gbc_lblCElectronico.anchor = GridBagConstraints.WEST;
		gbc_lblCElectronico.insets = new Insets(0, 0, 5, 5);
		gbc_lblCElectronico.gridx = 1;
		gbc_lblCElectronico.gridy = 2;
		pnlLogin.add(lblCElectronico, gbc_lblCElectronico);

		txtCorreoElectronico = new JTextField();
		txtCorreoElectronico.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		txtCorreoElectronico.setForeground(new Color(169, 169, 169));
		txtCorreoElectronico.setHorizontalAlignment(SwingConstants.CENTER);
		txtCorreoElectronico.setFont(new Font("Verdana", Font.ITALIC, 14));
		txtCorreoElectronico.setText("Correo electronico");
		GridBagConstraints gbc_txtCorreoElectronico = new GridBagConstraints();
		gbc_txtCorreoElectronico.insets = new Insets(0, 0, 5, 5);
		gbc_txtCorreoElectronico.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtCorreoElectronico.gridx = 1;
		gbc_txtCorreoElectronico.gridy = 3;
		pnlLogin.add(txtCorreoElectronico, gbc_txtCorreoElectronico);
		txtCorreoElectronico.setColumns(10);

		JLabel lblCancelC = new JLabel("");
		lblCancelC.setIcon(new ImageIcon(P_Login.class.getResource("/presentacion/cancel.png")));
		GridBagConstraints gbc_lblCancelC = new GridBagConstraints();
		gbc_lblCancelC.insets = new Insets(0, 0, 5, 5);
		gbc_lblCancelC.gridx = 2;
		gbc_lblCancelC.gridy = 3;
		pnlLogin.add(lblCancelC, gbc_lblCancelC);

		JLabel lblContraseña = new JLabel("Contraseña");
		lblContraseña.setFont(new Font("Verdana", Font.BOLD, 16));
		GridBagConstraints gbc_lblContraseña = new GridBagConstraints();
		gbc_lblContraseña.anchor = GridBagConstraints.WEST;
		gbc_lblContraseña.insets = new Insets(0, 0, 5, 5);
		gbc_lblContraseña.gridx = 1;
		gbc_lblContraseña.gridy = 5;
		pnlLogin.add(lblContraseña, gbc_lblContraseña);

		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Verdana", Font.PLAIN, 14));
		passwordField.setEchoChar('*');
		passwordField.setToolTipText("");
		passwordField.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		GridBagConstraints gbc_passwordField = new GridBagConstraints();
		gbc_passwordField.fill = GridBagConstraints.HORIZONTAL;
		gbc_passwordField.insets = new Insets(0, 0, 5, 5);
		gbc_passwordField.gridx = 1;
		gbc_passwordField.gridy = 6;
		pnlLogin.add(passwordField, gbc_passwordField);

		JLabel lblCancelP = new JLabel("");
		lblCancelP.setIcon(new ImageIcon(P_Login.class.getResource("/presentacion/cancel.png")));
		GridBagConstraints gbc_lblCancelP = new GridBagConstraints();
		gbc_lblCancelP.insets = new Insets(0, 0, 5, 5);
		gbc_lblCancelP.gridx = 2;
		gbc_lblCancelP.gridy = 6;
		pnlLogin.add(lblCancelP, gbc_lblCancelP);

		JLabel lblLink = new JLabel("Crear cuenta");
		lblLink.setForeground(new Color(0, 0, 255));
		lblLink.setFont(new Font("Verdana", Font.ITALIC, 14));
		GridBagConstraints gbc_lblLink = new GridBagConstraints();
		gbc_lblLink.anchor = GridBagConstraints.WEST;
		gbc_lblLink.insets = new Insets(0, 0, 5, 5);
		gbc_lblLink.gridx = 1;
		gbc_lblLink.gridy = 7;
		pnlLogin.add(lblLink, gbc_lblLink);

		JButton btnAceptarLogin = new JButton("Aceptar");
		btnAceptarLogin.addActionListener(new BtnAceptarLoginActionListener());
	//	btnAceptarLogin.addMouseListener(new BtnAceptarLoginMouseListener());
		
		JLabel lblEstado = new JLabel("");
		lblEstado.setForeground(Color.RED);
		GridBagConstraints gbc_lblEstado = new GridBagConstraints();
		gbc_lblEstado.fill = GridBagConstraints.VERTICAL;
		gbc_lblEstado.insets = new Insets(0, 0, 5, 5);
		gbc_lblEstado.gridx = 1;
		gbc_lblEstado.gridy = 8;
		pnlLogin.add(lblEstado, gbc_lblEstado);
		btnAceptarLogin.setBackground(new Color(244, 164, 96));
		btnAceptarLogin.setToolTipText("Confrmar para acceder");
		btnAceptarLogin.setFont(new Font("Verdana", Font.BOLD, 16));
		GridBagConstraints gbc_btnAceptarLogin = new GridBagConstraints();
		gbc_btnAceptarLogin.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnAceptarLogin.insets = new Insets(0, 0, 0, 5);
		gbc_btnAceptarLogin.gridx = 1;
		gbc_btnAceptarLogin.gridy = 10;
		pnlLogin.add(btnAceptarLogin, gbc_btnAceptarLogin);
		frmLogin.setResizable(false);
		frmLogin.setBackground(Color.WHITE);
		// frame.setForeground(new Color(255, 204, 102));
		frmLogin.setBounds(new Rectangle(0, 0, 1350, 850));
		// frame.setBounds(100, 100, 450, 300);
		frmLogin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	
	private class BtnAceptarLoginActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if (txtCorreoElectronico.getText().equals("algo") && passwordField.getText().equals("algo")) {
				JOptionPane.showMessageDialog(null,"BIENVENIDO");
				P_Parcela parcela = new P_Parcela();
				parcela.setVisible(true);
			} else if (txtCorreoElectronico.getText().equals(" ") || txtCorreoElectronico.getText().equals("Correo electronico")
					|| passwordField.getText().equals(" ") || passwordField.getText().equals("passsword")) {
				
				lblEstado.setText("Introduzca todos los datos");
			}else {
				lblEstado.setText("No coinciden los datos, por favor intentelo de nuevo");
			}

		}
	}

}
