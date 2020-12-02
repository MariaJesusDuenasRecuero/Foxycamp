package presentacion;

import javax.swing.JPanel;
import java.awt.Rectangle;
import java.awt.SystemColor;
import java.awt.GridBagLayout;
import javax.swing.BoxLayout;
import java.awt.BorderLayout;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JSlider;
import javax.swing.JSpinner;
import javax.swing.SpinnerListModel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class V_Parcela extends JPanel {
	private JTextField txtEntrada;
	private JTextField txtSalida;

	/**
	 * Create the panel.
	 */
	public V_Parcela() {
		setBackground(SystemColor.controlHighlight);
		setBounds(new Rectangle(0, 0, 800, 517));
		setLayout(new BorderLayout(0, 0));
		
		JPanel pnlDatos = new JPanel();
		add(pnlDatos, BorderLayout.WEST);
		GridBagLayout gbl_pnlDatos = new GridBagLayout();
		gbl_pnlDatos.columnWidths = new int[]{86, 0, 50, 0, 86, 0};
		gbl_pnlDatos.rowHeights = new int[]{100, 0, 35, 35, 0, 35, 35, 0, 35, 0, 0, 35, 100, 0};
		gbl_pnlDatos.columnWeights = new double[]{0.0, 1.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_pnlDatos.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		pnlDatos.setLayout(gbl_pnlDatos);
		
		JLabel lblFEntrada = new JLabel("Fecha de entrada");
		lblFEntrada.setFont(new Font("Verdana", Font.BOLD, 16));
		GridBagConstraints gbc_lblFEntrada = new GridBagConstraints();
		gbc_lblFEntrada.anchor = GridBagConstraints.WEST;
		gbc_lblFEntrada.insets = new Insets(0, 0, 5, 5);
		gbc_lblFEntrada.gridx = 1;
		gbc_lblFEntrada.gridy = 1;
		pnlDatos.add(lblFEntrada, gbc_lblFEntrada);
		
		txtEntrada = new JTextField();
		txtEntrada.setFont(new Font("Verdana", Font.PLAIN, 16));
		GridBagConstraints gbc_txtEntrada = new GridBagConstraints();
		gbc_txtEntrada.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtEntrada.insets = new Insets(0, 0, 5, 5);
		gbc_txtEntrada.anchor = GridBagConstraints.SOUTH;
		gbc_txtEntrada.gridx = 1;
		gbc_txtEntrada.gridy = 2;
		pnlDatos.add(txtEntrada, gbc_txtEntrada);
		txtEntrada.setColumns(10);
		
		JLabel lblCalendario = new JLabel("");
		lblCalendario.setIcon(new ImageIcon(V_Parcela.class.getResource("/presentacion/IconCalendario.png")));
		GridBagConstraints gbc_lblCalendario = new GridBagConstraints();
		gbc_lblCalendario.insets = new Insets(0, 0, 5, 5);
		gbc_lblCalendario.gridx = 2;
		gbc_lblCalendario.gridy = 2;
		pnlDatos.add(lblCalendario, gbc_lblCalendario);
		
		JLabel lblFLlegada = new JLabel("Fecha de salida");
		lblFLlegada.setFont(new Font("Verdana", Font.BOLD, 16));
		GridBagConstraints gbc_lblFLlegada = new GridBagConstraints();
		gbc_lblFLlegada.anchor = GridBagConstraints.WEST;
		gbc_lblFLlegada.insets = new Insets(0, 0, 5, 5);
		gbc_lblFLlegada.gridx = 1;
		gbc_lblFLlegada.gridy = 4;
		pnlDatos.add(lblFLlegada, gbc_lblFLlegada);
		
		txtSalida = new JTextField();
		txtSalida.setFont(new Font("Verdana", Font.BOLD, 16));
		GridBagConstraints gbc_txtSalida = new GridBagConstraints();
		gbc_txtSalida.insets = new Insets(0, 0, 5, 5);
		gbc_txtSalida.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtSalida.gridx = 1;
		gbc_txtSalida.gridy = 5;
		pnlDatos.add(txtSalida, gbc_txtSalida);
		txtSalida.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(V_Parcela.class.getResource("/presentacion/IconCalendario.png")));
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 2;
		gbc_lblNewLabel.gridy = 5;
		pnlDatos.add(lblNewLabel, gbc_lblNewLabel);
		
		JLabel lblPrecio = new JLabel("Precio");
		lblPrecio.setFont(new Font("Verdana", Font.BOLD, 16));
		GridBagConstraints gbc_lblPrecio = new GridBagConstraints();
		gbc_lblPrecio.anchor = GridBagConstraints.WEST;
		gbc_lblPrecio.insets = new Insets(0, 0, 5, 5);
		gbc_lblPrecio.gridx = 1;
		gbc_lblPrecio.gridy = 7;
		pnlDatos.add(lblPrecio, gbc_lblPrecio);
		
		JSlider slider = new JSlider();
		slider.setValue(225);
		slider.setMinimum(50);
		slider.setMaximum(500);
		GridBagConstraints gbc_slider = new GridBagConstraints();
		gbc_slider.fill = GridBagConstraints.HORIZONTAL;
		gbc_slider.insets = new Insets(0, 0, 5, 5);
		gbc_slider.gridx = 1;
		gbc_slider.gridy = 8;
		pnlDatos.add(slider, gbc_slider);
		
		JLabel lblIconEuro = new JLabel("");
		lblIconEuro.setIcon(new ImageIcon(V_Parcela.class.getResource("/presentacion/IconEuro.png")));
		GridBagConstraints gbc_lblIconEuro = new GridBagConstraints();
		gbc_lblIconEuro.insets = new Insets(0, 0, 5, 5);
		gbc_lblIconEuro.gridx = 2;
		gbc_lblIconEuro.gridy = 8;
		pnlDatos.add(lblIconEuro, gbc_lblIconEuro);
		
		JLabel lblTParcela = new JLabel("Tipo de parcela");
		lblTParcela.setFont(new Font("Verdana", Font.BOLD, 16));
		GridBagConstraints gbc_lblTParcela = new GridBagConstraints();
		gbc_lblTParcela.anchor = GridBagConstraints.WEST;
		gbc_lblTParcela.insets = new Insets(0, 0, 5, 5);
		gbc_lblTParcela.gridx = 1;
		gbc_lblTParcela.gridy = 10;
		pnlDatos.add(lblTParcela, gbc_lblTParcela);
		
		JComboBox comboBox_Parcela = new JComboBox();
		comboBox_Parcela.setFont(new Font("Verdana", Font.PLAIN, 16));
		comboBox_Parcela.setModel(new DefaultComboBoxModel(new String[] {"Pequeña", "Mediana", "Grande", "Deluxe", "Con auto"}));
		GridBagConstraints gbc_comboBox_Parcela = new GridBagConstraints();
		gbc_comboBox_Parcela.insets = new Insets(0, 0, 5, 5);
		gbc_comboBox_Parcela.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox_Parcela.gridx = 1;
		gbc_comboBox_Parcela.gridy = 11;
		pnlDatos.add(comboBox_Parcela, gbc_comboBox_Parcela);
		
		JPanel pnlParcelas = new JPanel();
		add(pnlParcelas, BorderLayout.CENTER);
		
		JScrollPane scrollPane = new JScrollPane();
		pnlParcelas.add(scrollPane);
		V_Parcela p = new V_Parcela();

	}
}
