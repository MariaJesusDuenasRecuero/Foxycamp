package presentacion;

import javax.swing.JPanel;


import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.GridBagLayout;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;

import javax.swing.JScrollPane;

import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;

import java.awt.Font;
import javax.swing.JSlider;
import javax.swing.JComboBox;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import com.toedter.calendar.JDateChooser;
import javax.swing.JTextArea;
import javax.swing.border.TitledBorder;

public class V_Parcela extends JPanel {
	private JSlider sliderPrecio;
	private JScrollPane scrollPane;
	private JPanel pnlContenido;
	/**
	 * Create the panel.
	 */
	public V_Parcela(JPanel referenciaPnlContenido) {
		pnlContenido = referenciaPnlContenido;
		setBackground(Color.LIGHT_GRAY);
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
		gbl_panel_2.columnWidths = new int[] { 25, 177, 70, 35, 0 };
		gbl_panel_2.rowHeights = new int[] { 100, 0, 50, 0, 50, 0, 0, 50, 0, 0, 100, 0 };
		gbl_panel_2.columnWeights = new double[] { 0.0, 1.0, 0.0, 0.0, Double.MIN_VALUE };
		gbl_panel_2.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
				Double.MIN_VALUE };
		panel_2.setLayout(gbl_panel_2);
		
		JSeparator separator = new JSeparator();
		separator.setOrientation(SwingConstants.VERTICAL);
		GridBagConstraints gbc_separator = new GridBagConstraints();
		gbc_separator.gridheight = 11;
		gbc_separator.insets = new Insets(0, 0, 5, 0);
		gbc_separator.gridx = 3;
		gbc_separator.gridy = 0;
		panel_2.add(separator, gbc_separator);

		JLabel lblNewLabel = new JLabel("Fecha entrada");
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
		lblNewLabel_4.setIcon(new ImageIcon(V_Parcela.class.getResource("/presentacion/IconEuro.png")));
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
		
	    scrollPane = new JScrollPane();
		scrollPane.setAutoscrolls(true);
		scrollPane.setBackground(Color.WHITE);
		panel.add(scrollPane, BorderLayout.CENTER);
		scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		
		JPanel pnlParcelas = new JPanel();
		pnlParcelas.setBackground(Color.WHITE);
		scrollPane.setViewportView(pnlParcelas);
		GridBagLayout gbl_pnlParcelas = new GridBagLayout();
		gbl_pnlParcelas.columnWidths = new int[]{40, 0, 0, 35, 0};
		gbl_pnlParcelas.rowHeights = new int[]{35, 144, 35, 30, 144, 35, 30, 144, 35, 30, 144, 0, 25, 144, 0, 0, 0, 0};
		gbl_pnlParcelas.columnWeights = new double[]{0.0, 0.0, 1.0, 0.0, Double.MIN_VALUE};
		gbl_pnlParcelas.rowWeights = new double[]{0.0, 1.0, 0.0, 0.0, 1.0, 0.0, 0.0, 1.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		pnlParcelas.setLayout(gbl_pnlParcelas);
		
		JLabel lblParcela1 = new JLabel("");
		lblParcela1.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		lblParcela1.setIcon(new ImageIcon(V_Parcela.class.getResource("/presentacion/Parcela1.jpg")));
		GridBagConstraints gbc_lblParcela1 = new GridBagConstraints();
		gbc_lblParcela1.insets = new Insets(0, 0, 5, 5);
		gbc_lblParcela1.gridx = 1;
		gbc_lblParcela1.gridy = 1;
		pnlParcelas.add(lblParcela1, gbc_lblParcela1);
		
		JTextArea txtAParcela1 = new JTextArea();
		txtAParcela1.setFont(new Font("Verdana", Font.PLAIN, 9));
		txtAParcela1.setText("El RK Catalina Lofts se encuentra en Las Palmas de Gran Canaria, a 2,3 km de la playa del Confital y a 200 metros del parque de Santa Catalina, y ofrece WiFi gratuita y aire acondicionado. Este apartamento ocupa un edificio que data de 2018 y se encuentra a 1,7 km del parque Romano y a 2 km del auditorio Alfredo Kraus.\r\n\r\nEl apartamento cuenta con 1 dormitorio, TV de pantalla plana, cocina equipada con microondas y nevera, lavadora y baño con ducha.\r\n\r\nEntre los lugares de interés cercanos al apartamento se incluyen el centro comercial El Muelle, el acuario Poema Del Mar y el puerto de Las Palmas.");
		txtAParcela1.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		txtAParcela1.setEditable(false);
		txtAParcela1.setLineWrap(true);
		GridBagConstraints gbc_txtAParcela1 = new GridBagConstraints();
		gbc_txtAParcela1.insets = new Insets(0, 0, 5, 5);
		gbc_txtAParcela1.fill = GridBagConstraints.BOTH;
		gbc_txtAParcela1.gridx = 2;
		gbc_txtAParcela1.gridy = 1;
		
		pnlParcelas.add(txtAParcela1, gbc_txtAParcela1);
		
		JButton btnReservarParcela1 = new JButton("Reservar");
		btnReservarParcela1.setFont(new Font("Verdana", Font.BOLD, 16));
		GridBagConstraints gbc_btnReservarParcela1 = new GridBagConstraints();
		gbc_btnReservarParcela1.gridwidth = 2;
		gbc_btnReservarParcela1.fill = GridBagConstraints.BOTH;
		gbc_btnReservarParcela1.insets = new Insets(0, 0, 5, 5);
		gbc_btnReservarParcela1.gridx = 1;
		gbc_btnReservarParcela1.gridy = 2;
		btnReservarParcela1.addActionListener(new BtnActionListener());
		btnReservarParcela1.setBackground(new Color(255, 165, 0));
		pnlParcelas.add(btnReservarParcela1, gbc_btnReservarParcela1);
		
		JLabel lblParcela2 = new JLabel("");
		lblParcela2.setIcon(new ImageIcon(V_Parcela.class.getResource("/presentacion/Parcela2.jpg")));
		GridBagConstraints gbc_lblParcela2 = new GridBagConstraints();
		gbc_lblParcela2.insets = new Insets(0, 0, 5, 5);
		gbc_lblParcela2.gridx = 1;
		gbc_lblParcela2.gridy = 4;
		pnlParcelas.add(lblParcela2, gbc_lblParcela2);
		
		JTextArea txtAParcela2 = new JTextArea();
		txtAParcela2.setFont(new Font("Verdana", Font.PLAIN, 9));
		txtAParcela2.setText("La Casa El Mirador se encuentra en Teruel, Aragón, y ofrece patio y vistas al jardín. El establecimiento se encuentra a 2,7 km del parque Dinópolis y dispone de jardín y aparcamiento privado gratuito.\r\nLa casa cuenta con 3 dormitorios independientes y cocina con lavavajillas, microondas y zona de comedor.\r\n\r\nEn las inmediaciones se puede practicar ciclismo. Además, hay solárium.");
		txtAParcela2.setLineWrap(true);
		txtAParcela2.setEditable(false);
		txtAParcela2.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		GridBagConstraints gbc_txtAParcela2 = new GridBagConstraints();
		gbc_txtAParcela2.insets = new Insets(0, 0, 5, 5);
		gbc_txtAParcela2.fill = GridBagConstraints.BOTH;
		gbc_txtAParcela2.gridx = 2;
		gbc_txtAParcela2.gridy = 4;
		pnlParcelas.add(txtAParcela2, gbc_txtAParcela2);
		
		JButton btnReservarParcela2 = new JButton("Reservar");
		btnReservarParcela2.setFont(new Font("Verdana", Font.BOLD, 16));
		GridBagConstraints gbc_btnReservarParcela2 = new GridBagConstraints();
		gbc_btnReservarParcela2.fill = GridBagConstraints.BOTH;
		gbc_btnReservarParcela2.gridwidth = 2;
		gbc_btnReservarParcela2.insets = new Insets(0, 0, 5, 5);
		gbc_btnReservarParcela2.gridx = 1;
		gbc_btnReservarParcela2.gridy = 5;
		btnReservarParcela2.addActionListener(new BtnActionListener());
		btnReservarParcela2.setBackground(new Color(255, 165, 0));
		pnlParcelas.add(btnReservarParcela2, gbc_btnReservarParcela2);
		
		JLabel lblParcela3 = new JLabel("");
		lblParcela3.setIcon(new ImageIcon(V_Parcela.class.getResource("/presentacion/Parcela3.jpg")));
		GridBagConstraints gbc_lblParcela3 = new GridBagConstraints();
		gbc_lblParcela3.insets = new Insets(0, 0, 5, 5);
		gbc_lblParcela3.gridx = 1;
		gbc_lblParcela3.gridy = 7;
		pnlParcelas.add(lblParcela3, gbc_lblParcela3);
		
		JTextArea txtAParcela3 = new JTextArea();
		txtAParcela3.setFont(new Font("Verdana", Font.PLAIN, 9));
		txtAParcela3.setText("La Casa La Finca se encuentra en Vigo y ofrece jardín, zona de barbacoa, WiFi gratuita y vistas al jardín. El establecimiento tiene vistas a la montaña y está a 500 metros de la playa de Samil y a 8 km de la estación marítima.\r\n\r\nEsta casa cuenta con 2 dormitorios, cocina con microondas, TV de pantalla plana, zona de estar y baño con ducha.\r\n\r\nEn los alrededores se puede pescar.\r\n\r\nEl Museo del Mar de Galicia se encuentra a 2,5 km de la casa, mientras que la sede de Comisiones Obreras está a 2,7 km. El aeropuerto más cercano es el de Vigo, ubicado a 12 km de la Casa La Finca. El establecimiento ofrece un servicio de enlace con el aeropuerto por un suplemento.");
		txtAParcela3.setLineWrap(true);
		txtAParcela3.setEditable(false);
		txtAParcela3.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		GridBagConstraints gbc_txtAParcela3 = new GridBagConstraints();
		gbc_txtAParcela3.insets = new Insets(0, 0, 5, 5);
		gbc_txtAParcela3.fill = GridBagConstraints.BOTH;
		gbc_txtAParcela3.gridx = 2;
		gbc_txtAParcela3.gridy = 7;
		
		pnlParcelas.add(txtAParcela3, gbc_txtAParcela3);
		
		JButton btnReservarParcela3 = new JButton("Reservar");
		btnReservarParcela3.setFont(new Font("Verdana", Font.BOLD, 16));
		GridBagConstraints gbc_btnReservarParcela3 = new GridBagConstraints();
		gbc_btnReservarParcela3.fill = GridBagConstraints.BOTH;
		gbc_btnReservarParcela3.gridwidth = 2;
		gbc_btnReservarParcela3.insets = new Insets(0, 0, 5, 5);
		gbc_btnReservarParcela3.gridx = 1;
		gbc_btnReservarParcela3.gridy = 8;
		btnReservarParcela3.addActionListener(new BtnActionListener());
		btnReservarParcela3.setBackground(new Color(255, 165, 0));
		pnlParcelas.add(btnReservarParcela3, gbc_btnReservarParcela3);
		
		JLabel lblParcela4 = new JLabel("");
		lblParcela4.setIcon(new ImageIcon(V_Parcela.class.getResource("/presentacion/Parcela4.jpg")));
		GridBagConstraints gbc_lblParcela4 = new GridBagConstraints();
		gbc_lblParcela4.insets = new Insets(0, 0, 5, 5);
		gbc_lblParcela4.gridx = 1;
		gbc_lblParcela4.gridy = 10;
		pnlParcelas.add(lblParcela4, gbc_lblParcela4);
		
		JTextArea txtAParcela4 = new JTextArea();
		txtAParcela4.setFont(new Font("Verdana", Font.PLAIN, 9));
		txtAParcela4.setText("El CAN JOAN está situado en Palma de Mallorca, a 1,5 km de la playa de Es Calonet des Fornàs y a 12 km del puerto de Palma, y ofrece alojamiento con conexión WiFi gratuita, aire acondicionado, piscina al aire libre de temporada y jardín. El establecimiento cuenta con piscina privada.\r\n\r\nLa casa cuenta con 5 dormitorios, TV de pantalla plana con canales vía satélite, cocina equipada con lavavajillas y microondas, lavadora y 3 baños con bidet.\r\n\r\nLa casa cuenta con barbacoa y terraza.");
		txtAParcela4.setLineWrap(true);
		txtAParcela4.setEditable(false);
		txtAParcela4.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		GridBagConstraints gbc_txtAParcela4 = new GridBagConstraints();
		gbc_txtAParcela4.insets = new Insets(0, 0, 5, 5);
		gbc_txtAParcela4.fill = GridBagConstraints.BOTH;
		gbc_txtAParcela4.gridx = 2;
		gbc_txtAParcela4.gridy = 10;
		pnlParcelas.add(txtAParcela4, gbc_txtAParcela4);
		
		JButton btnReservarParcela4 = new JButton("Reservar");
		btnReservarParcela4.setFont(new Font("Verdana", Font.BOLD, 16));
		GridBagConstraints gbc_btnReservarParcela4 = new GridBagConstraints();
		gbc_btnReservarParcela4.fill = GridBagConstraints.BOTH;
		gbc_btnReservarParcela4.gridwidth = 2;
		gbc_btnReservarParcela4.insets = new Insets(0, 0, 5, 5);
		gbc_btnReservarParcela4.gridx = 1;
		gbc_btnReservarParcela4.gridy = 11;
		btnReservarParcela4.addActionListener(new BtnActionListener());
		btnReservarParcela4.setBackground(new Color(255, 165, 0));
		pnlParcelas.add(btnReservarParcela4, gbc_btnReservarParcela4);
		
		JLabel lblParcela5 = new JLabel("");
		lblParcela5.setIcon(new ImageIcon(V_Parcela.class.getResource("/presentacion/101.jpg")));
		GridBagConstraints gbc_lblParcela5 = new GridBagConstraints();
		gbc_lblParcela5.insets = new Insets(0, 0, 5, 5);
		gbc_lblParcela5.gridx = 1;
		gbc_lblParcela5.gridy = 13;
		pnlParcelas.add(lblParcela5, gbc_lblParcela5);
		
		JTextArea txtAParcela5 = new JTextArea();
		txtAParcela5.setText("La Casa cercana a Santa Catalina se encuentra en Palma de Mallorca y ofrece alojamiento con aire acondicionado y patio. Esta casa cuenta con jardín, zona de barbacoa, conexión WiFi gratuita y aparcamiento privado gratuito.\r\nEsta casa cuenta con 2 dormitorios, sala de estar, TV de pantalla plana, cocina equipada con zona de comedor y 2 baños con ducha y lavadora.\r\nLa casa tiene terraza.\r\n\r\n");
		txtAParcela5.setFont(new Font("Verdana", Font.PLAIN, 9));
		txtAParcela5.setLineWrap(true);
		txtAParcela5.setEditable(false);
		txtAParcela5.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		GridBagConstraints gbc_txtAParcela5 = new GridBagConstraints();
		gbc_txtAParcela5.insets = new Insets(0, 0, 5, 5);
		gbc_txtAParcela5.fill = GridBagConstraints.BOTH;
		gbc_txtAParcela5.gridx = 2;
		gbc_txtAParcela5.gridy = 13;
		pnlParcelas.add(txtAParcela5, gbc_txtAParcela5);
		
		JButton btnReservarParcela5 = new JButton("Reservar");
		btnReservarParcela5.setFont(new Font("Verdana", Font.BOLD, 16));
		GridBagConstraints gbc_btnReservarParcela5 = new GridBagConstraints();
		gbc_btnReservarParcela5.fill = GridBagConstraints.BOTH;
		gbc_btnReservarParcela5.gridwidth = 2;
		gbc_btnReservarParcela5.insets = new Insets(0, 0, 5, 5);
		gbc_btnReservarParcela5.gridx = 1;
		gbc_btnReservarParcela5.gridy = 14;
		btnReservarParcela5.setBackground(new Color(255, 165, 0));
		btnReservarParcela5.addActionListener(new BtnActionListener());
		pnlParcelas.add(btnReservarParcela5, gbc_btnReservarParcela5);
		
		GridBagConstraints gbc_separator_3 = new GridBagConstraints();
		gbc_separator_3.anchor = GridBagConstraints.WEST;
		gbc_separator_3.insets = new Insets(0, 0, 0, 5);
		gbc_separator_3.gridx = 0;
		gbc_separator_3.gridy = 3;
	}
	private class BtnActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			CardLayout cl = (CardLayout)(pnlContenido.getLayout());
			cl.show(pnlContenido, "reservar");
		}
	}
	
	private static class __Tmp {
		private static void __tmp() {
			  javax.swing.JPanel __wbp_panel = new javax.swing.JPanel();
		}
	}
}