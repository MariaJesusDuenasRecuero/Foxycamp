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
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import javax.swing.JRadioButton;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;
import javax.swing.text.MaskFormatter;

import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.text.ParseException;

import javax.swing.ImageIcon;
import javax.swing.border.BevelBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ButtonGroup;

public class V_inscribirse extends JPanel {
	private Color colorResaltado = new Color (255,255,210);
	private Color colorBlanco = new Color (255,255,255);
	private JTextField textNombre;
	private JTextField textApellidos;
	private JTextField textEmail;
	private JTextArea textAreaInfoAdic;
	private JTextField textTrajcred1;
	private JTextField textTarjcred2;
	private JTextField txtFormatedDNI;
	private JFormattedTextField textTelefono;
	private JRadioButton rdbtnCiclismo;
	private JRadioButton rdbtnNatacion;
	private JLabel lblEstadoAct;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private final ButtonGroup buttonGroup_1 = new ButtonGroup();
	

	/**
	 * Create the panel.
	 */
	public V_inscribirse() {
		setBorder(new TitledBorder(null, MessagesV_Inscribirse.getString("V_inscribirse.this.borderTitle"), TitledBorder.LEADING, TitledBorder.TOP, null, null)); //$NON-NLS-1$
		setBounds(new Rectangle(10, 50, 1001, 530));
		setLayout(null);
		
		JLabel lblNewLabel_1_1_1 = new JLabel(MessagesV_Inscribirse.getString("V_inscribirse.lblNewLabel_1_1_1.text")); //$NON-NLS-1$
		lblNewLabel_1_1_1.setFont(new Font("Verdana", Font.PLAIN, 16)); //$NON-NLS-1$
		lblNewLabel_1_1_1.setBounds(382, 419, 121, 14);
		add(lblNewLabel_1_1_1);
		
		JLabel lblDatosPersonales = new JLabel(MessagesV_Inscribirse.getString("V_inscribirse.lblDatosPersonales.text")); //$NON-NLS-1$
		lblDatosPersonales.setHorizontalAlignment(SwingConstants.CENTER);
		lblDatosPersonales.setForeground(new Color(255, 165, 0));
		lblDatosPersonales.setFont(new Font("Verdana", Font.BOLD, 30)); //$NON-NLS-1$
		lblDatosPersonales.setBounds(594, 51, 341, 32);
		add(lblDatosPersonales);
		
		JSeparator separator = new JSeparator();
		separator.setOrientation(SwingConstants.VERTICAL);
		separator.setBounds(548, 51, 16, 425);
		add(separator);
		
		JLabel lblActividades = new JLabel(MessagesV_Inscribirse.getString("V_inscribirse.lblActividades.text")); //$NON-NLS-1$
		lblActividades.setHorizontalAlignment(SwingConstants.CENTER);
		lblActividades.setForeground(new Color(255, 165, 0));
		lblActividades.setFont(new Font("Verdana", Font.BOLD, 30)); //$NON-NLS-1$
		lblActividades.setBounds(105, 51, 358, 32);
		add(lblActividades);
		
		rdbtnNatacion = new JRadioButton(MessagesV_Inscribirse.getString("V_inscribirse.rdbtnNatacion.text")); //$NON-NLS-1$
		buttonGroup.add(rdbtnNatacion);
		
		rdbtnNatacion.setSelected(false);
		rdbtnNatacion.setFont(new Font("Verdana", Font.PLAIN, 16)); //$NON-NLS-1$
		rdbtnNatacion.setBounds(132, 122, 109, 23);
		add(rdbtnNatacion);
		
		JRadioButton rdbtnTiroConArco = new JRadioButton(MessagesV_Inscribirse.getString("V_inscribirse.rdbtnTiroConArco.text")); //$NON-NLS-1$
		buttonGroup.add(rdbtnTiroConArco);
		
		rdbtnTiroConArco.setFont(new Font("Verdana", Font.PLAIN, 16)); //$NON-NLS-1$
		rdbtnTiroConArco.setBounds(132, 210, 131, 23);
		add(rdbtnTiroConArco);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton(MessagesV_Inscribirse.getString("V_inscribirse.rdbtnNewRadioButton_2.text")); //$NON-NLS-1$
		buttonGroup.add(rdbtnNewRadioButton_2);
		
		rdbtnNewRadioButton_2.setFont(new Font("Verdana", Font.PLAIN, 16)); //$NON-NLS-1$
		rdbtnNewRadioButton_2.setBounds(132, 282, 109, 23);
		add(rdbtnNewRadioButton_2);
		
		rdbtnCiclismo = new JRadioButton(MessagesV_Inscribirse.getString("V_inscribirse.rdbtnCiclismo.text")); //$NON-NLS-1$
		buttonGroup.add(rdbtnCiclismo);
		
		rdbtnCiclismo.setFont(new Font("Verdana", Font.PLAIN, 16)); //$NON-NLS-1$
		rdbtnCiclismo.setBounds(395, 122, 109, 23);
		add(rdbtnCiclismo);
		
		JRadioButton rdbtnFutbol = new JRadioButton(MessagesV_Inscribirse.getString("V_inscribirse.rdbtnFutbol.text")); //$NON-NLS-1$
		buttonGroup.add(rdbtnFutbol);
		
		rdbtnFutbol.setFont(new Font("Verdana", Font.PLAIN, 16)); //$NON-NLS-1$
		rdbtnFutbol.setBounds(395, 206, 109, 23);
		add(rdbtnFutbol);
		
		JRadioButton rdbtnYoga = new JRadioButton(MessagesV_Inscribirse.getString("V_inscribirse.rdbtnYoga.text")); //$NON-NLS-1$
		buttonGroup.add(rdbtnYoga);
	
		rdbtnYoga.setFont(new Font("Verdana", Font.PLAIN, 16)); //$NON-NLS-1$
		rdbtnYoga.setBounds(395, 282, 109, 23);
		add(rdbtnYoga);
		
		JRadioButton rdbtnNewRadioButton_6 = new JRadioButton(MessagesV_Inscribirse.getString("V_inscribirse.rdbtnNewRadioButton_6.text")); //$NON-NLS-1$
		buttonGroup_1.add(rdbtnNewRadioButton_6);
	
		rdbtnNewRadioButton_6.setHorizontalAlignment(SwingConstants.LEFT);
		rdbtnNewRadioButton_6.setFont(new Font("Verdana", Font.PLAIN, 16)); //$NON-NLS-1$
		rdbtnNewRadioButton_6.setBounds(55, 389, 145, 23);
		add(rdbtnNewRadioButton_6);
		
		JRadioButton rdbtnNewRadioButton_7 = new JRadioButton(MessagesV_Inscribirse.getString("V_inscribirse.rdbtnNewRadioButton_7.text")); //$NON-NLS-1$
		buttonGroup_1.add(rdbtnNewRadioButton_7);
	
		rdbtnNewRadioButton_7.setHorizontalAlignment(SwingConstants.LEFT);
		rdbtnNewRadioButton_7.setFont(new Font("Verdana", Font.PLAIN, 16)); //$NON-NLS-1$
		rdbtnNewRadioButton_7.setBounds(229, 389, 101, 23);
		add(rdbtnNewRadioButton_7);
		
		JRadioButton rdbtnNewRadioButton_8 = new JRadioButton(MessagesV_Inscribirse.getString("V_inscribirse.rdbtnNewRadioButton_8.text")); //$NON-NLS-1$
		buttonGroup_1.add(rdbtnNewRadioButton_8);
		
		rdbtnNewRadioButton_8.setFont(new Font("Verdana", Font.PLAIN, 16)); //$NON-NLS-1$
		rdbtnNewRadioButton_8.setBounds(382, 389, 122, 23);
		add(rdbtnNewRadioButton_8);
		
		JButton btnAceptar = new JButton(MessagesV_Inscribirse.getString("V_inscribirse.btnAceptar.text")); //$NON-NLS-1$
		btnAceptar.addActionListener(new BtnAceptarActionListener());
		btnAceptar.setFont(new Font("Verdana", Font.BOLD, 16)); //$NON-NLS-1$
		btnAceptar.setBackground(new Color(255, 165, 0));
		btnAceptar.setBorder(new RoundedBorder(10));
		btnAceptar.setBounds(835, 462, 121, 32);
		add(btnAceptar);
		
		JLabel lblNatacion = new JLabel(""); //$NON-NLS-1$
		lblNatacion.setIcon(new ImageIcon(V_inscribirse.class.getResource("/presentacion/natacionx64.png"))); //$NON-NLS-1$
		lblNatacion.setHorizontalAlignment(SwingConstants.CENTER);
		lblNatacion.setBounds(55, 103, 71, 79);
		add(lblNatacion);
		
		JLabel lblTiroConArco = new JLabel(""); //$NON-NLS-1$
		lblTiroConArco.setIcon(new ImageIcon(V_inscribirse.class.getResource("/presentacion/TiroConArcox64.png"))); //$NON-NLS-1$
		lblTiroConArco.setHorizontalAlignment(SwingConstants.CENTER);
		lblTiroConArco.setBounds(49, 180, 77, 79);
		add(lblTiroConArco);
		
		JLabel lblkayak = new JLabel(""); //$NON-NLS-1$
		lblkayak.setIcon(new ImageIcon(V_inscribirse.class.getResource("/presentacion/kayakx64.png"))); //$NON-NLS-1$
		lblkayak.setHorizontalAlignment(SwingConstants.CENTER);
		lblkayak.setBounds(55, 256, 71, 73);
		add(lblkayak);
		
		JLabel lblCiclismo = new JLabel(""); //$NON-NLS-1$
		lblCiclismo.setIcon(new ImageIcon(V_inscribirse.class.getResource("/presentacion/IconCiclismo.png"))); //$NON-NLS-1$
		lblCiclismo.setHorizontalAlignment(SwingConstants.CENTER);
		lblCiclismo.setBounds(318, 103, 71, 73);
		add(lblCiclismo);
		
		JLabel lblFutbol = new JLabel(""); //$NON-NLS-1$
		lblFutbol.setIcon(new ImageIcon(V_inscribirse.class.getResource("/presentacion/IconFutbol.png"))); //$NON-NLS-1$
		lblFutbol.setHorizontalAlignment(SwingConstants.CENTER);
		lblFutbol.setBounds(312, 184, 77, 73);
		add(lblFutbol);
		
		JLabel lblYoga = new JLabel(""); //$NON-NLS-1$
		lblYoga.setIcon(new ImageIcon(V_inscribirse.class.getResource("/presentacion/IconYoga.png"))); //$NON-NLS-1$
		lblYoga.setHorizontalAlignment(SwingConstants.CENTER);
		lblYoga.setBounds(308, 256, 81, 79);
		add(lblYoga);
		
		JLabel lblHorarioYPrecio = new JLabel(MessagesV_Inscribirse.getString("V_inscribirse.lblHorarioYPrecio.text")); //$NON-NLS-1$
		lblHorarioYPrecio.setForeground(new Color(255, 165, 0));
		lblHorarioYPrecio.setFont(new Font("Verdana", Font.BOLD, 30)); //$NON-NLS-1$
		lblHorarioYPrecio.setHorizontalAlignment(SwingConstants.CENTER);
		lblHorarioYPrecio.setBounds(143, 334, 264, 48);
		add(lblHorarioYPrecio);
		
		JLabel lblNewLabel_1 = new JLabel(MessagesV_Inscribirse.getString("V_inscribirse.lblNewLabel_1.text")); //$NON-NLS-1$
		lblNewLabel_1.setFont(new Font("Verdana", Font.PLAIN, 16)); //$NON-NLS-1$
		lblNewLabel_1.setBounds(55, 419, 121, 14);
		add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel(MessagesV_Inscribirse.getString("V_inscribirse.lblNewLabel_1_1.text")); //$NON-NLS-1$
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setFont(new Font("Verdana", Font.PLAIN, 16)); //$NON-NLS-1$
		lblNewLabel_1_1.setBounds(229, 419, 121, 14);
		add(lblNewLabel_1_1);
		
		JLabel lblPrecioNatacion = new JLabel(MessagesV_Inscribirse.getString("V_inscribirse.lblPrecioNatacion.text")); //$NON-NLS-1$
		lblPrecioNatacion.setFont(new Font("Verdana", Font.PLAIN, 15)); //$NON-NLS-1$
		lblPrecioNatacion.setBounds(154, 146, 46, 14);
		add(lblPrecioNatacion);
		
		JLabel lblPrecioTiro = new JLabel(MessagesV_Inscribirse.getString("V_inscribirse.lblPrecioTiro.text")); //$NON-NLS-1$
		lblPrecioTiro.setFont(new Font("Verdana", Font.PLAIN, 15)); //$NON-NLS-1$
		lblPrecioTiro.setBounds(154, 237, 46, 14);
		add(lblPrecioTiro);
		
		JLabel lblPrecioKayak = new JLabel(MessagesV_Inscribirse.getString("V_inscribirse.lblPrecioKayak.text")); //$NON-NLS-1$
		lblPrecioKayak.setFont(new Font("Verdana", Font.PLAIN, 15)); //$NON-NLS-1$
		lblPrecioKayak.setBounds(154, 304, 46, 14);
		add(lblPrecioKayak);
		
		JLabel lblPrecioCiclismo = new JLabel(MessagesV_Inscribirse.getString("V_inscribirse.lblPrecioCiclismo.text")); //$NON-NLS-1$
		lblPrecioCiclismo.setFont(new Font("Verdana", Font.PLAIN, 15)); //$NON-NLS-1$
		lblPrecioCiclismo.setBounds(417, 146, 46, 14);
		add(lblPrecioCiclismo);
		
		JLabel lblPrecioFutbol = new JLabel(MessagesV_Inscribirse.getString("V_inscribirse.lblPrecioFutbol.text")); //$NON-NLS-1$
		lblPrecioFutbol.setFont(new Font("Verdana", Font.PLAIN, 15)); //$NON-NLS-1$
		lblPrecioFutbol.setBounds(417, 231, 46, 14);
		add(lblPrecioFutbol);
		
		JLabel lblPrecioYoga = new JLabel(MessagesV_Inscribirse.getString("V_inscribirse.lblPrecioYoga.text")); //$NON-NLS-1$
		lblPrecioYoga.setFont(new Font("Verdana", Font.PLAIN, 15)); //$NON-NLS-1$
		lblPrecioYoga.setBounds(417, 304, 46, 14);
		add(lblPrecioYoga);
		
		JLabel lblNombre = new JLabel(MessagesV_Inscribirse.getString("V_inscribirse.lblNombre.text")); //$NON-NLS-1$
		lblNombre.setToolTipText(MessagesV_Inscribirse.getString("V_inscribirse.lblNombre.toolTipText")); //$NON-NLS-1$
		lblNombre.setFont(new Font("Verdana", Font.BOLD, 16)); //$NON-NLS-1$
		lblNombre.setBounds(655, 123, 81, 21);
		add(lblNombre);
		
		textNombre = new JTextField();
		textNombre.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		textNombre.setFont(new Font("Dialog", Font.PLAIN, 14)); //$NON-NLS-1$
		
		textNombre.setColumns(10);
		textNombre.setBounds(755, 122, 170, 20);
		add(textNombre);
		
		JLabel lblApellidos = new JLabel(MessagesV_Inscribirse.getString("V_inscribirse.lblApellidos.text")); //$NON-NLS-1$
		lblApellidos.setFont(new Font("Verdana", Font.BOLD, 16)); //$NON-NLS-1$
		lblApellidos.setBounds(652, 155, 90, 21);
		add(lblApellidos);
		
		textApellidos = new JTextField();
		textApellidos.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		textApellidos.setFont(new Font("Dialog", Font.PLAIN, 14)); //$NON-NLS-1$
		textApellidos.setColumns(10);
		textApellidos.setBounds(755, 157, 170, 20);
		add(textApellidos);
		
		JLabel lblDNI = new JLabel(MessagesV_Inscribirse.getString("V_inscribirse.lblDNI.text")); //$NON-NLS-1$
		lblDNI.setToolTipText(MessagesV_Inscribirse.getString("V_inscribirse.lblDNI.toolTipText")); //$NON-NLS-1$
		lblDNI.setFont(new Font("Verdana", Font.BOLD, 16)); //$NON-NLS-1$
		lblDNI.setBounds(691, 191, 45, 21);
		add(lblDNI);
		
		MaskFormatter formatoDNI;
		try {
			formatoDNI= new MaskFormatter("########'-U"); //$NON-NLS-1$
			formatoDNI.setPlaceholderCharacter('X');
			txtFormatedDNI= new JFormattedTextField(formatoDNI);
			txtFormatedDNI.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
			txtFormatedDNI.addFocusListener(new TxtDNIFocusListener());
		} catch (ParseException e) {

			e.printStackTrace();
		}
		txtFormatedDNI.setFont(new Font("Dialog", Font.PLAIN, 14)); //$NON-NLS-1$
		txtFormatedDNI.setForeground(new Color(169, 169, 169));
		txtFormatedDNI.setHorizontalAlignment(SwingConstants.CENTER);
		txtFormatedDNI.setColumns(10);
		txtFormatedDNI.setBounds(755, 192, 140, 20);
		add(txtFormatedDNI);
		
		JLabel lblEmail = new JLabel(MessagesV_Inscribirse.getString("V_inscribirse.lblEmail.text")); //$NON-NLS-1$
		lblEmail.setToolTipText(MessagesV_Inscribirse.getString("V_inscribirse.lblEmail.toolTipText")); //$NON-NLS-1$
		lblEmail.setFont(new Font("Verdana", Font.BOLD, 16)); //$NON-NLS-1$
		lblEmail.setBounds(679, 227, 57, 21);
		add(lblEmail);
		
		textEmail = new JTextField();
		textEmail.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		textEmail.setFont(new Font("Dialog", Font.PLAIN, 14)); //$NON-NLS-1$
		textEmail.setColumns(10);
		textEmail.setBounds(755, 226, 200, 21);
		add(textEmail);
		
		JLabel lblTelefono_1 = new JLabel(MessagesV_Inscribirse.getString("V_inscribirse.lblTelefono_1.text")); //$NON-NLS-1$
		lblTelefono_1.setFont(new Font("Verdana", Font.BOLD, 16)); //$NON-NLS-1$
		lblTelefono_1.setBounds(655, 261, 90, 21);
		add(lblTelefono_1);
		
		
		MaskFormatter formatoTlfno;
		try {
			formatoTlfno= new MaskFormatter("'(###')' ###' ###' ###'"); //$NON-NLS-1$
			formatoTlfno.setPlaceholderCharacter('*');
			textTelefono= new JFormattedTextField(formatoTlfno);
			textTelefono.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		}catch (ParseException e) {
			e.printStackTrace();
		}

		textTelefono.setFont(new Font("Dialog", Font.PLAIN, 14)); //$NON-NLS-1$
		textTelefono.setHorizontalAlignment(SwingConstants.CENTER);
		textTelefono.setForeground(new Color(169, 169, 169));
		textTelefono.setColumns(10);
		textTelefono.setBounds(755, 263, 140, 20);
		add(textTelefono);
		
		textAreaInfoAdic = new JTextArea();
		textAreaInfoAdic.setFont(new Font("Verdana", Font.PLAIN, 16)); //$NON-NLS-1$
		textAreaInfoAdic.setBorder(new TitledBorder(null, MessagesV_Inscribirse.getString("V_inscribirse.textAreaInfoAdic.borderTitle"), TitledBorder.LEADING, TitledBorder.TOP, null, null)); //$NON-NLS-1$
		textAreaInfoAdic.setLineWrap(true);
		textAreaInfoAdic.setBounds(594, 348, 361, 94);
		add(textAreaInfoAdic);
		
		JLabel lblTarjCredito = new JLabel(MessagesV_Inscribirse.getString("V_inscribirse.lblTarjCredito.text")); //$NON-NLS-1$
		lblTarjCredito.setFont(new Font("Verdana", Font.BOLD, 16)); //$NON-NLS-1$
		lblTarjCredito.setBounds(572, 297, 173, 26);
		add(lblTarjCredito);
		
		MaskFormatter formatoTarj1;
		try {
			formatoTarj1= new MaskFormatter(" ****' ****' ****' ****'"); //$NON-NLS-1$
			formatoTarj1.setPlaceholderCharacter('*');
			textTrajcred1 =new JFormattedTextField(formatoTarj1);
			textTrajcred1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
			textTrajcred1.setFont(new Font("Verdana", Font.PLAIN, 14)); //$NON-NLS-1$
		}catch (ParseException e) {
			e.printStackTrace();
		}
	
		textTrajcred1.setBounds(755, 302, 131, 20);
		add(textTrajcred1);
		textTrajcred1.setColumns(10);
		
		MaskFormatter formatoTarj12;
		try {
			formatoTarj12= new MaskFormatter(" ###'"); //$NON-NLS-1$
			formatoTarj12.setPlaceholderCharacter('*');
			textTarjcred2= new JFormattedTextField(formatoTarj12);
			textTarjcred2.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
			textTarjcred2.setFont(new Font("Verdana", Font.PLAIN, 14)); //$NON-NLS-1$
			textTarjcred2.setToolTipText(MessagesV_Inscribirse.getString("V_inscribirse.textTarjcred2.toolTipText")); //$NON-NLS-1$
		}catch (ParseException e) {
	
			e.printStackTrace();
		}
		textTarjcred2.setColumns(10);
		textTarjcred2.setBounds(898, 303, 57, 20);
		add(textTarjcred2);
		
		lblEstadoAct = new JLabel(""); //$NON-NLS-1$
		lblEstadoAct.setForeground(new Color(204, 0, 0));
		lblEstadoAct.setFont(new Font("Verdana", Font.BOLD, 14)); //$NON-NLS-1$
		lblEstadoAct.setBounds(594, 440, 377, 27);
		add(lblEstadoAct);
		
		JButton btnBorrar = new JButton(MessagesV_Inscribirse.getString("V_inscribirse.btnBorrar.text")); //$NON-NLS-1$
		btnBorrar.setFont(new Font("Verdana", Font.BOLD, 16)); //$NON-NLS-1$
		btnBorrar.setBorder(new RoundedBorder(10));
		btnBorrar.setBackground(new Color(255, 165, 0));
		btnBorrar.setBounds(49, 462, 121, 32);
		btnBorrar.addActionListener(new BtnBorrarActionListener());
		add(btnBorrar);
		
		textAreaInfoAdic.addFocusListener(new textAreaInfoAdicFocusListener());
		textApellidos.addFocusListener(new TextApellidosFocusListener()); 
		textEmail.addFocusListener(new TextEmailFocusListener()); 
		textTelefono.addFocusListener(new TextTelefonoFocusListener()); 
		textNombre.addFocusListener(new TextNombreFocusListener());
		textTrajcred1.addFocusListener(new textTrajcred1FocusListener());
		textTarjcred2.addFocusListener(new textTrajcred2FocusListener());
		
	}
	private class textTrajcred1FocusListener extends FocusAdapter {
		@Override
		public void focusGained(FocusEvent e) {
			e.getComponent().setBackground(colorResaltado);
		}
		@Override
		public void focusLost(FocusEvent e) {
			e.getComponent().setBackground(colorBlanco);
		}
	}
	private class textTrajcred2FocusListener extends FocusAdapter {
		@Override
		public void focusGained(FocusEvent e) {
			e.getComponent().setBackground(colorResaltado);
		}
		@Override
		public void focusLost(FocusEvent e) {
			e.getComponent().setBackground(colorBlanco);
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
	private class BtnAceptarActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if(textNombre.getText().equals("") ||textApellidos.getText().equals("") || txtFormatedDNI.getText().equals("") || textEmail.getText().equals("") || textTarjcred2.getText().equals("") || textTrajcred1.getText().equals("")) { //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$ //$NON-NLS-6$
				
				lblEstadoAct.setText(MessagesV_Inscribirse.getString("V_inscribirse.61")); //$NON-NLS-1$
			}else {
				
				lblEstadoAct.setForeground(Color.GREEN);
				lblEstadoAct.setText(MessagesV_Inscribirse.getString("V_inscribirse.62")); //$NON-NLS-1$
				txtFormatedDNI.setText(null);
				textNombre.setText(null);
				textApellidos.setText(null);
				textTarjcred2.setText(null);
				textTrajcred1.setText(null);
				textEmail.setText(null);
				textTelefono.setText(null);
				textAreaInfoAdic.setText(null);
			}
		}
	}
	
	private class BtnBorrarActionListener implements ActionListener{
		public void actionPerformed(ActionEvent arg0) {
			textNombre.setText(null);
			textApellidos.setText(null);
			textTelefono.setText(null);
			textEmail.setText(null);
			txtFormatedDNI.setText(null);
			textAreaInfoAdic.setText(null);
			buttonGroup.clearSelection();
			buttonGroup_1.clearSelection();
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