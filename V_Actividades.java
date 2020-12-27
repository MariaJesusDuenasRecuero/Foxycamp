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
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;

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
		panel.setLayout(null);
		
		JLabel lblTiroConArco = new JLabel("");
		lblTiroConArco.setHorizontalAlignment(SwingConstants.CENTER);
		lblTiroConArco.setIcon(new ImageIcon(V_Actividades.class.getResource("/presentacion/TiroConArcox64.png")));
		lblTiroConArco.setBounds(48, 180, 124, 119);
		panel.add(lblTiroConArco);
		
		JLabel lblNatacion = new JLabel("");
		lblNatacion.setHorizontalAlignment(SwingConstants.CENTER);
		lblNatacion.setIcon(new ImageIcon(V_Actividades.class.getResource("/presentacion/natacionx64.png")));
		lblNatacion.setBounds(48, 36, 124, 119);
		panel.add(lblNatacion);
		
		JLabel lblkayak = new JLabel("");
		lblkayak.setIcon(new ImageIcon(V_Actividades.class.getResource("/presentacion/kayakx64.png")));
		lblkayak.setHorizontalAlignment(SwingConstants.CENTER);
		lblkayak.setBounds(48, 326, 124, 119);
		panel.add(lblkayak);
		
		JSeparator separator = new JSeparator();
		separator.setOrientation(SwingConstants.VERTICAL);
		separator.setBounds(486, 24, 11, 421);
		panel.add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(58, 157, 408, 18);
		panel.add(separator_1);
		
		JSeparator separator_1_1 = new JSeparator();
		separator_1_1.setBounds(58, 305, 408, 18);
		panel.add(separator_1_1);
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setEditable(false);
		textArea_1.setBounds(178, 172, 288, 122);
		panel.add(textArea_1);
		
		JButton btnNewButton = new JButton("Inscritos");
		btnNewButton.setFont(new Font("Verdana", Font.PLAIN, 16));
		btnNewButton.setBackground(new Color(255, 165, 0));
		btnNewButton.setBounds(342, 485, 124, 23);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Incribirse");
		btnNewButton_1.setFont(new Font("Verdana", Font.PLAIN, 16));
		btnNewButton_1.setBackground(new Color(255, 165, 0));
		btnNewButton_1.setBounds(511, 485, 124, 23);
		panel.add(btnNewButton_1);
		
		JTextArea textArea_1_1 = new JTextArea();
		textArea_1_1.setEditable(false);
		textArea_1_1.setBounds(178, 323, 288, 122);
		panel.add(textArea_1_1);
		
		JTextArea textArea_1_2 = new JTextArea();
		textArea_1_2.setEditable(false);
		textArea_1_2.setBounds(178, 22, 288, 122);
		panel.add(textArea_1_2);
		
		JLabel lblNatacion_1 = new JLabel("");
		lblNatacion_1.setIcon(new ImageIcon(V_Actividades.class.getResource("/presentacion/IconCiclismo.png")));
		lblNatacion_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNatacion_1.setBounds(511, 38, 124, 119);
		panel.add(lblNatacion_1);
		
		JTextArea textArea_1_2_1 = new JTextArea();
		textArea_1_2_1.setEditable(false);
		textArea_1_2_1.setBounds(641, 24, 288, 122);
		panel.add(textArea_1_2_1);
		
		JSeparator separator_1_2 = new JSeparator();
		separator_1_2.setBounds(521, 159, 408, 18);
		panel.add(separator_1_2);
		
		JTextArea textArea_1_3 = new JTextArea();
		textArea_1_3.setEditable(false);
		textArea_1_3.setBounds(641, 174, 288, 122);
		panel.add(textArea_1_3);
		
		JLabel lblTiroConArco_1 = new JLabel("");
		lblTiroConArco_1.setIcon(new ImageIcon(V_Actividades.class.getResource("/presentacion/IconFutbol.png")));
		lblTiroConArco_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblTiroConArco_1.setBounds(511, 182, 124, 119);
		panel.add(lblTiroConArco_1);
		
		JSeparator separator_1_1_1 = new JSeparator();
		separator_1_1_1.setBounds(521, 307, 408, 18);
		panel.add(separator_1_1_1);
		
		JTextArea textArea_1_1_1 = new JTextArea();
		textArea_1_1_1.setEditable(false);
		textArea_1_1_1.setBounds(641, 325, 288, 122);
		panel.add(textArea_1_1_1);
		
		JLabel lblkayak_1 = new JLabel("");
		lblkayak_1.setIcon(new ImageIcon(V_Actividades.class.getResource("/presentacion/IconYoga.png")));
		lblkayak_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblkayak_1.setBounds(511, 328, 124, 119);
		panel.add(lblkayak_1);
		
	}

	/*private class BtnInscritosActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			P_Inscritos ins = new P_Inscritos();
			ins.getFrame().setVisible(true);
			frmLogin.dispose();
		}
	}*/
}