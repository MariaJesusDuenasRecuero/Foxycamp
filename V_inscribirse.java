package presentacion;

import java.awt.Rectangle;

import javax.swing.JPanel;
import javax.swing.JLabel;
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

import presentacion.P_Registro.TxtDNIFocusListener;

//import presentacion.P_Registro.TxtDNIFocusListener;

import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.SystemColor;
import java.awt.TextArea;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.text.ParseException;

import javax.swing.ImageIcon;

public class V_inscribirse extends JPanel {
	private Color colorResaltado = new Color (255,255,210);
	private Color colorBlanco = new Color (255,255,255);
	private JTextField textNombre;
	private JTextField textApellidos;
	private JTextField textEmail;
	private TextArea textAreaInfoAdic;

	/**
	 * Create the panel.
	 */
	public V_inscribirse() {
		setBorder(new TitledBorder(null, "Inscripci\u00F3n a actividades", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		setBounds(new Rectangle(10, 50, 1001, 530));
		setLayout(null);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("18:00 a 20:00");
		lblNewLabel_1_1_1.setFont(new Font("Verdana", Font.PLAIN, 16));
		lblNewLabel_1_1_1.setBounds(392, 429, 121, 14);
		add(lblNewLabel_1_1_1);
		
		JLabel lblDatosPersonales = new JLabel("Datos personales");
		lblDatosPersonales.setHorizontalAlignment(SwingConstants.CENTER);
		lblDatosPersonales.setForeground(new Color(255, 165, 0));
		lblDatosPersonales.setFont(new Font("Verdana", Font.BOLD, 30));
		lblDatosPersonales.setBounds(594, 51, 341, 32);
		add(lblDatosPersonales);
		
		JSeparator separator = new JSeparator();
		separator.setOrientation(SwingConstants.VERTICAL);
		separator.setBounds(548, 51, 16, 425);
		add(separator);
		
		JLabel lblActividades = new JLabel("Actividades y precios");
		lblActividades.setHorizontalAlignment(SwingConstants.CENTER);
		lblActividades.setForeground(new Color(255, 165, 0));
		lblActividades.setFont(new Font("Verdana", Font.BOLD, 30));
		lblActividades.setBounds(105, 51, 358, 32);
		add(lblActividades);
		
		JRadioButton rdbtnNatacion = new JRadioButton("Natación");
		rdbtnNatacion.setFont(new Font("Verdana", Font.PLAIN, 16));
		rdbtnNatacion.setBounds(132, 122, 109, 23);
		add(rdbtnNatacion);
		
		JRadioButton rdbtnTiroConArco = new JRadioButton("Tiro con arco");
		rdbtnTiroConArco.setFont(new Font("Verdana", Font.PLAIN, 16));
		rdbtnTiroConArco.setBounds(132, 210, 131, 23);
		add(rdbtnTiroConArco);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("Kayak");
		rdbtnNewRadioButton_2.setFont(new Font("Verdana", Font.PLAIN, 16));
		rdbtnNewRadioButton_2.setBounds(132, 282, 109, 23);
		add(rdbtnNewRadioButton_2);
		
		JRadioButton rdbtnCiclismo = new JRadioButton("Ciclismo");
		rdbtnCiclismo.setFont(new Font("Verdana", Font.PLAIN, 16));
		rdbtnCiclismo.setBounds(395, 122, 109, 23);
		add(rdbtnCiclismo);
		
		JRadioButton rdbtnFutbol = new JRadioButton("Fútbol");
		rdbtnFutbol.setFont(new Font("Verdana", Font.PLAIN, 16));
		rdbtnFutbol.setBounds(395, 206, 109, 23);
		add(rdbtnFutbol);
		
		JRadioButton rdbtnYoga = new JRadioButton("Yoga");
		rdbtnYoga.setFont(new Font("Verdana", Font.PLAIN, 16));
		rdbtnYoga.setBounds(395, 282, 109, 23);
		add(rdbtnYoga);
		
		JRadioButton rdbtnNewRadioButton_6 = new JRadioButton("Lunes ");
		rdbtnNewRadioButton_6.setHorizontalAlignment(SwingConstants.LEFT);
		rdbtnNewRadioButton_6.setFont(new Font("Verdana", Font.PLAIN, 16));
		rdbtnNewRadioButton_6.setBounds(55, 399, 145, 23);
		add(rdbtnNewRadioButton_6);
		
		JRadioButton rdbtnNewRadioButton_7 = new JRadioButton("Martes");
		rdbtnNewRadioButton_7.setHorizontalAlignment(SwingConstants.LEFT);
		rdbtnNewRadioButton_7.setFont(new Font("Verdana", Font.PLAIN, 16));
		rdbtnNewRadioButton_7.setBounds(229, 399, 101, 23);
		add(rdbtnNewRadioButton_7);
		
		JRadioButton rdbtnNewRadioButton_8 = new JRadioButton("Jueves");
		rdbtnNewRadioButton_8.setFont(new Font("Verdana", Font.PLAIN, 16));
		rdbtnNewRadioButton_8.setBounds(382, 399, 122, 23);
		add(rdbtnNewRadioButton_8);
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.setFont(new Font("Verdana", Font.PLAIN, 16));
		btnAceptar.setBackground(new Color(255, 165, 0));
		btnAceptar.setBounds(827, 473, 121, 23);
		add(btnAceptar);
		
		JLabel lblNatacion = new JLabel("");
		lblNatacion.setIcon(new ImageIcon(V_inscribirse.class.getResource("/presentacion/natacionx64.png")));
		lblNatacion.setHorizontalAlignment(SwingConstants.CENTER);
		lblNatacion.setBounds(55, 103, 71, 79);
		add(lblNatacion);
		
		JLabel lblTiroConArco = new JLabel("");
		lblTiroConArco.setIcon(new ImageIcon(V_inscribirse.class.getResource("/presentacion/TiroConArcox64.png")));
		lblTiroConArco.setHorizontalAlignment(SwingConstants.CENTER);
		lblTiroConArco.setBounds(49, 180, 77, 79);
		add(lblTiroConArco);
		
		JLabel lblkayak = new JLabel("");
		lblkayak.setIcon(new ImageIcon(V_inscribirse.class.getResource("/presentacion/kayakx64.png")));
		lblkayak.setHorizontalAlignment(SwingConstants.CENTER);
		lblkayak.setBounds(55, 256, 71, 73);
		add(lblkayak);
		
		JLabel lblCiclismo = new JLabel("");
		lblCiclismo.setIcon(new ImageIcon(V_inscribirse.class.getResource("/presentacion/IconCiclismo.png")));
		lblCiclismo.setHorizontalAlignment(SwingConstants.CENTER);
		lblCiclismo.setBounds(318, 103, 71, 73);
		add(lblCiclismo);
		
		JLabel lblFutbol = new JLabel("");
		lblFutbol.setIcon(new ImageIcon(V_inscribirse.class.getResource("/presentacion/IconFutbol.png")));
		lblFutbol.setHorizontalAlignment(SwingConstants.CENTER);
		lblFutbol.setBounds(312, 184, 77, 73);
		add(lblFutbol);
		
		JLabel lblYoga = new JLabel("");
		lblYoga.setIcon(new ImageIcon(V_inscribirse.class.getResource("/presentacion/IconYoga.png")));
		lblYoga.setHorizontalAlignment(SwingConstants.CENTER);
		lblYoga.setBounds(308, 256, 81, 79);
		add(lblYoga);
		
		JLabel lblHorarioYPrecio = new JLabel("Horarios ");
		lblHorarioYPrecio.setForeground(new Color(255, 165, 0));
		lblHorarioYPrecio.setFont(new Font("Verdana", Font.BOLD, 30));
		lblHorarioYPrecio.setHorizontalAlignment(SwingConstants.CENTER);
		lblHorarioYPrecio.setBounds(144, 334, 264, 48);
		add(lblHorarioYPrecio);
		
		JLabel lblNewLabel_1 = new JLabel("12:00 a 14:00");
		lblNewLabel_1.setFont(new Font("Verdana", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(65, 429, 121, 14);
		add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("16:00 a 18:00");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setFont(new Font("Verdana", Font.PLAIN, 16));
		lblNewLabel_1_1.setBounds(239, 429, 121, 14);
		add(lblNewLabel_1_1);
		
		JLabel lblPrecioNatacion = new JLabel("15€");
		lblPrecioNatacion.setFont(new Font("Verdana", Font.PLAIN, 15));
		lblPrecioNatacion.setBounds(154, 146, 46, 14);
		add(lblPrecioNatacion);
		
		JLabel lblPrecioTiro = new JLabel("35€");
		lblPrecioTiro.setFont(new Font("Verdana", Font.PLAIN, 15));
		lblPrecioTiro.setBounds(154, 237, 46, 14);
		add(lblPrecioTiro);
		
		JLabel lblPrecioKayak = new JLabel("50€");
		lblPrecioKayak.setFont(new Font("Verdana", Font.PLAIN, 15));
		lblPrecioKayak.setBounds(154, 304, 46, 14);
		add(lblPrecioKayak);
		
		JLabel lblPrecioCiclismo = new JLabel("29€");
		lblPrecioCiclismo.setFont(new Font("Verdana", Font.PLAIN, 15));
		lblPrecioCiclismo.setBounds(417, 146, 46, 14);
		add(lblPrecioCiclismo);
		
		JLabel lblPrecioFutbol = new JLabel("25€");
		lblPrecioFutbol.setFont(new Font("Verdana", Font.PLAIN, 15));
		lblPrecioFutbol.setBounds(417, 231, 46, 14);
		add(lblPrecioFutbol);
		
		JLabel lblPrecioYoga = new JLabel("15€");
		lblPrecioYoga.setFont(new Font("Verdana", Font.PLAIN, 15));
		lblPrecioYoga.setBounds(417, 304, 46, 14);
		add(lblPrecioYoga);
		
		JLabel lblNombre = new JLabel("Nombre*");
		lblNombre.setToolTipText("Campo obligatorio");
		lblNombre.setFont(new Font("Verdana", Font.BOLD, 16));
		lblNombre.setBounds(633, 122, 81, 21);
		add(lblNombre);
		
		textNombre = new JTextField();
		textNombre.setColumns(10);
		textNombre.setBounds(719, 123, 170, 20);
		add(textNombre);
		
		JLabel lblApellidos = new JLabel("Apellidos");
		lblApellidos.setFont(new Font("Verdana", Font.BOLD, 16));
		lblApellidos.setBounds(637, 157, 77, 21);
		add(lblApellidos);
		
		textApellidos = new JTextField();
		textApellidos.setColumns(10);
		textApellidos.setBounds(719, 158, 170, 20);
		add(textApellidos);
		
		JLabel lblDNI = new JLabel("DNI*");
		lblDNI.setToolTipText("Campo obligatorio");
		lblDNI.setFont(new Font("Verdana", Font.BOLD, 16));
		lblDNI.setBounds(669, 192, 45, 21);
		add(lblDNI);
		

		
		JFormattedTextField txtDNI = new JFormattedTextField((AbstractFormatter) null);
		txtDNI.setFont(new Font("Verdana", Font.PLAIN, 14));
		txtDNI.setForeground(new Color(169, 169, 169));
		txtDNI.setHorizontalAlignment(SwingConstants.CENTER);
		txtDNI.setText("XXXXXXXX-U");
		txtDNI.setColumns(10);
		txtDNI.setBounds(719, 193, 140, 20);
		add(txtDNI);
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
		
		JLabel lblEmail = new JLabel("Email*");
		lblEmail.setToolTipText("Campo obligatorio");
		lblEmail.setFont(new Font("Verdana", Font.BOLD, 16));
		lblEmail.setBounds(657, 227, 57, 21);
		add(lblEmail);
		
		textEmail = new JTextField();
		textEmail.setFont(new Font("Verdana", Font.BOLD, 11));
		textEmail.setColumns(10);
		textEmail.setBounds(719, 227, 200, 21);
		add(textEmail);
		
		JLabel lblTelefono_1 = new JLabel("Telefono ");
		lblTelefono_1.setFont(new Font("Verdana", Font.BOLD, 16));
		lblTelefono_1.setBounds(633, 266, 89, 21);
		add(lblTelefono_1);
		
		JFormattedTextField textTelefono = new JFormattedTextField((AbstractFormatter) null);
		textTelefono.setFont(new Font("Verdana", Font.PLAIN, 12));
		textTelefono.setHorizontalAlignment(SwingConstants.CENTER);
		textTelefono.setForeground(new Color(169, 169, 169));
		textTelefono.setText("(---) ###  ### ###");
		textTelefono.setColumns(10);
		textTelefono.setBounds(719, 264, 140, 20);
		add(textTelefono);
		MaskFormatter formatoTlfno;
		try {
			formatoTlfno= new MaskFormatter("'(###')' ###' ###' ###");
			formatoTlfno.setPlaceholderCharacter('*');
			textTelefono= new JFormattedTextField(formatoTlfno);
		}catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		JTextArea textAreaInfoAdic = new JTextArea();
		textAreaInfoAdic.setFont(new Font("Verdana", Font.PLAIN, 16));
		textAreaInfoAdic.setBorder(new TitledBorder(null, "Informaci\u00F3n adicional", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		textAreaInfoAdic.setLineWrap(true);
		textAreaInfoAdic.setBounds(594, 314, 355, 128);
		add(textAreaInfoAdic);
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
