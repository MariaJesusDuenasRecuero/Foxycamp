package presentacion;

import javax.swing.JPanel;
import javax.swing.border.Border;

import presentacion.P_Registro.RoundedBorder;

import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.GridBagLayout;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;

import java.awt.Font;
import java.awt.Graphics;


public class V_Ruta extends JPanel {
	
	private JPanel pnlContenido;

	/**
	 * Create the panel.
	 */
	public V_Ruta(JPanel referenciaPnlContenido) {
		pnlContenido = referenciaPnlContenido;
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
		
		JLabel lblRuta1 = new JLabel(""); //$NON-NLS-1$
		lblRuta1.setIcon(new ImageIcon(V_Ruta.class.getResource("/presentacion/Ruta.jpg"))); //$NON-NLS-1$
		GridBagConstraints gbc_lblRuta1 = new GridBagConstraints();
		gbc_lblRuta1.insets = new Insets(0, 0, 5, 5);
		gbc_lblRuta1.gridx = 1;
		gbc_lblRuta1.gridy = 1;
		panel_1.add(lblRuta1, gbc_lblRuta1);
		
		JLabel lblRuta2 = new JLabel(""); //$NON-NLS-1$
		lblRuta2.setIcon(new ImageIcon(V_Ruta.class.getResource("/presentacion/Ruta2.jpg"))); //$NON-NLS-1$
		GridBagConstraints gbc_lblRuta2 = new GridBagConstraints();
		gbc_lblRuta2.insets = new Insets(0, 0, 5, 5);
		gbc_lblRuta2.gridx = 3;
		gbc_lblRuta2.gridy = 1;
		panel_1.add(lblRuta2, gbc_lblRuta2);
		
		JLabel lblRuta3 = new JLabel(""); //$NON-NLS-1$
		lblRuta3.setIcon(new ImageIcon(V_Ruta.class.getResource("/presentacion/Ruta3.png"))); //$NON-NLS-1$
		GridBagConstraints gbc_lblRuta3 = new GridBagConstraints();
		gbc_lblRuta3.insets = new Insets(0, 0, 5, 5);
		gbc_lblRuta3.gridx = 5;
		gbc_lblRuta3.gridy = 1;
		panel_1.add(lblRuta3, gbc_lblRuta3);
		
		JButton btnNombreRuta1 = new JButton(MessagesV_Ruta.getString("V_Ruta.btnNombreRuta1.text")); //$NON-NLS-1$
		btnNombreRuta1.setToolTipText(MessagesV_Ruta.getString("V_Ruta.btnNombreRuta1.toolTipText")); //$NON-NLS-1$
		btnNombreRuta1.addActionListener(new BtnReservarActionListener());
		btnNombreRuta1.setBorder(new RoundedBorder(10));
		btnNombreRuta1.setBackground(new Color(244, 165, 0));
		btnNombreRuta1.setFont(new Font("Verdana", Font.BOLD, 14)); //$NON-NLS-1$
		GridBagConstraints gbc_btnNombreRuta1 = new GridBagConstraints();
		gbc_btnNombreRuta1.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnNombreRuta1.insets = new Insets(0, 0, 5, 5);
		gbc_btnNombreRuta1.gridx = 1;
		gbc_btnNombreRuta1.gridy = 2;
		panel_1.add(btnNombreRuta1, gbc_btnNombreRuta1);
		
		JButton btnNombreRuta2 = new JButton(MessagesV_Ruta.getString("V_Ruta.btnNombreRuta2.text")); //$NON-NLS-1$
		btnNombreRuta2.setToolTipText(MessagesV_Ruta.getString("V_Ruta.btnNombreRuta2.toolTipText")); //$NON-NLS-1$
		btnNombreRuta2.setFont(new Font("Verdana", Font.BOLD, 14)); //$NON-NLS-1$
		btnNombreRuta2.setBorder(new RoundedBorder(10));
		btnNombreRuta2.setBackground(new Color(244, 165, 0));
		btnNombreRuta2.addActionListener(new BtnReservarActionListener());
		GridBagConstraints gbc_btnNombreRuta2 = new GridBagConstraints();
		gbc_btnNombreRuta2.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnNombreRuta2.insets = new Insets(0, 0, 5, 5);
		gbc_btnNombreRuta2.gridx = 3;
		gbc_btnNombreRuta2.gridy = 2;
		panel_1.add(btnNombreRuta2, gbc_btnNombreRuta2);
		
		JButton btnNombreRuta3 = new JButton(MessagesV_Ruta.getString("V_Ruta.btnNombreRuta3.text")); //$NON-NLS-1$
		btnNombreRuta3.setToolTipText(MessagesV_Ruta.getString("V_Ruta.btnNombreRuta3.toolTipText")); //$NON-NLS-1$
		btnNombreRuta3.setFont(new Font(MessagesV_Ruta.getString("V_Ruta.8"), Font.BOLD, 14)); //$NON-NLS-1$
		btnNombreRuta3.setBackground(new Color(244, 165, 0));
		btnNombreRuta3.setBorder(new RoundedBorder(10));
		btnNombreRuta3.addActionListener(new BtnReservarActionListener());
		GridBagConstraints gbc_btnNombreRuta3 = new GridBagConstraints();
		gbc_btnNombreRuta3.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnNombreRuta3.insets = new Insets(0, 0, 5, 5);
		gbc_btnNombreRuta3.gridx = 5;
		gbc_btnNombreRuta3.gridy = 2;
		panel_1.add(btnNombreRuta3, gbc_btnNombreRuta3);
		
		JLabel lblRuta4 = new JLabel(""); //$NON-NLS-1$
		lblRuta4.setIcon(new ImageIcon(V_Ruta.class.getResource("/presentacion/Ruta5.png"))); //$NON-NLS-1$
		GridBagConstraints gbc_lblRuta4 = new GridBagConstraints();
		gbc_lblRuta4.insets = new Insets(0, 0, 5, 5);
		gbc_lblRuta4.gridx = 1;
		gbc_lblRuta4.gridy = 4;
		panel_1.add(lblRuta4, gbc_lblRuta4);
		
		JLabel lblRuta5 = new JLabel(""); //$NON-NLS-1$
		GridBagConstraints gbc_lblRuta5 = new GridBagConstraints();
		gbc_lblRuta5.insets = new Insets(0, 0, 5, 5);
		gbc_lblRuta5.gridx = 3;
		gbc_lblRuta5.gridy = 4;
		panel_1.add(lblRuta5, gbc_lblRuta5);
		
		JLabel lblRuta6 = new JLabel(""); //$NON-NLS-1$
		GridBagConstraints gbc_lblRuta6 = new GridBagConstraints();
		gbc_lblRuta6.insets = new Insets(0, 0, 5, 5);
		gbc_lblRuta6.gridx = 5;
		gbc_lblRuta6.gridy = 4;
		panel_1.add(lblRuta6, gbc_lblRuta6);
		
		JButton btnNombreRuta4 = new JButton(MessagesV_Ruta.getString("V_Ruta.btnNombreRuta4.text")); //$NON-NLS-1$
		btnNombreRuta4.setToolTipText(MessagesV_Ruta.getString("V_Ruta.btnNombreRuta4.toolTipText")); //$NON-NLS-1$
		btnNombreRuta4.setFont(new Font("Verdana", Font.BOLD, 14)); //$NON-NLS-1$
		btnNombreRuta4.setBackground(new Color(244, 165, 0));
		btnNombreRuta4.setBorder(new RoundedBorder(10));
		btnNombreRuta4.addActionListener(new BtnReservarActionListener());
		GridBagConstraints gbc_btnNombreRuta4 = new GridBagConstraints();
		gbc_btnNombreRuta4.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnNombreRuta4.insets = new Insets(0, 0, 5, 5);
		gbc_btnNombreRuta4.gridx = 1;
		gbc_btnNombreRuta4.gridy = 5;
		
		panel_1.add(btnNombreRuta4, gbc_btnNombreRuta4);
		
		JLabel lblNombreRuta5 = new JLabel(""); //$NON-NLS-1$
		GridBagConstraints gbc_lblNombreRuta5 = new GridBagConstraints();
		gbc_lblNombreRuta5.insets = new Insets(0, 0, 5, 5);
		gbc_lblNombreRuta5.gridx = 3;
		gbc_lblNombreRuta5.gridy = 5;
		panel_1.add(lblNombreRuta5, gbc_lblNombreRuta5);
		
		JLabel lblNombreRuta6 = new JLabel(""); //$NON-NLS-1$
		GridBagConstraints gbc_lblNombreRuta6 = new GridBagConstraints();
		gbc_lblNombreRuta6.insets = new Insets(0, 0, 5, 5);
		gbc_lblNombreRuta6.gridx = 5;
		gbc_lblNombreRuta6.gridy = 5;
		panel_1.add(lblNombreRuta6, gbc_lblNombreRuta6);
		
	}
	public class RoundedBorder implements Border {

		private int radius;

		RoundedBorder(int radius) {
			this.radius = radius;
		}

		public Insets getBorderInsets(Component c) {
			return new Insets(this.radius + 1, this.radius + 1, this.radius + 2, this.radius);
		}

		public boolean isBorderOpaque() {
			return true;
		}

		public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
			g.drawRoundRect(x, y, width - 1, height - 1, radius, radius);
		}
	}

	private class BtnReservarActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			CardLayout cl = (CardLayout)(pnlContenido.getLayout());
			cl.show(pnlContenido, MessagesV_Ruta.getString("V_Ruta.16")); //$NON-NLS-1$
		}
	}
}