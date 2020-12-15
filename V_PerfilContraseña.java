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

public class V_PerfilContraseña extends JPanel {
	private JPasswordField _contrasenaActual;
	private JPasswordField passwordField_NuevaContrasena;
	private JPasswordField passwordField_RepitaContra;

	/**
	 * Create the panel.
	 */
	public V_PerfilContraseña() {
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
		
		JLabel lblContraseñaActual = new JLabel("Introduzca contraseña actual");
		lblContraseñaActual.setForeground(SystemColor.desktop);
		lblContraseñaActual.setFont(new Font("Verdana", Font.PLAIN, 16));
		GridBagConstraints gbc_lblContraseñaActual = new GridBagConstraints();
		gbc_lblContraseñaActual.anchor = GridBagConstraints.WEST;
		gbc_lblContraseñaActual.insets = new Insets(0, 0, 5, 5);
		gbc_lblContraseñaActual.gridx = 1;
		gbc_lblContraseñaActual.gridy = 3;
		panel.add(lblContraseñaActual, gbc_lblContraseñaActual);
		
		_contrasenaActual = new JPasswordField();
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
		GridBagConstraints gbc_passwordField_NuevaContrasena = new GridBagConstraints();
		gbc_passwordField_NuevaContrasena.insets = new Insets(0, 0, 5, 5);
		gbc_passwordField_NuevaContrasena.fill = GridBagConstraints.HORIZONTAL;
		gbc_passwordField_NuevaContrasena.gridx = 1;
		gbc_passwordField_NuevaContrasena.gridy = 7;
		panel.add(passwordField_NuevaContrasena, gbc_passwordField_NuevaContrasena);
		
		JLabel lblRepitaLaNueva = new JLabel("Repita la nueva contraseña");
		lblRepitaLaNueva.setForeground(Color.BLACK);
		lblRepitaLaNueva.setFont(new Font("Verdana", Font.PLAIN, 16));
		GridBagConstraints gbc_lblRepitaLaNueva = new GridBagConstraints();
		gbc_lblRepitaLaNueva.insets = new Insets(0, 0, 5, 5);
		gbc_lblRepitaLaNueva.gridx = 1;
		gbc_lblRepitaLaNueva.gridy = 9;
		panel.add(lblRepitaLaNueva, gbc_lblRepitaLaNueva);
		
		passwordField_RepitaContra = new JPasswordField();
		GridBagConstraints gbc_passwordField_RepitaContra = new GridBagConstraints();
		gbc_passwordField_RepitaContra.insets = new Insets(0, 0, 5, 5);
		gbc_passwordField_RepitaContra.fill = GridBagConstraints.HORIZONTAL;
		gbc_passwordField_RepitaContra.gridx = 1;
		gbc_passwordField_RepitaContra.gridy = 10;
		panel.add(passwordField_RepitaContra, gbc_passwordField_RepitaContra);
		
		JButton btnCambiarContrasea = new JButton("Cambiar contraseña");
		btnCambiarContrasea.setForeground(Color.WHITE);
		btnCambiarContrasea.setFont(new Font("Verdana", Font.BOLD, 16));
		btnCambiarContrasea.setBorder(new RoundedBorder(12));
		btnCambiarContrasea.setBackground(new Color(153, 0, 0));
		GridBagConstraints gbc_btnCambiarContrasea = new GridBagConstraints();
		gbc_btnCambiarContrasea.anchor = GridBagConstraints.EAST;
		gbc_btnCambiarContrasea.insets = new Insets(0, 0, 0, 5);
		gbc_btnCambiarContrasea.gridx = 1;
		gbc_btnCambiarContrasea.gridy = 12;
		panel.add(btnCambiarContrasea, gbc_btnCambiarContrasea);
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
}