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
import javax.swing.border.LineBorder;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Component;
import javax.swing.border.BevelBorder;


public class P_Login {

	private JFrame frmLogin;
	private JTextField txtDNI;
	private JLabel lblDNI;
	private JPasswordField pwdIntroduzcaContrasea;
	private JButton btnBorarLogin;
	private JButton btnAceptarLogin;
	private JLabel lblIncorrectDNI;
	private JLabel lblIncorrectPassword;
	private JLabel lblValidar;
	

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
		gbl_pnlLogin.columnWidths = new int[] { 100, 10, 100, 100, 30, 95, 0 };
		gbl_pnlLogin.rowHeights = new int[] { 56, 59, 24, 0, 0, 0, 0, 19, 26, 25, 58, 0 };
		gbl_pnlLogin.columnWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
		gbl_pnlLogin.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
				Double.MIN_VALUE };
		pnlLogin.setLayout(gbl_pnlLogin);

		lblDNI = new JLabel("Usuario");
		lblDNI.setFont(new Font("Verdana", Font.BOLD, 16));
		GridBagConstraints gbc_lblDNI = new GridBagConstraints();
		gbc_lblDNI.anchor = GridBagConstraints.WEST;
		gbc_lblDNI.insets = new Insets(0, 0, 5, 5);
		gbc_lblDNI.gridx = 2;
		gbc_lblDNI.gridy = 2;
		pnlLogin.add(lblDNI, gbc_lblDNI);
		
		txtDNI = new JTextField();
		txtDNI.setFont(new Font("Verdana", Font.PLAIN, 11));
		txtDNI.setForeground(new Color(169, 169, 169));
		txtDNI.setText("Introduzca DNI");
		txtDNI.setHorizontalAlignment(SwingConstants.CENTER);
		txtDNI.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.gridwidth = 2;
		gbc_textField.insets = new Insets(0, 0, 5, 5);
		gbc_textField.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField.gridx = 2;
		gbc_textField.gridy = 3;
		pnlLogin.add(txtDNI, gbc_textField);
		txtDNI.setColumns(10);
		
		lblIncorrectDNI = new JLabel("");
		lblIncorrectDNI.setVisible(false);
		lblIncorrectDNI.setIcon(new ImageIcon(P_Login.class.getResource("/presentacion/cancel.png")));
		GridBagConstraints gbc_lblIncorrectDNI = new GridBagConstraints();
		gbc_lblIncorrectDNI.insets = new Insets(0, 0, 5, 5);
		gbc_lblIncorrectDNI.gridx = 4;
		gbc_lblIncorrectDNI.gridy = 3;
		pnlLogin.add(lblIncorrectDNI, gbc_lblIncorrectDNI);


		
		JLabel lblContraseña = new JLabel("Contraseña");
		lblContraseña.setFont(new Font("Verdana", Font.BOLD, 16));
		GridBagConstraints gbc_lblContraseña = new GridBagConstraints();
		gbc_lblContraseña.gridwidth = 2;
		gbc_lblContraseña.anchor = GridBagConstraints.WEST;
		gbc_lblContraseña.insets = new Insets(0, 0, 5, 5);
		gbc_lblContraseña.gridx = 2;
		gbc_lblContraseña.gridy = 5;
		pnlLogin.add(lblContraseña, gbc_lblContraseña);

		pwdIntroduzcaContrasea = new JPasswordField();
		pwdIntroduzcaContrasea.setHorizontalAlignment(SwingConstants.CENTER);
		pwdIntroduzcaContrasea.setFont(new Font("Verdana", Font.PLAIN, 14));
		pwdIntroduzcaContrasea.setToolTipText("");
		pwdIntroduzcaContrasea.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		GridBagConstraints gbc_pwdIntroduzcaContrasea = new GridBagConstraints();
		gbc_pwdIntroduzcaContrasea.gridwidth = 2;
		gbc_pwdIntroduzcaContrasea.fill = GridBagConstraints.BOTH;
		gbc_pwdIntroduzcaContrasea.insets = new Insets(0, 0, 5, 5);
		gbc_pwdIntroduzcaContrasea.gridx = 2;
		gbc_pwdIntroduzcaContrasea.gridy = 6;
		pnlLogin.add(pwdIntroduzcaContrasea, gbc_pwdIntroduzcaContrasea);

	
		btnAceptarLogin = new JButton("Aceptar");
		btnAceptarLogin.addActionListener(new BtnAceptarLoginActionListener());
				
				lblIncorrectPassword = new JLabel("");
				lblIncorrectPassword.setVisible(false);
				lblIncorrectPassword.setIcon(new ImageIcon(P_Login.class.getResource("/presentacion/cancel.png")));
				GridBagConstraints gbc_lblInocrrectPassword = new GridBagConstraints();
				gbc_lblInocrrectPassword.insets = new Insets(0, 0, 5, 5);
				gbc_lblInocrrectPassword.gridx = 4;
				gbc_lblInocrrectPassword.gridy = 6;
				pnlLogin.add(lblIncorrectPassword, gbc_lblInocrrectPassword);
				
				lblValidar = new JLabel("");
				lblValidar.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 10));
				lblValidar.setForeground(new Color(204, 0, 51));
				GridBagConstraints gbc_lblValidar = new GridBagConstraints();
				gbc_lblValidar.fill = GridBagConstraints.BOTH;
				gbc_lblValidar.gridwidth = 3;
				gbc_lblValidar.insets = new Insets(0, 0, 5, 5);
				gbc_lblValidar.gridx = 2;
				gbc_lblValidar.gridy = 7;
				pnlLogin.add(lblValidar, gbc_lblValidar);
		
				JLabel lblLink = new JLabel("Crear cuenta");
				lblLink.setForeground(new Color(0, 0, 255));
				lblLink.setFont(new Font("Verdana", Font.ITALIC, 14));
				GridBagConstraints gbc_lblLink = new GridBagConstraints();
				gbc_lblLink.anchor = GridBagConstraints.WEST;
				gbc_lblLink.insets = new Insets(0, 0, 5, 5);
				gbc_lblLink.gridx = 2;
				gbc_lblLink.gridy = 8;
				pnlLogin.add(lblLink, gbc_lblLink);
		
		btnBorarLogin = new JButton("Borrar");
		btnBorarLogin.setToolTipText("Confrmar para acceder");
		btnBorarLogin.setFont(new Font("Verdana", Font.BOLD, 16));
		btnBorarLogin.setBackground(new Color(244, 164, 96));
		GridBagConstraints gbc_btnBorarLogin = new GridBagConstraints();
		gbc_btnBorarLogin.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnBorarLogin.insets = new Insets(0, 0, 0, 5);
		gbc_btnBorarLogin.gridx = 2;
		gbc_btnBorarLogin.gridy = 10;
		pnlLogin.add(btnBorarLogin, gbc_btnBorarLogin);
		btnAceptarLogin.setBackground(new Color(244, 164, 96));
		btnAceptarLogin.setToolTipText("Confrmar para acceder");
		btnAceptarLogin.setFont(new Font("Verdana", Font.BOLD, 16));
		GridBagConstraints gbc_btnAceptarLogin = new GridBagConstraints();
		gbc_btnAceptarLogin.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnAceptarLogin.insets = new Insets(0, 0, 0, 5);
		gbc_btnAceptarLogin.gridx = 3;
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
            if (txtDNI.getText().equals("06290278P") && pwdIntroduzcaContrasea.getText().equals("man123")) {
                frmLogin.setVisible(false);
                P_Parcela principal = new P_Parcela();
                principal.setVisible(true);
            } else if (txtDNI.getText().equals(" ") && pwdIntroduzcaContrasea.getText().equals(" " )|| (txtDNI.getText().equals("Introduzca DNI") || pwdIntroduzcaContrasea.getText().equals("passsword"))) {
                lblValidar.setText("Por favor, introduzca los datos");
                lblIncorrectPassword.setVisible(true);
                lblIncorrectDNI.setVisible(true);
            }else if(txtDNI.getText().equals("06290278P") && pwdIntroduzcaContrasea.getText().equals(" " )) {
            	lblValidar.setText("Por favor, introduzca bien la contraseña");
            	lblIncorrectPassword.setVisible(true);
            }else if(txtDNI.getText().equals(" ") && pwdIntroduzcaContrasea.getText().equals("man123")) {
            	lblValidar.setText("Por favor, introduzca bien el usuario");
            	lblIncorrectDNI.setVisible(true);
          
            }else {
                lblValidar.setText("Datos incorrectos,intentelo de nuevo");
                lblIncorrectDNI.setVisible(true);
                lblIncorrectPassword.setVisible(true);
            }
                

        }
    }


}
