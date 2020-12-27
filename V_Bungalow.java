package presentacion;

import javax.swing.JPanel;
import java.awt.Rectangle;
import java.awt.SystemColor;
import java.awt.GridBagLayout;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;

import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JLabel;
import javax.swing.border.BevelBorder;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JSlider;
import javax.swing.JSpinner;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.border.SoftBevelBorder;



import com.toedter.calendar.JCalendar;

import java.awt.BorderLayout;
import javax.swing.JScrollBar;
import javax.swing.SpinnerListModel;
import javax.swing.JEditorPane;
import javax.swing.JTextPane;
import javax.swing.JButton;
import com.toedter.calendar.JDateChooser;
import javax.swing.JTextArea;

public class V_Bungalow extends JPanel {

	private JSlider sliderPrecio;
	

	/**
	 * Create the panel.
	 */
	public V_Bungalow() {
		setBackground(Color.WHITE);
		setBounds(new Rectangle(10, 50, 1001, 530));
		setLayout(new BorderLayout(0, 0));

		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		add(panel, BorderLayout.CENTER);
		panel.setLayout(new BorderLayout(0, 0));

		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.WHITE);
		panel_2.setBounds(new Rectangle(0, 0, 75, 500));
		panel.add(panel_2, BorderLayout.WEST);
		GridBagLayout gbl_panel_2 = new GridBagLayout();
		gbl_panel_2.columnWidths = new int[] { 25, 155, 70, 35, 0 };
		gbl_panel_2.rowHeights = new int[] { 100, 0, 50, 0, 50, 0, 0, 50, 0, 0, 100, 0 };
		gbl_panel_2.columnWeights = new double[] { 0.0, 1.0, 0.0, 0.0, Double.MIN_VALUE };
		gbl_panel_2.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
				Double.MIN_VALUE };
		panel_2.setLayout(gbl_panel_2);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setOrientation(SwingConstants.VERTICAL);
		GridBagConstraints gbc_separator_2 = new GridBagConstraints();
		gbc_separator_2.gridheight = 11;
		gbc_separator_2.insets = new Insets(0, 0, 5, 0);
		gbc_separator_2.gridx = 3;
		gbc_separator_2.gridy = 0;
		panel_2.add(separator_2, gbc_separator_2);

		JLabel lblNewLabel = new JLabel("Fecha llegada");
		lblNewLabel.setFont(new Font("Verdana", Font.BOLD, 16));
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 1;
		gbc_lblNewLabel.gridy = 1;
		panel_2.add(lblNewLabel, gbc_lblNewLabel);

		JDateChooser dateChooser = new JDateChooser();
		GridBagConstraints gbc_dateChooser = new GridBagConstraints();
		gbc_dateChooser.insets = new Insets(0, 0, 5, 5);
		gbc_dateChooser.fill = GridBagConstraints.BOTH;
		gbc_dateChooser.gridx = 2;
		gbc_dateChooser.gridy = 1;
		panel_2.add(dateChooser, gbc_dateChooser);

		JLabel lblSalida = new JLabel("Fecha salida");
		lblSalida.setFont(new Font("Verdana", Font.BOLD, 16));
		GridBagConstraints gbc_lblSalida = new GridBagConstraints();
		gbc_lblSalida.anchor = GridBagConstraints.WEST;
		gbc_lblSalida.insets = new Insets(0, 0, 5, 5);
		gbc_lblSalida.gridx = 1;
		gbc_lblSalida.gridy = 3;
		panel_2.add(lblSalida, gbc_lblSalida);

		JDateChooser dateChooser_1 = new JDateChooser();
		GridBagConstraints gbc_dateChooser_1 = new GridBagConstraints();
		gbc_dateChooser_1.insets = new Insets(0, 0, 5, 5);
		gbc_dateChooser_1.fill = GridBagConstraints.BOTH;
		gbc_dateChooser_1.gridx = 2;
		gbc_dateChooser_1.gridy = 3;
		panel_2.add(dateChooser_1, gbc_dateChooser_1);

		JLabel lblPrecio = new JLabel("Precio");
		lblPrecio.setFont(new Font("Verdana", Font.BOLD, 14));
		GridBagConstraints gbc_lblPrecio = new GridBagConstraints();
		gbc_lblPrecio.anchor = GridBagConstraints.WEST;
		gbc_lblPrecio.insets = new Insets(0, 0, 5, 5);
		gbc_lblPrecio.gridx = 1;
		gbc_lblPrecio.gridy = 5;
		panel_2.add(lblPrecio, gbc_lblPrecio);

		sliderPrecio = new JSlider(JSlider.HORIZONTAL, 50, 500, 250);
		sliderPrecio.setBackground(Color.WHITE);
		sliderPrecio.setValue(50);
		sliderPrecio.setMaximum(550);
		sliderPrecio.setMinimum(50);
		sliderPrecio.setMajorTickSpacing(250);
		sliderPrecio.setSnapToTicks(true);
		sliderPrecio.setPaintTicks(true);
		sliderPrecio.setPaintLabels(true);
		sliderPrecio.setFont(new Font("Verdana", Font.PLAIN, 16));
		GridBagConstraints gbc_sliderPrecio = new GridBagConstraints();
		gbc_sliderPrecio.fill = GridBagConstraints.HORIZONTAL;
		gbc_sliderPrecio.insets = new Insets(0, 0, 5, 5);
		gbc_sliderPrecio.gridx = 1;
		gbc_sliderPrecio.gridy = 6;
		panel_2.add(sliderPrecio, gbc_sliderPrecio);

		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(new ImageIcon(V_Bungalow.class.getResource("/presentacion/IconEuro.png")));
		GridBagConstraints gbc_lblNewLabel_4 = new GridBagConstraints();
		gbc_lblNewLabel_4.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_4.gridx = 2;
		gbc_lblNewLabel_4.gridy = 6;
		panel_2.add(lblNewLabel_4, gbc_lblNewLabel_4);

		JLabel lblNewLabel_3 = new JLabel("Tipo");
		lblNewLabel_3.setFont(new Font("Verdana", Font.BOLD, 14));
		GridBagConstraints gbc_lblNewLabel_3 = new GridBagConstraints();
		gbc_lblNewLabel_3.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel_3.fill = GridBagConstraints.VERTICAL;
		gbc_lblNewLabel_3.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_3.gridx = 1;
		gbc_lblNewLabel_3.gridy = 8;
		panel_2.add(lblNewLabel_3, gbc_lblNewLabel_3);

		JComboBox comboBox = new JComboBox();
		comboBox.setModel(
				new DefaultComboBoxModel(new String[] {"Pequeña", "Mediana", "Grande", "Deluxe", "Con auto"}));
		comboBox.setFont(new Font("Verdana", Font.PLAIN, 14));
		GridBagConstraints gbc_comboBox = new GridBagConstraints();
		gbc_comboBox.insets = new Insets(0, 0, 5, 5);
		gbc_comboBox.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox.gridx = 2;
		gbc_comboBox.gridy = 8;
		panel_2.add(comboBox, gbc_comboBox);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel.add(scrollPane, BorderLayout.CENTER);
		
		JPanel panelBungalow = new JPanel();
		scrollPane.setViewportView(panelBungalow);
		panelBungalow.setLayout(null);
		
		JLabel lblBungalow1 = new JLabel("");
		lblBungalow1.setIcon(new ImageIcon(V_Bungalow.class.getResource("/presentacion/Bungalow1.jpg")));
		lblBungalow1.setBounds(10, 11, 141, 133);
		panelBungalow.add(lblBungalow1);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 150, 569, 9);
		panelBungalow.add(separator);
		
		JLabel lblBungalow2 = new JLabel("");
		lblBungalow2.setIcon(new ImageIcon(V_Bungalow.class.getResource("/presentacion/Bungalow2.jpg")));
		lblBungalow2.setBounds(10, 155, 141, 133);
		panelBungalow.add(lblBungalow2);
		
		JSeparator separator1 = new JSeparator();
		separator1.setBounds(10, 294, 561, 9);
		panelBungalow.add(separator1);
		
		JLabel lblBungalow3 = new JLabel("");
		lblBungalow3.setIcon(new ImageIcon(V_Bungalow.class.getResource("/presentacion/Bungalow3.jpg")));
		lblBungalow3.setBounds(10, 299, 141, 133);
		panelBungalow.add(lblBungalow3);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(10, 438, 561, 9);
		panelBungalow.add(separator_1);
		
		JLabel lblBungalow4 = new JLabel("");
		lblBungalow4.setIcon(new ImageIcon(V_Bungalow.class.getResource("/presentacion/Bungalow4.jpg")));
		lblBungalow4.setBounds(10, 443, 135, 133);
		panelBungalow.add(lblBungalow4);
		
		JTextArea textAreaBungalow1 = new JTextArea();
		textAreaBungalow1.setText("El RK Catalina Lofts se encuentra en Las Palmas de Gran Canaria, a 2,3 km de la playa del Confital .Ofrece WiFi gratuita y aire acondicionado. \r\nEl apartamento cuenta con 1 dormitorio, TV de pantalla plana, cocina equipada con microondas y nevera, lavadora y baño con ducha.Entre los lugares de interés cercanos al apartamento se incluyen el centro comercial El Muelle, el acuario Poema Del Mar y el puerto de Las Palmas.");
		textAreaBungalow1.setLineWrap(true);
		textAreaBungalow1.setFont(new Font("Verdana", Font.PLAIN, 10));
		textAreaBungalow1.setEditable(false);
		textAreaBungalow1.setAutoscrolls(false);
		textAreaBungalow1.setBounds(161, 11, 418, 102);
		panelBungalow.add(textAreaBungalow1);
		
		JButton btnBungalow1 = new JButton("Reservar");
		btnBungalow1.setFont(new Font("Verdana", Font.PLAIN, 16));
		btnBungalow1.setBackground(new Color(255, 165, 0));
		btnBungalow1.setBounds(161, 114, 418, 23);
		panelBungalow.add(btnBungalow1);
		
		JTextArea textAreaBungalow2 = new JTextArea();
		textAreaBungalow2.setText("El RK Catalina Lofts se encuentra en Las Palmas de Gran Canaria, a 2,3 km de la playa del Confital .Ofrece WiFi gratuita y aire acondicionado. \r\nEl apartamento cuenta con 1 dormitorio, TV de pantalla plana, cocina equipada con microondas y nevera, lavadora y baño con ducha.Entre los lugares de interés cercanos al apartamento se incluyen el centro comercial El Muelle, el acuario Poema Del Mar y el puerto de Las Palmas.");
		textAreaBungalow2.setLineWrap(true);
		textAreaBungalow2.setFont(new Font("Verdana", Font.PLAIN, 10));
		textAreaBungalow2.setEditable(false);
		textAreaBungalow2.setAutoscrolls(false);
		textAreaBungalow2.setBounds(161, 162, 418, 102);
		panelBungalow.add(textAreaBungalow2);
		
		JButton btnBungalow2 = new JButton("Reservar");
		btnBungalow2.setFont(new Font("Verdana", Font.PLAIN, 16));
		btnBungalow2.setBackground(new Color(255, 165, 0));
		btnBungalow2.setBounds(161, 265, 418, 23);
		panelBungalow.add(btnBungalow2);
		
		JTextArea textAreaBungalow3 = new JTextArea();
		textAreaBungalow3.setText("El RK Catalina Lofts se encuentra en Las Palmas de Gran Canaria, a 2,3 km de la playa del Confital .Ofrece WiFi gratuita y aire acondicionado. \r\nEl apartamento cuenta con 1 dormitorio, TV de pantalla plana, cocina equipada con microondas y nevera, lavadora y baño con ducha.Entre los lugares de interés cercanos al apartamento se incluyen el centro comercial El Muelle, el acuario Poema Del Mar y el puerto de Las Palmas.");
		textAreaBungalow3.setLineWrap(true);
		textAreaBungalow3.setFont(new Font("Verdana", Font.PLAIN, 10));
		textAreaBungalow3.setEditable(false);
		textAreaBungalow3.setAutoscrolls(false);
		textAreaBungalow3.setBounds(161, 306, 418, 102);
		panelBungalow.add(textAreaBungalow3);
		
		JButton btnBungalow2_1 = new JButton("Reservar");
		btnBungalow2_1.setFont(new Font("Verdana", Font.PLAIN, 16));
		btnBungalow2_1.setBackground(new Color(255, 165, 0));
		btnBungalow2_1.setBounds(161, 409, 418, 23);
		panelBungalow.add(btnBungalow2_1);
		
		JTextArea textAreaBungalow3_1 = new JTextArea();
		textAreaBungalow3_1.setText("El RK Catalina Lofts se encuentra en Las Palmas de Gran Canaria, a 2,3 km de la playa del Confital .Ofrece WiFi gratuita y aire acondicionado. \r\nEl apartamento cuenta con 1 dormitorio, TV de pantalla plana, cocina equipada con microondas y nevera, lavadora y baño con ducha.Entre los lugares de interés cercanos al apartamento se incluyen el centro comercial El Muelle, el acuario Poema Del Mar y el puerto de Las Palmas.");
		textAreaBungalow3_1.setLineWrap(true);
		textAreaBungalow3_1.setFont(new Font("Verdana", Font.PLAIN, 10));
		textAreaBungalow3_1.setEditable(false);
		textAreaBungalow3_1.setAutoscrolls(false);
		textAreaBungalow3_1.setBounds(161, 446, 418, 102);
		panelBungalow.add(textAreaBungalow3_1);
		GridBagConstraints gbc_separator_3 = new GridBagConstraints();
		gbc_separator_3.anchor = GridBagConstraints.WEST;
		gbc_separator_3.insets = new Insets(0, 0, 0, 5);
		gbc_separator_3.gridx = 0;
		gbc_separator_3.gridy = 3;

	}
}