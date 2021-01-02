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
import javax.swing.border.LineBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.CompoundBorder;

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
		
		JLabel lblNewLabel = new JLabel(" Actividades 2000");
		lblNewLabel.setBackground(new Color(255, 204, 153));
		lblNewLabel.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setIcon(new ImageIcon(V_ActHistorial.class.getResource("/presentacion/IconDescargaPDF.png")));
		lblNewLabel.setFont(new Font("Verdana", Font.PLAIN, 20));
		lblNewLabel.setBounds(68, 75, 229, 69);
		pnlContenido.add(lblNewLabel);
		
		JLabel lblActividades = new JLabel(" Actividades 2001");
		lblActividades.setBackground(new Color(255, 204, 153));
		lblActividades.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		lblActividades.setHorizontalAlignment(SwingConstants.CENTER);
		lblActividades.setIcon(new ImageIcon(V_ActHistorial.class.getResource("/presentacion/IconDescargaPDF.png")));
		lblActividades.setFont(new Font("Verdana", Font.PLAIN, 20));
		lblActividades.setBounds(68, 171, 229, 69);
		pnlContenido.add(lblActividades);
		
		JLabel lblActividades_1 = new JLabel(" Actividades 2002");
		lblActividades_1.setBackground(new Color(255, 204, 153));
		lblActividades_1.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		lblActividades_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblActividades_1.setIcon(new ImageIcon(V_ActHistorial.class.getResource("/presentacion/IconDescargaPDF.png")));
		lblActividades_1.setFont(new Font("Verdana", Font.PLAIN, 20));
		lblActividades_1.setBounds(68, 273, 229, 69);
		pnlContenido.add(lblActividades_1);
		
		JLabel lblActividades_1_1 = new JLabel(" Actividades 2003");
		lblActividades_1_1.setBackground(new Color(255, 204, 153));
		lblActividades_1_1.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		lblActividades_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblActividades_1_1.setIcon(new ImageIcon(V_ActHistorial.class.getResource("/presentacion/IconDescargaPDF.png")));
		lblActividades_1_1.setFont(new Font("Verdana", Font.PLAIN, 20));
		lblActividades_1_1.setBounds(68, 366, 229, 69);
		pnlContenido.add(lblActividades_1_1);
		
		JLabel lblActividades_3 = new JLabel(" Actividades 2004");
		lblActividades_3.setBackground(new Color(255, 204, 153));
		lblActividades_3.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		lblActividades_3.setIcon(new ImageIcon(V_ActHistorial.class.getResource("/presentacion/IconDescargaPDF.png")));
		lblActividades_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblActividades_3.setFont(new Font("Verdana", Font.PLAIN, 20));
		lblActividades_3.setBounds(384, 75, 229, 69);
		pnlContenido.add(lblActividades_3);
		
		JLabel lblActividades_4 = new JLabel(" Actividades 2005");
		lblActividades_4.setBackground(new Color(255, 204, 153));
		lblActividades_4.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		lblActividades_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblActividades_4.setIcon(new ImageIcon(V_ActHistorial.class.getResource("/presentacion/IconDescargaPDF.png")));
		lblActividades_4.setFont(new Font("Verdana", Font.PLAIN, 20));
		lblActividades_4.setBounds(384, 171, 229, 69);
		pnlContenido.add(lblActividades_4);
		
		JLabel lblActividades_1_2 = new JLabel(" Actividades 2006");
		lblActividades_1_2.setBackground(new Color(255, 204, 153));
		lblActividades_1_2.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		lblActividades_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblActividades_1_2.setIcon(new ImageIcon(V_ActHistorial.class.getResource("/presentacion/IconDescargaPDF.png")));
		lblActividades_1_2.setFont(new Font("Verdana", Font.PLAIN, 20));
		lblActividades_1_2.setBounds(384, 273, 229, 69);
		pnlContenido.add(lblActividades_1_2);
		
		JLabel lblActividades_1_1_1 = new JLabel(" Actividades 2007");
		lblActividades_1_1_1.setBackground(new Color(255, 204, 153));
		lblActividades_1_1_1.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		lblActividades_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblActividades_1_1_1.setIcon(new ImageIcon(V_ActHistorial.class.getResource("/presentacion/IconDescargaPDF.png")));
		lblActividades_1_1_1.setFont(new Font("Verdana", Font.PLAIN, 20));
		lblActividades_1_1_1.setBounds(384, 366, 229, 69);
		pnlContenido.add(lblActividades_1_1_1);
		
		JLabel lblActividades_3_1 = new JLabel(" Actividades 2008");
		lblActividades_3_1.setBackground(new Color(255, 204, 153));
		lblActividades_3_1.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		lblActividades_3_1.setIcon(new ImageIcon(V_ActHistorial.class.getResource("/presentacion/IconDescargaPDF.png")));
		lblActividades_3_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblActividades_3_1.setFont(new Font("Verdana", Font.PLAIN, 20));
		lblActividades_3_1.setBounds(702, 75, 223, 69);
		pnlContenido.add(lblActividades_3_1);
		
		JLabel lblActividades_4_1 = new JLabel(" Actividades 2009");
		lblActividades_4_1.setBackground(new Color(255, 204, 153));
		lblActividades_4_1.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		lblActividades_4_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblActividades_4_1.setIcon(new ImageIcon(V_ActHistorial.class.getResource("/presentacion/IconDescargaPDF.png")));
		lblActividades_4_1.setFont(new Font("Verdana", Font.PLAIN, 20));
		lblActividades_4_1.setBounds(702, 171, 223, 69);
		pnlContenido.add(lblActividades_4_1);
		
		JLabel lblActividades_1_2_1 = new JLabel(" Actividades 2010");
		lblActividades_1_2_1.setBackground(new Color(255, 204, 153));
		lblActividades_1_2_1.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		lblActividades_1_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblActividades_1_2_1.setIcon(new ImageIcon(V_ActHistorial.class.getResource("/presentacion/IconDescargaPDF.png")));
		lblActividades_1_2_1.setFont(new Font("Verdana", Font.PLAIN, 20));
		lblActividades_1_2_1.setBounds(702, 273, 223, 69);
		pnlContenido.add(lblActividades_1_2_1);
		
		JLabel lblActividades_1_1_1_1 = new JLabel(" Actividades 2011");
		lblActividades_1_1_1_1.setBackground(new Color(255, 204, 153));
		lblActividades_1_1_1_1.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		lblActividades_1_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblActividades_1_1_1_1.setIcon(new ImageIcon(V_ActHistorial.class.getResource("/presentacion/IconDescargaPDF.png")));
		lblActividades_1_1_1_1.setFont(new Font("Verdana", Font.PLAIN, 20));
		lblActividades_1_1_1_1.setBounds(702, 366, 223, 69);
		pnlContenido.add(lblActividades_1_1_1_1);
		
		JLabel lblNewLabel_1 = new JLabel("Aviso:  A partir de 2011 se han mantenido las mismas actividades.");
		lblNewLabel_1.setForeground(Color.RED);
		lblNewLabel_1.setFont(new Font("Verdana", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(212, 470, 563, 31);
		pnlContenido.add(lblNewLabel_1);
		
	}
}
