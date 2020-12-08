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
		add(panel, BorderLayout.CENTER);
		panel.setLayout(new BorderLayout(0, 0));

		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_1.setBounds(new Rectangle(0, 0, 800, 530));
		panel.add(panel_1, BorderLayout.EAST);
		GridBagLayout gbl_panel_1 = new GridBagLayout();
		gbl_panel_1.columnWidths = new int[] { 0, 0, 140, 145, 100, 25, 0 };
		gbl_panel_1.rowHeights = new int[] { 50, 130, 0, 0, 0, 0, 0, 0, 50, 0 };
		gbl_panel_1.columnWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
		gbl_panel_1.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, Double.MIN_VALUE };
		panel_1.setLayout(gbl_panel_1);

		JScrollBar scrollBar = new JScrollBar();
		GridBagConstraints gbc_scrollBar = new GridBagConstraints();
		gbc_scrollBar.fill = GridBagConstraints.VERTICAL;
		gbc_scrollBar.gridheight = 9;
		gbc_scrollBar.anchor = GridBagConstraints.EAST;
		gbc_scrollBar.gridx = 5;
		gbc_scrollBar.gridy = 0;
		panel_1.add(scrollBar, gbc_scrollBar);

		JLabel lblNewLabel_6 = new JLabel("");
		lblNewLabel_6.setIcon(new ImageIcon(V_Parcela.class.getResource("/presentacion/Parcela1.jpg")));
		GridBagConstraints gbc_lblNewLabel_6 = new GridBagConstraints();
		gbc_lblNewLabel_6.fill = GridBagConstraints.VERTICAL;
		gbc_lblNewLabel_6.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_6.gridx = 1;
		gbc_lblNewLabel_6.gridy = 1;
		panel_1.add(lblNewLabel_6, gbc_lblNewLabel_6);
		
		JEditorPane editorPane = new JEditorPane();
		editorPane.setBackground(SystemColor.menu);
		editorPane.setEditable(false);
		GridBagConstraints gbc_editorPane = new GridBagConstraints();
		gbc_editorPane.gridwidth = 3;
		gbc_editorPane.insets = new Insets(0, 0, 5, 5);
		gbc_editorPane.fill = GridBagConstraints.BOTH;
		gbc_editorPane.gridx = 2;
		gbc_editorPane.gridy = 1;
		panel_1.add(editorPane, gbc_editorPane);

		JButton btnReservar = new JButton("Reservar");
		btnReservar.setBackground(new Color(255, 140, 0));
		GridBagConstraints gbc_btnReservar = new GridBagConstraints();
		gbc_btnReservar.fill = GridBagConstraints.BOTH;
		gbc_btnReservar.insets = new Insets(0, 0, 5, 5);
		gbc_btnReservar.gridx = 4;
		gbc_btnReservar.gridy = 2;
		panel_1.add(btnReservar, gbc_btnReservar);

		JPanel panel_2 = new JPanel();
		panel_2.setBounds(new Rectangle(0, 0, 75, 500));
		panel.add(panel_2, BorderLayout.WEST);
		GridBagLayout gbl_panel_2 = new GridBagLayout();
		gbl_panel_2.columnWidths = new int[] { 50, 155, 70, 0, 0 };
		gbl_panel_2.rowHeights = new int[] { 100, 0, 50, 0, 50, 0, 0, 50, 0, 0, 100, 0 };
		gbl_panel_2.columnWeights = new double[] { 0.0, 1.0, 0.0, 0.0, Double.MIN_VALUE };
		gbl_panel_2.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
				Double.MIN_VALUE };
		panel_2.setLayout(gbl_panel_2);

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
				new DefaultComboBoxModel(new String[] { "Pequeña", "Mediana", "Grande", "Deluxe", "Con auto" }));
		comboBox.setFont(new Font("Verdana", Font.PLAIN, 14));
		GridBagConstraints gbc_comboBox = new GridBagConstraints();
		gbc_comboBox.insets = new Insets(0, 0, 5, 5);
		gbc_comboBox.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox.gridx = 2;
		gbc_comboBox.gridy = 8;
		panel_2.add(comboBox, gbc_comboBox);
		GridBagConstraints gbc_separator_3 = new GridBagConstraints();
		gbc_separator_3.anchor = GridBagConstraints.WEST;
		gbc_separator_3.insets = new Insets(0, 0, 0, 5);
		gbc_separator_3.gridx = 0;
		gbc_separator_3.gridy = 3;
	}
}
