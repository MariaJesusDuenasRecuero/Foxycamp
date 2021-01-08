package presentacion;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Rectangle;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JList;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;

public class V_ActHistorial extends JPanel {

	/**
	 * Create the panel.
	 */
	public V_ActHistorial() {
		setBackground(Color.LIGHT_GRAY);
		setBounds(new Rectangle(10, 50, 1001, 530));
		setLayout(new BorderLayout(0, 0));
		
		JPanel pnlContenido = new JPanel();
		add(pnlContenido, BorderLayout.CENTER);
		pnlContenido.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Actividades 2000");
		lblNewLabel.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel.setIcon(new ImageIcon(V_ActHistorial.class.getResource("/presentacion/IconDescargaPDF.png")));
		lblNewLabel.setFont(new Font("Verdana", Font.PLAIN, 20));
		lblNewLabel.setBounds(68, 75, 190, 69);
		pnlContenido.add(lblNewLabel);
		
		JLabel lblActividades = new JLabel("Actividades 2001");
		lblActividades.setFont(new Font("Verdana", Font.PLAIN, 20));
		lblActividades.setBounds(68, 171, 180, 69);
		pnlContenido.add(lblActividades);
		
		JLabel lblActividades_1 = new JLabel("Actividades 2002");
		lblActividades_1.setFont(new Font("Verdana", Font.PLAIN, 20));
		lblActividades_1.setBounds(68, 273, 180, 69);
		pnlContenido.add(lblActividades_1);
		
		JLabel lblActividades_1_1 = new JLabel("Actividades 2003");
		lblActividades_1_1.setFont(new Font("Verdana", Font.PLAIN, 20));
		lblActividades_1_1.setBounds(68, 366, 180, 69);
		pnlContenido.add(lblActividades_1_1);
		
		JLabel lblActividades_3 = new JLabel("Actividades 2004");
		lblActividades_3.setHorizontalAlignment(SwingConstants.LEFT);
		lblActividades_3.setFont(new Font("Verdana", Font.PLAIN, 20));
		lblActividades_3.setBounds(379, 75, 190, 69);
		pnlContenido.add(lblActividades_3);
		
		JLabel lblActividades_4 = new JLabel("Actividades 2005");
		lblActividades_4.setFont(new Font("Verdana", Font.PLAIN, 20));
		lblActividades_4.setBounds(379, 171, 180, 69);
		pnlContenido.add(lblActividades_4);
		
		JLabel lblActividades_1_2 = new JLabel("Actividades 2006");
		lblActividades_1_2.setFont(new Font("Verdana", Font.PLAIN, 20));
		lblActividades_1_2.setBounds(379, 273, 180, 69);
		pnlContenido.add(lblActividades_1_2);
		
		JLabel lblActividades_1_1_1 = new JLabel("Actividades 2007");
		lblActividades_1_1_1.setFont(new Font("Verdana", Font.PLAIN, 20));
		lblActividades_1_1_1.setBounds(379, 366, 180, 69);
		pnlContenido.add(lblActividades_1_1_1);
		
		JLabel lblActividades_3_1 = new JLabel("Actividades 2008");
		lblActividades_3_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblActividades_3_1.setFont(new Font("Verdana", Font.PLAIN, 20));
		lblActividades_3_1.setBounds(697, 75, 190, 69);
		pnlContenido.add(lblActividades_3_1);
		
		JLabel lblActividades_4_1 = new JLabel("Actividades 2009");
		lblActividades_4_1.setFont(new Font("Verdana", Font.PLAIN, 20));
		lblActividades_4_1.setBounds(697, 171, 180, 69);
		pnlContenido.add(lblActividades_4_1);
		
		JLabel lblActividades_1_2_1 = new JLabel("Actividades 2010");
		lblActividades_1_2_1.setFont(new Font("Verdana", Font.PLAIN, 20));
		lblActividades_1_2_1.setBounds(697, 273, 190, 69);
		pnlContenido.add(lblActividades_1_2_1);
		
		JLabel lblActividades_1_1_1_1 = new JLabel("Actividades 2011");
		lblActividades_1_1_1_1.setFont(new Font("Verdana", Font.PLAIN, 20));
		lblActividades_1_1_1_1.setBounds(697, 366, 180, 69);
		pnlContenido.add(lblActividades_1_1_1_1);
		
		JLabel lblNewLabel_1 = new JLabel("Aviso:  A partir de 2011 se han mantenido las mismas actividades.");
		lblNewLabel_1.setForeground(Color.RED);
		lblNewLabel_1.setFont(new Font("Verdana", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(212, 470, 563, 31);
		pnlContenido.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(V_ActHistorial.class.getResource("IconDescargaPDF.png")));
		lblNewLabel_2.setBounds(249, 64, 107, 96);
		pnlContenido.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("");
		lblNewLabel_2_1.setIcon(new ImageIcon(V_ActHistorial.class.getResource("/presentacion/IconDescargaPDF.png")));
		lblNewLabel_2_1.setBounds(249, 171, 83, 69);
		pnlContenido.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("");
		lblNewLabel_2_1_1.setIcon(new ImageIcon(V_ActHistorial.class.getResource("/presentacion/IconDescargaPDF.png")));
		lblNewLabel_2_1_1.setBounds(249, 273, 83, 69);
		pnlContenido.add(lblNewLabel_2_1_1);
		
		JLabel lblNewLabel_2_1_1_1 = new JLabel("");
		lblNewLabel_2_1_1_1.setIcon(new ImageIcon(V_ActHistorial.class.getResource("/presentacion/IconDescargaPDF.png")));
		lblNewLabel_2_1_1_1.setBounds(249, 366, 83, 69);
		pnlContenido.add(lblNewLabel_2_1_1_1);
		
		JLabel lblNewLabel_2_1_1_1_1 = new JLabel("");
		lblNewLabel_2_1_1_1_1.setIcon(new ImageIcon(V_ActHistorial.class.getResource("/presentacion/IconDescargaPDF.png")));
		lblNewLabel_2_1_1_1_1.setBounds(558, 75, 83, 69);
		pnlContenido.add(lblNewLabel_2_1_1_1_1);
		
		JLabel lblNewLabel_2_1_1_1_1_1 = new JLabel("");
		lblNewLabel_2_1_1_1_1_1.setIcon(new ImageIcon(V_ActHistorial.class.getResource("/presentacion/IconDescargaPDF.png")));
		lblNewLabel_2_1_1_1_1_1.setBounds(558, 171, 83, 69);
		pnlContenido.add(lblNewLabel_2_1_1_1_1_1);
		
		JLabel lblNewLabel_2_1_1_1_1_2 = new JLabel("");
		lblNewLabel_2_1_1_1_1_2.setIcon(new ImageIcon(V_ActHistorial.class.getResource("/presentacion/IconDescargaPDF.png")));
		lblNewLabel_2_1_1_1_1_2.setBounds(558, 273, 83, 69);
		pnlContenido.add(lblNewLabel_2_1_1_1_1_2);
		
		JLabel lblNewLabel_2_1_1_1_1_3 = new JLabel("");
		lblNewLabel_2_1_1_1_1_3.setIcon(new ImageIcon(V_ActHistorial.class.getResource("/presentacion/IconDescargaPDF.png")));
		lblNewLabel_2_1_1_1_1_3.setBounds(558, 366, 83, 69);
		pnlContenido.add(lblNewLabel_2_1_1_1_1_3);
		
		JLabel lblNewLabel_2_1_1_1_1_4 = new JLabel("");
		lblNewLabel_2_1_1_1_1_4.setIcon(new ImageIcon(V_ActHistorial.class.getResource("/presentacion/IconDescargaPDF.png")));
		lblNewLabel_2_1_1_1_1_4.setBounds(883, 75, 83, 69);
		pnlContenido.add(lblNewLabel_2_1_1_1_1_4);
		
		JLabel lblNewLabel_2_1_1_1_1_5 = new JLabel("");
		lblNewLabel_2_1_1_1_1_5.setIcon(new ImageIcon(V_ActHistorial.class.getResource("/presentacion/IconDescargaPDF.png")));
		lblNewLabel_2_1_1_1_1_5.setBounds(883, 171, 83, 69);
		pnlContenido.add(lblNewLabel_2_1_1_1_1_5);
		
		JLabel lblNewLabel_2_1_1_1_1_6 = new JLabel("");
		lblNewLabel_2_1_1_1_1_6.setIcon(new ImageIcon(V_ActHistorial.class.getResource("/presentacion/IconDescargaPDF.png")));
		lblNewLabel_2_1_1_1_1_6.setBounds(883, 273, 83, 69);
		pnlContenido.add(lblNewLabel_2_1_1_1_1_6);
		
		JLabel lblNewLabel_2_1_1_1_1_7 = new JLabel("");
		lblNewLabel_2_1_1_1_1_7.setIcon(new ImageIcon(V_ActHistorial.class.getResource("/presentacion/IconDescargaPDF.png")));
		lblNewLabel_2_1_1_1_1_7.setBounds(883, 366, 83, 69);
		pnlContenido.add(lblNewLabel_2_1_1_1_1_7);
		
	}
}