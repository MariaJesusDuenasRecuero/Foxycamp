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
import java.awt.Graphics;

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
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.border.CompoundBorder;
import javax.swing.border.SoftBevelBorder;

import presentacion.P_Parcela.RoundedBorder;

import javax.swing.border.BevelBorder;
import javax.swing.border.Border;
import javax.swing.JSeparator;

public class P_Principal extends JFrame {

	private JPanel contentPane;
	private JButton btnParcela;
	private JButton  btnBungalows;
	private JButton btnActividades;
	private JPanel  pnlContenido;
	private JButton btnRutas;
	private JButton btnVolver;

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
		gbc_lblNewLabel_1.gridwidth = 13;
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 0, 5);
		gbc_lblNewLabel_1.gridx = 1;
		gbc_lblNewLabel_1.gridy = 2;
		pnlHeader.add(lblNewLabel_1, gbc_lblNewLabel_1);
		
		JPanel pnlPantallaPrincipal = new JPanel();
		pnlPantallaPrincipal.setBackground(new Color(255, 228, 196));
		contentPane.add(pnlPantallaPrincipal, BorderLayout.CENTER);
		GridBagLayout gbl_pnlPantallaPrincipal = new GridBagLayout();
		gbl_pnlPantallaPrincipal.columnWidths = new int[]{45, 75, 225, 0, 5, 800, 50, 0};
		gbl_pnlPantallaPrincipal.rowHeights = new int[]{29, 100, 75, 75, 75, 75, 73, 75, 50, 0, 0, 0, 0, 0, 0, 0};
		gbl_pnlPantallaPrincipal.columnWeights = new double[]{1.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, Double.MIN_VALUE};
		gbl_pnlPantallaPrincipal.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		pnlPantallaPrincipal.setLayout(gbl_pnlPantallaPrincipal);
		
		JPanel pnlBotones = new JPanel();
		pnlBotones.setBackground(new Color(255, 228, 196));
		pnlBotones.setBounds(new Rectangle(0, 0, 200, 0));
		GridBagConstraints gbc_pnlBotones = new GridBagConstraints();
		gbc_pnlBotones.gridheight = 11;
		gbc_pnlBotones.gridwidth = 2;
		gbc_pnlBotones.insets = new Insets(0, 0, 5, 5);
		gbc_pnlBotones.fill = GridBagConstraints.BOTH;
		gbc_pnlBotones.gridx = 1;
		gbc_pnlBotones.gridy = 1;
		pnlPantallaPrincipal.add(pnlBotones, gbc_pnlBotones);
		GridBagLayout gbl_pnlBotones = new GridBagLayout();
		gbl_pnlBotones.columnWidths = new int[]{103, 89, 0, 0, 0, 0, 0};
		gbl_pnlBotones.rowHeights = new int[]{90, 50, 90, 50, 90, 50, 90, 50, 100, 0};
		gbl_pnlBotones.columnWeights = new double[]{1.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_pnlBotones.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		pnlBotones.setLayout(gbl_pnlBotones);
		
		 btnParcela = new JButton("Parcelas");
		 btnParcela.setHorizontalTextPosition(SwingConstants.RIGHT);
		 btnParcela.setIcon(new ImageIcon(P_Principal.class.getResource("/presentacion/parcelas.png")));
		 btnParcela.setFont(new Font("Verdana", Font.BOLD, 20));
		 btnParcela.setBackground(Color.WHITE);
		 btnParcela.setBounds(new Rectangle(0, 0, 0, 2000));
		GridBagConstraints gbc_btnParcela = new GridBagConstraints();
		gbc_btnParcela.insets = new Insets(0, 0, 5, 0);
		gbc_btnParcela.fill = GridBagConstraints.BOTH;
		btnParcela.setBorder(new RoundedBorder(12));
		gbc_btnParcela.gridwidth = 6;
		gbc_btnParcela.gridx = 0;
		gbc_btnParcela.gridy = 0;
		pnlBotones.add(btnParcela, gbc_btnParcela);
		
		btnBungalows = new JButton("Bungalows");
		btnBungalows.setIcon(new ImageIcon(P_Principal.class.getResource("/presentacion/bungalow.png")));
		btnBungalows.setBackground(Color.WHITE);
		btnBungalows.setFont(new Font("Verdana", Font.BOLD, 20));
		GridBagConstraints gbc_btnBungalows = new GridBagConstraints();
		btnBungalows.setBorder(new RoundedBorder(12));
		gbc_btnBungalows.gridwidth = 6;
		gbc_btnBungalows.fill = GridBagConstraints.BOTH;
		gbc_btnBungalows.insets = new Insets(0, 0, 5, 0);
		gbc_btnBungalows.gridx = 0;
		gbc_btnBungalows.gridy = 2;
		pnlBotones.add(btnBungalows, gbc_btnBungalows);
		
		btnActividades = new JButton("Actividades");
		btnActividades.setIcon(new ImageIcon(P_Principal.class.getResource("/presentacion/actividades.png")));
		btnActividades.setFont(new Font("Verdana", Font.BOLD, 20));
		btnActividades.setBackground(Color.WHITE);
		GridBagConstraints gbc_btnActividades = new GridBagConstraints();
		gbc_btnActividades.fill = GridBagConstraints.BOTH;
		btnActividades.setBorder(new RoundedBorder(12));
		gbc_btnActividades.gridwidth = 6;
		gbc_btnActividades.insets = new Insets(0, 0, 5, 0);
		gbc_btnActividades.gridx = 0;
		gbc_btnActividades.gridy = 4;
		pnlBotones.add(btnActividades, gbc_btnActividades);
		
		btnRutas = new JButton("Rutas");
		btnRutas.setIcon(new ImageIcon(P_Principal.class.getResource("/presentacion/rutas.png")));
		btnRutas.setFont(new Font("Verdana", Font.BOLD, 20));
		btnRutas.setBackground(Color.WHITE);
		GridBagConstraints gbc_btnRutas = new GridBagConstraints();
		gbc_btnRutas.fill = GridBagConstraints.BOTH;
		btnRutas.setBorder(new RoundedBorder(12));
		gbc_btnRutas.gridwidth = 6;
		gbc_btnRutas.insets = new Insets(0, 0, 5, 0);
		gbc_btnRutas.gridx = 0;
		gbc_btnRutas.gridy = 6;
		pnlBotones.add(btnRutas, gbc_btnRutas);
		
	    btnVolver = new JButton("Volver");
	    btnVolver.setIcon(new ImageIcon(P_Principal.class.getResource("/presentacion/volver-flecha (1).png")));
		btnVolver.setFont(new Font("Verdana", Font.BOLD, 20));
		btnVolver.setBackground(new Color(255, 165, 0));
		GridBagConstraints gbc_btnVolver = new GridBagConstraints();
		gbc_btnVolver.fill = GridBagConstraints.BOTH;
		btnVolver.setBorder(new RoundedBorder(12));
		gbc_btnVolver.gridwidth = 6;
		gbc_btnVolver.insets = new Insets(0, 0, 0, 5);
		gbc_btnVolver.gridx = 0;
		gbc_btnVolver.gridy = 8;
		pnlBotones.add(btnVolver, gbc_btnVolver);
		
		
		
		pnlContenido = new JPanel();
		pnlContenido.setLayout(null);
		GridBagConstraints gbc_pnlContenido = new GridBagConstraints();
		gbc_pnlContenido.gridwidth = 2;
		gbc_pnlContenido.gridheight = 11;
		gbc_pnlContenido.insets = new Insets(0, 0, 5, 5);
		gbc_pnlContenido.fill = GridBagConstraints.BOTH;
		pnlContenido.setBorder(new RoundedBorder(10));
		gbc_pnlContenido.gridx = 4;
		gbc_pnlContenido.gridy = 1;
		pnlPantallaPrincipal.add(pnlContenido, gbc_pnlContenido);
		
		JLabel lblZorroEligeOpcion = new JLabel("");
		lblZorroEligeOpcion.setBounds(10, 11, 818, 638);
		lblZorroEligeOpcion.setHorizontalAlignment(SwingConstants.CENTER);
		lblZorroEligeOpcion.setIcon(new ImageIcon(P_Principal.class.getResource("/presentacion/zorroGrandeTransparencia.png")));
		pnlContenido.add(lblZorroEligeOpcion);
		
		
		
		
		btnParcela.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent e) {
	        	lblZorroEligeOpcion.show(false);
	           V_Parcela  p = new V_Parcela();
	            pnlContenido.add(p);
	            p.show();
	        }
	    });
		
		btnBungalows.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent e) {
	        	lblZorroEligeOpcion.show(false);
	           V_Parcela  p = new V_Parcela();
	            pnlContenido.add(p);
	            p.show();
	        }
	    });
		
		btnActividades.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent e) {
	        	lblZorroEligeOpcion.show(false);
	           V_Parcela  p = new V_Parcela();
	            pnlContenido.add(p);
	            p.show();
	        }
	    });
		
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

	
	
	
	
	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {

		});
	}
}

