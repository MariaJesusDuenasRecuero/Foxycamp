package presentacion;

import java.awt.BorderLayout;
import java.awt.CardLayout;
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
import javax.swing.JButton;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.border.Border;
import javax.swing.JSeparator;
import java.awt.Toolkit;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import java.awt.Cursor;

@SuppressWarnings("serial")
public class P_Principal extends JFrame implements ActionListener{

	private JPanel contentPane;
	private JPanel pnlContenido;
	private JButton btnVolver;
	private JLabel lblZorroEligeOpcion;
	private JFrame frmPrincipal;
	private V_Actividades panelActividades;
	private V_Bungalow panelBungalow;
	private V_Parcela panelParcela;
	private V_Ruta panelRuta;
	private V_RutaInscritos panelRutaInscritos;
	private V_RutaCrear panelRutaCrear;
	private V_inscritos panelInscritosActividades;
	private V_LogoZorro panelLogoZorro;
	private JMenuItem menuRutasDisponibles, RutaCrear,RutaInscritos;
	private V_BungalowsPromociones panelBungalowsPromociones;
	private V_ActHistorial panelHistorialActividades;
	private V_PromocionesActividades panelActividadesPromociones;
	private V_RutaElegida rutaElegida;
	private V_RutaInscribirse rutaInscribirse;
	private V_inscribirse actInscribirse;
	private V_Reserva reservar;
	/**
	 * Create the frame.
	 */
	public P_Principal() {
		frmPrincipal = new JFrame();
		frmPrincipal.setIconImage(Toolkit.getDefaultToolkit().getImage(P_Principal.class.getResource("/presentacion/casa-de-perro.png")));
		frmPrincipal.setTitle("Menú principal");
		frmPrincipal.setResizable(false);
		frmPrincipal.setBounds(new Rectangle(0, 0, 1375, 800));
		frmPrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(255, 153, 0));
		contentPane.setBackground(new Color(255, 228, 196));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		frmPrincipal.getContentPane().add(contentPane);

		JPanel pnlHeader = new JPanel();
		pnlHeader.setBackground(new Color(255, 228, 196));
		contentPane.add(pnlHeader, BorderLayout.NORTH);
		GridBagLayout gbl_pnlHeader = new GridBagLayout();
		gbl_pnlHeader.columnWidths = new int[] { 50, 44, 64, 300, 0, 0, 358, 92, 50, 50, 64, 64, 0, 28, 0, 0, 0, 0 };
		gbl_pnlHeader.rowHeights = new int[] { 50, 0, 50, 0 };
		gbl_pnlHeader.columnWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
				0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
		gbl_pnlHeader.rowWeights = new double[] { 0.0, 0.0, 0.0, Double.MIN_VALUE };
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
		lblAyuda.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblAyuda.setIcon(
				new ImageIcon(P_Principal.class.getResource("/presentacion/signo-de-interrogacion-dibujar.png")));
		lblAyuda.setToolTipText("Ayuda");
		GridBagConstraints gbc_lblAyuda = new GridBagConstraints();
		gbc_lblAyuda.anchor = GridBagConstraints.SOUTH;
		gbc_lblAyuda.insets = new Insets(0, 0, 5, 5);
		gbc_lblAyuda.gridx = 10;
		gbc_lblAyuda.gridy = 1;
		pnlHeader.add(lblAyuda, gbc_lblAyuda);
		lblAyuda.addMouseListener(new LblAyudaMouseListener());

		JLabel lblTraductor = new JLabel("");
		lblTraductor.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblTraductor.setIcon(new ImageIcon(P_Principal.class.getResource("/presentacion/traductor.png")));
		lblTraductor.setToolTipText("Traductor");
		GridBagConstraints gbc_lblTraductor = new GridBagConstraints();
		gbc_lblTraductor.anchor = GridBagConstraints.SOUTH;
		gbc_lblTraductor.insets = new Insets(0, 0, 5, 5);
		gbc_lblTraductor.gridx = 11;
		gbc_lblTraductor.gridy = 1;
		pnlHeader.add(lblTraductor, gbc_lblTraductor);

		JLabel lblPerfil = new JLabel("");
		lblPerfil.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblPerfil.setIcon(new ImageIcon(P_Principal.class.getResource("/presentacion/usuario.png")));
		GridBagConstraints gbc_lblPerfil = new GridBagConstraints();
		gbc_lblPerfil.anchor = GridBagConstraints.SOUTH;
		gbc_lblPerfil.insets = new Insets(0, 0, 5, 5);
		gbc_lblPerfil.gridx = 12;
		gbc_lblPerfil.gridy = 1;
		pnlHeader.add(lblPerfil, gbc_lblPerfil);

		JLabel lblFlecha = new JLabel("");

		lblFlecha.setIcon(
				new ImageIcon(P_Principal.class.getResource("/presentacion/flecha-hacia-abajo-del-angulo.png")));

		JPopupMenu pmFlecha = new JPopupMenu();
		pmFlecha.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		addPopup(lblFlecha, pmFlecha);

		JLabel lblPerfilOption = new JLabel("    Adrián Ruiz");
		lblPerfilOption.setFont(new Font("Verdana", Font.PLAIN, 14));
		lblPerfilOption.setIcon(new ImageIcon(P_Principal.class.getResource("/presentacion/PerfilAdri.png")));
		pmFlecha.add(lblPerfilOption);

		JSeparator separator = new JSeparator();
		separator.setBorder(new LineBorder(new Color(255, 200, 0), 10));
		pmFlecha.add(separator);

		JButton btnAbout = new JButton("   Sobre nosotros");
		btnAbout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				P_About frmAbout = new P_About();
				frmAbout.getFrame().setVisible(true);
				frmPrincipal.dispose();
			}
		});
		btnAbout.setBounds(new Rectangle(0, 0, 70, 0));
		btnAbout.setIcon(new ImageIcon(P_Principal.class.getResource("/presentacion/IconAboutUs.png")));
		pmFlecha.add(btnAbout);

		JSeparator separator_1 = new JSeparator();
		separator_1.setBorder(new LineBorder(Color.ORANGE, 10));
		pmFlecha.add(separator_1);

		JButton btnAjustes = new JButton("   Ajustes               ");
		btnAjustes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				P_Perfil frmPerfil = new P_Perfil();
				frmPerfil.getFrame().setVisible(true);
				frmPrincipal.dispose();
			}
		});
		btnAjustes.setIcon(new ImageIcon(P_Principal.class.getResource("/presentacion/configuraciones.png")));
		pmFlecha.add(btnAjustes);

		JButton btnDesconectar = new JButton("   Salir                     ");
		btnDesconectar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				P_Login frmLogin = new P_Login();
				frmLogin.getFrame().setVisible(true);
				frmPrincipal.dispose();
			}
		});
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setForeground(new Color(255, 204, 51));
		pmFlecha.add(separator_2);
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
		gbc_lblNewLabel_1.gridwidth = 16;
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 0, 5);
		gbc_lblNewLabel_1.gridx = 1;
		gbc_lblNewLabel_1.gridy = 2;
		pnlHeader.add(lblNewLabel_1, gbc_lblNewLabel_1);

		JPanel pnlPantallaPrincipal = new JPanel();
		pnlPantallaPrincipal.setBackground(new Color(255, 228, 196));
		contentPane.add(pnlPantallaPrincipal, BorderLayout.CENTER);
		pnlPantallaPrincipal.setLayout(null);

		JPanel pnlBotones = new JPanel();
		pnlBotones.setFont(new Font("Verdana", Font.BOLD, 20));
		pnlBotones.setBackground(new Color(255, 228, 196));
		pnlBotones.setBounds(new Rectangle(0, 0, 293, 575));
		pnlPantallaPrincipal.add(pnlBotones);
		pnlBotones.setLayout(null);

		btnVolver = new JButton("Volver");
		btnVolver.addActionListener(new BtnVolverActionListener());
		btnVolver.setBounds(37, 542, 242, 33);
		pnlBotones.add(btnVolver);
		btnVolver.setIcon(new ImageIcon(P_Principal.class.getResource("/presentacion/volver-flecha (1).png")));
		btnVolver.setFont(new Font("Verdana", Font.BOLD, 20));
		btnVolver.setBackground(new Color(255, 165, 0));
		btnVolver.setBorder(new RoundedBorder(12));
		
		JMenuBar menuRuta = new JMenuBar();
		menuRuta.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		menuRuta.setBackground(Color.WHITE);
		menuRuta.setForeground(Color.WHITE);
		menuRuta.setBounds(37, 400, 242, 65);
		pnlBotones.add(menuRuta);
		
		JLabel lblVacia = new JLabel("       ");
		menuRuta.add(lblVacia);
		
		JMenu mnRuta_1 = new JMenu("Ruta         ");
		mnRuta_1.setIcon(new ImageIcon(P_Principal.class.getResource("/presentacion/rutas.png")));
		mnRuta_1.setForeground(Color.BLACK);
		mnRuta_1.setFont(new Font("Verdana", Font.BOLD, 20));
		mnRuta_1.setBorder(null);
		mnRuta_1.setBackground(Color.WHITE);
		menuRuta.add(mnRuta_1);
		
		menuRutasDisponibles = new JMenuItem("Rutas disponibles");
		menuRutasDisponibles.addActionListener(new BtnRutasDisponiblesActionListener());
		mnRuta_1.add(menuRutasDisponibles);
		
		RutaCrear = new JMenuItem("Crear ruta");
		RutaCrear.addActionListener(new BtnRutaCrearActionListener());
		mnRuta_1.add(RutaCrear);
		
		RutaInscritos = new JMenuItem("Inscritos a la ruta");
		RutaInscritos.addActionListener(new BtnRutaInscritosActionListener());
		mnRuta_1.add(RutaInscritos);
		
		JMenuBar menuActividades = new JMenuBar();
		menuActividades.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		menuActividades.setBackground(Color.WHITE);
		menuActividades.setBounds(37, 270, 242, 65);
		pnlBotones.add(menuActividades);
		
		JLabel lblVaciaAct = new JLabel("       ");
		menuActividades.add(lblVaciaAct);
		
		JMenu mnActiv = new JMenu("Actividades");
		mnActiv.setBorder(null);
		mnActiv.setFont(new Font("Verdana", Font.BOLD, 20));
		mnActiv.setIcon(new ImageIcon(P_Principal.class.getResource("/presentacion/actividades.png")));
		menuActividades.add(mnActiv);
		
		JMenuItem mntmVerActividades = new JMenuItem("Ver actividades");
		mntmVerActividades.addActionListener(new BtnVerActividadeesActionListener());
		mnActiv.add(mntmVerActividades);
		
		JMenuItem mntmPromocionesAct = new JMenuItem("Promociones");
		mntmPromocionesAct.addActionListener(new BtnPromocionesActActionListener());
		mnActiv.add(mntmPromocionesAct);
		
		JMenuItem mntmHistorialAct = new JMenuItem("Historial");
		mntmHistorialAct.addActionListener(new BtnHistorialActActionListener());
		mnActiv.add(mntmHistorialAct);
		
		JMenuItem mntmInscritosAct = new JMenuItem("Inscritos");
		mntmInscritosAct.addActionListener(new BtnInscritosActActionListener());
		mnActiv.add(mntmInscritosAct);
		
		JMenuBar menuBungalows = new JMenuBar();
		menuBungalows.setBackground(Color.WHITE);
		menuBungalows.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		menuBungalows.setBounds(37, 140, 242, 65);
		pnlBotones.add(menuBungalows);
		
		JLabel lblVaciaBunga = new JLabel("       ");
		menuBungalows.add(lblVaciaBunga);
		
		JMenu mnBungalows = new JMenu("Bungalows");
		mnBungalows.setIcon(new ImageIcon(P_Principal.class.getResource("/presentacion/bungalow.png")));
		mnBungalows.setFont(new Font("Verdana", Font.BOLD, 20));
		menuBungalows.add(mnBungalows);
		
		JMenuItem mntmBungalows = new JMenuItem("Bungalows");
		mntmBungalows.addActionListener(new BtnBungalowsActionListener());
		mnBungalows.add(mntmBungalows);
		JMenuItem mntmPromosBungalow = new JMenuItem("Promociones");
		mntmPromosBungalow.addActionListener(new BtnPromosBungalowsActionListener());
		
		mnBungalows.add(mntmPromosBungalow);
		
		JMenuBar menuParcelas = new JMenuBar();
		menuParcelas.setBackground(Color.WHITE);
		menuParcelas.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		menuParcelas.setBounds(37, 10, 242, 65);
		pnlBotones.add(menuParcelas);
		
		JLabel lblVaciaParcela = new JLabel("       ");
		menuParcelas.add(lblVaciaParcela);
		
		JMenu mnParcela = new JMenu("Parcelas");
		mnParcela.setFont(new Font("Verdana", Font.BOLD, 20));
		mnParcela.setIcon(new ImageIcon(P_Principal.class.getResource("/presentacion/parcelas.png")));
		menuParcelas.add(mnParcela);
		
		JMenuItem mntmParcelas = new JMenuItem("Parcelas");
		mntmParcelas.addActionListener(new BtnParcelasActionListener());
		mnParcela.add(mntmParcelas);
		btnVolver.addActionListener(new BtnLogoZorroActionListener());

		pnlContenido = new JPanel();
		pnlContenido.setBounds(303, 0, 1001, 575);
		pnlContenido.setBorder(new RoundedBorder(10));
		pnlPantallaPrincipal.add(pnlContenido);
		pnlContenido.setLayout(new CardLayout(0, 0));

		lblZorroEligeOpcion = new JLabel("");
		lblZorroEligeOpcion.setHorizontalAlignment(SwingConstants.CENTER);
		lblZorroEligeOpcion.setIcon(new ImageIcon(P_Principal.class.getResource("/presentacion/zorroGrandeTransparencia.png")));
		pnlContenido.add(lblZorroEligeOpcion, "lblZorro");
		
		panelLogoZorro = new V_LogoZorro();
		pnlContenido.add(panelLogoZorro, "panellogoZorro");
		
		panelRuta = new V_Ruta(pnlContenido);
		pnlContenido.add(panelRuta, "Ruta");
		
		rutaElegida = new V_RutaElegida(pnlContenido);
		pnlContenido.add(rutaElegida, "rutaElegida");
		
		panelHistorialActividades = new V_ActHistorial();
		pnlContenido.add(panelHistorialActividades, "panelHistorialActividades");
		
		actInscribirse = new V_inscribirse();
		pnlContenido.add(actInscribirse, "actInscribirse");
		
		rutaInscribirse = new V_RutaInscribirse();
		pnlContenido.add(rutaInscribirse, "rutaInscribirse");
		
		reservar = new V_Reserva();
		pnlContenido.add(reservar, "reservar");

		CardLayout c1 = (CardLayout)(pnlContenido.getLayout());
		c1.show(pnlContenido, "panellogoZorro");

	}
	
	private class BtnRutaCrearActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			panelRutaCrear = new V_RutaCrear();
			pnlContenido.add(panelRutaCrear, "RutaCrear");
			CardLayout c1 = (CardLayout)(pnlContenido.getLayout());
			c1.show(pnlContenido, "RutaCrear");
		}
	}
	
	private class BtnRutasDisponiblesActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			panelRuta = new V_Ruta(pnlContenido);
			pnlContenido.add(panelRuta, "Ruta");
			CardLayout c1 = (CardLayout)(pnlContenido.getLayout());
			c1.show(pnlContenido, "Ruta");
		}
	}
	
	private class BtnRutaInscritosActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			panelRutaInscritos = new V_RutaInscritos();
			pnlContenido.add(panelRutaInscritos, "RutaInscritos");
			CardLayout c1 = (CardLayout)(pnlContenido.getLayout());
			c1.show(pnlContenido, "RutaInscritos");
		}
	}
	private class BtnVerActividadeesActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			panelActividades = new V_Actividades(pnlContenido);
			pnlContenido.add(panelActividades, "Actividades");
			CardLayout c1 = (CardLayout)(pnlContenido.getLayout());
			c1.show(pnlContenido, "Actividades");
		}
	}
	private class BtnHistorialActActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			panelHistorialActividades = new V_ActHistorial();
			pnlContenido.add(panelHistorialActividades, "panelHistorialActividades");
			CardLayout c1 = (CardLayout)(pnlContenido.getLayout());
			c1.show(pnlContenido, "panelHistorialActividades");
		}	
	}

	private class BtnBungalowsActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			panelBungalow = new V_Bungalow(pnlContenido);
			pnlContenido.add(panelBungalow, "Bungalow");
			CardLayout c1 = (CardLayout)(pnlContenido.getLayout());
			c1.show(pnlContenido, "Bungalow");
		}
	}
	private class BtnPromocionesActActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			panelActividadesPromociones = new V_PromocionesActividades();
			pnlContenido.add(panelActividadesPromociones, "panelActividadesPromociones");
			CardLayout c1 = (CardLayout)(pnlContenido.getLayout());
			c1.show(pnlContenido, "panelActividadesPromociones");
		}
	}
	
	private class BtnPromosBungalowsActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			panelBungalowsPromociones = new V_BungalowsPromociones();
			pnlContenido.add(panelBungalowsPromociones, "panelBungalowsPromociones");
			CardLayout c1 = (CardLayout)(pnlContenido.getLayout());
			c1.show(pnlContenido, "panelBungalowsPromociones");
		}
	}
	private class BtnInscritosActActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			panelInscritosActividades = new V_inscritos();
			pnlContenido.add(panelInscritosActividades, "ActividadesInscritos");
			CardLayout c1 = (CardLayout)(pnlContenido.getLayout());
			c1.show(pnlContenido, "ActividadesInscritos");
		}
	}
	
	private class BtnParcelasActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			panelParcela = new V_Parcela(pnlContenido);
			pnlContenido.add(panelParcela, "Parcela");
			CardLayout c1 = (CardLayout)(pnlContenido.getLayout());
			c1.show(pnlContenido, "Parcela");
		}
	}
	
	public JPanel getPnlContenido() {
		return pnlContenido;
	}
	
	public void setPnlContenido(JPanel pnlContenido) {
		this.pnlContenido = pnlContenido;
	}

	private class BtnLogoZorroActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			CardLayout c1 = (CardLayout)(pnlContenido.getLayout());
			c1.show(pnlContenido, "panellogoZorro");
		}
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

	 public void actionPerformed(ActionEvent e){
		 CardLayout c1 = (CardLayout)(pnlContenido.getLayout());
		    if(e.getSource() == menuRutasDisponibles){
		    	panelActividades = new V_Actividades(pnlContenido);
				pnlContenido.add(panelActividades, "Actividades");
		    	c1.show(pnlContenido, "Actividades");
		    }
		    if(e.getSource() == RutaCrear){
		     
		    }
		    if(e.getSource() == RutaInscritos){
		      
		    }
		  }  
	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {

		});
	}

	private class BtnVolverActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			lblZorroEligeOpcion.show(false);
			V_LogoZorro iconZorro = new V_LogoZorro();
			pnlContenido.add(iconZorro);
			iconZorro.show();

		}
	}

	public JFrame getFrame() {
		return frmPrincipal;
	}

	private class LblAyudaMouseListener extends MouseAdapter {
		@Override
		public void mouseClicked(MouseEvent e) {
			P_Ayuda frmAyuda = new P_Ayuda();
			frmAyuda.getFrame().setVisible(true);
			frmPrincipal.dispose();
		}
	}
}