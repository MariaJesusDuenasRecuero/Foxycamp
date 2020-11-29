package presentacion;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Rectangle;
import java.awt.Color;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.Font;
import javax.swing.border.LineBorder;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.UIManager;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.border.CompoundBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.JSeparator;

public class P_Principal extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					P_Principal frame = new P_Principal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public P_Principal() {
		setResizable(false);
		setBounds(new Rectangle(0, 0, 1300, 1000));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(255, 153, 0));
		contentPane.setBackground(new Color(255, 228, 196));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel pnlHeader = new JPanel();
		pnlHeader.setBackground(new Color(255, 228, 196));
		contentPane.add(pnlHeader, BorderLayout.NORTH);
		GridBagLayout gbl_pnlHeader = new GridBagLayout();
		gbl_pnlHeader.columnWidths = new int[]{50, 44, 64, 300, 0, 0, 358, 92, 50, 50, 64, 64, 0, 28, 0, 0};
		gbl_pnlHeader.rowHeights = new int[]{50, 0, 50, 0};
		gbl_pnlHeader.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_pnlHeader.rowWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
		pnlHeader.setLayout(gbl_pnlHeader);
		
		JLabel lblLogoZorro = new JLabel("");
		lblLogoZorro.setIcon(new ImageIcon(P_Principal.class.getResource("/presentacion/fox.png")));
		lblLogoZorro.setBackground(new Color(255, 228, 181));
		GridBagConstraints gbc_lblLogoZorro = new GridBagConstraints();
		gbc_lblLogoZorro.insets = new Insets(0, 0, 5, 5);
		gbc_lblLogoZorro.gridx = 2;
		gbc_lblLogoZorro.gridy = 1;
		pnlHeader.add(lblLogoZorro, gbc_lblLogoZorro);
		
		JLabel lblFoxycamp = new JLabel("FOXYCAMP");
		lblFoxycamp.setForeground(new Color(210, 105, 30));
		lblFoxycamp.setFont(new Font("Verdana", Font.BOLD, 40));
		GridBagConstraints gbc_lblFoxycamp = new GridBagConstraints();
		gbc_lblFoxycamp.insets = new Insets(0, 0, 5, 5);
		gbc_lblFoxycamp.gridx = 3;
		gbc_lblFoxycamp.gridy = 1;
		pnlHeader.add(lblFoxycamp, gbc_lblFoxycamp);
		
		JLabel lblAyuda = new JLabel("");
		lblAyuda.setIcon(new ImageIcon(P_Principal.class.getResource("/presentacion/signo-de-interrogacion-dibujar.png")));
		lblAyuda.setToolTipText("Ayuda");
		GridBagConstraints gbc_lblAyuda = new GridBagConstraints();
		gbc_lblAyuda.anchor = GridBagConstraints.SOUTH;
		gbc_lblAyuda.insets = new Insets(0, 0, 5, 5);
		gbc_lblAyuda.gridx = 10;
		gbc_lblAyuda.gridy = 1;
		pnlHeader.add(lblAyuda, gbc_lblAyuda);
		
		JLabel lblTraductor = new JLabel("");
		lblTraductor.setIcon(new ImageIcon(P_Principal.class.getResource("/presentacion/traductor.png")));
		lblTraductor.setToolTipText("Traductor");
		GridBagConstraints gbc_lblTraductor = new GridBagConstraints();
		gbc_lblTraductor.anchor = GridBagConstraints.SOUTH;
		gbc_lblTraductor.insets = new Insets(0, 0, 5, 5);
		gbc_lblTraductor.gridx = 11;
		gbc_lblTraductor.gridy = 1;
		pnlHeader.add(lblTraductor, gbc_lblTraductor);
		
		JLabel lblPerfil = new JLabel("");
		lblPerfil.setIcon(new ImageIcon(P_Principal.class.getResource("/presentacion/usuario.png")));
		GridBagConstraints gbc_lblPerfil = new GridBagConstraints();
		gbc_lblPerfil.anchor = GridBagConstraints.SOUTH;
		gbc_lblPerfil.insets = new Insets(0, 0, 5, 5);
		gbc_lblPerfil.gridx = 12;
		gbc_lblPerfil.gridy = 1;
		pnlHeader.add(lblPerfil, gbc_lblPerfil);
		
		JLabel lblFlecha = new JLabel("");
		
		lblFlecha.setIcon(new ImageIcon(P_Principal.class.getResource("/presentacion/flecha-hacia-abajo-del-angulo.png")));
		
		JPopupMenu pmFlecha = new JPopupMenu();
		addPopup(lblFlecha, pmFlecha);
		
		JLabel lblPerfilOption = new JLabel("    Adrian Ruiz");
		lblPerfilOption.setIcon(new ImageIcon(P_Principal.class.getResource("/presentacion/adrian.png")));
		pmFlecha.add(lblPerfilOption);
		
		JSeparator separator = new JSeparator();
		separator.setBorder(new LineBorder(new Color(255, 200, 0), 10));
		pmFlecha.add(separator);
		
		JButton btnAbout = new JButton("   Sobre nosotros");
		btnAbout.setBounds(new Rectangle(0, 0, 50, 0));
		btnAbout.setIcon(new ImageIcon(P_Principal.class.getResource("/presentacion/informacion.png")));
		pmFlecha.add(btnAbout);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBorder(new LineBorder(Color.ORANGE, 10));
		pmFlecha.add(separator_1);
		
		JButton btnAjustes = new JButton("   Ajustes               ");
		btnAjustes.setIcon(new ImageIcon(P_Principal.class.getResource("/presentacion/configuraciones.png")));
		pmFlecha.add(btnAjustes);
		
		JButton btnDesconectar = new JButton("   Salir                     ");
		btnDesconectar.setIcon(new ImageIcon(P_Principal.class.getResource("/presentacion/desconectar.png")));
		pmFlecha.add(btnDesconectar);
		
		lblFlecha.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				pmFlecha.show(e.getComponent(), e.getX(), e.getY());
			}
		});
		GridBagConstraints gbc_lblFlecha = new GridBagConstraints();
		gbc_lblFlecha.anchor = GridBagConstraints.SOUTH;
		gbc_lblFlecha.insets = new Insets(0, 0, 5, 5);
		gbc_lblFlecha.gridx = 13;
		gbc_lblFlecha.gridy = 1;
		pnlHeader.add(lblFlecha, gbc_lblFlecha);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setVerticalAlignment(SwingConstants.BOTTOM);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1.setBorder(new LineBorder(new Color(210, 105, 30), 2, true));
		lblNewLabel_1.setAlignmentX(0.5f);
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblNewLabel_1.gridwidth = 5;
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 0, 5);
		gbc_lblNewLabel_1.gridx = 1;
		gbc_lblNewLabel_1.gridy = 2;
		pnlHeader.add(lblNewLabel_1, gbc_lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("");
		lblNewLabel_1_1.setVerticalAlignment(SwingConstants.BOTTOM);
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_1.setBorder(new LineBorder(new Color(210, 105, 30), 2, true));
		lblNewLabel_1_1.setAlignmentX(0.5f);
		GridBagConstraints gbc_lblNewLabel_1_1 = new GridBagConstraints();
		gbc_lblNewLabel_1_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblNewLabel_1_1.gridwidth = 6;
		gbc_lblNewLabel_1_1.insets = new Insets(0, 0, 0, 5);
		gbc_lblNewLabel_1_1.gridx = 7;
		gbc_lblNewLabel_1_1.gridy = 2;
		pnlHeader.add(lblNewLabel_1_1, gbc_lblNewLabel_1_1);
		
		JPanel pnlPantallaPrincipal = new JPanel();
		pnlPantallaPrincipal.setBackground(new Color(255, 228, 196));
		contentPane.add(pnlPantallaPrincipal, BorderLayout.CENTER);
		GridBagLayout gbl_pnlPantallaPrincipal = new GridBagLayout();
		gbl_pnlPantallaPrincipal.columnWidths = new int[]{50, 75, 225, 10, 800, 50, 0};
		gbl_pnlPantallaPrincipal.rowHeights = new int[]{60, 100, 75, 75, 75, 75, 200, 75, 50, 0};
		gbl_pnlPantallaPrincipal.columnWeights = new double[]{1.0, 1.0, 0.0, 0.0, 1.0, 0.0, Double.MIN_VALUE};
		gbl_pnlPantallaPrincipal.rowWeights = new double[]{1.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		pnlPantallaPrincipal.setLayout(gbl_pnlPantallaPrincipal);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.gridheight = 7;
		gbc_panel.insets = new Insets(0, 0, 5, 5);
		gbc_panel.fill = GridBagConstraints.BOTH;
		gbc_panel.gridx = 4;
		gbc_panel.gridy = 1;
		pnlPantallaPrincipal.add(panel, gbc_panel);
		
		JLabel lblZorroEligeOpcion = new JLabel("");
		lblZorroEligeOpcion.setBounds(179, 158, 475, 385);
		lblZorroEligeOpcion.setHorizontalAlignment(SwingConstants.CENTER);
		lblZorroEligeOpcion.setIcon(new ImageIcon(P_Principal.class.getResource("/presentacion/zorroGrandeTransparencia.png")));
		panel.add(lblZorroEligeOpcion);
		
		JPanel pnlParcelas = new JPanel();
		pnlParcelas.setBackground(Color.WHITE);
		pnlParcelas.setLayout(null);
		GridBagConstraints gbc_pnlParcelas = new GridBagConstraints();
		gbc_pnlParcelas.gridwidth = 2;
		gbc_pnlParcelas.insets = new Insets(0, 0, 5, 5);
		gbc_pnlParcelas.fill = GridBagConstraints.BOTH;
		gbc_pnlParcelas.gridx = 1;
		gbc_pnlParcelas.gridy = 2;
		pnlPantallaPrincipal.add(pnlParcelas, gbc_pnlParcelas);
		
		JLabel lblIconoParcelas = new JLabel("");
		lblIconoParcelas.setIcon(new ImageIcon(P_Principal.class.getResource("/presentacion/parcelas.png")));
		lblIconoParcelas.setBounds(10, 0, 67, 70);
		pnlParcelas.add(lblIconoParcelas);
		
		JLabel lblTextoParcelas = new JLabel("Parcelas");
		lblTextoParcelas.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblTextoParcelas.setBounds(85, 11, 200, 48);
		pnlParcelas.add(lblTextoParcelas);
		
		JPanel pnlBungalows = new JPanel();
		pnlBungalows.setBackground(Color.WHITE);
		pnlBungalows.setLayout(null);
		GridBagConstraints gbc_pnlBungalows = new GridBagConstraints();
		gbc_pnlBungalows.gridwidth = 2;
		gbc_pnlBungalows.insets = new Insets(0, 0, 5, 5);
		gbc_pnlBungalows.fill = GridBagConstraints.BOTH;
		gbc_pnlBungalows.gridx = 1;
		gbc_pnlBungalows.gridy = 3;
		pnlPantallaPrincipal.add(pnlBungalows, gbc_pnlBungalows);
		
		JLabel lblIconoBungalows = new JLabel("");
		lblIconoBungalows.setIcon(new ImageIcon(P_Principal.class.getResource("/presentacion/bungalow.png")));
		lblIconoBungalows.setBounds(10, 0, 67, 70);
		pnlBungalows.add(lblIconoBungalows);
		
		JLabel lblTextoBungalows = new JLabel("Bungalows");
		lblTextoBungalows.setFont(new Font("Tahoma", Font.PLAIN, 30));
		
		lblTextoBungalows.setBounds(84, 11, 201, 48);
		pnlBungalows.add(lblTextoBungalows);
		
		JPanel pnlActividades = new JPanel();
		pnlActividades.setBackground(Color.WHITE);
		pnlActividades.setLayout(null);
		GridBagConstraints gbc_pnlActividades = new GridBagConstraints();
		gbc_pnlActividades.gridwidth = 2;
		gbc_pnlActividades.insets = new Insets(0, 0, 5, 5);
		gbc_pnlActividades.fill = GridBagConstraints.BOTH;
		gbc_pnlActividades.gridx = 1;
		gbc_pnlActividades.gridy = 4;
		pnlPantallaPrincipal.add(pnlActividades, gbc_pnlActividades);
		
		JLabel lblIconoActividades = new JLabel("");
		lblIconoActividades.setIcon(new ImageIcon(P_Principal.class.getResource("/presentacion/actividades.png")));
		lblIconoActividades.setBounds(10, 0, 67, 70);
		pnlActividades.add(lblIconoActividades);
		
		JLabel lblTextoActividades = new JLabel("Actividades");
		lblTextoActividades.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblTextoActividades.setBounds(87, 11, 198, 48);
		pnlActividades.add(lblTextoActividades);
		
		JPanel pnlRutas = new JPanel();
		pnlRutas.setBackground(Color.WHITE);
		pnlRutas.setLayout(null);
		GridBagConstraints gbc_pnlRutas = new GridBagConstraints();
		gbc_pnlRutas.gridwidth = 2;
		gbc_pnlRutas.insets = new Insets(0, 0, 5, 5);
		gbc_pnlRutas.fill = GridBagConstraints.BOTH;
		gbc_pnlRutas.gridx = 1;
		gbc_pnlRutas.gridy = 5;
		pnlPantallaPrincipal.add(pnlRutas, gbc_pnlRutas);
		
		JLabel lblIconoRutas = new JLabel("");
		lblIconoRutas.setIcon(new ImageIcon(P_Principal.class.getResource("/presentacion/rutas.png")));
		lblIconoRutas.setBounds(10, 0, 70, 70);
		pnlRutas.add(lblIconoRutas);
		
		JLabel lblTextoRutas = new JLabel("Rutas");
		lblTextoRutas.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblTextoRutas.setBounds(90, 11, 195, 48);
		pnlRutas.add(lblTextoRutas);
		
		JLabel lblExit = new JLabel("");
		lblExit.setIcon(new ImageIcon(P_Principal.class.getResource("/presentacion/exit3.png")));
		GridBagConstraints gbc_lblExit = new GridBagConstraints();
		gbc_lblExit.insets = new Insets(0, 0, 5, 5);
		gbc_lblExit.gridx = 1;
		gbc_lblExit.gridy = 7;
		pnlPantallaPrincipal.add(lblExit, gbc_lblExit);
		
		
		
	}
	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {

		});
	}
}
