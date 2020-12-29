package presentacion;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.GridBagLayout;
import java.awt.Rectangle;
import java.awt.font.TextAttribute;
import java.util.Map;

import javax.swing.JPanel;
import javax.swing.border.Border;

import presentacion.P_Registro.RoundedBorder;

import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JEditorPane;
import javax.swing.JButton;

public class V_RutaElegida extends JPanel {
	private JLabel lblNUM;

	/**
	 * Create the panel.
	 */
	public V_RutaElegida() {
		setBackground(Color.LIGHT_GRAY);
		setBounds(new Rectangle(10, 50, 1001, 530));
		setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		add(panel, BorderLayout.CENTER);
		panel.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_1 = new JPanel();
		panel.add(panel_1, BorderLayout.NORTH);
		GridBagLayout gbl_panel_1 = new GridBagLayout();
		gbl_panel_1.columnWidths = new int[]{55, 116, 82, 139, 55, 0, 260, 0, 55, 0};
		gbl_panel_1.rowHeights = new int[]{31, 36, 298, 25, 25, 25, 25, 13, 21, 0};
		gbl_panel_1.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, Double.MIN_VALUE};
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
		
		JLabel lblImagenRuta = new JLabel("New label");
		GridBagConstraints gbc_lblImagenRuta = new GridBagConstraints();
		gbc_lblImagenRuta.gridwidth = 6;
		gbc_lblImagenRuta.insets = new Insets(0, 0, 5, 5);
		gbc_lblImagenRuta.gridx = 1;
		gbc_lblImagenRuta.gridy = 2;
		panel_1.add(lblImagenRuta, gbc_lblImagenRuta);
		
		JLabel lblDiaRuta = new JLabel("Día");
		GridBagConstraints gbc_lblDiaRuta = new GridBagConstraints();
		gbc_lblDiaRuta.anchor = GridBagConstraints.WEST;
		gbc_lblDiaRuta.insets = new Insets(0, 0, 5, 5);
		gbc_lblDiaRuta.gridx = 1;
		gbc_lblDiaRuta.gridy = 3;
		panel_1.add(lblDiaRuta, gbc_lblDiaRuta);
		
		JLabel lblDIA = new JLabel("16/07/2021");
		GridBagConstraints gbc_lblDIA = new GridBagConstraints();
		gbc_lblDIA.anchor = GridBagConstraints.WEST;
		gbc_lblDIA.insets = new Insets(0, 0, 5, 5);
		gbc_lblDIA.gridx = 2;
		gbc_lblDIA.gridy = 3;
		panel_1.add(lblDIA, gbc_lblDIA);
		
		JLabel lblNum = new JLabel("Núm máx - núm min. *");
		GridBagConstraints gbc_lblNum = new GridBagConstraints();
		gbc_lblNum.anchor = GridBagConstraints.WEST;
		gbc_lblNum.insets = new Insets(0, 0, 5, 5);
		gbc_lblNum.gridx = 3;
		gbc_lblNum.gridy = 3;
		panel_1.add(lblNum, gbc_lblNum);
		
		lblNUM = new JLabel("");
		GridBagConstraints gbc_lblNUM = new GridBagConstraints();
		gbc_lblNUM.insets = new Insets(0, 0, 5, 5);
		gbc_lblNUM.gridx = 4;
		gbc_lblNUM.gridy = 3;
		panel_1.add(lblNUM, gbc_lblNUM);
		
		JLabel lblDescripcion = new JLabel("Descripción de la ruta");
		GridBagConstraints gbc_lblDescripcion = new GridBagConstraints();
		gbc_lblDescripcion.anchor = GridBagConstraints.WEST;
		gbc_lblDescripcion.insets = new Insets(0, 0, 5, 5);
		gbc_lblDescripcion.gridx = 6;
		gbc_lblDescripcion.gridy = 3;
		panel_1.add(lblDescripcion, gbc_lblDescripcion);
		
		
		JLabel lblHora = new JLabel("Hora");
		GridBagConstraints gbc_lblHora = new GridBagConstraints();
		gbc_lblHora.anchor = GridBagConstraints.WEST;
		gbc_lblHora.insets = new Insets(0, 0, 5, 5);
		gbc_lblHora.gridx = 1;
		gbc_lblHora.gridy = 4;
		panel_1.add(lblHora, gbc_lblHora);
		
		JLabel lblHORA = new JLabel("");
		GridBagConstraints gbc_lblHORA = new GridBagConstraints();
		gbc_lblHORA.insets = new Insets(0, 0, 5, 5);
		gbc_lblHORA.gridx = 2;
		gbc_lblHORA.gridy = 4;
		panel_1.add(lblHORA, gbc_lblHORA);
		
		JLabel lblDificultad = new JLabel("Grado de dificultad");
		GridBagConstraints gbc_lblDificultad = new GridBagConstraints();
		gbc_lblDificultad.anchor = GridBagConstraints.WEST;
		gbc_lblDificultad.insets = new Insets(0, 0, 5, 5);
		gbc_lblDificultad.gridx = 3;
		gbc_lblDificultad.gridy = 4;
		panel_1.add(lblDificultad, gbc_lblDificultad);
		
		JLabel lblDIFICULTAD = new JLabel("");
		GridBagConstraints gbc_lblDIFICULTAD = new GridBagConstraints();
		gbc_lblDIFICULTAD.insets = new Insets(0, 0, 5, 5);
		gbc_lblDIFICULTAD.gridx = 4;
		gbc_lblDIFICULTAD.gridy = 4;
		panel_1.add(lblDIFICULTAD, gbc_lblDIFICULTAD);
		
		JEditorPane PaneDescripcionRuta = new JEditorPane();
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
		gbc_lblMonitor.anchor = GridBagConstraints.WEST;
		gbc_lblMonitor.insets = new Insets(0, 0, 5, 5);
		gbc_lblMonitor.gridx = 1;
		gbc_lblMonitor.gridy = 5;
		panel_1.add(lblMonitor, gbc_lblMonitor);
		
		JLabel lblMONITOR = new JLabel("");
		GridBagConstraints gbc_lblMONITOR = new GridBagConstraints();
		gbc_lblMONITOR.insets = new Insets(0, 0, 5, 5);
		gbc_lblMONITOR.gridx = 2;
		gbc_lblMONITOR.gridy = 5;
		panel_1.add(lblMONITOR, gbc_lblMONITOR);
		
		JLabel lblEncuetro = new JLabel("Punto de encuentro");
		GridBagConstraints gbc_lblEncuetro = new GridBagConstraints();
		gbc_lblEncuetro.anchor = GridBagConstraints.WEST;
		gbc_lblEncuetro.insets = new Insets(0, 0, 5, 5);
		gbc_lblEncuetro.gridx = 1;
		gbc_lblEncuetro.gridy = 6;
		panel_1.add(lblEncuetro, gbc_lblEncuetro);
		
		JLabel lblENCUENTRO = new JLabel("");
		GridBagConstraints gbc_lblENCUENTRO = new GridBagConstraints();
		gbc_lblENCUENTRO.insets = new Insets(0, 0, 5, 5);
		gbc_lblENCUENTRO.gridx = 2;
		gbc_lblENCUENTRO.gridy = 6;
		panel_1.add(lblENCUENTRO, gbc_lblENCUENTRO);
		
		JLabel lblInfo = new JLabel("*: Puede variar dependiendo de un posible estado de alarma");
		GridBagConstraints gbc_lblInfo = new GridBagConstraints();
		gbc_lblInfo.anchor = GridBagConstraints.WEST;
		gbc_lblInfo.gridwidth = 3;
		gbc_lblInfo.insets = new Insets(0, 0, 0, 5);
		gbc_lblInfo.gridx = 1;
		gbc_lblInfo.gridy = 8;
		panel_1.add(lblInfo, gbc_lblInfo);
		
		JButton btnInscribirse = new JButton("Inscribirse");
		GridBagConstraints gbc_btnInscribirse = new GridBagConstraints();
		gbc_btnInscribirse.anchor = GridBagConstraints.EAST;
		gbc_btnInscribirse.gridwidth = 2;
		gbc_btnInscribirse.insets = new Insets(0, 0, 0, 5);
		gbc_btnInscribirse.gridx = 6;
		gbc_btnInscribirse.gridy = 8;
		btnInscribirse.setBounds(new Rectangle(0, 0, 30, 10));
		btnInscribirse.setBorder(new RoundedBorder(7));
		btnInscribirse.setForeground(new Color(0,0,0));
		btnInscribirse.setBackground(new Color(244, 164, 96));
		panel_1.add(btnInscribirse, gbc_btnInscribirse);
		
		
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
