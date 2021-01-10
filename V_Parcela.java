package presentacion;

import javax.swing.JPanel;


import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.GridBagLayout;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Component;

import javax.swing.JScrollPane;

import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;

import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JSlider;
import javax.swing.JComboBox;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import com.toedter.calendar.JDateChooser;

import presentacion.V_RutaElegida.RoundedBorder;

import javax.swing.JTextArea;
import javax.swing.border.Border;
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

		JLabel lblNewLabel = new JLabel(MessagesV_Parcela.getString("V_Parcela.lblNewLabel.text")); //$NON-NLS-1$
		lblNewLabel.setFont(new Font("Verdana", Font.BOLD, 16)); //$NON-NLS-1$
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

		JLabel lblSalida = new JLabel(MessagesV_Parcela.getString("V_Parcela.lblSalida.text")); //$NON-NLS-1$
		lblSalida.setFont(new Font("Verdana", Font.BOLD, 16)); //$NON-NLS-1$
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

		JLabel lblPrecio = new JLabel(MessagesV_Parcela.getString("V_Parcela.lblPrecio.text")); //$NON-NLS-1$
		lblPrecio.setFont(new Font("Verdana", Font.BOLD, 14)); //$NON-NLS-1$
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
		sliderPrecio.setFont(new Font("Verdana", Font.PLAIN, 16)); //$NON-NLS-1$
		GridBagConstraints gbc_sliderPrecio = new GridBagConstraints();
		gbc_sliderPrecio.fill = GridBagConstraints.HORIZONTAL;
		gbc_sliderPrecio.insets = new Insets(0, 0, 5, 5);
		gbc_sliderPrecio.gridx = 1;
		gbc_sliderPrecio.gridy = 6;
		panel_2.add(sliderPrecio, gbc_sliderPrecio);

		JLabel lblNewLabel_4 = new JLabel(""); //$NON-NLS-1$
		lblNewLabel_4.setIcon(new ImageIcon(V_Parcela.class.getResource("/presentacion/IconEuro.png"))); //$NON-NLS-1$
		GridBagConstraints gbc_lblNewLabel_4 = new GridBagConstraints();
		gbc_lblNewLabel_4.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_4.gridx = 2;
		gbc_lblNewLabel_4.gridy = 6;
		panel_2.add(lblNewLabel_4, gbc_lblNewLabel_4);

		JLabel lblNewLabel_3 = new JLabel(MessagesV_Parcela.getString("V_Parcela.lblNewLabel_3.text")); //$NON-NLS-1$
		lblNewLabel_3.setFont(new Font("Verdana", Font.BOLD, 14)); //$NON-NLS-1$
		GridBagConstraints gbc_lblNewLabel_3 = new GridBagConstraints();
		gbc_lblNewLabel_3.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel_3.fill = GridBagConstraints.VERTICAL;
		gbc_lblNewLabel_3.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_3.gridx = 1;
		gbc_lblNewLabel_3.gridy = 8;
		panel_2.add(lblNewLabel_3, gbc_lblNewLabel_3);

		JComboBox comboBox = new JComboBox();
		comboBox.setModel(
				new DefaultComboBoxModel(new String[] {MessagesV_Parcela.getString("V_Parcela.6"), MessagesV_Parcela.getString("V_Parcela.7"), MessagesV_Parcela.getString("V_Parcela.8"), MessagesV_Parcela.getString("V_Parcela.9"), MessagesV_Parcela.getString("V_Parcela.10")})); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$
		comboBox.setFont(new Font("Verdana", Font.PLAIN, 14)); //$NON-NLS-1$
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
		
		JLabel lblParcela1 = new JLabel(""); //$NON-NLS-1$
		lblParcela1.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null)); //$NON-NLS-1$
		lblParcela1.setIcon(new ImageIcon(V_Parcela.class.getResource("/presentacion/Parcela1.jpg"))); //$NON-NLS-1$
		GridBagConstraints gbc_lblParcela1 = new GridBagConstraints();
		gbc_lblParcela1.insets = new Insets(0, 0, 5, 5);
		gbc_lblParcela1.gridx = 1;
		gbc_lblParcela1.gridy = 1;
		pnlParcelas.add(lblParcela1, gbc_lblParcela1);
		
		JTextArea txtAParcela1 = new JTextArea();
		txtAParcela1.setFont(new Font("Verdana", Font.PLAIN, 9)); //$NON-NLS-1$
		txtAParcela1.setText(MessagesV_Parcela.getString("V_Parcela.txtAParcela1.text")); //$NON-NLS-1$
		txtAParcela1.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null)); //$NON-NLS-1$
		txtAParcela1.setEditable(false);
		txtAParcela1.setLineWrap(true);
		GridBagConstraints gbc_txtAParcela1 = new GridBagConstraints();
		gbc_txtAParcela1.insets = new Insets(0, 0, 5, 5);
		gbc_txtAParcela1.fill = GridBagConstraints.BOTH;
		gbc_txtAParcela1.gridx = 2;
		gbc_txtAParcela1.gridy = 1;
		
		pnlParcelas.add(txtAParcela1, gbc_txtAParcela1);
		
		JButton btnReservarParcela1 = new JButton(MessagesV_Parcela.getString("V_Parcela.btnReservarParcela1.text")); //$NON-NLS-1$
		btnReservarParcela1.setFont(new Font("Verdana", Font.BOLD, 16)); //$NON-NLS-1$
		GridBagConstraints gbc_btnReservarParcela1 = new GridBagConstraints();
		gbc_btnReservarParcela1.gridwidth = 2;
		gbc_btnReservarParcela1.fill = GridBagConstraints.BOTH;
		gbc_btnReservarParcela1.insets = new Insets(0, 0, 5, 5);
		gbc_btnReservarParcela1.gridx = 1;
		gbc_btnReservarParcela1.gridy = 2;
		btnReservarParcela1.setBorder(new RoundedBorder(10));
		btnReservarParcela1.addActionListener(new BtnActionListener());
		btnReservarParcela1.setBackground(new Color(255, 165, 0));
		pnlParcelas.add(btnReservarParcela1, gbc_btnReservarParcela1);
		
		JLabel lblParcela2 = new JLabel(""); //$NON-NLS-1$
		lblParcela2.setIcon(new ImageIcon(V_Parcela.class.getResource("/presentacion/Parcela2.jpg"))); //$NON-NLS-1$
		GridBagConstraints gbc_lblParcela2 = new GridBagConstraints();
		gbc_lblParcela2.insets = new Insets(0, 0, 5, 5);
		gbc_lblParcela2.gridx = 1;
		gbc_lblParcela2.gridy = 4;
		pnlParcelas.add(lblParcela2, gbc_lblParcela2);
		
		JTextArea txtAParcela2 = new JTextArea();
		txtAParcela2.setFont(new Font("Verdana", Font.PLAIN, 9)); //$NON-NLS-1$
		txtAParcela2.setText(MessagesV_Parcela.getString("V_Parcela.txtAParcela2.text")); //$NON-NLS-1$
		txtAParcela2.setLineWrap(true);
		txtAParcela2.setEditable(false);
		txtAParcela2.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null)); //$NON-NLS-1$
		GridBagConstraints gbc_txtAParcela2 = new GridBagConstraints();
		gbc_txtAParcela2.insets = new Insets(0, 0, 5, 5);
		gbc_txtAParcela2.fill = GridBagConstraints.BOTH;
		gbc_txtAParcela2.gridx = 2;
		gbc_txtAParcela2.gridy = 4;
		pnlParcelas.add(txtAParcela2, gbc_txtAParcela2);
		
		JButton btnReservarParcela2 = new JButton(MessagesV_Parcela.getString("V_Parcela.btnReservarParcela2.text")); //$NON-NLS-1$
		btnReservarParcela2.setFont(new Font("Verdana", Font.BOLD, 16)); //$NON-NLS-1$
		GridBagConstraints gbc_btnReservarParcela2 = new GridBagConstraints();
		gbc_btnReservarParcela2.fill = GridBagConstraints.BOTH;
		gbc_btnReservarParcela2.gridwidth = 2;
		gbc_btnReservarParcela2.insets = new Insets(0, 0, 5, 5);
		gbc_btnReservarParcela2.gridx = 1;
		gbc_btnReservarParcela2.gridy = 5;
		btnReservarParcela2.setBorder(new RoundedBorder(10));
		btnReservarParcela2.addActionListener(new BtnActionListener());
		btnReservarParcela2.addActionListener(new BtnActionListener());
		btnReservarParcela2.setBackground(new Color(255, 165, 0));
		pnlParcelas.add(btnReservarParcela2, gbc_btnReservarParcela2);
		
		JLabel lblParcela3 = new JLabel(""); //$NON-NLS-1$
		lblParcela3.setIcon(new ImageIcon(V_Parcela.class.getResource("/presentacion/Parcela3.jpg"))); //$NON-NLS-1$
		GridBagConstraints gbc_lblParcela3 = new GridBagConstraints();
		gbc_lblParcela3.insets = new Insets(0, 0, 5, 5);
		gbc_lblParcela3.gridx = 1;
		gbc_lblParcela3.gridy = 7;
		pnlParcelas.add(lblParcela3, gbc_lblParcela3);
		
		JTextArea txtAParcela3 = new JTextArea();
		txtAParcela3.setFont(new Font("Verdana", Font.PLAIN, 9)); //$NON-NLS-1$
		txtAParcela3.setText(MessagesV_Parcela.getString("V_Parcela.txtAParcela3.text")); //$NON-NLS-1$
		txtAParcela3.setLineWrap(true);
		txtAParcela3.setEditable(false);
		txtAParcela3.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null)); //$NON-NLS-1$
		GridBagConstraints gbc_txtAParcela3 = new GridBagConstraints();
		gbc_txtAParcela3.insets = new Insets(0, 0, 5, 5);
		gbc_txtAParcela3.fill = GridBagConstraints.BOTH;
		gbc_txtAParcela3.gridx = 2;
		gbc_txtAParcela3.gridy = 7;
		
		pnlParcelas.add(txtAParcela3, gbc_txtAParcela3);
		
		JButton btnReservarParcela3 = new JButton(MessagesV_Parcela.getString("V_Parcela.btnReservarParcela3.text")); //$NON-NLS-1$
		btnReservarParcela3.setFont(new Font("Verdana", Font.BOLD, 16)); //$NON-NLS-1$
		GridBagConstraints gbc_btnReservarParcela3 = new GridBagConstraints();
		gbc_btnReservarParcela3.fill = GridBagConstraints.BOTH;
		gbc_btnReservarParcela3.gridwidth = 2;
		gbc_btnReservarParcela3.insets = new Insets(0, 0, 5, 5);
		gbc_btnReservarParcela3.gridx = 1;
		gbc_btnReservarParcela3.gridy = 8;
		btnReservarParcela3.setBorder(new RoundedBorder(10));
		btnReservarParcela3.addActionListener(new BtnActionListener());
		btnReservarParcela3.addActionListener(new BtnActionListener());
		btnReservarParcela3.setBackground(new Color(255, 165, 0));
		pnlParcelas.add(btnReservarParcela3, gbc_btnReservarParcela3);
		
		JLabel lblParcela4 = new JLabel(""); //$NON-NLS-1$
		lblParcela4.setIcon(new ImageIcon(V_Parcela.class.getResource("/presentacion/Parcela4.jpg"))); //$NON-NLS-1$
		GridBagConstraints gbc_lblParcela4 = new GridBagConstraints();
		gbc_lblParcela4.insets = new Insets(0, 0, 5, 5);
		gbc_lblParcela4.gridx = 1;
		gbc_lblParcela4.gridy = 10;
		pnlParcelas.add(lblParcela4, gbc_lblParcela4);
		
		JTextArea txtAParcela4 = new JTextArea();
		txtAParcela4.setFont(new Font("Verdana", Font.PLAIN, 9)); //$NON-NLS-1$
		txtAParcela4.setText(MessagesV_Parcela.getString("V_Parcela.txtAParcela4.text")); //$NON-NLS-1$
		txtAParcela4.setLineWrap(true);
		txtAParcela4.setEditable(false);
		txtAParcela4.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null)); //$NON-NLS-1$
		GridBagConstraints gbc_txtAParcela4 = new GridBagConstraints();
		gbc_txtAParcela4.insets = new Insets(0, 0, 5, 5);
		gbc_txtAParcela4.fill = GridBagConstraints.BOTH;
		gbc_txtAParcela4.gridx = 2;
		gbc_txtAParcela4.gridy = 10;
		pnlParcelas.add(txtAParcela4, gbc_txtAParcela4);
		
		JButton btnReservarParcela4 = new JButton(MessagesV_Parcela.getString("V_Parcela.btnReservarParcela4.text")); //$NON-NLS-1$
		btnReservarParcela4.setFont(new Font("Verdana", Font.BOLD, 16)); //$NON-NLS-1$
		GridBagConstraints gbc_btnReservarParcela4 = new GridBagConstraints();
		gbc_btnReservarParcela4.fill = GridBagConstraints.BOTH;
		gbc_btnReservarParcela4.gridwidth = 2;
		gbc_btnReservarParcela4.insets = new Insets(0, 0, 5, 5);
		gbc_btnReservarParcela4.gridx = 1;
		gbc_btnReservarParcela4.gridy = 11;
		btnReservarParcela4.setBorder(new RoundedBorder(10));
		btnReservarParcela4.addActionListener(new BtnActionListener());
		btnReservarParcela4.addActionListener(new BtnActionListener());
		btnReservarParcela4.setBackground(new Color(255, 165, 0));
		pnlParcelas.add(btnReservarParcela4, gbc_btnReservarParcela4);
		
		JLabel lblParcela5 = new JLabel(""); //$NON-NLS-1$
		lblParcela5.setIcon(new ImageIcon(V_Parcela.class.getResource("/presentacion/101.jpg"))); //$NON-NLS-1$
		GridBagConstraints gbc_lblParcela5 = new GridBagConstraints();
		gbc_lblParcela5.insets = new Insets(0, 0, 5, 5);
		gbc_lblParcela5.gridx = 1;
		gbc_lblParcela5.gridy = 13;
		pnlParcelas.add(lblParcela5, gbc_lblParcela5);
		
		JTextArea txtAParcela5 = new JTextArea();
		txtAParcela5.setText(MessagesV_Parcela.getString("V_Parcela.txtAParcela5.text")); //$NON-NLS-1$
		txtAParcela5.setFont(new Font("Verdana", Font.PLAIN, 9)); //$NON-NLS-1$
		txtAParcela5.setLineWrap(true);
		txtAParcela5.setEditable(false);
		txtAParcela5.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null)); //$NON-NLS-1$
		GridBagConstraints gbc_txtAParcela5 = new GridBagConstraints();
		gbc_txtAParcela5.insets = new Insets(0, 0, 5, 5);
		gbc_txtAParcela5.fill = GridBagConstraints.BOTH;
		gbc_txtAParcela5.gridx = 2;
		gbc_txtAParcela5.gridy = 13;
		pnlParcelas.add(txtAParcela5, gbc_txtAParcela5);
		
		JButton btnReservarParcela5 = new JButton(MessagesV_Parcela.getString("V_Parcela.btnReservarParcela5.text")); //$NON-NLS-1$
		btnReservarParcela5.setFont(new Font("Verdana", Font.BOLD, 16)); //$NON-NLS-1$
		GridBagConstraints gbc_btnReservarParcela5 = new GridBagConstraints();
		gbc_btnReservarParcela5.fill = GridBagConstraints.BOTH;
		gbc_btnReservarParcela5.gridwidth = 2;
		gbc_btnReservarParcela5.insets = new Insets(0, 0, 5, 5);
		gbc_btnReservarParcela5.gridx = 1;
		gbc_btnReservarParcela5.gridy = 14;
		btnReservarParcela5.setBorder(new RoundedBorder(10));
		btnReservarParcela1.addActionListener(new BtnActionListener());
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
			cl.show(pnlContenido, "reservar"); //$NON-NLS-1$
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
	private static class __Tmp {
		private static void __tmp() {
			  javax.swing.JPanel __wbp_panel = new javax.swing.JPanel();
		}
	}
}