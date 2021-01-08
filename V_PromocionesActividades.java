package presentacion;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;

//import presentacion.V_Actividades.BtnInscritosActionListener;

public class V_PromocionesActividades extends JPanel {

	/**
	 * Create the panel.
	 */
	public V_PromocionesActividades() {
		setBackground(Color.LIGHT_GRAY);
		setBounds(new Rectangle(10, 50, 1001, 530));
		setLayout(new BorderLayout(0, 0));
		
		JPanel pnlContenido = new JPanel();
		add(pnlContenido, BorderLayout.CENTER);
		pnlContenido.setLayout(null);
		
		JLabel lblIconOferta2 = new JLabel("");
		lblIconOferta2.setIcon(new ImageIcon(V_PromocionesActividades.class.getResource("/presentacion/IconPromo1.png")));
		lblIconOferta2.setBounds(521, 255, 53, 44);
		pnlContenido.add(lblIconOferta2);
		
		JLabel lblIconOferta1 = new JLabel("");
		lblIconOferta1.setHorizontalAlignment(SwingConstants.CENTER);
		lblIconOferta1.setIcon(new ImageIcon(V_PromocionesActividades.class.getResource("/presentacion/IconCalendario.png")));
		lblIconOferta1.setBounds(32, 367, 102, 93);
		pnlContenido.add(lblIconOferta1);
		
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
		lblkayak.setBounds(77, 334, 77, 83);
		pnlContenido.add(lblkayak);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(Color.ORANGE);
		separator.setOrientation(SwingConstants.VERTICAL);
		separator.setBounds(491, 22, 11, 421);
		pnlContenido.add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setForeground(Color.ORANGE);
		separator_1.setBounds(58, 157, 408, 18);
		pnlContenido.add(separator_1);
		
		JSeparator separator_1_1 = new JSeparator();
		separator_1_1.setForeground(Color.ORANGE);
		separator_1_1.setBounds(58, 305, 408, 18);
		pnlContenido.add(separator_1_1);
		
		JTextArea txtrComienzaElDa_1 = new JTextArea();
		txtrComienzaElDa_1.setLineWrap(true);
		txtrComienzaElDa_1.setFont(new Font("Verdana", Font.PLAIN, 10));
		txtrComienzaElDa_1.setText("Comienza el día 5 de septiembre.\r\n\r\nPara la inscripción en los grupos no indicados en el  formulario se requiere una prueba de nivel, excepto para aquellos que ya estuvieran apuntados al final de la temporada pasada.\r\nLas pruebas se realizarán del 5 al 7 de septiembre, de 18:00 a 20:00 horas.");
		txtrComienzaElDa_1.setEditable(false);
		txtrComienzaElDa_1.setBounds(164, 172, 302, 122);
		pnlContenido.add(txtrComienzaElDa_1);
		
		JButton btnInscribirse = new JButton("Inscribirse");
		btnInscribirse.setBounds(new Rectangle(0, 0, 60, 50));
		btnInscribirse.setFont(new Font("Verdana", Font.PLAIN, 16));
		btnInscribirse.setBackground(new Color(255, 165, 0));
		btnInscribirse.setBounds(433, 469, 124, 23);
		pnlContenido.add(btnInscribirse);
		
		JTextArea txtrComienzaElDa_2 = new JTextArea();
		txtrComienzaElDa_2.setFont(new Font("Verdana", Font.PLAIN, 10));
		txtrComienzaElDa_2.setLineWrap(true);
		txtrComienzaElDa_2.setText("Comienza el día 23 de septiembre.\r\nEn la escuela de niños, para la inscripción en los grupos no indicadosen el  formulario se requiere una prueba de nivel, excepto para aquellos que ya estuvieran apuntados al final de la temporada pasada.\r\nLas pruebas se realizarán del 23 al 27 de septiembre, de 18:00 a 20:00 horas.");
		txtrComienzaElDa_2.setEditable(false);
		txtrComienzaElDa_2.setBounds(164, 323, 302, 122);
		pnlContenido.add(txtrComienzaElDa_2);
		
		JTextArea txtrComienzaElDa = new JTextArea();
		txtrComienzaElDa.setLineWrap(true);
		txtrComienzaElDa.setText("Comienza el día 3 de septiembre.\r\nEn la escuela de niños, para la inscripción en los grupos no indicadosen el  formulario se requiere una prueba de nivel, excepto para aquellos que ya estuvieran apuntados al final de la temporada pasada.\r\nLas pruebas se realizarán del 3 al 7 de septiembre, de 18:00 a 20:00 horas.");
		txtrComienzaElDa.setFont(new Font("Verdana", Font.PLAIN, 10));
		txtrComienzaElDa.setEditable(false);
		txtrComienzaElDa.setBounds(164, 22, 302, 122);
		pnlContenido.add(txtrComienzaElDa);
		
		JLabel lblNatacion_1 = new JLabel("");
		lblNatacion_1.setIcon(new ImageIcon(V_Actividades.class.getResource("/presentacion/IconCiclismo.png")));
		lblNatacion_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNatacion_1.setBounds(511, 38, 124, 119);
		pnlContenido.add(lblNatacion_1);
		
		JTextArea txtrComienzaElDa_3 = new JTextArea();
		txtrComienzaElDa_3.setLineWrap(true);
		txtrComienzaElDa_3.setFont(new Font("Verdana", Font.PLAIN, 10));
		txtrComienzaElDa_3.setText("Comienza el día 13 de septiembre.\r\nEn la escuela de niños, para la inscripción en los grupos no indicadosen el  formulario se requiere una prueba de nivel, excepto para aquellos que ya estuvieran apuntados al final de la temporada pasada.\r\nLas pruebas se realizarán del 13 al 17 de septiembre, de 18:00 a 20:00 horas.");
		txtrComienzaElDa_3.setEditable(false);
		txtrComienzaElDa_3.setBounds(627, 24, 302, 122);
		pnlContenido.add(txtrComienzaElDa_3);
		
		JSeparator separator_1_2 = new JSeparator();
		separator_1_2.setForeground(Color.ORANGE);
		separator_1_2.setBounds(521, 159, 408, 18);
		pnlContenido.add(separator_1_2);
		
		JTextArea txtrComienzaElDa_4 = new JTextArea();
		txtrComienzaElDa_4.setFont(new Font("Verdana", Font.PLAIN, 10));
		txtrComienzaElDa_4.setText("Comienza el día 12 de septiembre.\r\nEn la escuela de niños, para la inscripción en los grupos no indicadosen el  formulario se requiere una prueba de nivel, excepto para aquellos que ya estuvieran apuntados al final de la temporada pasada.\r\nLas pruebas se realizarán del 12 al 15 de septiembre, de 18:00 a 20:00 horas.");
		txtrComienzaElDa_4.setLineWrap(true);
		txtrComienzaElDa_4.setEditable(false);
		txtrComienzaElDa_4.setBounds(627, 174, 302, 122);
		pnlContenido.add(txtrComienzaElDa_4);
		
		JSeparator separator_1_1_1 = new JSeparator();
		separator_1_1_1.setForeground(Color.ORANGE);
		separator_1_1_1.setBounds(521, 307, 408, 18);
		pnlContenido.add(separator_1_1_1);
		
		JTextArea txtrComienzaElDa_5 = new JTextArea();
		txtrComienzaElDa_5.setFont(new Font("Verdana", Font.PLAIN, 10));
		txtrComienzaElDa_5.setLineWrap(true);
		txtrComienzaElDa_5.setText("Comienza el día 23 de septiembre.\r\nEn la escuela de niños, para la inscripción en los grupos no indicadosen el  formulario se requiere una prueba de nivel, excepto para aquellos que ya estuvieran apuntados al final de la temporada pasada.\r\nLas pruebas se realizarán del 23 al 30 de septiembre, de 18:00 a 20:00 horas.");
		txtrComienzaElDa_5.setEditable(false);
		txtrComienzaElDa_5.setBounds(627, 325, 302, 122);
		pnlContenido.add(txtrComienzaElDa_5);
		
		JLabel lblkayak_1 = new JLabel("");
		lblkayak_1.setIcon(new ImageIcon(V_Actividades.class.getResource("/presentacion/IconYoga.png")));
		lblkayak_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblkayak_1.setBounds(511, 328, 124, 119);
		pnlContenido.add(lblkayak_1);
		
		JLabel lblTiroConArco_1 = new JLabel("");
		lblTiroConArco_1.setIcon(new ImageIcon(V_Actividades.class.getResource("/presentacion/IconFutbol.png")));
		lblTiroConArco_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblTiroConArco_1.setBounds(511, 182, 124, 119);
		pnlContenido.add(lblTiroConArco_1);
		
	}
}