package presentacion;

import java.awt.Rectangle;  

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.Color;
import java.awt.Component;

import javax.swing.JTextField;
import javax.swing.JFormattedTextField;
import javax.swing.JFormattedTextField.AbstractFormatter;
import javax.swing.SwingConstants;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;
import javax.swing.text.MaskFormatter;

import presentacion.V_Ruta.RoundedBorder;

import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.TextArea;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.text.ParseException;

import javax.swing.border.EtchedBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class V_RutaInscribirse extends JPanel {
	private Color colorResaltado = new Color (255,255,210);
	private Color colorBlanco = new Color (255,255,255);
	private JTextField textNombre;
	private JTextField textApellidos;
	private JTextField textEmail;
	private JTextArea textAreaInfoAdic;
	private JTextField txtDNI;
	private JTextField textTelefono;
	private JButton btnAceptar;
	/**
	 * Create the panel.
	 */
	public V_RutaInscribirse() {
		setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Inscripci\u00F3n a ruta", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		setBounds(new Rectangle(10, 50, 1001, 530));
		setLayout(null);

		JLabel lblDatosPersonales = new JLabel("Datos personales");
		lblDatosPersonales.setHorizontalAlignment(SwingConstants.CENTER);
		lblDatosPersonales.setForeground(new Color(255, 165, 0));
		lblDatosPersonales.setFont(new Font("Verdana", Font.BOLD, 30));
		lblDatosPersonales.setBounds(40, 47, 312, 32);
		add(lblDatosPersonales);

		btnAceptar = new JButton("Aceptar");
		btnAceptar.setForeground(Color.BLACK);
		btnAceptar.setEnabled(false);
		btnAceptar.setToolTipText("Pulsa para aceptar la inscripción");
		btnAceptar.addActionListener(new BtnAceptarActionListener());
		btnAceptar.setBorder(new RoundedBorder(6));
		btnAceptar.setFont(new Font("Verdana", Font.PLAIN, 16));
		btnAceptar.setBackground(new Color(244, 164, 96));
		btnAceptar.setBounds(827, 473, 121, 23);
		add(btnAceptar);

		JLabel lblNombre = new JLabel("Nombre*");
		lblNombre.setToolTipText("Campo obligatorio");
		lblNombre.setFont(new Font("Verdana", Font.BOLD, 16));
		lblNombre.setBounds(55, 120, 81, 21);
		add(lblNombre);

		textNombre = new JTextField();
		textNombre.setToolTipText("Pulsa enter cuando el nombre este escrito");
		textNombre.setColumns(10);
		textNombre.setBounds(152, 123, 170, 20);
		textNombre.addActionListener(new TextNombreActionListener());
		add(textNombre);

		JLabel lblApellidos = new JLabel("Apellidos");
		lblApellidos.setFont(new Font("Verdana", Font.BOLD, 16));
		lblApellidos.setBounds(55, 193, 77, 21);
		add(lblApellidos);

		textApellidos = new JTextField();
		textApellidos.setColumns(10);
		textApellidos.setBounds(152, 196, 170, 20);
		add(textApellidos);

		JLabel lblDNI = new JLabel("DNI*");
		lblDNI.setToolTipText("Campo obligatorio");
		lblDNI.setFont(new Font("Verdana", Font.BOLD, 16));
		lblDNI.setBounds(55, 262, 45, 21);
		add(lblDNI);

		MaskFormatter formatoDNI;
		try {
			formatoDNI= new MaskFormatter("########'-U");
			formatoDNI.setPlaceholderCharacter('X');
			txtDNI= new JFormattedTextField(formatoDNI);
			txtDNI.setToolTipText("Pulsa enter cuando se haya escrito");
			txtDNI.setEnabled(false);
			txtDNI.addActionListener(new TextDNIActionListener());
			txtDNI.addFocusListener(new TxtDNIFocusListener());
		}catch (ParseException e) {
			e.printStackTrace();
		}
		txtDNI.setFont(new Font("Verdana", Font.PLAIN, 14));
		txtDNI.setForeground(Color.BLACK);
		txtDNI.setHorizontalAlignment(SwingConstants.CENTER);
		txtDNI.setColumns(10);
		txtDNI.setBounds(152, 263, 140, 20);
		add(txtDNI);

		JLabel lblEmail = new JLabel("Email*");
		lblEmail.setToolTipText("Campo obligatorio");
		lblEmail.setFont(new Font("Verdana", Font.BOLD, 16));
		lblEmail.setBounds(55, 330, 57, 21);
		add(lblEmail);

		textEmail = new JTextField();
		textEmail.setToolTipText("Pulsa enter cuando se haya escrito");
		textEmail.setEnabled(false);
		textEmail.setFont(new Font("Verdana", Font.BOLD, 11));
		textEmail.setColumns(10);
		textEmail.setBounds(152, 332, 200, 21);
		textEmail.addActionListener(new TextEmailActionListener());
		add(textEmail);

		JLabel lblTelefono_1 = new JLabel("Telefono ");
		lblTelefono_1.setFont(new Font("Verdana", Font.BOLD, 16));
		lblTelefono_1.setBounds(55, 399, 89, 21);
		add(lblTelefono_1);

		
		MaskFormatter formatoTlfno;
		try {
			formatoTlfno= new MaskFormatter("'(###')' ###' ###' ###");
			formatoTlfno.setPlaceholderCharacter('*');
			textTelefono= new JFormattedTextField(formatoTlfno);
			textTelefono.setEnabled(false);
		}catch (ParseException e) {
			e.printStackTrace();
		}
		textTelefono.setFont(new Font("Verdana", Font.PLAIN, 12));
		textTelefono.setHorizontalAlignment(SwingConstants.CENTER);
		textTelefono.setForeground(new Color(169, 169, 169));
		textTelefono.setColumns(10);
		textTelefono.setBounds(152, 401, 140, 20);
		add(textTelefono);

		 textAreaInfoAdic = new JTextArea();
		textAreaInfoAdic.setFont(new Font("Verdana", Font.PLAIN, 16));
		textAreaInfoAdic.setBorder(new TitledBorder(null, "Informaci\u00F3n adicional", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		textAreaInfoAdic.setLineWrap(true);
		textAreaInfoAdic.setBounds(485, 258, 463, 163);
		add(textAreaInfoAdic);
		
		JLabel lblImporteTotal = new JLabel("Importe total:");
		lblImporteTotal.setToolTipText("Campo obligatorio");
		lblImporteTotal.setFont(new Font("Verdana", Font.BOLD, 16));
		lblImporteTotal.setBounds(485, 120, 177, 21);
		add(lblImporteTotal);
		
		JLabel lblCoste = new JLabel("20 € por persona");
		lblCoste.setToolTipText("Campo obligatorio");
		lblCoste.setFont(new Font("Verdana", Font.BOLD, 16));
		lblCoste.setBounds(631, 120, 177, 21);
		add(lblCoste);
	}

	private class BtnAceptarActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			 JOptionPane.showMessageDialog(null, "Operación realizada");
		}
	}
	private class textAreaInfoAdicFocusListener extends FocusAdapter {
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
	private class TextNombreActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			txtDNI.setEnabled(true);
			txtDNI.requestFocus();
		}
	}
	
	private class TextDNIActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			textEmail.setEnabled(true);
			textEmail.requestFocus();
		}
	}
	
	private class TextEmailActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			textTelefono.setEnabled(true);
			textTelefono.requestFocus();
			
			btnAceptar.setEnabled(true);
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
}