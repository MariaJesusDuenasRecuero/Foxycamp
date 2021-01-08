package presentacion;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Rectangle;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.border.TitledBorder;
import javax.swing.text.MaskFormatter;

import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridBagLayout;
import javax.swing.JSeparator;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JLabel;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;

import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.text.ParseException;
import java.awt.event.ActionEvent;
import javax.swing.border.BevelBorder;
import javax.swing.border.Border;
import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.ButtonModel;

public class V_Reserva extends JPanel {
	private JTextField textNombre;
	private JTextField textApellidos;
	private JTextField textCodigoPostal;
	private JTextField textTelefono;
	private JTextField textEmail;
	private JTextArea textAreaInfoAdic;
	private JRadioButton rdbtnSiMediaP;
	private JRadioButton rdbtnSiPensionC;
	private AbstractButton rdbtnNoMediaP;
	private JRadioButton rdbtnNoPensionC;

	private Color colorBlanco = new Color(255, 255, 255);
	private Color colorResaltado = new Color(255, 255, 210);
	private JTextField textTrajcred1;
	private JTextField textTarjcred2;
	private JLabel lblEstado;

	private final ButtonGroup buttonGroup = new ButtonGroup();

	// private P_Principal pnlContenido;
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
		gbl_pnlReserva.columnWidths = new int[] { 0, 0, 0, 0, 0, 0, 156, 0, 0, 0, 0, 0 };
		gbl_pnlReserva.rowHeights = new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
				0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		gbl_pnlReserva.columnWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0,
				Double.MIN_VALUE };
		gbl_pnlReserva.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
				0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
				0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
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
		lblInformacionReserva.setFont(new Font("Verdana", Font.BOLD, 15));
		GridBagConstraints gbc_lblInformacionReserva = new GridBagConstraints();
		gbc_lblInformacionReserva.anchor = GridBagConstraints.WEST;
		gbc_lblInformacionReserva.fill = GridBagConstraints.VERTICAL;
		gbc_lblInformacionReserva.gridwidth = 2;
		gbc_lblInformacionReserva.insets = new Insets(0, 0, 5, 5);
		gbc_lblInformacionReserva.gridx = 3;
		gbc_lblInformacionReserva.gridy = 1;
		pnlReserva.add(lblInformacionReserva, gbc_lblInformacionReserva);

		JSeparator separator = new JSeparator();
		GridBagConstraints gbc_separator = new GridBagConstraints();
		gbc_separator.fill = GridBagConstraints.HORIZONTAL;
		gbc_separator.gridwidth = 6;
		gbc_separator.insets = new Insets(0, 0, 5, 0);
		gbc_separator.gridx = 5;
		gbc_separator.gridy = 1;
		pnlReserva.add(separator, gbc_separator);

		JLabel lblNewLabel = new JLabel("Número de personas");
		lblNewLabel.setFont(new Font("Verdana", Font.PLAIN, 16));
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 3;
		gbc_lblNewLabel.gridy = 3;
		pnlReserva.add(lblNewLabel, gbc_lblNewLabel);

		JSpinner spinnerPersona = new JSpinner();
		spinnerPersona.setModel(new SpinnerNumberModel(0, 0, 10, 1));
		spinnerPersona.setFont(new Font("Verdana", Font.PLAIN, 16));
		GridBagConstraints gbc_spinnerPersona = new GridBagConstraints();
		gbc_spinnerPersona.fill = GridBagConstraints.HORIZONTAL;
		gbc_spinnerPersona.insets = new Insets(0, 0, 5, 5);
		gbc_spinnerPersona.gridx = 5;
		gbc_spinnerPersona.gridy = 3;
		pnlReserva.add(spinnerPersona, gbc_spinnerPersona);

		JLabel lblTipoVehculo = new JLabel("Tipo vehículo");
		lblTipoVehculo.setFont(new Font("Verdana", Font.PLAIN, 16));
		GridBagConstraints gbc_lblTipoVehculo = new GridBagConstraints();
		gbc_lblTipoVehculo.anchor = GridBagConstraints.EAST;
		gbc_lblTipoVehculo.gridwidth = 3;
		gbc_lblTipoVehculo.insets = new Insets(0, 0, 5, 5);
		gbc_lblTipoVehculo.gridx = 1;
		gbc_lblTipoVehculo.gridy = 5;
		pnlReserva.add(lblTipoVehculo, gbc_lblTipoVehculo);

		JSpinner spinnerCoche = new JSpinner();
		spinnerCoche.setModel(new SpinnerNumberModel(0, 0, 5, 1));
		spinnerCoche.setFont(new Font("Verdana", Font.PLAIN, 16));
		GridBagConstraints gbc_spinnerCoche = new GridBagConstraints();
		gbc_spinnerCoche.fill = GridBagConstraints.HORIZONTAL;
		gbc_spinnerCoche.insets = new Insets(0, 0, 5, 5);
		gbc_spinnerCoche.gridx = 5;
		gbc_spinnerCoche.gridy = 5;
		pnlReserva.add(spinnerCoche, gbc_spinnerCoche);

		JLabel lblCoche = new JLabel("Coche");
		lblCoche.setFont(new Font("Verdana", Font.PLAIN, 16));
		GridBagConstraints gbc_lblCoche = new GridBagConstraints();
		gbc_lblCoche.anchor = GridBagConstraints.WEST;
		gbc_lblCoche.insets = new Insets(0, 0, 5, 5);
		gbc_lblCoche.gridx = 6;
		gbc_lblCoche.gridy = 5;
		pnlReserva.add(lblCoche, gbc_lblCoche);

		JSpinner spinnerMoto = new JSpinner();
		spinnerMoto.setModel(new SpinnerNumberModel(0, 0, 10, 1));
		spinnerMoto.setFont(new Font("Verdana", Font.PLAIN, 16));
		GridBagConstraints gbc_spinnerMoto = new GridBagConstraints();
		gbc_spinnerMoto.fill = GridBagConstraints.HORIZONTAL;
		gbc_spinnerMoto.insets = new Insets(0, 0, 5, 5);
		gbc_spinnerMoto.gridx = 5;
		gbc_spinnerMoto.gridy = 6;
		pnlReserva.add(spinnerMoto, gbc_spinnerMoto);

		JLabel lblMoto = new JLabel("Moto     42€ /vehiculo adicional");
		lblMoto.setFont(new Font("Verdana", Font.PLAIN, 16));
		GridBagConstraints gbc_lblMoto = new GridBagConstraints();
		gbc_lblMoto.gridwidth = 2;
		gbc_lblMoto.anchor = GridBagConstraints.WEST;
		gbc_lblMoto.insets = new Insets(0, 0, 5, 5);
		gbc_lblMoto.gridx = 6;
		gbc_lblMoto.gridy = 6;
		pnlReserva.add(lblMoto, gbc_lblMoto);

		JSpinner spinnerFurgoneta = new JSpinner();
		spinnerFurgoneta.setModel(new SpinnerNumberModel(0, 0, 5, 1));
		spinnerFurgoneta.setFont(new Font("Verdana", Font.PLAIN, 16));
		GridBagConstraints gbc_spinnerFurgoneta = new GridBagConstraints();
		gbc_spinnerFurgoneta.fill = GridBagConstraints.HORIZONTAL;
		gbc_spinnerFurgoneta.insets = new Insets(0, 0, 5, 5);
		gbc_spinnerFurgoneta.gridx = 5;
		gbc_spinnerFurgoneta.gridy = 7;
		pnlReserva.add(spinnerFurgoneta, gbc_spinnerFurgoneta);

		JLabel lblFurgoneta = new JLabel("Furgoneta ");
		lblFurgoneta.setFont(new Font("Verdana", Font.PLAIN, 16));
		GridBagConstraints gbc_lblFurgoneta = new GridBagConstraints();
		gbc_lblFurgoneta.anchor = GridBagConstraints.WEST;
		gbc_lblFurgoneta.insets = new Insets(0, 0, 5, 5);
		gbc_lblFurgoneta.gridx = 6;
		gbc_lblFurgoneta.gridy = 7;
		pnlReserva.add(lblFurgoneta, gbc_lblFurgoneta);

		JLabel lblOtros = new JLabel("Otros");
		lblOtros.setFont(new Font("Verdana", Font.PLAIN, 16));
		GridBagConstraints gbc_lblOtros = new GridBagConstraints();
		gbc_lblOtros.gridwidth = 3;
		gbc_lblOtros.anchor = GridBagConstraints.EAST;
		gbc_lblOtros.insets = new Insets(0, 0, 5, 5);
		gbc_lblOtros.gridx = 1;
		gbc_lblOtros.gridy = 9;
		pnlReserva.add(lblOtros, gbc_lblOtros);

		JSpinner spinnerMacota = new JSpinner();
		spinnerMacota.setModel(new SpinnerNumberModel(0, 0, 3, 1));
		spinnerMacota.setFont(new Font("Verdana", Font.PLAIN, 16));
		GridBagConstraints gbc_spinnerMacota = new GridBagConstraints();
		gbc_spinnerMacota.fill = GridBagConstraints.HORIZONTAL;
		gbc_spinnerMacota.insets = new Insets(0, 0, 5, 5);
		gbc_spinnerMacota.gridx = 5;
		gbc_spinnerMacota.gridy = 10;
		pnlReserva.add(spinnerMacota, gbc_spinnerMacota);

		JLabel lblMascota = new JLabel("Mascota     10€ por  mascota");
		lblMascota.setFont(new Font("Verdana", Font.PLAIN, 16));
		GridBagConstraints gbc_lblMascota = new GridBagConstraints();
		gbc_lblMascota.gridwidth = 2;
		gbc_lblMascota.anchor = GridBagConstraints.WEST;
		gbc_lblMascota.insets = new Insets(0, 0, 5, 5);
		gbc_lblMascota.gridx = 6;
		gbc_lblMascota.gridy = 10;
		pnlReserva.add(lblMascota, gbc_lblMascota);

		JSpinner spinnerCuna = new JSpinner();
		spinnerCuna.setModel(new SpinnerNumberModel(0, 0, 7, 1));
		spinnerCuna.setFont(new Font("Verdana", Font.PLAIN, 16));
		GridBagConstraints gbc_spinnerCuna = new GridBagConstraints();
		gbc_spinnerCuna.fill = GridBagConstraints.HORIZONTAL;
		gbc_spinnerCuna.insets = new Insets(0, 0, 5, 5);
		gbc_spinnerCuna.gridx = 5;
		gbc_spinnerCuna.gridy = 11;
		pnlReserva.add(spinnerCuna, gbc_spinnerCuna);

		JLabel lblCuna = new JLabel("Cuna          5€ por  cuna");
		lblCuna.setFont(new Font("Verdana", Font.PLAIN, 16));
		GridBagConstraints gbc_lblCuna = new GridBagConstraints();
		gbc_lblCuna.gridwidth = 2;
		gbc_lblCuna.anchor = GridBagConstraints.WEST;
		gbc_lblCuna.insets = new Insets(0, 0, 5, 5);
		gbc_lblCuna.gridx = 6;
		gbc_lblCuna.gridy = 11;
		pnlReserva.add(lblCuna, gbc_lblCuna);

		rdbtnNoPensionC = new JRadioButton("No");
		buttonGroup.add(rdbtnNoPensionC);

		rdbtnNoPensionC.setFont(new Font("Verdana", Font.PLAIN, 16));
		GridBagConstraints gbc_rdbtnNoPensionC = new GridBagConstraints();
		gbc_rdbtnNoPensionC.insets = new Insets(0, 0, 5, 5);
		gbc_rdbtnNoPensionC.gridx = 5;
		gbc_rdbtnNoPensionC.gridy = 12;
		pnlReserva.add(rdbtnNoPensionC, gbc_rdbtnNoPensionC);

		rdbtnSiPensionC = new JRadioButton("Si           Pension completa");
		buttonGroup.add(rdbtnSiPensionC);

		rdbtnSiPensionC.setFont(new Font("Verdana", Font.PLAIN, 16));
		GridBagConstraints gbc_rdbtnSiPensionC = new GridBagConstraints();
		gbc_rdbtnSiPensionC.gridwidth = 2;
		gbc_rdbtnSiPensionC.anchor = GridBagConstraints.WEST;
		gbc_rdbtnSiPensionC.insets = new Insets(0, 0, 5, 5);
		gbc_rdbtnSiPensionC.gridx = 6;
		gbc_rdbtnSiPensionC.gridy = 12;
		pnlReserva.add(rdbtnSiPensionC, gbc_rdbtnSiPensionC);

		rdbtnNoMediaP = new JRadioButton("No");
		buttonGroup.add(rdbtnNoMediaP);

		rdbtnNoMediaP.setFont(new Font("Verdana", Font.PLAIN, 16));
		GridBagConstraints gbc_rdbtnNoMediaP = new GridBagConstraints();
		gbc_rdbtnNoMediaP.insets = new Insets(0, 0, 5, 5);
		gbc_rdbtnNoMediaP.gridx = 5;
		gbc_rdbtnNoMediaP.gridy = 13;
		pnlReserva.add(rdbtnNoMediaP, gbc_rdbtnNoMediaP);

		rdbtnSiMediaP = new JRadioButton("Si           Media pension");
		buttonGroup.add(rdbtnSiMediaP);

		rdbtnSiMediaP.setFont(new Font("Verdana", Font.PLAIN, 16));
		GridBagConstraints gbc_rdbtnSiMediaP = new GridBagConstraints();
		gbc_rdbtnSiMediaP.anchor = GridBagConstraints.WEST;
		gbc_rdbtnSiMediaP.insets = new Insets(0, 0, 5, 5);
		gbc_rdbtnSiMediaP.gridx = 6;
		gbc_rdbtnSiMediaP.gridy = 13;
		pnlReserva.add(rdbtnSiMediaP, gbc_rdbtnSiMediaP);

		rdbtnNoMediaP = new JRadioButton("No");
		buttonGroup.add(rdbtnNoMediaP);

		rdbtnNoMediaP.setFont(new Font("Verdana", Font.PLAIN, 16));
		GridBagConstraints gbc_rdbtnNoMediaPension = new GridBagConstraints();
		gbc_rdbtnNoMediaPension.insets = new Insets(0, 0, 5, 5);
		gbc_rdbtnNoMediaPension.gridx = 5;
		gbc_rdbtnNoMediaPension.gridy = 14;
		pnlReserva.add(rdbtnNoMediaP, gbc_rdbtnNoMediaPension);

		JRadioButton rdbtnSiDesayuno = new JRadioButton("Si           Con desayuno");
		buttonGroup.add(rdbtnSiDesayuno);

		rdbtnSiDesayuno.setFont(new Font("Verdana", Font.PLAIN, 16));
		GridBagConstraints gbc_rdbtnSiDesayuno = new GridBagConstraints();
		gbc_rdbtnSiDesayuno.anchor = GridBagConstraints.WEST;
		gbc_rdbtnSiDesayuno.insets = new Insets(0, 0, 5, 5);
		gbc_rdbtnSiDesayuno.gridx = 6;
		gbc_rdbtnSiDesayuno.gridy = 14;
		pnlReserva.add(rdbtnSiDesayuno, gbc_rdbtnSiDesayuno);

		textAreaInfoAdic = new JTextArea();
		textAreaInfoAdic.setBorder(new TitledBorder(null, "Informaci\u00F3n adicional", TitledBorder.LEADING,
				TitledBorder.TOP, null, null));
		textAreaInfoAdic.setLineWrap(true);
		textAreaInfoAdic.setFont(new Font("Verdana", Font.PLAIN, 16));
		GridBagConstraints gbc_textAreaInfoAdic = new GridBagConstraints();
		gbc_textAreaInfoAdic.gridheight = 6;
		gbc_textAreaInfoAdic.gridwidth = 3;
		gbc_textAreaInfoAdic.insets = new Insets(0, 0, 5, 5);
		gbc_textAreaInfoAdic.fill = GridBagConstraints.BOTH;
		gbc_textAreaInfoAdic.gridx = 4;
		gbc_textAreaInfoAdic.gridy = 16;
		pnlReserva.add(textAreaInfoAdic, gbc_textAreaInfoAdic);

		JSeparator separator_1_1 = new JSeparator();
		GridBagConstraints gbc_separator_1_1 = new GridBagConstraints();
		gbc_separator_1_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_separator_1_1.gridwidth = 3;
		gbc_separator_1_1.insets = new Insets(0, 0, 5, 5);
		gbc_separator_1_1.gridx = 0;
		gbc_separator_1_1.gridy = 24;
		pnlReserva.add(separator_1_1, gbc_separator_1_1);

		JLabel lblDatosPersonales = new JLabel("DATOS PERSONALES");
		lblDatosPersonales.setForeground(new Color(210, 105, 30));
		lblDatosPersonales.setFont(new Font("Verdana", Font.BOLD, 16));
		GridBagConstraints gbc_lblDatosPersonales = new GridBagConstraints();
		gbc_lblDatosPersonales.anchor = GridBagConstraints.WEST;
		gbc_lblDatosPersonales.gridwidth = 2;
		gbc_lblDatosPersonales.insets = new Insets(0, 0, 5, 5);
		gbc_lblDatosPersonales.gridx = 3;
		gbc_lblDatosPersonales.gridy = 24;
		pnlReserva.add(lblDatosPersonales, gbc_lblDatosPersonales);

		JSeparator separator_2 = new JSeparator();
		GridBagConstraints gbc_separator_2 = new GridBagConstraints();
		gbc_separator_2.fill = GridBagConstraints.HORIZONTAL;
		gbc_separator_2.gridwidth = 6;
		gbc_separator_2.insets = new Insets(0, 0, 5, 0);
		gbc_separator_2.gridx = 5;
		gbc_separator_2.gridy = 24;
		pnlReserva.add(separator_2, gbc_separator_2);

		JLabel lblNewLabel_1 = new JLabel("*Campo obligatorio");
		lblNewLabel_1.setForeground(new Color(204, 0, 0));
		lblNewLabel_1.setFont(new Font("Verdana", Font.PLAIN, 16));
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.gridwidth = 4;
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1.gridx = 2;
		gbc_lblNewLabel_1.gridy = 26;
		pnlReserva.add(lblNewLabel_1, gbc_lblNewLabel_1);

		JLabel lblNombre = new JLabel("Nombre*");
		lblNombre.setFont(new Font("Verdana", Font.PLAIN, 16));
		GridBagConstraints gbc_lblNombre = new GridBagConstraints();
		gbc_lblNombre.anchor = GridBagConstraints.EAST;
		gbc_lblNombre.gridwidth = 2;
		gbc_lblNombre.insets = new Insets(0, 0, 5, 5);
		gbc_lblNombre.gridx = 3;
		gbc_lblNombre.gridy = 27;
		pnlReserva.add(lblNombre, gbc_lblNombre);

		textNombre = new JTextField();
		textNombre.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		textNombre.setFont(new Font("Verdana", Font.PLAIN, 16));
		GridBagConstraints gbc_textNombre = new GridBagConstraints();
		gbc_textNombre.insets = new Insets(0, 0, 5, 5);
		gbc_textNombre.fill = GridBagConstraints.HORIZONTAL;
		gbc_textNombre.gridx = 5;
		gbc_textNombre.gridy = 27;
		pnlReserva.add(textNombre, gbc_textNombre);
		textNombre.setColumns(10);

		JLabel lblPrimerApellido = new JLabel("Apellidos*");
		lblPrimerApellido.setFont(new Font("Verdana", Font.PLAIN, 16));
		GridBagConstraints gbc_lblPrimerApellido = new GridBagConstraints();
		gbc_lblPrimerApellido.anchor = GridBagConstraints.EAST;
		gbc_lblPrimerApellido.gridwidth = 2;
		gbc_lblPrimerApellido.insets = new Insets(0, 0, 5, 5);
		gbc_lblPrimerApellido.gridx = 3;
		gbc_lblPrimerApellido.gridy = 28;
		pnlReserva.add(lblPrimerApellido, gbc_lblPrimerApellido);

		textApellidos = new JTextField();
		textApellidos.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		textApellidos.setFont(new Font("Verdana", Font.PLAIN, 16));
		textApellidos.setColumns(10);
		GridBagConstraints gbc_textApellidos = new GridBagConstraints();
		gbc_textApellidos.insets = new Insets(0, 0, 5, 5);
		gbc_textApellidos.fill = GridBagConstraints.HORIZONTAL;
		gbc_textApellidos.gridx = 5;
		gbc_textApellidos.gridy = 28;
		pnlReserva.add(textApellidos, gbc_textApellidos);

		JLabel lblCdi = new JLabel("Código postal");
		lblCdi.setFont(new Font("Verdana", Font.PLAIN, 16));
		GridBagConstraints gbc_lblCdi = new GridBagConstraints();
		gbc_lblCdi.anchor = GridBagConstraints.EAST;
		gbc_lblCdi.gridwidth = 3;
		gbc_lblCdi.insets = new Insets(0, 0, 5, 5);
		gbc_lblCdi.gridx = 2;
		gbc_lblCdi.gridy = 29;
		pnlReserva.add(lblCdi, gbc_lblCdi);

		textCodigoPostal = new JTextField();
		textCodigoPostal.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		textCodigoPostal.setFont(new Font("Verdana", Font.PLAIN, 16));
		textCodigoPostal.setColumns(10);
		GridBagConstraints gbc_textCodigoPostal = new GridBagConstraints();
		gbc_textCodigoPostal.insets = new Insets(0, 0, 5, 5);
		gbc_textCodigoPostal.fill = GridBagConstraints.HORIZONTAL;
		gbc_textCodigoPostal.gridx = 5;
		gbc_textCodigoPostal.gridy = 29;
		pnlReserva.add(textCodigoPostal, gbc_textCodigoPostal);

		JLabel lblTlefono = new JLabel("Teléfono");
		lblTlefono.setFont(new Font("Verdana", Font.PLAIN, 16));
		GridBagConstraints gbc_lblTlefono = new GridBagConstraints();
		gbc_lblTlefono.insets = new Insets(0, 0, 5, 5);
		gbc_lblTlefono.gridx = 4;
		gbc_lblTlefono.gridy = 30;
		pnlReserva.add(lblTlefono, gbc_lblTlefono);
		MaskFormatter formatoTlfno;
		try {
			formatoTlfno = new MaskFormatter("'(###')' ###' ###'");
			formatoTlfno.setPlaceholderCharacter('*');
			textTelefono = new JFormattedTextField(formatoTlfno);
			textTelefono.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		} catch (ParseException e) {
			e.printStackTrace();
		}

		textTelefono.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		textTelefono.setFont(new Font("Verdana", Font.PLAIN, 16));
		textTelefono.setColumns(10);
		GridBagConstraints gbc_textTelefono = new GridBagConstraints();
		gbc_textTelefono.insets = new Insets(0, 0, 5, 5);
		gbc_textTelefono.fill = GridBagConstraints.HORIZONTAL;
		gbc_textTelefono.gridx = 5;
		gbc_textTelefono.gridy = 30;
		pnlReserva.add(textTelefono, gbc_textTelefono);
		textTelefono.addFocusListener(new TextTelefonoFocusListener());

		JLabel lblTarjetaDeCredito = new JLabel("Tarjeta de crédito");
		lblTarjetaDeCredito.setFont(new Font("Verdana", Font.PLAIN, 16));
		GridBagConstraints gbc_lblTarjetaDeCredito = new GridBagConstraints();
		gbc_lblTarjetaDeCredito.anchor = GridBagConstraints.EAST;
		gbc_lblTarjetaDeCredito.gridwidth = 2;
		gbc_lblTarjetaDeCredito.insets = new Insets(0, 0, 5, 5);
		gbc_lblTarjetaDeCredito.gridx = 3;
		gbc_lblTarjetaDeCredito.gridy = 31;
		pnlReserva.add(lblTarjetaDeCredito, gbc_lblTarjetaDeCredito);

		MaskFormatter formatoTarj1;
		try {
			formatoTarj1 = new MaskFormatter(" ****' ****' ****' ****'");
			formatoTarj1.setPlaceholderCharacter('*');
			textTrajcred1 = new JFormattedTextField(formatoTarj1);
			textTrajcred1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
			textTrajcred1.setFont(new Font("Verdana", Font.PLAIN, 14));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		textTrajcred1.setFont(new Font("Verdana", Font.PLAIN, 16));
		textTrajcred1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		GridBagConstraints gbc_textTrajcred1 = new GridBagConstraints();
		gbc_textTrajcred1.anchor = GridBagConstraints.WEST;
		gbc_textTrajcred1.insets = new Insets(0, 0, 5, 5);
		gbc_textTrajcred1.gridx = 5;
		gbc_textTrajcred1.gridy = 31;
		pnlReserva.add(textTrajcred1, gbc_textTrajcred1);
		textTrajcred1.setColumns(10);
		textTrajcred1.addFocusListener(new textTrajcred1FocusListener());

		MaskFormatter formatoTarj12;
		try {
			formatoTarj12 = new MaskFormatter(" ###'");
			formatoTarj12.setPlaceholderCharacter('*');
			textTarjcred2 = new JFormattedTextField(formatoTarj12);
			textTarjcred2.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
			textTarjcred2.setFont(new Font("Verdana", Font.PLAIN, 14));
			textTarjcred2.setToolTipText("Introduzca CVC");
		} catch (ParseException e) {
			e.printStackTrace();
		}
		textTarjcred2.setFont(new Font("Verdana", Font.PLAIN, 16));
		textTarjcred2.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		GridBagConstraints gbc_textTarjcred2 = new GridBagConstraints();
		gbc_textTarjcred2.fill = GridBagConstraints.VERTICAL;
		gbc_textTarjcred2.insets = new Insets(0, 0, 5, 5);
		gbc_textTarjcred2.gridx = 6;
		gbc_textTarjcred2.gridy = 31;
		pnlReserva.add(textTarjcred2, gbc_textTarjcred2);
		textTarjcred2.setColumns(10);
		textTarjcred2.addFocusListener(new textTrajcred2FocusListener());

		JLabel lblCorreoElectrnico = new JLabel("Correo electrónico*");
		lblCorreoElectrnico.setFont(new Font("Verdana", Font.PLAIN, 16));
		GridBagConstraints gbc_lblCorreoElectrnico = new GridBagConstraints();
		gbc_lblCorreoElectrnico.anchor = GridBagConstraints.EAST;
		gbc_lblCorreoElectrnico.gridwidth = 4;
		gbc_lblCorreoElectrnico.insets = new Insets(0, 0, 5, 5);
		gbc_lblCorreoElectrnico.gridx = 1;
		gbc_lblCorreoElectrnico.gridy = 32;
		pnlReserva.add(lblCorreoElectrnico, gbc_lblCorreoElectrnico);

		textEmail = new JTextField();
		textEmail.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		textEmail.setFont(new Font("Verdana", Font.PLAIN, 16));
		textEmail.setColumns(10);
		GridBagConstraints gbc_textEmail = new GridBagConstraints();
		gbc_textEmail.gridwidth = 2;
		gbc_textEmail.insets = new Insets(0, 0, 5, 5);
		gbc_textEmail.fill = GridBagConstraints.HORIZONTAL;
		gbc_textEmail.gridx = 5;
		gbc_textEmail.gridy = 32;
		pnlReserva.add(textEmail, gbc_textEmail);
		textEmail.addFocusListener(new TextEmailFocusListener());

		lblEstado = new JLabel("");
		lblEstado.setForeground(new Color(204, 0, 0));
		lblEstado.setFont(new Font("Verdana", Font.BOLD, 16));
		GridBagConstraints gbc_lblEstado = new GridBagConstraints();
		gbc_lblEstado.gridheight = 2;
		gbc_lblEstado.gridwidth = 3;
		gbc_lblEstado.insets = new Insets(0, 0, 5, 5);
		gbc_lblEstado.gridx = 6;
		gbc_lblEstado.gridy = 33;
		pnlReserva.add(lblEstado, gbc_lblEstado);

		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new BtnCancelarActionListener());
		btnCancelar.setFont(new Font("Verdana", Font.BOLD, 20));
		btnCancelar.setBackground(new Color(244, 165, 0));
		GridBagConstraints gbc_btnCancelar = new GridBagConstraints();
		gbc_btnCancelar.insets = new Insets(0, 0, 5, 5);
		btnCancelar.setBorder(new RoundedBorder(10));
		gbc_btnCancelar.gridx = 3;
		gbc_btnCancelar.gridy = 35;
		pnlReserva.add(btnCancelar, gbc_btnCancelar);

		JButton btnReservar = new JButton("Reservar");
		btnReservar.addActionListener(new BtnReservarActionListener());
		btnReservar.setFont(new Font("Verdana", Font.BOLD, 20));
		btnReservar.setBackground(new Color(244, 164, 96));
		GridBagConstraints gbc_btnReservar = new GridBagConstraints();
		gbc_btnReservar.anchor = GridBagConstraints.EAST;
		gbc_btnReservar.insets = new Insets(0, 0, 5, 5);
		btnReservar.setBorder(new RoundedBorder(10));
		gbc_btnReservar.gridx = 7;
		gbc_btnReservar.gridy = 35;
		pnlReserva.add(btnReservar, gbc_btnReservar);

		textAreaInfoAdic.addFocusListener(new textAreaInfoAdicFocusListener());
		textApellidos.addFocusListener(new TextApellidosFocusListener());
		textNombre.addFocusListener(new TextNombreFocusListener());
		textCodigoPostal.addFocusListener(new TxtCodigoPostalFocusListener());

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

	private class TxtCodigoPostalFocusListener extends FocusAdapter {
		@Override
		public void focusGained(FocusEvent e) {
			e.getComponent().setBackground(colorResaltado);
		}

		@Override
		public void focusLost(FocusEvent e) {
			e.getComponent().setBackground(colorBlanco);
		}
	}

	private class BtnReservarActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if (textNombre.getText().equals("") || textApellidos.getText().equals("") || textEmail.getText().equals("")
					|| textTarjcred2.getText().equals("") || textTrajcred1.getText().equals("")) {
				lblEstado.setText("Introduzca los datos obligatorios");
			} else {
				lblEstado.setForeground(Color.GREEN);
				lblEstado.setText("Reserva realizada");
				textNombre.setText(null);
				textApellidos.setText(null);
				textTarjcred2.setText(null);
				textTrajcred1.setText(null);
				textEmail.setText(null);
				textTelefono.setText(null);
				textAreaInfoAdic.setText(null);
				textCodigoPostal.setText(null);

			}
		}
	}

	private class BtnCancelarActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			textNombre.setText(null);
			textApellidos.setText(null);
			textTarjcred2.setText(null);
			textTrajcred1.setText(null);
			textEmail.setText(null);
			textTelefono.setText(null);
			textAreaInfoAdic.setText(null);
			textCodigoPostal.setText(null);
			buttonGroup.clearSelection();
		}
	}

	public class RoundedBorder implements Border {

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

}
