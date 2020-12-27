package presentacion;

import javax.swing.JPanel;
import javax.swing.JScrollBar;

import java.awt.Rectangle;
import java.awt.SystemColor;
import java.awt.GridBagLayout;
import javax.swing.BoxLayout;
import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JScrollPane;
import javax.swing.JTextField;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;

import java.awt.Font;
import javax.swing.JSlider;
import javax.swing.JSpinner;
import javax.swing.SpinnerListModel;
import javax.swing.JComboBox;
import javax.swing.JEditorPane;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import javax.swing.border.BevelBorder;
import javax.swing.border.SoftBevelBorder;

import com.toedter.calendar.JDateChooser;
import javax.swing.JTextPane;
import javax.swing.JTextArea;

public class V_Parcela extends JPanel {
	private JTextField txtLlegada;
	private JTextField txtSAlida;
	private final JSeparator separator_3 = new JSeparator();
	private JSlider sliderPrecio;

	/**
	 * Create the panel.
	 */
	public V_Parcela() {
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
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setAutoscrolls(true);
		scrollPane.setBackground(Color.WHITE);
		scrollPane.setViewportBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel.add(scrollPane, BorderLayout.CENTER);
		
		JPanel pnlParcelas = new JPanel();
		pnlParcelas.setBounds(new Rectangle(0, 0, 0, 900));
		scrollPane.setViewportView(pnlParcelas);
		pnlParcelas.setLayout(null);
		
		JLabel lblParcela2 = new JLabel("");
		lblParcela2.setIcon(new ImageIcon(V_Parcela.class.getResource("/presentacion/Parcela2.jpg")));
		lblParcela2.setBounds(10, 20, 149, 130);
		pnlParcelas.add(lblParcela2);
		
		JButton btnParcela2 = new JButton("Reservar");
		btnParcela2.setBackground(new Color(255, 165, 0));
		btnParcela2.setFont(new Font("Verdana", Font.PLAIN, 16));
		btnParcela2.setBounds(169, 127, 418, 23);
		pnlParcelas.add(btnParcela2);
		
		JLabel lblParcela3 = new JLabel("");
		lblParcela3.setIcon(new ImageIcon(V_Parcela.class.getResource("/presentacion/Parcela3.jpg")));
		lblParcela3.setBounds(10, 177, 149, 130);
		pnlParcelas.add(lblParcela3);
		
		JTextArea textAreaParcela3 = new JTextArea();
		textAreaParcela3.setFont(new Font("Verdana", Font.PLAIN, 10));
		textAreaParcela3.setText("La Casa El Mirador se encuentra en Teruel, Aragón, y ofrece patio y vistas al jardín. El establecimiento se encuentra a 2,7 km del parque Dinópolis y dispone de jardín y aparcamiento privado gratuito.\r\nLa casa cuenta con 3 dormitorios independientes y cocina con lavavajillas, microondas y zona de comedor.\r\nEn las inmediaciones se puede practicar ciclismo. Además, hay solárium.");
		textAreaParcela3.setAutoscrolls(false);
		textAreaParcela3.setLineWrap(true);
		textAreaParcela3.setEditable(false);
		textAreaParcela3.setBounds(169, 179, 418, 102);
		pnlParcelas.add(textAreaParcela3);
		
		JButton btnParcela3 = new JButton("Reservar");
		btnParcela3.setFont(new Font("Verdana", Font.PLAIN, 16));
		btnParcela3.setBackground(new Color(255, 165, 0));
		btnParcela3.setBounds(169, 282, 418, 23);
		pnlParcelas.add(btnParcela3);
		
		JLabel lblParcela4 = new JLabel("");
		lblParcela4.setIcon(new ImageIcon(V_Parcela.class.getResource("/presentacion/Parcela4.jpg")));
		lblParcela4.setBounds(10, 318, 149, 130);
		pnlParcelas.add(lblParcela4);
		
		JTextArea textAreaParcela2 = new JTextArea();
		textAreaParcela2.setFont(new Font("Verdana", Font.PLAIN, 10));
		textAreaParcela2.setText("El RK Catalina Lofts se encuentra en Las Palmas de Gran Canaria, a 2,3 km de la playa del Confital .Ofrece WiFi gratuita y aire acondicionado. \r\nEl apartamento cuenta con 1 dormitorio, TV de pantalla plana, cocina equipada con microondas y nevera, lavadora y baño con ducha.Entre los lugares de interés cercanos al apartamento se incluyen el centro comercial El Muelle, el acuario Poema Del Mar y el puerto de Las Palmas.");
		textAreaParcela2.setAutoscrolls(false);
		textAreaParcela2.setLineWrap(true);
		textAreaParcela2.setEditable(false);
		textAreaParcela2.setBounds(169, 24, 418, 102);
		pnlParcelas.add(textAreaParcela2);
		
		JTextArea textAreaParcela4 = new JTextArea();
		textAreaParcela4.setFont(new Font("Verdana", Font.PLAIN, 10));
		textAreaParcela4.setText("El CAN JOAN está situado en Palma de Mallorca, a 1,5 km de la playa de Es Calonet des Fornàs y a 12 km del puerto de Palma, y ofrece alojamiento con conexión WiFi gratuita, aire acondicionado, piscina al aire libre de temporada y jardín. El establecimiento cuenta con piscina privada.\r\nLa casa cuenta con 5 dormitorios, TV de pantalla plana con canales vía satélite, cocina equipada con lavavajillas y microondas, lavadora y 3 baños con bidet.\r\nLa casa cuenta con barbacoa y terraza.");
		textAreaParcela4.setAutoscrolls(false);
		textAreaParcela4.setLineWrap(true);
		textAreaParcela4.setEditable(false);
		textAreaParcela4.setBounds(169, 318, 418, 102);
		pnlParcelas.add(textAreaParcela4);
		
		JButton btnParcela4 = new JButton("Reservar");
		btnParcela4.setFont(new Font("Verdana", Font.PLAIN, 16));
		btnParcela4.setBackground(new Color(255, 165, 0));
		btnParcela4.setBounds(169, 421, 418, 23);
		pnlParcelas.add(btnParcela4);
		
		JLabel lblParcela1 = new JLabel("");
		lblParcela1.setIcon(new ImageIcon(V_Parcela.class.getResource("/presentacion/Parcela1.jpg")));
		lblParcela1.setBounds(10, 474, 149, 130);
		pnlParcelas.add(lblParcela1);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(10, 162, 577, 23);
		pnlParcelas.add(separator_1);
		
		JSeparator separator2 = new JSeparator();
		separator2.setBounds(10, 313, 573, 23);
		pnlParcelas.add(separator2);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(10, 459, 573, 2);
		pnlParcelas.add(separator_2);
		
		JTextArea txtrCercaDeLa = new JTextArea();
		txtrCercaDeLa.setEditable(false);
		txtrCercaDeLa.setFont(new Font("Verdana", Font.PLAIN, 10));
		txtrCercaDeLa.setLineWrap(true);
		txtrCercaDeLa.setText("Cerca de la Casa cercana hay varios lugares de interés. El establecimiento A Santa Catalina alberga el club náutico de Palma, el Pueblo Español Mallorca y la discoteca Pacha Mallorca. El aeropuerto más cercano es el de Palma de Mallorca, ubicado a 11 km.");
		txtrCercaDeLa.setAutoscrolls(false);
		txtrCercaDeLa.setBounds(169, 472, 418, 66);
		pnlParcelas.add(txtrCercaDeLa);
		GridBagConstraints gbc_separator_3 = new GridBagConstraints();
		gbc_separator_3.anchor = GridBagConstraints.WEST;
		gbc_separator_3.insets = new Insets(0, 0, 0, 5);
		gbc_separator_3.gridx = 0;
		gbc_separator_3.gridy = 3;
	}
	private static class __Tmp {
		private static void __tmp() {
			  javax.swing.JPanel __wbp_panel = new javax.swing.JPanel();
		}
	}
}