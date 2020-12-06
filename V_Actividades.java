package presentacion;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Rectangle;

import javax.swing.JPanel;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JEditorPane;
import javax.swing.JButton;

public class V_Actividades extends JPanel {

	/**
	 * Create the panel.
	 */
	public V_Actividades() {
		setBackground(Color.LIGHT_GRAY);
		setBounds(new Rectangle(10, 50, 1001, 530));
		setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		add(panel, BorderLayout.CENTER);
		panel.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_1 = new JPanel();
		panel.add(panel_1, BorderLayout.CENTER);
		GridBagLayout gbl_panel_1 = new GridBagLayout();
		gbl_panel_1.columnWidths = new int[]{50, 218, 0, 500, 0, 0, 0, 0};
		gbl_panel_1.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panel_1.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panel_1.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel_1.setLayout(gbl_panel_1);
		
		JLabel lblNewLabel_3 = new JLabel("ACTIVIDADES");
		lblNewLabel_3.setFont(new Font("Verdana", Font.BOLD, 25));
		lblNewLabel_3.setForeground(new Color(255, 140, 0));
		GridBagConstraints gbc_lblNewLabel_3 = new GridBagConstraints();
		gbc_lblNewLabel_3.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel_3.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_3.gridx = 3;
		gbc_lblNewLabel_3.gridy = 0;
		panel_1.add(lblNewLabel_3, gbc_lblNewLabel_3);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(V_Actividades.class.getResource("/presentacion/natacion.png")));
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 1;
		gbc_lblNewLabel.gridy = 1;
		panel_1.add(lblNewLabel, gbc_lblNewLabel);
		
		JEditorPane editorPane = new JEditorPane();
		editorPane.setEditable(false);
		GridBagConstraints gbc_editorPane = new GridBagConstraints();
		gbc_editorPane.insets = new Insets(0, 0, 5, 5);
		gbc_editorPane.fill = GridBagConstraints.BOTH;
		gbc_editorPane.gridx = 3;
		gbc_editorPane.gridy = 1;
		panel_1.add(editorPane, gbc_editorPane);
		
		JPanel panel_2 = new JPanel();
		GridBagConstraints gbc_panel_2 = new GridBagConstraints();
		gbc_panel_2.gridwidth = 2;
		gbc_panel_2.insets = new Insets(0, 0, 5, 5);
		gbc_panel_2.gridx = 4;
		gbc_panel_2.gridy = 1;
		panel_1.add(panel_2, gbc_panel_2);
		
		JButton btnNewButton = new JButton("Inscritos");
		panel_2.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Reservar");
		panel_2.add(btnNewButton_1);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(V_Actividades.class.getResource("/presentacion/objetivox128.png")));
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1.gridx = 1;
		gbc_lblNewLabel_1.gridy = 3;
		panel_1.add(lblNewLabel_1, gbc_lblNewLabel_1);
		
		JEditorPane editorPane_1 = new JEditorPane();
		editorPane_1.setEditable(false);
		GridBagConstraints gbc_editorPane_1 = new GridBagConstraints();
		gbc_editorPane_1.insets = new Insets(0, 0, 5, 5);
		gbc_editorPane_1.fill = GridBagConstraints.BOTH;
		gbc_editorPane_1.gridx = 3;
		gbc_editorPane_1.gridy = 3;
		panel_1.add(editorPane_1, gbc_editorPane_1);
		
		JPanel panel_3 = new JPanel();
		GridBagConstraints gbc_panel_3 = new GridBagConstraints();
		gbc_panel_3.gridwidth = 2;
		gbc_panel_3.insets = new Insets(0, 0, 5, 5);
		gbc_panel_3.gridx = 4;
		gbc_panel_3.gridy = 3;
		panel_1.add(panel_3, gbc_panel_3);
		
		JButton btnNewButton_2 = new JButton("Inscritos");
		panel_3.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Reservar");
		panel_3.add(btnNewButton_3);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(V_Actividades.class.getResource("/presentacion/kayak.png")));
		GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
		gbc_lblNewLabel_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_2.gridx = 1;
		gbc_lblNewLabel_2.gridy = 5;
		panel_1.add(lblNewLabel_2, gbc_lblNewLabel_2);
		
		JEditorPane editorPane_2 = new JEditorPane();
		editorPane_2.setEditable(false);
		GridBagConstraints gbc_editorPane_2 = new GridBagConstraints();
		gbc_editorPane_2.insets = new Insets(0, 0, 5, 5);
		gbc_editorPane_2.fill = GridBagConstraints.BOTH;
		gbc_editorPane_2.gridx = 3;
		gbc_editorPane_2.gridy = 5;
		panel_1.add(editorPane_2, gbc_editorPane_2);
		
		JPanel panel_4 = new JPanel();
		GridBagConstraints gbc_panel_4 = new GridBagConstraints();
		gbc_panel_4.gridwidth = 2;
		gbc_panel_4.insets = new Insets(0, 0, 5, 5);
		gbc_panel_4.gridx = 4;
		gbc_panel_4.gridy = 5;
		panel_1.add(panel_4, gbc_panel_4);
		
		JButton btnNewButton_5 = new JButton("Inscritos");
		panel_4.add(btnNewButton_5);
		
		JButton btnNewButton_4 = new JButton("Reservar");
		panel_4.add(btnNewButton_4);
		
	}

}
