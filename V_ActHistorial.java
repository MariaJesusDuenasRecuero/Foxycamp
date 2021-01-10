package presentacion;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Rectangle;

import javax.swing.JPanel;
import javax.swing.JOptionPane;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.border.BevelBorder;
import java.awt.Cursor;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.awt.event.ActionEvent;

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
		
		JButton lblNewLabel = new JButton(MessagesV_ActHistorial.getString("V_ActHistorial.lblNewLabel.text")); //$NON-NLS-1$
		lblNewLabel.addActionListener(new BtnActionListener());
		lblNewLabel.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblNewLabel.setBackground(new Color(255, 204, 153));
		lblNewLabel.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setIcon(new ImageIcon(V_ActHistorial.class.getResource("/presentacion/IconDescargaPDF.png")));
		lblNewLabel.setFont(new Font("Verdana", Font.PLAIN, 20));
		lblNewLabel.setBounds(68, 75, 229, 69);
		pnlContenido.add(lblNewLabel);
		
		JButton lblActividades = new JButton(MessagesV_ActHistorial.getString("V_ActHistorial.lblActividades.text")); //$NON-NLS-1$
		lblActividades.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblActividades.setBackground(new Color(255, 204, 153));
		lblActividades.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		lblActividades.setHorizontalAlignment(SwingConstants.CENTER);
		lblActividades.setIcon(new ImageIcon(V_ActHistorial.class.getResource("/presentacion/IconDescargaPDF.png")));
		lblActividades.setFont(new Font("Verdana", Font.PLAIN, 20));
		lblActividades.addActionListener(new BtnActionListener());
		lblActividades.setBounds(68, 171, 229, 69);
		pnlContenido.add(lblActividades);
		
		JButton lblActividades_1 = new JButton(MessagesV_ActHistorial.getString("V_ActHistorial.lblActividades_1.text")); //$NON-NLS-1$
		lblActividades_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblActividades_1.setBackground(new Color(255, 204, 153));
		lblActividades_1.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		lblActividades_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblActividades_1.setIcon(new ImageIcon(V_ActHistorial.class.getResource("/presentacion/IconDescargaPDF.png")));
		lblActividades_1.setFont(new Font("Verdana", Font.PLAIN, 20));
		lblActividades_1.setBounds(68, 273, 229, 69);
		lblActividades_1.addActionListener(new BtnActionListener());
		pnlContenido.add(lblActividades_1);
		
		JButton lblActividades_1_1 = new JButton(MessagesV_ActHistorial.getString("V_ActHistorial.lblActividades_1_1.text")); //$NON-NLS-1$
		lblActividades_1_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblActividades_1_1.setBackground(new Color(255, 204, 153));
		lblActividades_1_1.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		lblActividades_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblActividades_1_1.setIcon(new ImageIcon(V_ActHistorial.class.getResource("/presentacion/IconDescargaPDF.png")));
		lblActividades_1_1.setFont(new Font("Verdana", Font.PLAIN, 20));
		lblActividades_1_1.setBounds(68, 366, 229, 69);
		lblActividades_1_1.addActionListener(new BtnActionListener());
		pnlContenido.add(lblActividades_1_1);
		
		JButton lblActividades_3 = new JButton(MessagesV_ActHistorial.getString("V_ActHistorial.lblActividades_3.text")); //$NON-NLS-1$
		lblActividades_3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblActividades_3.setBackground(new Color(255, 204, 153));
		lblActividades_3.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		lblActividades_3.setIcon(new ImageIcon(V_ActHistorial.class.getResource("/presentacion/IconDescargaPDF.png")));
		lblActividades_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblActividades_3.setFont(new Font("Verdana", Font.PLAIN, 20));
		lblActividades_3.setBounds(384, 75, 229, 69);
		lblActividades_3.addActionListener(new BtnActionListener());
		pnlContenido.add(lblActividades_3);
		
		JButton lblActividades_4 = new JButton(MessagesV_ActHistorial.getString("V_ActHistorial.lblActividades_4.text")); //$NON-NLS-1$
		lblActividades_4.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblActividades_4.setBackground(new Color(255, 204, 153));
		lblActividades_4.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		lblActividades_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblActividades_4.setIcon(new ImageIcon(V_ActHistorial.class.getResource("/presentacion/IconDescargaPDF.png")));
		lblActividades_4.setFont(new Font("Verdana", Font.PLAIN, 20));
		lblActividades_4.setBounds(384, 171, 229, 69);
		lblActividades_4.addActionListener(new BtnActionListener());
		pnlContenido.add(lblActividades_4);
		
		JButton lblActividades_1_2 = new JButton(MessagesV_ActHistorial.getString("V_ActHistorial.lblActividades_1_2.text")); //$NON-NLS-1$
		lblActividades_1_2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblActividades_1_2.setBackground(new Color(255, 204, 153));
		lblActividades_1_2.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		lblActividades_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblActividades_1_2.setIcon(new ImageIcon(V_ActHistorial.class.getResource("/presentacion/IconDescargaPDF.png")));
		lblActividades_1_2.setFont(new Font("Verdana", Font.PLAIN, 20));
		lblActividades_1_2.setBounds(384, 273, 229, 69);
		lblActividades_1_2.addActionListener(new BtnActionListener());
		pnlContenido.add(lblActividades_1_2);
		
		JButton lblActividades_1_1_1 = new JButton(MessagesV_ActHistorial.getString("V_ActHistorial.lblActividades_1_1_1.text")); //$NON-NLS-1$
		lblActividades_1_1_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblActividades_1_1_1.setBackground(new Color(255, 204, 153));
		lblActividades_1_1_1.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		lblActividades_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblActividades_1_1_1.setIcon(new ImageIcon(V_ActHistorial.class.getResource("/presentacion/IconDescargaPDF.png")));
		lblActividades_1_1_1.setFont(new Font("Verdana", Font.PLAIN, 20));
		lblActividades_1_1_1.setBounds(384, 366, 229, 69);
		lblActividades_1_1_1.addActionListener(new BtnActionListener());
		pnlContenido.add(lblActividades_1_1_1);
		
		JButton lblActividades_3_1 = new JButton(MessagesV_ActHistorial.getString("V_ActHistorial.lblActividades_3_1.text")); //$NON-NLS-1$
		lblActividades_3_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblActividades_3_1.setBackground(new Color(255, 204, 153));
		lblActividades_3_1.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		lblActividades_3_1.setIcon(new ImageIcon(V_ActHistorial.class.getResource("/presentacion/IconDescargaPDF.png")));
		lblActividades_3_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblActividades_3_1.setFont(new Font("Verdana", Font.PLAIN, 20));
		lblActividades_3_1.setBounds(702, 75, 223, 69);
		lblActividades_3_1.addActionListener(new BtnActionListener());
		pnlContenido.add(lblActividades_3_1);
		
		JButton lblActividades_4_1 = new JButton(MessagesV_ActHistorial.getString("V_ActHistorial.lblActividades_4_1.text")); //$NON-NLS-1$
		lblActividades_4_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblActividades_4_1.setBackground(new Color(255, 204, 153));
		lblActividades_4_1.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		lblActividades_4_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblActividades_4_1.setIcon(new ImageIcon(V_ActHistorial.class.getResource("/presentacion/IconDescargaPDF.png")));
		lblActividades_4_1.setFont(new Font("Verdana", Font.PLAIN, 20));
		lblActividades_4_1.setBounds(702, 171, 223, 69);
		lblActividades_4_1.addActionListener(new BtnActionListener());
		pnlContenido.add(lblActividades_4_1);
		
		JButton lblActividades_1_2_1 = new JButton(MessagesV_ActHistorial.getString("V_ActHistorial.lblActividades_1_2_1.text")); //$NON-NLS-1$
		lblActividades_1_2_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblActividades_1_2_1.setBackground(new Color(255, 204, 153));
		lblActividades_1_2_1.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		lblActividades_1_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblActividades_1_2_1.setIcon(new ImageIcon(V_ActHistorial.class.getResource("/presentacion/IconDescargaPDF.png")));
		lblActividades_1_2_1.setFont(new Font("Verdana", Font.PLAIN, 20));
		lblActividades_1_2_1.addActionListener(new BtnActionListener());
		lblActividades_1_2_1.setBounds(702, 273, 223, 69);
		pnlContenido.add(lblActividades_1_2_1);
		
		JButton lblActividades_1_1_1_1 = new JButton(MessagesV_ActHistorial.getString("V_ActHistorial.lblActividades_1_1_1_1.text")); //$NON-NLS-1$
		lblActividades_1_1_1_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblActividades_1_1_1_1.setBackground(new Color(255, 204, 153));
		lblActividades_1_1_1_1.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		lblActividades_1_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblActividades_1_1_1_1.setIcon(new ImageIcon(V_ActHistorial.class.getResource("/presentacion/IconDescargaPDF.png")));
		lblActividades_1_1_1_1.setFont(new Font("Verdana", Font.PLAIN, 20));
		lblActividades_1_1_1_1.addActionListener(new BtnActionListener());
		lblActividades_1_1_1_1.setBounds(702, 366, 223, 69);
		pnlContenido.add(lblActividades_1_1_1_1);
		
		JLabel lblNewLabel_1 = new JLabel(MessagesV_ActHistorial.getString("V_ActHistorial.lblNewLabel_1.text")); //$NON-NLS-1$
		lblNewLabel_1.setForeground(Color.RED);
		lblNewLabel_1.setFont(new Font("Verdana", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(212, 470, 563, 31);
		pnlContenido.add(lblNewLabel_1);
		
	}
	private class BtnActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			String direccion = "https://drive.google.com/file/d/1TfB6TvsqT8MBxvYHlvCSW241p_Iwulfa/view?usp=sharing";
			try {
				String osName = System.getProperty("os.name");
				 if(osName.contains("Windows")) {
				 	Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler " + direccion);
				 }else if(osName.contains("Linux")) {
					 Runtime.getRuntime().exec("open " + direccion);
				 }else if(osName.contains("Mac OS X")) {
					 Runtime.getRuntime().exec("open " + direccion);
			} else{ 
					JOptionPane.showMessageDialog(null, "OS no soportado");
				 }
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		}
	}
}