package presentacion;

import java.awt.BorderLayout;
import java.awt.CardLayout;
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
private JPanel pnlContenido;
	/**
	 * Create the panel.
	 */
	public V_Actividades() {
		setBackground(Color.LIGHT_GRAY);
		setBounds(new Rectangle(10, 50, 1001, 530));
		setLayout(new BorderLayout(0, 0));
		
		JPanel pnlContenido = new JPanel();
		add(pnlContenido, BorderLayout.CENTER);
		pnlContenido.setLayout(null);
		
		JLabel lblTiroConArco = new JLabel("");
		lblTiroConArco.setHorizontalAlignment(SwingConstants.CENTER);
		lblTiroConArco.setIcon(new ImageIcon(V_Actividades.class.getResource("/presentacion/TiroConArcox64.png")));
		lblTiroConArco.setBounds(48, 180, 124, 119);
		pnlContenido.add(lblTiroConArco);
		
		JLabel lblNatacion = new JLabel("");
		lblNatacion.setHorizontalAlignment(SwingConstants.CENTER);
		lblNatacion.setIcon(new ImageIcon(V_Actividades.class.getResource("/presentacion/natacionx64.png")));
		lblNatacion.setBounds(48, 36, 124, 119);
		pnlContenido.add(lblNatacion);
		
		JLabel lblkayak = new JLabel("");
		lblkayak.setIcon(new ImageIcon(V_Actividades.class.getResource("/presentacion/kayakx64.png")));
		lblkayak.setHorizontalAlignment(SwingConstants.CENTER);
		lblkayak.setBounds(48, 326, 124, 119);
		pnlContenido.add(lblkayak);
		
		JSeparator separator = new JSeparator();
		separator.setOrientation(SwingConstants.VERTICAL);
		separator.setBounds(486, 24, 11, 421);
		pnlContenido.add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(58, 157, 408, 18);
		pnlContenido.add(separator_1);
		
		JSeparator separator_1_1 = new JSeparator();
		separator_1_1.setBounds(58, 305, 408, 18);
		pnlContenido.add(separator_1_1);
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setEditable(false);
		textArea_1.setBounds(164, 172, 302, 122);
		pnlContenido.add(textArea_1);
		
		JButton btnInscritos = new JButton("Inscritos");
		btnInscritos.setBounds(new Rectangle(0, 0, 60, 50));
		btnInscritos.addActionListener(new BtnInscritosActionListener());
		btnInscritos.setFont(new Font("Verdana", Font.PLAIN, 16));
		btnInscritos.setBackground(new Color(255, 165, 0));
		btnInscritos.setBounds(341, 468, 124, 23);
		pnlContenido.add(btnInscritos);
		
		JButton btnInscribirse = new JButton("Inscribirse");
		btnInscribirse.setBounds(new Rectangle(0, 0, 60, 50));
		btnInscribirse.setFont(new Font("Verdana", Font.PLAIN, 16));
		btnInscribirse.setBackground(new Color(255, 165, 0));
		btnInscribirse.setBounds(511, 468, 124, 23);
		pnlContenido.add(btnInscribirse);
		
		JTextArea textArea_1_1 = new JTextArea();
		textArea_1_1.setEditable(false);
		textArea_1_1.setBounds(164, 323, 302, 122);
		pnlContenido.add(textArea_1_1);
		
		JTextArea txtrComienzaElDa = new JTextArea();
		txtrComienzaElDa.setLineWrap(true);
		txtrComienzaElDa.setText("Comienza el día 3 de septiembre.\r\nEn la escuela de niños, para la inscripción en los grupos no indicadosen el  formulario se requiere una prueba de nivel, excepto para aquellos que ya estuvieran apuntados al final de la temporada pasada.\r\nLas pruebas se realizarán del 3 al 7 de septiembre, de 18:00 a 20:00 horas.");
		txtrComienzaElDa.setFont(new Font("Verdana", Font.PLAIN, 14));
		txtrComienzaElDa.setEditable(false);
		txtrComienzaElDa.setBounds(164, 22, 302, 122);
		pnlContenido.add(txtrComienzaElDa);
		
		JLabel lblNatacion_1 = new JLabel("");
		lblNatacion_1.setIcon(new ImageIcon(V_Actividades.class.getResource("/presentacion/IconCiclismo.png")));
		lblNatacion_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNatacion_1.setBounds(511, 38, 124, 119);
		pnlContenido.add(lblNatacion_1);
		
		JTextArea textArea_1_2_1 = new JTextArea();
		textArea_1_2_1.setEditable(false);
		textArea_1_2_1.setBounds(627, 24, 302, 122);
		pnlContenido.add(textArea_1_2_1);
		
		JSeparator separator_1_2 = new JSeparator();
		separator_1_2.setBounds(521, 159, 408, 18);
		pnlContenido.add(separator_1_2);
		
		JTextArea textArea_1_3 = new JTextArea();
		textArea_1_3.setEditable(false);
		textArea_1_3.setBounds(627, 174, 302, 122);
		pnlContenido.add(textArea_1_3);
		
		JLabel lblTiroConArco_1 = new JLabel("");
		lblTiroConArco_1.setIcon(new ImageIcon(V_Actividades.class.getResource("/presentacion/IconFutbol.png")));
		lblTiroConArco_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblTiroConArco_1.setBounds(511, 182, 124, 119);
		pnlContenido.add(lblTiroConArco_1);
		
		JSeparator separator_1_1_1 = new JSeparator();
		separator_1_1_1.setBounds(521, 307, 408, 18);
		pnlContenido.add(separator_1_1_1);
		
		JTextArea textArea_1_1_1 = new JTextArea();
		textArea_1_1_1.setEditable(false);
		textArea_1_1_1.setBounds(627, 325, 302, 122);
		pnlContenido.add(textArea_1_1_1);
		
		JLabel lblkayak_1 = new JLabel("");
		lblkayak_1.setIcon(new ImageIcon(V_Actividades.class.getResource("/presentacion/IconYoga.png")));
		lblkayak_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblkayak_1.setBounds(511, 328, 124, 119);
		pnlContenido.add(lblkayak_1);
		
	}

	

	private class BtnInscritosActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			
		}
	}
}