package presentacion;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Rectangle;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.border.TitledBorder;
import javax.swing.text.MaskFormatter;
import javax.swing.border.EtchedBorder;
import java.awt.Font;
import java.awt.GridBagLayout;
import javax.swing.JSeparator;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JLabel;
import javax.swing.border.LineBorder;
import javax.swing.SwingConstants;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import java.awt.GridLayout;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;

import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.text.ParseException;
import java.awt.event.ActionEvent;

public class V_Reserva extends JPanel {
	private JTextField textNombre;
	private JTextField textApellidos;
	private JTextField texCodigoPostal;
	private JTextField TextTelefono;
	private JTextField TextCorreo;
	private JTextField TextConfirmarCorreo;
	private JTextField txtFormattedDNI;

	private Color colorBlanco = new Color (255,255,255);
	private Color colorResaltado = new Color (255,255,210);
	private JTextField textField;
	private JTextField textField_1;
	/**
	 * Create the panel.
	 */
	public V_Reserva() {
		setBackground(Color.WHITE);
		setBounds(new Rectangle(10, 50, 1001, 530));
		setLayout(new BorderLayout(0, 0));
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBorder(new TitledBorder(null, "Reservar", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		add(scrollPane, BorderLayout.CENTER);
		
		JPanel pnlReserva = new JPanel();
		scrollPane.setViewportView(pnlReserva);
		GridBagLayout gbl_pnlReserva = new GridBagLayout();
		gbl_pnlReserva.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_pnlReserva.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_pnlReserva.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_pnlReserva.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		pnlReserva.setLayout(gbl_pnlReserva);
		
		JSeparator separator_1 = new JSeparator();
		GridBagConstraints gbc_separator_1 = new GridBagConstraints();
		gbc_separator_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_separator_1.gridwidth = 3;
		gbc_separator_1.insets = new Insets(0, 0, 5, 5);
		gbc_separator_1.gridx = 0;
		gbc_separator_1.gridy = 1;
		pnlReserva.add(separator_1, gbc_separator_1);
		
		JLabel lblInformacionReserva = new JLabel("INFORMACIÓN DE ESTANCIA");
		lblInformacionReserva.setForeground(new Color(210, 105, 30));
		lblInformacionReserva.setFont(new Font("Verdana", Font.BOLD, 18));
		GridBagConstraints gbc_lblInformacionReserva = new GridBagConstraints();
		gbc_lblInformacionReserva.gridwidth = 4;
		gbc_lblInformacionReserva.insets = new Insets(0, 0, 5, 5);
		gbc_lblInformacionReserva.gridx = 3;
		gbc_lblInformacionReserva.gridy = 1;
		pnlReserva.add(lblInformacionReserva, gbc_lblInformacionReserva);
		
		JSeparator separator = new JSeparator();
		GridBagConstraints gbc_separator = new GridBagConstraints();
		gbc_separator.fill = GridBagConstraints.HORIZONTAL;
		gbc_separator.gridwidth = 8;
		gbc_separator.insets = new Insets(0, 0, 5, 0);
		gbc_separator.gridx = 8;
		gbc_separator.gridy = 1;
		pnlReserva.add(separator, gbc_separator);
		
		JLabel lblNewLabel = new JLabel("Número de personas");
		lblNewLabel.setFont(new Font("Verdana", Font.PLAIN, 16));
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel.gridwidth = 4;
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 1;
		gbc_lblNewLabel.gridy = 2;
		pnlReserva.add(lblNewLabel, gbc_lblNewLabel);
		
		JSpinner spinner = new JSpinner();
		spinner.setModel(new SpinnerNumberModel(0, 0, 10, 1));
		spinner.setFont(new Font("Verdana", Font.PLAIN, 16));
		GridBagConstraints gbc_spinner = new GridBagConstraints();
		gbc_spinner.fill = GridBagConstraints.HORIZONTAL;
		gbc_spinner.insets = new Insets(0, 0, 5, 5);
		gbc_spinner.gridx = 6;
		gbc_spinner.gridy = 2;
		pnlReserva.add(spinner, gbc_spinner);
		
		JLabel lblTipoVehculo = new JLabel("Tipo vehículo");
		lblTipoVehculo.setFont(new Font("Verdana", Font.PLAIN, 16));
		GridBagConstraints gbc_lblTipoVehculo = new GridBagConstraints();
		gbc_lblTipoVehculo.anchor = GridBagConstraints.EAST;
		gbc_lblTipoVehculo.gridwidth = 3;
		gbc_lblTipoVehculo.insets = new Insets(0, 0, 5, 5);
		gbc_lblTipoVehculo.gridx = 1;
		gbc_lblTipoVehculo.gridy = 4;
		pnlReserva.add(lblTipoVehculo, gbc_lblTipoVehculo);
		
		JSpinner spinnerCoche = new JSpinner();
		spinnerCoche.setModel(new SpinnerNumberModel(0, 0, 5, 1));
		spinnerCoche.setFont(new Font("Verdana", Font.PLAIN, 16));
		GridBagConstraints gbc_spinnerCoche = new GridBagConstraints();
		gbc_spinnerCoche.fill = GridBagConstraints.HORIZONTAL;
		gbc_spinnerCoche.insets = new Insets(0, 0, 5, 5);
		gbc_spinnerCoche.gridx = 6;
		gbc_spinnerCoche.gridy = 4;
		pnlReserva.add(spinnerCoche, gbc_spinnerCoche);
		
		JLabel lblCoche = new JLabel("Coche");
		lblCoche.setFont(new Font("Verdana", Font.PLAIN, 16));
		GridBagConstraints gbc_lblCoche = new GridBagConstraints();
		gbc_lblCoche.anchor = GridBagConstraints.WEST;
		gbc_lblCoche.insets = new Insets(0, 0, 5, 5);
		gbc_lblCoche.gridx = 7;
		gbc_lblCoche.gridy = 4;
		pnlReserva.add(lblCoche, gbc_lblCoche);
		
		JSpinner spinnerMoto = new JSpinner();
		spinnerMoto.setModel(new SpinnerNumberModel(0, 0, 10, 1));
		spinnerMoto.setFont(new Font("Verdana", Font.PLAIN, 16));
		GridBagConstraints gbc_spinnerMoto = new GridBagConstraints();
		gbc_spinnerMoto.fill = GridBagConstraints.HORIZONTAL;
		gbc_spinnerMoto.insets = new Insets(0, 0, 5, 5);
		gbc_spinnerMoto.gridx = 6;
		gbc_spinnerMoto.gridy = 5;
		pnlReserva.add(spinnerMoto, gbc_spinnerMoto);
		
		JLabel lblMoto = new JLabel("Moto");
		lblMoto.setFont(new Font("Verdana", Font.PLAIN, 16));
		GridBagConstraints gbc_lblMoto = new GridBagConstraints();
		gbc_lblMoto.anchor = GridBagConstraints.WEST;
		gbc_lblMoto.insets = new Insets(0, 0, 5, 5);
		gbc_lblMoto.gridx = 7;
		gbc_lblMoto.gridy = 5;
		pnlReserva.add(lblMoto, gbc_lblMoto);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("42€ /vehiculo adicional");
		lblNewLabel_1_2_1.setFont(new Font("Verdana", Font.PLAIN, 16));
		GridBagConstraints gbc_lblNewLabel_1_2_1 = new GridBagConstraints();
		gbc_lblNewLabel_1_2_1.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel_1_2_1.gridwidth = 3;
		gbc_lblNewLabel_1_2_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1_2_1.gridx = 8;
		gbc_lblNewLabel_1_2_1.gridy = 5;
		pnlReserva.add(lblNewLabel_1_2_1, gbc_lblNewLabel_1_2_1);
		
		JSpinner spinnerFurgoneta = new JSpinner();
		spinnerFurgoneta.setModel(new SpinnerNumberModel(0, 0, 5, 1));
		spinnerFurgoneta.setFont(new Font("Verdana", Font.PLAIN, 16));
		GridBagConstraints gbc_spinnerFurgoneta = new GridBagConstraints();
		gbc_spinnerFurgoneta.fill = GridBagConstraints.HORIZONTAL;
		gbc_spinnerFurgoneta.insets = new Insets(0, 0, 5, 5);
		gbc_spinnerFurgoneta.gridx = 6;
		gbc_spinnerFurgoneta.gridy = 6;
		pnlReserva.add(spinnerFurgoneta, gbc_spinnerFurgoneta);
		
		JLabel lblFurgoneta = new JLabel("Furgoneta ");
		lblFurgoneta.setFont(new Font("Verdana", Font.PLAIN, 16));
		GridBagConstraints gbc_lblFurgoneta = new GridBagConstraints();
		gbc_lblFurgoneta.anchor = GridBagConstraints.WEST;
		gbc_lblFurgoneta.insets = new Insets(0, 0, 5, 5);
		gbc_lblFurgoneta.gridx = 7;
		gbc_lblFurgoneta.gridy = 6;
		pnlReserva.add(lblFurgoneta, gbc_lblFurgoneta);
		
		JLabel lblOtros = new JLabel("Otros");
		lblOtros.setFont(new Font("Verdana", Font.PLAIN, 16));
		GridBagConstraints gbc_lblOtros = new GridBagConstraints();
		gbc_lblOtros.gridwidth = 3;
		gbc_lblOtros.anchor = GridBagConstraints.EAST;
		gbc_lblOtros.insets = new Insets(0, 0, 5, 5);
		gbc_lblOtros.gridx = 1;
		gbc_lblOtros.gridy = 8;
		pnlReserva.add(lblOtros, gbc_lblOtros);
		
		JSpinner spinnerMacota = new JSpinner();
		spinnerMacota.setModel(new SpinnerNumberModel(0, 0, 3, 1));
		spinnerMacota.setFont(new Font("Verdana", Font.PLAIN, 16));
		GridBagConstraints gbc_spinnerMacota = new GridBagConstraints();
		gbc_spinnerMacota.fill = GridBagConstraints.HORIZONTAL;
		gbc_spinnerMacota.insets = new Insets(0, 0, 5, 5);
		gbc_spinnerMacota.gridx = 6;
		gbc_spinnerMacota.gridy = 9;
		pnlReserva.add(spinnerMacota, gbc_spinnerMacota);
		
		JLabel lblMascota = new JLabel("Mascota");
		lblMascota.setFont(new Font("Verdana", Font.PLAIN, 16));
		GridBagConstraints gbc_lblMascota = new GridBagConstraints();
		gbc_lblMascota.anchor = GridBagConstraints.WEST;
		gbc_lblMascota.insets = new Insets(0, 0, 5, 5);
		gbc_lblMascota.gridx = 7;
		gbc_lblMascota.gridy = 9;
		pnlReserva.add(lblMascota, gbc_lblMascota);
		
		JLabel lblNewLabel_1_2 = new JLabel("10€ por  mascota");
		lblNewLabel_1_2.setFont(new Font("Verdana", Font.PLAIN, 16));
		GridBagConstraints gbc_lblNewLabel_1_2 = new GridBagConstraints();
		gbc_lblNewLabel_1_2.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel_1_2.gridwidth = 3;
		gbc_lblNewLabel_1_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1_2.gridx = 8;
		gbc_lblNewLabel_1_2.gridy = 9;
		pnlReserva.add(lblNewLabel_1_2, gbc_lblNewLabel_1_2);
		
		JSpinner spinnerCuna = new JSpinner();
		spinnerCuna.setModel(new SpinnerNumberModel(0, 0, 7, 1));
		spinnerCuna.setFont(new Font("Verdana", Font.PLAIN, 16));
		GridBagConstraints gbc_spinnerCuna = new GridBagConstraints();
		gbc_spinnerCuna.fill = GridBagConstraints.HORIZONTAL;
		gbc_spinnerCuna.insets = new Insets(0, 0, 5, 5);
		gbc_spinnerCuna.gridx = 6;
		gbc_spinnerCuna.gridy = 10;
		pnlReserva.add(spinnerCuna, gbc_spinnerCuna);
		
		JLabel lblCuna = new JLabel("Cuna");
		lblCuna.setFont(new Font("Verdana", Font.PLAIN, 16));
		GridBagConstraints gbc_lblCuna = new GridBagConstraints();
		gbc_lblCuna.anchor = GridBagConstraints.WEST;
		gbc_lblCuna.insets = new Insets(0, 0, 5, 5);
		gbc_lblCuna.gridx = 7;
		gbc_lblCuna.gridy = 10;
		pnlReserva.add(lblCuna, gbc_lblCuna);
		
		JLabel lblNewLabel_1_2_2 = new JLabel("5€ por  cuna");
		lblNewLabel_1_2_2.setFont(new Font("Verdana", Font.PLAIN, 16));
		GridBagConstraints gbc_lblNewLabel_1_2_2 = new GridBagConstraints();
		gbc_lblNewLabel_1_2_2.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel_1_2_2.gridwidth = 3;
		gbc_lblNewLabel_1_2_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1_2_2.gridx = 8;
		gbc_lblNewLabel_1_2_2.gridy = 10;
		pnlReserva.add(lblNewLabel_1_2_2, gbc_lblNewLabel_1_2_2);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("No");
		rdbtnNewRadioButton.setFont(new Font("Verdana", Font.PLAIN, 16));
		GridBagConstraints gbc_rdbtnNewRadioButton = new GridBagConstraints();
		gbc_rdbtnNewRadioButton.insets = new Insets(0, 0, 5, 5);
		gbc_rdbtnNewRadioButton.gridx = 6;
		gbc_rdbtnNewRadioButton.gridy = 11;
		pnlReserva.add(rdbtnNewRadioButton, gbc_rdbtnNewRadioButton);
		
		JRadioButton rdbtnSi = new JRadioButton("Si");
		rdbtnSi.setFont(new Font("Verdana", Font.PLAIN, 16));
		GridBagConstraints gbc_rdbtnSi = new GridBagConstraints();
		gbc_rdbtnSi.anchor = GridBagConstraints.WEST;
		gbc_rdbtnSi.insets = new Insets(0, 0, 5, 5);
		gbc_rdbtnSi.gridx = 7;
		gbc_rdbtnSi.gridy = 11;
		pnlReserva.add(rdbtnSi, gbc_rdbtnSi);
		
		JLabel lblPensionCompleta = new JLabel("Pension completa");
		lblPensionCompleta.setFont(new Font("Verdana", Font.PLAIN, 16));
		GridBagConstraints gbc_lblPensionCompleta = new GridBagConstraints();
		gbc_lblPensionCompleta.anchor = GridBagConstraints.WEST;
		gbc_lblPensionCompleta.gridwidth = 3;
		gbc_lblPensionCompleta.insets = new Insets(0, 0, 5, 5);
		gbc_lblPensionCompleta.gridx = 8;
		gbc_lblPensionCompleta.gridy = 11;
		pnlReserva.add(lblPensionCompleta, gbc_lblPensionCompleta);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("No");
		rdbtnNewRadioButton_1.setFont(new Font("Verdana", Font.PLAIN, 16));
		GridBagConstraints gbc_rdbtnNewRadioButton_1 = new GridBagConstraints();
		gbc_rdbtnNewRadioButton_1.insets = new Insets(0, 0, 5, 5);
		gbc_rdbtnNewRadioButton_1.gridx = 6;
		gbc_rdbtnNewRadioButton_1.gridy = 12;
		pnlReserva.add(rdbtnNewRadioButton_1, gbc_rdbtnNewRadioButton_1);
		
		JRadioButton rdbtnSi_1 = new JRadioButton("Si");
		rdbtnSi_1.setFont(new Font("Verdana", Font.PLAIN, 16));
		GridBagConstraints gbc_rdbtnSi_1 = new GridBagConstraints();
		gbc_rdbtnSi_1.anchor = GridBagConstraints.WEST;
		gbc_rdbtnSi_1.insets = new Insets(0, 0, 5, 5);
		gbc_rdbtnSi_1.gridx = 7;
		gbc_rdbtnSi_1.gridy = 12;
		pnlReserva.add(rdbtnSi_1, gbc_rdbtnSi_1);
		
		JLabel lblMediaPension = new JLabel("Media pension");
		lblMediaPension.setFont(new Font("Verdana", Font.PLAIN, 16));
		GridBagConstraints gbc_lblMediaPension = new GridBagConstraints();
		gbc_lblMediaPension.anchor = GridBagConstraints.WEST;
		gbc_lblMediaPension.gridwidth = 3;
		gbc_lblMediaPension.insets = new Insets(0, 0, 5, 5);
		gbc_lblMediaPension.gridx = 8;
		gbc_lblMediaPension.gridy = 12;
		pnlReserva.add(lblMediaPension, gbc_lblMediaPension);
		
		JRadioButton rdbtnNewRadioButton_1_1 = new JRadioButton("No");
		rdbtnNewRadioButton_1_1.setFont(new Font("Verdana", Font.PLAIN, 16));
		GridBagConstraints gbc_rdbtnNewRadioButton_1_1 = new GridBagConstraints();
		gbc_rdbtnNewRadioButton_1_1.insets = new Insets(0, 0, 5, 5);
		gbc_rdbtnNewRadioButton_1_1.gridx = 6;
		gbc_rdbtnNewRadioButton_1_1.gridy = 13;
		pnlReserva.add(rdbtnNewRadioButton_1_1, gbc_rdbtnNewRadioButton_1_1);
		
		JRadioButton rdbtnSi_1_1 = new JRadioButton("Si");
		rdbtnSi_1_1.setFont(new Font("Verdana", Font.PLAIN, 16));
		GridBagConstraints gbc_rdbtnSi_1_1 = new GridBagConstraints();
		gbc_rdbtnSi_1_1.anchor = GridBagConstraints.WEST;
		gbc_rdbtnSi_1_1.insets = new Insets(0, 0, 5, 5);
		gbc_rdbtnSi_1_1.gridx = 7;
		gbc_rdbtnSi_1_1.gridy = 13;
		pnlReserva.add(rdbtnSi_1_1, gbc_rdbtnSi_1_1);
		
		JLabel lblConDesayuno = new JLabel("Con desayuno");
		lblConDesayuno.setFont(new Font("Verdana", Font.PLAIN, 16));
		GridBagConstraints gbc_lblConDesayuno = new GridBagConstraints();
		gbc_lblConDesayuno.insets = new Insets(0, 0, 5, 5);
		gbc_lblConDesayuno.gridx = 8;
		gbc_lblConDesayuno.gridy = 13;
		pnlReserva.add(lblConDesayuno, gbc_lblConDesayuno);
		
		JTextArea textArea = new JTextArea();
		textArea.setBorder(new TitledBorder(null, "Informaci\u00F3n adicional", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		textArea.setLineWrap(true);
		textArea.setFont(new Font("Verdana", Font.PLAIN, 16));
		GridBagConstraints gbc_textArea = new GridBagConstraints();
		gbc_textArea.gridheight = 5;
		gbc_textArea.gridwidth = 5;
		gbc_textArea.insets = new Insets(0, 0, 5, 5);
		gbc_textArea.fill = GridBagConstraints.BOTH;
		gbc_textArea.gridx = 4;
		gbc_textArea.gridy = 15;
		pnlReserva.add(textArea, gbc_textArea);
		
		JSeparator separator_1_1 = new JSeparator();
		GridBagConstraints gbc_separator_1_1 = new GridBagConstraints();
		gbc_separator_1_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_separator_1_1.gridwidth = 3;
		gbc_separator_1_1.insets = new Insets(0, 0, 5, 5);
		gbc_separator_1_1.gridx = 0;
		gbc_separator_1_1.gridy = 21;
		pnlReserva.add(separator_1_1, gbc_separator_1_1);
		
		JLabel lblDatosPersonales = new JLabel("DATOS PERSONALES");
		lblDatosPersonales.setForeground(new Color(210, 105, 30));
		lblDatosPersonales.setFont(new Font("Verdana", Font.BOLD, 18));
		GridBagConstraints gbc_lblDatosPersonales = new GridBagConstraints();
		gbc_lblDatosPersonales.gridwidth = 4;
		gbc_lblDatosPersonales.insets = new Insets(0, 0, 5, 5);
		gbc_lblDatosPersonales.gridx = 3;
		gbc_lblDatosPersonales.gridy = 21;
		pnlReserva.add(lblDatosPersonales, gbc_lblDatosPersonales);
		
		JSeparator separator_2 = new JSeparator();
		GridBagConstraints gbc_separator_2 = new GridBagConstraints();
		gbc_separator_2.fill = GridBagConstraints.HORIZONTAL;
		gbc_separator_2.gridwidth = 9;
		gbc_separator_2.insets = new Insets(0, 0, 5, 0);
		gbc_separator_2.gridx = 7;
		gbc_separator_2.gridy = 21;
		pnlReserva.add(separator_2, gbc_separator_2);
		
		JLabel lblNewLabel_1 = new JLabel("*Campo obligatorio");
		lblNewLabel_1.setForeground(new Color(204, 0, 0));
		lblNewLabel_1.setFont(new Font("Verdana", Font.PLAIN, 16));
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.gridwidth = 5;
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1.gridx = 2;
		gbc_lblNewLabel_1.gridy = 22;
		pnlReserva.add(lblNewLabel_1, gbc_lblNewLabel_1);
		
		JLabel lblNombre = new JLabel("Nombre*");
		lblNombre.setFont(new Font("Verdana", Font.PLAIN, 16));
		GridBagConstraints gbc_lblNombre = new GridBagConstraints();
		gbc_lblNombre.anchor = GridBagConstraints.EAST;
		gbc_lblNombre.gridwidth = 3;
		gbc_lblNombre.insets = new Insets(0, 0, 5, 5);
		gbc_lblNombre.gridx = 3;
		gbc_lblNombre.gridy = 24;
		pnlReserva.add(lblNombre, gbc_lblNombre);
		
		textNombre = new JTextField();
		textNombre.setFont(new Font("Verdana", Font.PLAIN, 16));
		GridBagConstraints gbc_textNombre = new GridBagConstraints();
		gbc_textNombre.gridwidth = 2;
		gbc_textNombre.insets = new Insets(0, 0, 5, 5);
		gbc_textNombre.fill = GridBagConstraints.HORIZONTAL;
		gbc_textNombre.gridx = 7;
		gbc_textNombre.gridy = 24;
		pnlReserva.add(textNombre, gbc_textNombre);
		textNombre.setColumns(10);
		
		JLabel lblPrimerApellido = new JLabel("Apellidos*");
		lblPrimerApellido.setFont(new Font("Verdana", Font.PLAIN, 16));
		GridBagConstraints gbc_lblPrimerApellido = new GridBagConstraints();
		gbc_lblPrimerApellido.anchor = GridBagConstraints.EAST;
		gbc_lblPrimerApellido.gridwidth = 3;
		gbc_lblPrimerApellido.insets = new Insets(0, 0, 5, 5);
		gbc_lblPrimerApellido.gridx = 3;
		gbc_lblPrimerApellido.gridy = 25;
		pnlReserva.add(lblPrimerApellido, gbc_lblPrimerApellido);
		
		textApellidos = new JTextField();
		textApellidos.setFont(new Font("Verdana", Font.PLAIN, 16));
		textApellidos.setColumns(10);
		GridBagConstraints gbc_textApellidos = new GridBagConstraints();
		gbc_textApellidos.gridwidth = 4;
		gbc_textApellidos.insets = new Insets(0, 0, 5, 5);
		gbc_textApellidos.fill = GridBagConstraints.HORIZONTAL;
		gbc_textApellidos.gridx = 7;
		gbc_textApellidos.gridy = 25;
		pnlReserva.add(textApellidos, gbc_textApellidos);
		
		JLabel lblCdi = new JLabel("Código postal");
		lblCdi.setFont(new Font("Verdana", Font.PLAIN, 16));
		GridBagConstraints gbc_lblCdi = new GridBagConstraints();
		gbc_lblCdi.anchor = GridBagConstraints.EAST;
		gbc_lblCdi.gridwidth = 4;
		gbc_lblCdi.insets = new Insets(0, 0, 5, 5);
		gbc_lblCdi.gridx = 2;
		gbc_lblCdi.gridy = 26;
		pnlReserva.add(lblCdi, gbc_lblCdi);
		
		texCodigoPostal = new JTextField();
		texCodigoPostal.setFont(new Font("Verdana", Font.PLAIN, 16));
		texCodigoPostal.setColumns(10);
		GridBagConstraints gbc_texCodigoPostal = new GridBagConstraints();
		gbc_texCodigoPostal.insets = new Insets(0, 0, 5, 5);
		gbc_texCodigoPostal.fill = GridBagConstraints.HORIZONTAL;
		gbc_texCodigoPostal.gridx = 7;
		gbc_texCodigoPostal.gridy = 26;
		pnlReserva.add(texCodigoPostal, gbc_texCodigoPostal);
		
		JLabel lblTlefono = new JLabel("Télefono");
		lblTlefono.setFont(new Font("Verdana", Font.PLAIN, 16));
		GridBagConstraints gbc_lblTlefono = new GridBagConstraints();
		gbc_lblTlefono.insets = new Insets(0, 0, 5, 5);
		gbc_lblTlefono.gridx = 5;
		gbc_lblTlefono.gridy = 27;
		pnlReserva.add(lblTlefono, gbc_lblTlefono);
		
		TextTelefono = new JTextField();
		TextTelefono.setFont(new Font("Verdana", Font.PLAIN, 16));
		TextTelefono.setColumns(10);
		GridBagConstraints gbc_TextTelefono = new GridBagConstraints();
		gbc_TextTelefono.insets = new Insets(0, 0, 5, 5);
		gbc_TextTelefono.fill = GridBagConstraints.HORIZONTAL;
		gbc_TextTelefono.gridx = 7;
		gbc_TextTelefono.gridy = 27;
		pnlReserva.add(TextTelefono, gbc_TextTelefono);
		
		JLabel lblTarjetaDeCredito = new JLabel("Tarjeta de credito");
		lblTarjetaDeCredito.setFont(new Font("Verdana", Font.PLAIN, 16));
		GridBagConstraints gbc_lblTarjetaDeCredito = new GridBagConstraints();
		gbc_lblTarjetaDeCredito.anchor = GridBagConstraints.EAST;
		gbc_lblTarjetaDeCredito.gridwidth = 3;
		gbc_lblTarjetaDeCredito.insets = new Insets(0, 0, 5, 5);
		gbc_lblTarjetaDeCredito.gridx = 3;
		gbc_lblTarjetaDeCredito.gridy = 28;
		pnlReserva.add(lblTarjetaDeCredito, gbc_lblTarjetaDeCredito);
		
		textField = new JTextField();
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.anchor = GridBagConstraints.WEST;
		gbc_textField.insets = new Insets(0, 0, 5, 5);
		gbc_textField.gridx = 7;
		gbc_textField.gridy = 28;
		pnlReserva.add(textField, gbc_textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		GridBagConstraints gbc_textField_1 = new GridBagConstraints();
		gbc_textField_1.anchor = GridBagConstraints.WEST;
		gbc_textField_1.insets = new Insets(0, 0, 5, 5);
		gbc_textField_1.gridx = 8;
		gbc_textField_1.gridy = 28;
		pnlReserva.add(textField_1, gbc_textField_1);
		textField_1.setColumns(10);
		
		JLabel lblCorreoElectrnico = new JLabel("Correo electrónico*");
		lblCorreoElectrnico.setFont(new Font("Verdana", Font.PLAIN, 16));
		GridBagConstraints gbc_lblCorreoElectrnico = new GridBagConstraints();
		gbc_lblCorreoElectrnico.anchor = GridBagConstraints.EAST;
		gbc_lblCorreoElectrnico.gridwidth = 5;
		gbc_lblCorreoElectrnico.insets = new Insets(0, 0, 5, 5);
		gbc_lblCorreoElectrnico.gridx = 1;
		gbc_lblCorreoElectrnico.gridy = 29;
		pnlReserva.add(lblCorreoElectrnico, gbc_lblCorreoElectrnico);
		
		TextCorreo = new JTextField();
		TextCorreo.setFont(new Font("Verdana", Font.PLAIN, 16));
		TextCorreo.setColumns(10);
		GridBagConstraints gbc_TextCorreo = new GridBagConstraints();
		gbc_TextCorreo.gridwidth = 3;
		gbc_TextCorreo.insets = new Insets(0, 0, 5, 5);
		gbc_TextCorreo.fill = GridBagConstraints.HORIZONTAL;
		gbc_TextCorreo.gridx = 7;
		gbc_TextCorreo.gridy = 29;
		pnlReserva.add(TextCorreo, gbc_TextCorreo);
		
		JLabel lblConfirmarCorreoElectrnico = new JLabel("Confirmar correo electrónico*");
		lblConfirmarCorreoElectrnico.setFont(new Font("Verdana", Font.PLAIN, 16));
		GridBagConstraints gbc_lblConfirmarCorreoElectrnico = new GridBagConstraints();
		gbc_lblConfirmarCorreoElectrnico.anchor = GridBagConstraints.EAST;
		gbc_lblConfirmarCorreoElectrnico.gridwidth = 6;
		gbc_lblConfirmarCorreoElectrnico.insets = new Insets(0, 0, 5, 5);
		gbc_lblConfirmarCorreoElectrnico.gridx = 0;
		gbc_lblConfirmarCorreoElectrnico.gridy = 30;
		pnlReserva.add(lblConfirmarCorreoElectrnico, gbc_lblConfirmarCorreoElectrnico);
		
		TextConfirmarCorreo = new JTextField();
		TextConfirmarCorreo.setFont(new Font("Verdana", Font.PLAIN, 16));
		TextConfirmarCorreo.setColumns(10);
		GridBagConstraints gbc_TextConfirmarCorreo = new GridBagConstraints();
		gbc_TextConfirmarCorreo.gridwidth = 3;
		gbc_TextConfirmarCorreo.insets = new Insets(0, 0, 5, 5);
		gbc_TextConfirmarCorreo.fill = GridBagConstraints.HORIZONTAL;
		gbc_TextConfirmarCorreo.gridx = 7;
		gbc_TextConfirmarCorreo.gridy = 30;
		pnlReserva.add(TextConfirmarCorreo, gbc_TextConfirmarCorreo);
		
		JButton btnCancelar = new JButton("Cancelar");
		
		
		JLabel lblEstado = new JLabel("");
		lblEstado.setFont(new Font("Verdana", Font.PLAIN, 16));
		GridBagConstraints gbc_lblEstado = new GridBagConstraints();
		gbc_lblEstado.gridwidth = 3;
		gbc_lblEstado.insets = new Insets(0, 0, 5, 5);
		gbc_lblEstado.gridx = 7;
		gbc_lblEstado.gridy = 32;
		pnlReserva.add(lblEstado, gbc_lblEstado);
		btnCancelar.setFont(new Font("Verdana", Font.BOLD, 20));
		btnCancelar.setBackground(new Color(244, 164, 96));
		GridBagConstraints gbc_btnCancelar = new GridBagConstraints();
		gbc_btnCancelar.insets = new Insets(0, 0, 5, 5);
		gbc_btnCancelar.gridx = 5;
		gbc_btnCancelar.gridy = 33;
		pnlReserva.add(btnCancelar, gbc_btnCancelar);
		
		JButton btnReservar = new JButton("Reservar");
		btnReservar.setFont(new Font("Verdana", Font.BOLD, 20));
		btnReservar.setBackground(new Color(244, 164, 96));
		GridBagConstraints gbc_btnReservar = new GridBagConstraints();
		gbc_btnReservar.insets = new Insets(0, 0, 5, 5);
		gbc_btnReservar.gridx = 9;
		gbc_btnReservar.gridy = 33;
		pnlReserva.add(btnReservar, gbc_btnReservar);
		
		
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
	
}

