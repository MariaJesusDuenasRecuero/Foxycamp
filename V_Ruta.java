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

public class V_Ruta extends JPanel {
	private JTextField txtLlegada;
	private JTextField txtSAlida;
	private final JSeparator separator_3 = new JSeparator();

	/**
	 * Create the panel.
	 */
	public V_Ruta() {
		setBackground(Color.LIGHT_GRAY);
		setBounds(new Rectangle(10, 50, 1001, 530));
		setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		add(panel, BorderLayout.CENTER);
		panel.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_1 = new JPanel();
		panel.add(panel_1, BorderLayout.NORTH);
		GridBagLayout gbl_panel_1 = new GridBagLayout();
		gbl_panel_1.columnWidths = new int[]{55, 260, 55, 199, 55, 260, 55, 0};
		gbl_panel_1.rowHeights = new int[]{31, 171, 31, 0, 160, 37, 54, 0};
		gbl_panel_1.columnWeights = new double[]{0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panel_1.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel_1.setLayout(gbl_panel_1);
		
		JLabel lblRuta1 = new JLabel("");
		lblRuta1.setIcon(new ImageIcon(V_Ruta.class.getResource("/presentacion/Ruta.jpg")));
		GridBagConstraints gbc_lblRuta1 = new GridBagConstraints();
		gbc_lblRuta1.insets = new Insets(0, 0, 5, 5);
		gbc_lblRuta1.gridx = 1;
		gbc_lblRuta1.gridy = 1;
		panel_1.add(lblRuta1, gbc_lblRuta1);
		
		JLabel lblRuta2 = new JLabel("");
		lblRuta2.setIcon(new ImageIcon(V_Ruta.class.getResource("/presentacion/Ruta2.jpg")));
		GridBagConstraints gbc_lblRuta2 = new GridBagConstraints();
		gbc_lblRuta2.insets = new Insets(0, 0, 5, 5);
		gbc_lblRuta2.gridx = 3;
		gbc_lblRuta2.gridy = 1;
		panel_1.add(lblRuta2, gbc_lblRuta2);
		
		JLabel lblRuta3 = new JLabel("");
		lblRuta3.setIcon(new ImageIcon(V_Ruta.class.getResource("/presentacion/Ruta3.png")));
		GridBagConstraints gbc_lblRuta3 = new GridBagConstraints();
		gbc_lblRuta3.insets = new Insets(0, 0, 5, 5);
		gbc_lblRuta3.gridx = 5;
		gbc_lblRuta3.gridy = 1;
		panel_1.add(lblRuta3, gbc_lblRuta3);
		
		JLabel lblNombreRuta1 = new JLabel("RUTA X");
		lblNombreRuta1.setForeground(new Color(218, 165, 32));
		lblNombreRuta1.setFont(new Font("Verdana", Font.BOLD, 14));
		GridBagConstraints gbc_lblNombreRuta1 = new GridBagConstraints();
		gbc_lblNombreRuta1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNombreRuta1.gridx = 1;
		gbc_lblNombreRuta1.gridy = 2;
		panel_1.add(lblNombreRuta1, gbc_lblNombreRuta1);
		
		JLabel lblNombreRuta2 = new JLabel("RUTA Y");
		lblNombreRuta2.setFont(new Font("Verdana", Font.BOLD, 14));
		lblNombreRuta2.setForeground(new Color(218, 165, 32));
		GridBagConstraints gbc_lblNombreRuta2 = new GridBagConstraints();
		gbc_lblNombreRuta2.insets = new Insets(0, 0, 5, 5);
		gbc_lblNombreRuta2.gridx = 3;
		gbc_lblNombreRuta2.gridy = 2;
		panel_1.add(lblNombreRuta2, gbc_lblNombreRuta2);
		
		JLabel lblNombreRuta3 = new JLabel("RUTA O");
		lblNombreRuta3.setFont(new Font("Verdana", Font.BOLD, 14));
		lblNombreRuta3.setForeground(new Color(218, 165, 32));
		GridBagConstraints gbc_lblNombreRuta3 = new GridBagConstraints();
		gbc_lblNombreRuta3.insets = new Insets(0, 0, 5, 5);
		gbc_lblNombreRuta3.gridx = 5;
		gbc_lblNombreRuta3.gridy = 2;
		panel_1.add(lblNombreRuta3, gbc_lblNombreRuta3);
		
		JLabel lblRuta4 = new JLabel("");
		lblRuta4.setIcon(new ImageIcon(V_Ruta.class.getResource("/presentacion/Ruta5.png")));
		GridBagConstraints gbc_lblRuta4 = new GridBagConstraints();
		gbc_lblRuta4.insets = new Insets(0, 0, 5, 5);
		gbc_lblRuta4.gridx = 1;
		gbc_lblRuta4.gridy = 4;
		panel_1.add(lblRuta4, gbc_lblRuta4);
		
		JLabel lblRuta5 = new JLabel("");
		GridBagConstraints gbc_lblRuta5 = new GridBagConstraints();
		gbc_lblRuta5.insets = new Insets(0, 0, 5, 5);
		gbc_lblRuta5.gridx = 3;
		gbc_lblRuta5.gridy = 4;
		panel_1.add(lblRuta5, gbc_lblRuta5);
		
		JLabel lblRuta6 = new JLabel("");
		GridBagConstraints gbc_lblRuta6 = new GridBagConstraints();
		gbc_lblRuta6.insets = new Insets(0, 0, 5, 5);
		gbc_lblRuta6.gridx = 5;
		gbc_lblRuta6.gridy = 4;
		panel_1.add(lblRuta6, gbc_lblRuta6);
		
		JLabel lblNombreRuta4 = new JLabel("RUTA F");
		lblNombreRuta4.setFont(new Font("Verdana", Font.BOLD, 14));
		lblNombreRuta4.setForeground(new Color(218, 165, 32));
		GridBagConstraints gbc_lblNombreRuta4 = new GridBagConstraints();
		gbc_lblNombreRuta4.insets = new Insets(0, 0, 5, 5);
		gbc_lblNombreRuta4.gridx = 1;
		gbc_lblNombreRuta4.gridy = 5;
		panel_1.add(lblNombreRuta4, gbc_lblNombreRuta4);
		
		JLabel lblNombreRuta5 = new JLabel("");
		GridBagConstraints gbc_lblNombreRuta5 = new GridBagConstraints();
		gbc_lblNombreRuta5.insets = new Insets(0, 0, 5, 5);
		gbc_lblNombreRuta5.gridx = 3;
		gbc_lblNombreRuta5.gridy = 5;
		panel_1.add(lblNombreRuta5, gbc_lblNombreRuta5);
		
		JLabel lblNombreRuta6 = new JLabel("");
		GridBagConstraints gbc_lblNombreRuta6 = new GridBagConstraints();
		gbc_lblNombreRuta6.insets = new Insets(0, 0, 5, 5);
		gbc_lblNombreRuta6.gridx = 5;
		gbc_lblNombreRuta6.gridy = 5;
		panel_1.add(lblNombreRuta6, gbc_lblNombreRuta6);
		
	}
}