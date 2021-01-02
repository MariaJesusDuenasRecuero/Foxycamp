package presentacion;

import java.awt.BorderLayout;
import java.awt.GridBagLayout;
import java.awt.Rectangle;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Component;
import java.awt.SystemColor;
import javax.swing.JPasswordField;
import javax.swing.border.Border;
import javax.swing.JButton;


import presentacion.V_PerfilCerrarCuenta.RoundedBorder;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.border.BevelBorder;

public class V_PerfilContrasena extends JPanel {
	private JPasswordField _contrasenaActual;
	private JPasswordField passwordField_NuevaContrasena;
	private JPasswordField passwordField_RepitaContra;
	private JLabel lblEstado;
	private JLabel lblIncorrecto1;
	private JLabel lblIncorrecto2;
	private JButton btnBorrarLogin;
	private Color colorBlanco = new Color(255, 255, 255);
	private Color colorResaltado = new Color(255, 255, 209);
	/**
	 * Create the panel.
	 */
	public V_PerfilContrasena() {
		setBounds(new Rectangle(10, 50, 1001, 530));
		setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		add(panel, BorderLayout.CENTER);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{150, 220, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 150, 0, 0};
		gbl_panel.rowHeights = new int[]{0, 54, 0, 41, 0, 50, 0, 0, 50, 0, 0, 50, 0, 0};
		gbl_panel.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		
		JLabel lblCambioDeContrasea = new JLabel("Cambio de contraseña");
		lblCambioDeContrasea.setForeground(new Color(153, 0, 0));
		lblCambioDeContrasea.setFont(new Font("Verdana", Font.BOLD, 32));
		GridBagConstraints gbc_lblCambioDeContrasea = new GridBagConstraints();
		gbc_lblCambioDeContrasea.gridwidth = 13;
		gbc_lblCambioDeContrasea.insets = new Insets(0, 0, 5, 5);
		gbc_lblCambioDeContrasea.gridx = 1;
		gbc_lblCambioDeContrasea.gridy = 1;
		panel.add(lblCambioDeContrasea, gbc_lblCambioDeContrasea);
		
		JLabel lblContrasenaActual = new JLabel("Introduzca contraseña actual");
		lblContrasenaActual.setForeground(SystemColor.desktop);
		lblContrasenaActual.setFont(new Font("Verdana", Font.PLAIN, 16));
		GridBagConstraints gbc_lblContrasenaActual = new GridBagConstraints();
		gbc_lblContrasenaActual.anchor = GridBagConstraints.WEST;
		gbc_lblContrasenaActual.insets = new Insets(0, 0, 5, 5);
		gbc_lblContrasenaActual.gridx = 1;
		gbc_lblContrasenaActual.gridy = 3;
		panel.add(lblContrasenaActual, gbc_lblContrasenaActual);
		
		_contrasenaActual = new JPasswordField();
		_contrasenaActual.setFont(new Font("Verdana", Font.PLAIN, 16));
		GridBagConstraints gbc__contrasenaActual = new GridBagConstraints();
		gbc__contrasenaActual.insets = new Insets(0, 0, 5, 5);
		gbc__contrasenaActual.fill = GridBagConstraints.HORIZONTAL;
		gbc__contrasenaActual.gridx = 1;
		gbc__contrasenaActual.gridy = 4;
		panel.add(_contrasenaActual, gbc__contrasenaActual);
		
		JLabel lblIntroduzcaNuevaContrasea = new JLabel("Introduzca nueva contraseña");
		lblIntroduzcaNuevaContrasea.setForeground(Color.BLACK);
		lblIntroduzcaNuevaContrasea.setFont(new Font("Verdana", Font.PLAIN, 16));
		GridBagConstraints gbc_lblIntroduzcaNuevaContrasea = new GridBagConstraints();
		gbc_lblIntroduzcaNuevaContrasea.insets = new Insets(0, 0, 5, 5);
		gbc_lblIntroduzcaNuevaContrasea.gridx = 1;
		gbc_lblIntroduzcaNuevaContrasea.gridy = 6;
		panel.add(lblIntroduzcaNuevaContrasea, gbc_lblIntroduzcaNuevaContrasea);
		
		passwordField_NuevaContrasena = new JPasswordField();
		passwordField_NuevaContrasena.setFont(new Font("Verdana", Font.PLAIN, 16));
		GridBagConstraints gbc_passwordField_NuevaContrasena = new GridBagConstraints();
		gbc_passwordField_NuevaContrasena.insets = new Insets(0, 0, 5, 5);
		gbc_passwordField_NuevaContrasena.fill = GridBagConstraints.HORIZONTAL;
		gbc_passwordField_NuevaContrasena.gridx = 1;
		gbc_passwordField_NuevaContrasena.gridy = 7;
		panel.add(passwordField_NuevaContrasena, gbc_passwordField_NuevaContrasena);
		
		lblIncorrecto1 = new JLabel("");
		lblIncorrecto1.setIcon(new ImageIcon(V_PerfilContrasena.class.getResource("/presentacion/cancel.png")));
		GridBagConstraints gbc_lblIncorrecto1 = new GridBagConstraints();
		gbc_lblIncorrecto1.insets = new Insets(0, 0, 5, 5);
		gbc_lblIncorrecto1.gridx = 2;
		gbc_lblIncorrecto1.gridy = 7;
		panel.add(lblIncorrecto1, gbc_lblIncorrecto1);
		
		JLabel lblRepitaLaNueva = new JLabel("Repita la nueva contraseña");
		lblRepitaLaNueva.setForeground(Color.BLACK);
		lblRepitaLaNueva.setFont(new Font("Verdana", Font.PLAIN, 16));
		GridBagConstraints gbc_lblRepitaLaNueva = new GridBagConstraints();
		gbc_lblRepitaLaNueva.insets = new Insets(0, 0, 5, 5);
		gbc_lblRepitaLaNueva.gridx = 1;
		gbc_lblRepitaLaNueva.gridy = 9;
		panel.add(lblRepitaLaNueva, gbc_lblRepitaLaNueva);
		
		passwordField_RepitaContra = new JPasswordField();
		passwordField_RepitaContra.setFont(new Font("Verdana", Font.PLAIN, 16));
		GridBagConstraints gbc_passwordField_RepitaContra = new GridBagConstraints();
		gbc_passwordField_RepitaContra.insets = new Insets(0, 0, 5, 5);
		gbc_passwordField_RepitaContra.fill = GridBagConstraints.HORIZONTAL;
		gbc_passwordField_RepitaContra.gridx = 1;
		gbc_passwordField_RepitaContra.gridy = 10;
		panel.add(passwordField_RepitaContra, gbc_passwordField_RepitaContra);
		 
		 lblIncorrecto2 = new JLabel("");
		 lblIncorrecto2.setIcon(new ImageIcon(V_PerfilContrasena.class.getResource("/presentacion/cancel.png")));
		 GridBagConstraints gbc_lblIncorrecto2 = new GridBagConstraints();
		 gbc_lblIncorrecto2.insets = new Insets(0, 0, 5, 5);
		 gbc_lblIncorrecto2.gridx = 2;
		 gbc_lblIncorrecto2.gridy = 10;
		 panel.add(lblIncorrecto2, gbc_lblIncorrecto2);
		
		lblEstado = new JLabel("");
		lblEstado.setForeground(new Color(153, 0, 0));
		lblEstado.setFont(new Font("Verdana", Font.PLAIN, 16));
		GridBagConstraints gbc_lblEstado = new GridBagConstraints();
		gbc_lblEstado.anchor = GridBagConstraints.WEST;
		gbc_lblEstado.insets = new Insets(0, 0, 5, 5);
		gbc_lblEstado.gridx = 1;
		gbc_lblEstado.gridy = 11;
		panel.add(lblEstado, gbc_lblEstado);
		
		JButton btnCambiarContrasea = new JButton("Aceptar");
		btnCambiarContrasea.setIcon(new ImageIcon(V_PerfilContrasena.class.getResource("/presentacion/vintage-key-outline.png")));
		btnCambiarContrasea.addActionListener(new BtnCambiarContraseaActionListener());
		
		btnBorrarLogin = new JButton("Borrar");
		btnBorrarLogin.addActionListener(new BtnBorrarLoginActionListener());
		btnBorrarLogin.setIcon(new ImageIcon(V_PerfilContrasena.class.getResource("/presentacion/IconoBorrar.png")));
		btnBorrarLogin.setToolTipText("Borrar datos");
		btnBorrarLogin.setForeground(Color.BLACK);
		btnBorrarLogin.setFont(new Font("Verdana", Font.BOLD, 16));
		btnBorrarLogin.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnBorrarLogin.setBackground(new Color(255, 102, 51));
		GridBagConstraints gbc_btnBorrarLogin = new GridBagConstraints();
		gbc_btnBorrarLogin.fill = GridBagConstraints.VERTICAL;
		gbc_btnBorrarLogin.anchor = GridBagConstraints.EAST;
		gbc_btnBorrarLogin.insets = new Insets(0, 0, 0, 5);
		gbc_btnBorrarLogin.gridx = 1;
		gbc_btnBorrarLogin.gridy = 12;
		panel.add(btnBorrarLogin, gbc_btnBorrarLogin);
		btnCambiarContrasea.setForeground(Color.WHITE);
		btnCambiarContrasea.setFont(new Font("Verdana", Font.BOLD, 16));
		btnCambiarContrasea.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnCambiarContrasea.setBackground(new Color(153, 0, 0));
		GridBagConstraints gbc_btnCambiarContrasea = new GridBagConstraints();
		gbc_btnCambiarContrasea.gridwidth = 2;
		gbc_btnCambiarContrasea.fill = GridBagConstraints.VERTICAL;
		gbc_btnCambiarContrasea.anchor = GridBagConstraints.EAST;
		gbc_btnCambiarContrasea.insets = new Insets(0, 0, 0, 5);
		gbc_btnCambiarContrasea.gridx = 4;
		gbc_btnCambiarContrasea.gridy = 12;
		panel.add(btnCambiarContrasea, gbc_btnCambiarContrasea);
		
		lblIncorrecto1.setVisible(false);
		lblIncorrecto2.setVisible(false);
		passwordField_RepitaContra.addFocusListener(new passwordField_RepitaContraFocusListener());
		passwordField_NuevaContrasena.addFocusListener(new passwordField_NuevaContrasenaFocusListener());
		_contrasenaActual.addFocusListener(new _contrasenaActualFocusListener());
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
	private class BtnCambiarContraseaActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if(passwordField_RepitaContra!=passwordField_NuevaContrasena) {
				lblIncorrecto1.setVisible(true);
				lblIncorrecto2.setVisible(true);
				
				lblEstado.setText("Las contraseñas no coinciden");
			}
		}
	}
	private class BtnBorrarLoginActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			passwordField_RepitaContra.setText(null);
			passwordField_NuevaContrasena.setText(null);
			lblIncorrecto1.setVisible(false);
			lblIncorrecto2.setVisible(false);
			lblEstado.setText("");
		}
	}
	@SuppressWarnings("unused")
	private class passwordField_RepitaContraFocusListener extends FocusAdapter {
		@Override
		public void focusGained(FocusEvent e) {
			passwordField_RepitaContra.setBackground(colorResaltado);
		}

		@Override
		public void focusLost(FocusEvent e) {
			passwordField_RepitaContra.setBackground(colorBlanco);
		}
	}
	private class _contrasenaActualFocusListener extends FocusAdapter {
		@Override
		public void focusGained(FocusEvent e) {
			_contrasenaActual.setBackground(colorResaltado);
		}

		@Override
		public void focusLost(FocusEvent e) {
			_contrasenaActual.setBackground(colorBlanco);
		}
	}

	private class passwordField_NuevaContrasenaFocusListener extends FocusAdapter {
		@Override
		public void focusGained(FocusEvent e) {
			passwordField_NuevaContrasena.setBackground(colorResaltado);
		}

		@Override
		public void focusLost(FocusEvent e) {
			passwordField_NuevaContrasena.setBackground(colorBlanco);
		}
	}
}