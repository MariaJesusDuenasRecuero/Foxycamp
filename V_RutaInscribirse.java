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
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import javax.swing.JRadioButton;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;
import javax.swing.text.MaskFormatter;

import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.SystemColor;
import java.awt.TextArea;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.text.ParseException;

import javax.swing.ImageIcon;
import javax.swing.border.EtchedBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class V_RutaInscribirse extends JPanel {
	private Color colorResaltado = new Color (255,255,210);
	private Color colorBlanco = new Color (255,255,255);
	private JTextField textNombre;
	private JTextField textApellidos;
	private JTextField textEmail;
	private TextArea textAreaInfoAdic;
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

		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(new BtnAceptarActionListener());
			
		btnAceptar.setFont(new Font("Verdana", Font.PLAIN, 16));
		btnAceptar.setBackground(new Color(255, 165, 0));
		btnAceptar.setBounds(827, 473, 121, 23);
		add(btnAceptar);

		JLabel lblNombre = new JLabel("Nombre*");
		lblNombre.setToolTipText("Campo obligatorio");
		lblNombre.setFont(new Font("Verdana", Font.BOLD, 16));
		lblNombre.setBounds(55, 120, 81, 21);
		add(lblNombre);

		textNombre = new JTextField();
		textNombre.setColumns(10);
		textNombre.setBounds(152, 123, 170, 20);
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



		JFormattedTextField txtDNI = new JFormattedTextField((AbstractFormatter) null);
		txtDNI.setFont(new Font("Verdana", Font.PLAIN, 14));
		txtDNI.setForeground(new Color(169, 169, 169));
		txtDNI.setHorizontalAlignment(SwingConstants.CENTER);
		txtDNI.setText("XXXXXXXX-U");
		txtDNI.setColumns(10);
		txtDNI.setBounds(152, 263, 140, 20);
		add(txtDNI);
		MaskFormatter formatoDNI;
		try {
			formatoDNI= new MaskFormatter("########'-U");
			formatoDNI.setPlaceholderCharacter('X');
			txtDNI= new JFormattedTextField(formatoDNI);
			txtDNI.addFocusListener(new TxtDNIFocusListener());
		} catch (ParseException e) {
			e.printStackTrace();
		}

		JLabel lblEmail = new JLabel("Email*");
		lblEmail.setToolTipText("Campo obligatorio");
		lblEmail.setFont(new Font("Verdana", Font.BOLD, 16));
		lblEmail.setBounds(55, 330, 57, 21);
		add(lblEmail);

		textEmail = new JTextField();
		textEmail.setFont(new Font("Verdana", Font.BOLD, 11));
		textEmail.setColumns(10);
		textEmail.setBounds(152, 332, 200, 21);
		add(textEmail);

		JLabel lblTelefono_1 = new JLabel("Telefono ");
		lblTelefono_1.setFont(new Font("Verdana", Font.BOLD, 16));
		lblTelefono_1.setBounds(55, 399, 89, 21);
		add(lblTelefono_1);

		JFormattedTextField textTelefono = new JFormattedTextField((AbstractFormatter) null);
		textTelefono.setFont(new Font("Verdana", Font.PLAIN, 12));
		textTelefono.setHorizontalAlignment(SwingConstants.CENTER);
		textTelefono.setForeground(new Color(169, 169, 169));
		textTelefono.setText("(---) ###  ### ###");
		textTelefono.setColumns(10);
		textTelefono.setBounds(152, 401, 140, 20);
		add(textTelefono);
		MaskFormatter formatoTlfno;
		try {
			formatoTlfno= new MaskFormatter("'(###')' ###' ###' ###");
			formatoTlfno.setPlaceholderCharacter('*');
			textTelefono= new JFormattedTextField(formatoTlfno);
		}catch (ParseException e) {
			e.printStackTrace();
		}

		JTextArea textAreaInfoAdic = new JTextArea();
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