package presentacion;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Rectangle;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.border.TitledBorder;
import javax.swing.ImageIcon;

public class V_VerReservas extends JPanel {

	/**
	 * Create the panel.
	 */
	public V_VerReservas() {
		setBackground(Color.WHITE);
		setBounds(new Rectangle(10, 50, 1001, 530));
		setLayout(new BorderLayout(0, 0));
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBorder(new TitledBorder(null, "Reservas", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		add(scrollPane, BorderLayout.CENTER);
		
		JPanel panel = new JPanel();
		scrollPane.setViewportView(panel);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panel.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panel.columnWeights = new double[]{0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		
		JPanel pnlReserva1 = new JPanel();
		pnlReserva1.setBackground(Color.WHITE);
		pnlReserva1.setLayout(null);
		GridBagConstraints gbc_pnlReserva1 = new GridBagConstraints();
		gbc_pnlReserva1.gridwidth = 28;
		gbc_pnlReserva1.gridheight = 7;
		gbc_pnlReserva1.insets = new Insets(0, 0, 5, 5);
		gbc_pnlReserva1.fill = GridBagConstraints.BOTH;
		gbc_pnlReserva1.gridx = 2;
		gbc_pnlReserva1.gridy = 1;
		panel.add(pnlReserva1, gbc_pnlReserva1);
		
		JButton btnCancelar = new JButton("Borrar");
		btnCancelar.setBackground(new Color(248, 248, 255));
		btnCancelar.setIcon(new ImageIcon(V_VerReservas.class.getResource("/presentacion/IconoBorrar.png")));
		btnCancelar.setBounds(730, 130, 95, 34);
		pnlReserva1.add(btnCancelar);
		
		JLabel lblReservaEstrellaGalaxia = new JLabel("Reserva Estrella Galaxia");
		lblReservaEstrellaGalaxia.setFont(new Font("Verdana", Font.BOLD, 16));
		lblReservaEstrellaGalaxia.setBounds(42, 11, 236, 14);
		pnlReserva1.add(lblReservaEstrellaGalaxia);
		
		JLabel lblNewLabel = new JLabel("x2 coches");
		lblNewLabel.setFont(new Font("Verdana", Font.PLAIN, 14));
		lblNewLabel.setBounds(42, 134, 95, 23);
		pnlReserva1.add(lblNewLabel);
		
		JLabel lblPensionCompleta = new JLabel("Pension completa");
		lblPensionCompleta.setFont(new Font("Verdana", Font.PLAIN, 14));
		lblPensionCompleta.setBounds(288, 8, 183, 23);
		pnlReserva1.add(lblPensionCompleta);
		
		JLabel lblPagado = new JLabel("Pagado");
		lblPagado.setIcon(new ImageIcon(V_VerReservas.class.getResource("/presentacion/checked.png")));
		lblPagado.setFont(new Font("Verdana", Font.PLAIN, 14));
		lblPagado.setBounds(626, 141, 77, 23);
		pnlReserva1.add(lblPagado);
		
		JLabel lblJuanManuelRuiz = new JLabel("Juan Manuel Ruiz Merino");
		lblJuanManuelRuiz.setFont(new Font("Verdana", Font.PLAIN, 14));
		lblJuanManuelRuiz.setBounds(42, 70, 200, 23);
		pnlReserva1.add(lblJuanManuelRuiz);
		
		JLabel lblJuanmanuelruizmerinogmailcom = new JLabel("JuanManuelRuizMerino@gmail.com");
		lblJuanmanuelruizmerinogmailcom.setFont(new Font("Verdana", Font.PLAIN, 14));
		lblJuanmanuelruizmerinogmailcom.setBounds(42, 98, 288, 23);
		pnlReserva1.add(lblJuanmanuelruizmerinogmailcom);
		
		JLabel lblPersonas = new JLabel("7 personas");
		lblPersonas.setFont(new Font("Verdana", Font.PLAIN, 14));
		lblPersonas.setBounds(42, 36, 200, 23);
		pnlReserva1.add(lblPersonas);
		
		JPanel pnlReserva2 = new JPanel();
		pnlReserva2.setBackground(Color.WHITE);
		pnlReserva2.setLayout(null);
		GridBagConstraints gbc_pnlReserva2 = new GridBagConstraints();
		gbc_pnlReserva2.gridheight = 7;
		gbc_pnlReserva2.gridwidth = 28;
		gbc_pnlReserva2.insets = new Insets(0, 0, 5, 5);
		gbc_pnlReserva2.fill = GridBagConstraints.BOTH;
		gbc_pnlReserva2.gridx = 2;
		gbc_pnlReserva2.gridy = 9;
		panel.add(pnlReserva2, gbc_pnlReserva2);
		
		JButton btnCancelar_1 = new JButton("Borrar");
		btnCancelar_1.setBackground(new Color(248, 248, 255));
		btnCancelar_1.setIcon(new ImageIcon(V_VerReservas.class.getResource("/presentacion/IconoBorrar.png")));
		btnCancelar_1.setBounds(729, 133, 95, 34);
		pnlReserva2.add(btnCancelar_1);
		
		JPanel pnlReserva3 = new JPanel();
		pnlReserva3.setBackground(Color.WHITE);
		pnlReserva3.setLayout(null);
		GridBagConstraints gbc_pnlReserva3 = new GridBagConstraints();
		gbc_pnlReserva3.gridwidth = 28;
		gbc_pnlReserva3.gridheight = 9;
		gbc_pnlReserva3.insets = new Insets(0, 0, 5, 5);
		gbc_pnlReserva3.fill = GridBagConstraints.BOTH;
		gbc_pnlReserva3.gridx = 2;
		gbc_pnlReserva3.gridy = 17;
		panel.add(pnlReserva3, gbc_pnlReserva3);
		
		JButton btnCancelar_1_1 = new JButton("Borrar");
		btnCancelar_1_1.setBackground(new Color(248, 248, 255));
		btnCancelar_1_1.setIcon(new ImageIcon(V_VerReservas.class.getResource("/presentacion/IconoBorrar.png")));
		btnCancelar_1_1.setBounds(731, 173, 95, 34);
		pnlReserva3.add(btnCancelar_1_1);
	}
}
