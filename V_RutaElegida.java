package presentacion;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.GridBagLayout;
import java.awt.Rectangle;

import javax.swing.JPanel;
import javax.swing.border.Border;


import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JEditorPane;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.border.TitledBorder;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class V_RutaElegida extends JPanel {
	private JTextField txtDia;
	private JTextField txtHora;
	private JTextField txtMonitor;
	private JTextField txtPuntoEncuentro;
	private JTextField txtNum;
	private JTextField txtDificultad;
	private JPanel pnlContenido;
	/**
	 * Create the panel.
	 */
	public V_RutaElegida(JPanel referenciaPnlContenido) {
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
		gbl_panel_1.columnWidths = new int[]{55, 116, 98, 139, 55, 0, 328, 101, 26, 0};
		gbl_panel_1.rowHeights = new int[]{23, 36, 285, 25, 25, 25, 25, 13, 21, 0};
		gbl_panel_1.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panel_1.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel_1.setLayout(gbl_panel_1);
		
		JLabel lblItinerarioRuta = new JLabel("Itinerario de la ruta");
		lblItinerarioRuta.setFont(new Font("Verdana", Font.BOLD, 25));
		lblItinerarioRuta.setForeground(new Color(255, 140, 0));
		GridBagConstraints gbc_lblItinerarioRuta = new GridBagConstraints();
		gbc_lblItinerarioRuta.gridwidth = 5;
		gbc_lblItinerarioRuta.insets = new Insets(0, 0, 5, 5);
		gbc_lblItinerarioRuta.gridx = 2;
		gbc_lblItinerarioRuta.gridy = 1;
		panel_1.add(lblItinerarioRuta, gbc_lblItinerarioRuta);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setViewportBorder(new TitledBorder(null, "Mapa ruta", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		GridBagConstraints gbc_scrollPane = new GridBagConstraints();
		gbc_scrollPane.gridwidth = 7;
		gbc_scrollPane.insets = new Insets(0, 0, 5, 5);
		gbc_scrollPane.fill = GridBagConstraints.BOTH;
		gbc_scrollPane.gridx = 1;
		gbc_scrollPane.gridy = 2;
		panel_1.add(scrollPane, gbc_scrollPane);
		
		JLabel lblImagenRuta = new JLabel("");
		lblImagenRuta.setIcon(new ImageIcon(V_RutaElegida.class.getResource("/presentacion/Ruta2.jpg")));
		scrollPane.setViewportView(lblImagenRuta);
		
		JLabel lblDiaRuta = new JLabel("Día");
		GridBagConstraints gbc_lblDiaRuta = new GridBagConstraints();
		gbc_lblDiaRuta.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblDiaRuta.insets = new Insets(0, 0, 5, 5);
		gbc_lblDiaRuta.gridx = 1;
		gbc_lblDiaRuta.gridy = 3;
		panel_1.add(lblDiaRuta, gbc_lblDiaRuta);
		
		txtDia = new JTextField();
		txtDia.setText("12/01/2021");
		txtDia.setEditable(false);
		GridBagConstraints gbc_txtDia = new GridBagConstraints();
		gbc_txtDia.insets = new Insets(0, 0, 5, 5);
		gbc_txtDia.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtDia.gridx = 2;
		gbc_txtDia.gridy = 3;
		panel_1.add(txtDia, gbc_txtDia);
		txtDia.setColumns(10);
		
		JLabel lblNum = new JLabel("Núm máx - núm min. *");
		GridBagConstraints gbc_lblNum = new GridBagConstraints();
		gbc_lblNum.anchor = GridBagConstraints.EAST;
		gbc_lblNum.insets = new Insets(0, 0, 5, 5);
		gbc_lblNum.gridx = 3;
		gbc_lblNum.gridy = 3;
		panel_1.add(lblNum, gbc_lblNum);
		
		txtNum = new JTextField();
		txtNum.setText("13");
		txtNum.setEditable(false);
		GridBagConstraints gbc_txtNum = new GridBagConstraints();
		gbc_txtNum.anchor = GridBagConstraints.NORTH;
		gbc_txtNum.insets = new Insets(0, 0, 5, 5);
		gbc_txtNum.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtNum.gridx = 4;
		gbc_txtNum.gridy = 3;
		panel_1.add(txtNum, gbc_txtNum);
		txtNum.setColumns(10);
		
		JLabel lblDescripcion = new JLabel("Descripción de la ruta");
		GridBagConstraints gbc_lblDescripcion = new GridBagConstraints();
		gbc_lblDescripcion.anchor = GridBagConstraints.WEST;
		gbc_lblDescripcion.insets = new Insets(0, 0, 5, 5);
		gbc_lblDescripcion.gridx = 6;
		gbc_lblDescripcion.gridy = 3;
		panel_1.add(lblDescripcion, gbc_lblDescripcion);
		
		
		JLabel lblHora = new JLabel("Hora");
		GridBagConstraints gbc_lblHora = new GridBagConstraints();
		gbc_lblHora.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblHora.insets = new Insets(0, 0, 5, 5);
		gbc_lblHora.gridx = 1;
		gbc_lblHora.gridy = 4;
		panel_1.add(lblHora, gbc_lblHora);
		
		txtHora = new JTextField();
		txtHora.setText("12:00");
		txtHora.setEditable(false);
		GridBagConstraints gbc_txtHora = new GridBagConstraints();
		gbc_txtHora.insets = new Insets(0, 0, 5, 5);
		gbc_txtHora.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtHora.gridx = 2;
		gbc_txtHora.gridy = 4;
		panel_1.add(txtHora, gbc_txtHora);
		txtHora.setColumns(10);
		
		JLabel lblDificultad = new JLabel("Grado de dificultad");
		GridBagConstraints gbc_lblDificultad = new GridBagConstraints();
		gbc_lblDificultad.anchor = GridBagConstraints.EAST;
		gbc_lblDificultad.insets = new Insets(0, 0, 5, 5);
		gbc_lblDificultad.gridx = 3;
		gbc_lblDificultad.gridy = 4;
		panel_1.add(lblDificultad, gbc_lblDificultad);
		
		txtDificultad = new JTextField();
		txtDificultad.setText("Medio");
		txtDificultad.setEditable(false);
		GridBagConstraints gbc_txtDificultad = new GridBagConstraints();
		gbc_txtDificultad.insets = new Insets(0, 0, 5, 5);
		gbc_txtDificultad.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtDificultad.gridx = 4;
		gbc_txtDificultad.gridy = 4;
		panel_1.add(txtDificultad, gbc_txtDificultad);
		txtDificultad.setColumns(10);
		
		JEditorPane PaneDescripcionRuta = new JEditorPane();
		PaneDescripcionRuta.setEditable(false);
		PaneDescripcionRuta.setText("Ruta senderística con grado de dificultad medio, ideal para principiantes, se aconseja llevar mascarilla de repuesto, abundante agua y algun tipo de comida, imprescindible llevar algún caramelo azucarado por posibles bajas de tensión. Ropa de deporte.\r\n");
		GridBagConstraints gbc_PaneDescripcionRuta = new GridBagConstraints();
		gbc_PaneDescripcionRuta.gridwidth = 2;
		gbc_PaneDescripcionRuta.gridheight = 3;
		gbc_PaneDescripcionRuta.insets = new Insets(0, 0, 5, 5);
		gbc_PaneDescripcionRuta.fill = GridBagConstraints.BOTH;
		gbc_PaneDescripcionRuta.gridx = 6;
		gbc_PaneDescripcionRuta.gridy = 4;
		panel_1.add(PaneDescripcionRuta, gbc_PaneDescripcionRuta);
		
		JLabel lblMonitor = new JLabel("Monitor");
		GridBagConstraints gbc_lblMonitor = new GridBagConstraints();
		gbc_lblMonitor.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblMonitor.insets = new Insets(0, 0, 5, 5);
		gbc_lblMonitor.gridx = 1;
		gbc_lblMonitor.gridy = 5;
		panel_1.add(lblMonitor, gbc_lblMonitor);
		
		txtMonitor = new JTextField();
		txtMonitor.setText("Julian");
		txtMonitor.setEditable(false);
		GridBagConstraints gbc_txtMonitor = new GridBagConstraints();
		gbc_txtMonitor.insets = new Insets(0, 0, 5, 5);
		gbc_txtMonitor.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtMonitor.gridx = 2;
		gbc_txtMonitor.gridy = 5;
		panel_1.add(txtMonitor, gbc_txtMonitor);
		txtMonitor.setColumns(10);
		
		JLabel lblEncuetro = new JLabel("Punto de encuentro");
		GridBagConstraints gbc_lblEncuetro = new GridBagConstraints();
		gbc_lblEncuetro.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblEncuetro.insets = new Insets(0, 0, 5, 5);
		gbc_lblEncuetro.gridx = 1;
		gbc_lblEncuetro.gridy = 6;
		panel_1.add(lblEncuetro, gbc_lblEncuetro);
		
		txtPuntoEncuentro = new JTextField();
		txtPuntoEncuentro.setText("Jardín de Europa");
		txtPuntoEncuentro.setEditable(false);
		GridBagConstraints gbc_txtPuntoEncuentro = new GridBagConstraints();
		gbc_txtPuntoEncuentro.insets = new Insets(0, 0, 5, 5);
		gbc_txtPuntoEncuentro.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtPuntoEncuentro.gridx = 2;
		gbc_txtPuntoEncuentro.gridy = 6;
		panel_1.add(txtPuntoEncuentro, gbc_txtPuntoEncuentro);
		txtPuntoEncuentro.setColumns(10);
		
		JLabel lblInfo = new JLabel("*: Puede variar dependiendo de un posible estado de alarma");
		GridBagConstraints gbc_lblInfo = new GridBagConstraints();
		gbc_lblInfo.anchor = GridBagConstraints.WEST;
		gbc_lblInfo.gridwidth = 3;
		gbc_lblInfo.insets = new Insets(0, 0, 0, 5);
		gbc_lblInfo.gridx = 1;
		gbc_lblInfo.gridy = 8;
		panel_1.add(lblInfo, gbc_lblInfo);
		
		JButton btnInscribirse = new JButton("Inscribirse");
		btnInscribirse.setToolTipText("Pulsa para inscribir");
		btnInscribirse.addActionListener(new BtnActionListener());
		GridBagConstraints gbc_btnInscribirse = new GridBagConstraints();
		gbc_btnInscribirse.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnInscribirse.insets = new Insets(0, 0, 0, 5);
		gbc_btnInscribirse.gridx = 7;
		gbc_btnInscribirse.gridy = 8;
		btnInscribirse.setBounds(new Rectangle(0, 0, 30, 10));
		btnInscribirse.setBorder(new RoundedBorder(6));
		btnInscribirse.setForeground(new Color(0,0,0));
		btnInscribirse.setBackground(new Color(244, 164, 96));
		panel_1.add(btnInscribirse, gbc_btnInscribirse);
		
		
	}
	
	private class BtnActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			CardLayout cl = (CardLayout)(pnlContenido.getLayout());
			cl.show(pnlContenido, "rutaInscribirse");
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
}
