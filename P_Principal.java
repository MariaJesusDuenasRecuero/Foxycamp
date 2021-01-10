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
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import javax.swing.border.Border;
import javax.swing.JSeparator;
import java.awt.Toolkit;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import java.awt.Cursor;

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
	private V_VerReservasParcelas reservasP;
	private V_VerReservasBungalows reservasB;
	private String nombreAux;
	private Icon iconAux;
	
	/**
	 * Create the frame.
	 */
	public P_Principal(String nombre, Icon icon) {
		nombreAux= nombre;
		iconAux = icon;
		frmPrincipal = new JFrame();
		frmPrincipal.getContentPane().setBackground(Color.WHITE);
		frmPrincipal.setIconImage(Toolkit.getDefaultToolkit().getImage(P_Principal.class.getResource("/presentacion/casa-de-perro.png"))); //$NON-NLS-1$
		frmPrincipal.setTitle(MessagesPrincipal.getString("P_Principal.frmPrincipal.title")); //$NON-NLS-1$
		frmPrincipal.setResizable(false);
		frmPrincipal.setBounds(new Rectangle(0, 0, 1375, 800));
		frmPrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(255, 153, 0));
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		frmPrincipal.getContentPane().add(contentPane);

		JPanel pnlHeader = new JPanel();
		pnlHeader.setBackground(new Color(255, 228, 196));
		contentPane.add(pnlHeader, BorderLayout.NORTH);
		
		GridBagLayout gbl_pnlHeader = new GridBagLayout();
		gbl_pnlHeader.columnWidths = new int[] { 50, 44, 64, 300, 0, 0, 358, 92, 50, 50, 64, 46, 18, 0, 0, 0, 0 };
		gbl_pnlHeader.rowHeights = new int[] { 50, 0, 50, 0 };
		gbl_pnlHeader.columnWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
				0.0, 0.0, Double.MIN_VALUE };
		gbl_pnlHeader.rowWeights = new double[] { 0.0, 1.0, 0.0, Double.MIN_VALUE };
		pnlHeader.setLayout(gbl_pnlHeader);

		JLabel lblLogoZorro = new JLabel(""); //$NON-NLS-1$
		lblLogoZorro.setBackground(new Color(255, 228, 181));
		lblLogoZorro.setIcon(new ImageIcon(P_About.class.getResource("/presentacion/fox.png"))); //$NON-NLS-1$
		GridBagConstraints gbc_lblLogoZorro = new GridBagConstraints();
		gbc_lblLogoZorro.insets = new Insets(0, 0, 5, 5);
		gbc_lblLogoZorro.gridx = 2;
		gbc_lblLogoZorro.gridy = 1;
		pnlHeader.add(lblLogoZorro, gbc_lblLogoZorro);

		JLabel lblFoxycamp = new JLabel("FOXYCAMP"); //$NON-NLS-1$
		lblFoxycamp.setForeground(new Color(210, 105, 30));
		lblFoxycamp.setFont(new Font("Verdana", Font.BOLD, 40)); //$NON-NLS-1$
		GridBagConstraints gbc_lblFoxycamp = new GridBagConstraints();
		gbc_lblFoxycamp.insets = new Insets(0, 0, 5, 5);
		gbc_lblFoxycamp.gridx = 3;
		gbc_lblFoxycamp.gridy = 1;
		pnlHeader.add(lblFoxycamp, gbc_lblFoxycamp);

		JLabel lblAyuda = new JLabel(""); //$NON-NLS-1$
		lblAyuda.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblAyuda.addMouseListener(new LblAyudaMouseListener());
		lblAyuda.setToolTipText(""); //$NON-NLS-1$
		lblAyuda.setIcon(new ImageIcon(P_About.class.getResource("/presentacion/signo-de-interrogacion-dibujar.png"))); //$NON-NLS-1$
		GridBagConstraints gbc_lblAyuda = new GridBagConstraints();
		gbc_lblAyuda.anchor = GridBagConstraints.SOUTH;
		gbc_lblAyuda.insets = new Insets(0, 0, 5, 5);
		gbc_lblAyuda.gridx = 10;
		gbc_lblAyuda.gridy = 1;
		pnlHeader.add(lblAyuda, gbc_lblAyuda);
		
				JLabel lblTraductor = new JLabel(""); //$NON-NLS-1$
				lblTraductor.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
				lblTraductor.setToolTipText(""); //$NON-NLS-1$
				lblTraductor.setIcon(new ImageIcon(P_About.class.getResource("/presentacion/traductor.png"))); //$NON-NLS-1$
				GridBagConstraints gbc_lblTraductor = new GridBagConstraints();
				gbc_lblTraductor.anchor = GridBagConstraints.SOUTH;
				gbc_lblTraductor.insets = new Insets(0, 0, 5, 5);
				gbc_lblTraductor.gridx = 11;
				gbc_lblTraductor.gridy = 1;
				pnlHeader.add(lblTraductor, gbc_lblTraductor);
		
		JLabel lblFlechaTraductor = new JLabel(""); //$NON-NLS-1$
		lblFlechaTraductor.setIcon(new ImageIcon(P_About.class.getResource("/presentacion/flecha-hacia-abajo-del-angulo.png"))); //$NON-NLS-1$
		
		JPopupMenu pmFlecha2 = new JPopupMenu();
		pmFlecha2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		addPopup(lblFlechaTraductor, pmFlecha2);
		
		JButton btnEspanol = new JButton(MessagesPrincipal.getString("P_Principal.btnEspanol.text")); //$NON-NLS-1$ //$NON-NLS-1$ //$NON-NLS-1$
		btnEspanol.setFont(new Font("Verdana", Font.BOLD, 12));
		btnEspanol.setHorizontalAlignment(SwingConstants.LEFT);
		btnEspanol.setIcon(new ImageIcon(P_Principal.class.getResource("/presentacion/lengua-espanola.png")));
		btnEspanol.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MessagesP_About.setIdioma("español"); //$NON-NLS-1$
				MessagesP_Ayuda.setIdioma("español");
				MessagesP_Login.setIdioma("español");
				MessagesP_Perfil.setIdioma("español");
				MessagesP_Registro.setIdioma("español");
				MessagesPrincipal.setIdioma("español");
				
				MessagesV_ActHistorial.setIdioma("español"); //$NON-NLS-1$
				MessagesV_Actividades.setIdioma("español");
				MessagesV_Bungalows.setIdioma("español");
				MessagesV_BungalowsPromociones.setIdioma("español");
				MessagesV_Formacion.setIdioma("español");
				MessagesV_Informacion.setIdioma("español");
				MessagesV_Inscribirse.setIdioma("español"); //$NON-NLS-1$
				MessagesV_Inscritos.setIdioma("español");
				MessagesV_Parcela.setIdioma("español");
				MessagesV_PerfilCerrarCuenta.setIdioma("español");
				MessagesV_PerfilContrasena.setIdioma("español");
				MessagesV_PromocionesActividades.setIdioma("español");
				MessagesV_Reservas.setIdioma("español"); //$NON-NLS-1$
				MessagesV_Ruta.setIdioma("español");
				MessagesV_RutaCrear.setIdioma("español");
				MessagesV_RutaElegida.setIdioma("español");
				MessagesV_RutaInscribirse.setIdioma("español");
				MessagesV_RutaInscritos.setIdioma("español");
				MessagesV_VerReservasBungalows.setIdioma("español");
				MessagesV_VerReservasParcelas.setIdioma("español");
				
				P_Principal frm = new P_Principal(nombre,icon);
				frmPrincipal.dispose();
				frm.getFrame().setVisible(true);
			}
		});
		pmFlecha2.add(btnEspanol);
		
		JButton btnIngles = new JButton(MessagesPrincipal.getString("P_Principal.btnIngles.text"));
		btnIngles.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnIngles.setHorizontalAlignment(SwingConstants.LEFT);
		btnIngles.setFont(new Font("Verdana", Font.BOLD, 12));
		btnIngles.setIcon(new ImageIcon(P_Principal.class.getResource("/presentacion/idioma-en-ingles.png")));
		btnIngles.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MessagesP_About.setIdioma("inglés"); //$NON-NLS-1$
				MessagesP_Ayuda.setIdioma("inglés");
				MessagesP_Login.setIdioma("inglés");
				MessagesP_Perfil.setIdioma("inglés");
				MessagesP_Registro.setIdioma("inglés");
				MessagesPrincipal.setIdioma("inglés");
				
				MessagesV_ActHistorial.setIdioma("inglés"); //$NON-NLS-1$
				MessagesV_Actividades.setIdioma("inglés");
				MessagesV_Bungalows.setIdioma("inglés");
				MessagesV_BungalowsPromociones.setIdioma("inglés");
				MessagesV_Formacion.setIdioma("inglés");
				MessagesV_Informacion.setIdioma("inglés");
				MessagesV_Inscribirse.setIdioma("inglés"); //$NON-NLS-1$
				MessagesV_Inscritos.setIdioma("inglés");
				MessagesV_Parcela.setIdioma("inglés");
				MessagesV_PerfilCerrarCuenta.setIdioma("inglés");
				MessagesV_PerfilContrasena.setIdioma("inglés");
				MessagesV_PromocionesActividades.setIdioma("inglés");
				MessagesV_Reservas.setIdioma("inglés"); //$NON-NLS-1$
				MessagesV_Ruta.setIdioma("inglés");
				MessagesV_RutaCrear.setIdioma("inglés");
				MessagesV_RutaElegida.setIdioma("inglés");
				MessagesV_RutaInscribirse.setIdioma("inglés");
				MessagesV_RutaInscritos.setIdioma("inglés");
				MessagesV_VerReservasBungalows.setIdioma("inglés");
				MessagesV_VerReservasParcelas.setIdioma("inglés");
				
				P_Principal frm = new P_Principal(nombre,icon);
				frmPrincipal.dispose();
				frm.getFrame().setVisible(true);
			}
		});
		pmFlecha2.add(btnIngles);
		GridBagConstraints gbc_lblFlechaTraductor = new GridBagConstraints();
		gbc_lblFlechaTraductor.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblFlechaTraductor.anchor = GridBagConstraints.SOUTH;
		gbc_lblFlechaTraductor.insets = new Insets(0, 0, 5, 5);
		gbc_lblFlechaTraductor.gridx = 12;
		gbc_lblFlechaTraductor.gridy = 1;
		pnlHeader.add(lblFlechaTraductor, gbc_lblFlechaTraductor);
		
		JLabel lblPerfil = new JLabel(""); //$NON-NLS-1$
		lblPerfil.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblPerfil.setIcon(new ImageIcon(P_About.class.getResource("/presentacion/usuario.png"))); //$NON-NLS-1$
		GridBagConstraints gbc_lblPerfil = new GridBagConstraints();
		gbc_lblPerfil.anchor = GridBagConstraints.SOUTH;
		gbc_lblPerfil.insets = new Insets(0, 0, 5, 5);
		gbc_lblPerfil.gridx = 13;
		gbc_lblPerfil.gridy = 1;
		pnlHeader.add(lblPerfil, gbc_lblPerfil);
		
		JLabel lblFlechaPerfil = new JLabel(""); //$NON-NLS-1$
		lblFlechaPerfil.setIcon(new ImageIcon(P_About.class.getResource("/presentacion/flecha-hacia-abajo-del-angulo.png"))); //$NON-NLS-1$
		GridBagConstraints gbc_lblFlechaPerfil = new GridBagConstraints();
		gbc_lblFlechaPerfil.anchor = GridBagConstraints.SOUTHWEST;
		gbc_lblFlechaPerfil.insets = new Insets(0, 0, 5, 5);
		gbc_lblFlechaPerfil.gridx = 14;
		gbc_lblFlechaPerfil.gridy = 1;
		pnlHeader.add(lblFlechaPerfil, gbc_lblFlechaPerfil);
		JPopupMenu pmFlecha = new JPopupMenu();
		pmFlecha.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		addPopup(lblFlechaPerfil, pmFlecha);
		
		JLabel lblPerfilOption = new JLabel(nombre);
		lblPerfilOption.setIcon(nuevoIcono(nombre));
		pmFlecha.add(lblPerfilOption);
		
		LocalDate date = LocalDate.now(); // Gets the current date
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		String date_cu = date.format(formatter);
		JLabel lblUltimaFecha = new JLabel("Última fecha: " + date_cu);
		lblUltimaFecha.setFont(new Font("Verdana", Font.PLAIN, 9));
		pmFlecha.add(lblUltimaFecha);
		
		JButton btnAbout = new JButton(MessagesPrincipal.getString("P_Principal.btnAbout.text")); //$NON-NLS-1$
        btnAbout.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                P_About frmAbout = new P_About(nombre, icon);
                frmAbout.getFrame().setVisible(true);
                frmPrincipal.dispose();
            }
        });
        btnAbout.setBounds(new Rectangle(0, 0, 70, 0));
        btnAbout.setIcon(new ImageIcon(P_Principal.class.getResource("/presentacion/IconAboutUs.png")));
        pmFlecha.add(btnAbout);
        
		JButton btnAjustes = new JButton(MessagesPrincipal.getString("P_Principal.btnAjustes.text")); //$NON-NLS-1$ //$NON-NLS-1$ //$NON-NLS-1$
		btnAjustes.setBounds(new Rectangle(0, 0, 70, 0));
		btnAjustes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				P_Perfil frmPerfil = new P_Perfil(nombre,icon);				
				frmPerfil.getFrame().setVisible(true);
				frmPrincipal.setVisible(false);
				frmPerfil.dispose();
			}
		});
		
		JSeparator separator = new JSeparator();
		pmFlecha.add(separator);
		btnAjustes.setIcon(new ImageIcon(P_About.class.getResource("/presentacion/configuraciones.png"))); //$NON-NLS-1$
		pmFlecha.add(btnAjustes);
		
		JButton btnDesconectar = new JButton(MessagesPrincipal.getString("P_Principal.btnDesconectar.text")); //$NON-NLS-1$ //$NON-NLS-1$ //$NON-NLS-1$
		btnDesconectar.setBounds(new Rectangle(0, 0, 70, 0));
		btnDesconectar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				P_Login frmLogin = new P_Login();
				frmLogin.getFrame().setVisible(true);
				frmPrincipal.dispose();
			}
		});
		
		JSeparator separator_1 = new JSeparator();
		pmFlecha.add(separator_1);
		btnDesconectar.setIcon(new ImageIcon(P_About.class.getResource("/presentacion/desconectar.png"))); //$NON-NLS-1$
		pmFlecha.add(btnDesconectar);
		
		lblFlechaPerfil.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				pmFlecha.show(e.getComponent(), e.getX(), e.getY());
			}
		});
		
		lblFlechaTraductor.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				pmFlecha2.show(e.getComponent(), e.getX(), e.getY());
			}
		});

		JLabel lblLeftLine = new JLabel(""); //$NON-NLS-1$
		lblLeftLine.setAlignmentX(Component.CENTER_ALIGNMENT);
		lblLeftLine.setVerticalAlignment(SwingConstants.BOTTOM);
		lblLeftLine.setHorizontalAlignment(SwingConstants.LEFT);
		lblLeftLine.setBorder(new LineBorder(new Color(210, 105, 30), 2, true));
		GridBagConstraints gbc_lblLeftLine = new GridBagConstraints();
		gbc_lblLeftLine.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblLeftLine.gridwidth = 13;
		gbc_lblLeftLine.insets = new Insets(0, 0, 0, 5);
		gbc_lblLeftLine.gridx = 1;
		gbc_lblLeftLine.gridy = 2;
		pnlHeader.add(lblLeftLine, gbc_lblLeftLine);

		JPanel pnlPantallaPrincipal = new JPanel();
		pnlPantallaPrincipal.setBackground(new Color(255, 228, 196));
		contentPane.add(pnlPantallaPrincipal, BorderLayout.CENTER);
		pnlPantallaPrincipal.setLayout(null);

		JPanel pnlBotones = new JPanel();
		pnlBotones.setFont(new Font("Verdana", Font.BOLD, 20)); //$NON-NLS-1$
		pnlBotones.setBackground(new Color(255, 228, 196));
		pnlBotones.setBounds(new Rectangle(0, 0, 293, 575));
		pnlPantallaPrincipal.add(pnlBotones);
		pnlBotones.setLayout(null);

		btnVolver = new JButton(MessagesPrincipal.getString("P_Principal.btnVolver.text")); //$NON-NLS-1$ //$NON-NLS-1$
		btnVolver.addActionListener(new BtnVolverActionListener());
		btnVolver.setBounds(37, 542, 242, 33);
		pnlBotones.add(btnVolver);
		btnVolver.setIcon(new ImageIcon(P_Principal.class.getResource("/presentacion/volver-flecha (1).png"))); //$NON-NLS-1$
		btnVolver.setFont(new Font("Verdana", Font.BOLD, 20)); //$NON-NLS-1$
		btnVolver.setBackground(new Color(255, 165, 0));
		btnVolver.setBorder(new RoundedBorder(12));
		
		JMenuBar menuRuta = new JMenuBar();
		menuRuta.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		menuRuta.setBackground(Color.WHITE);
		menuRuta.setForeground(Color.WHITE);
		menuRuta.setBounds(37, 400, 242, 65);
		pnlBotones.add(menuRuta);
		
		JLabel lblVacia = new JLabel("       "); //$NON-NLS-1$
		menuRuta.add(lblVacia);
		
		JMenu mnRuta_1 = new JMenu(MessagesPrincipal.getString("P_Principal.mnRuta_1.text")); //$NON-NLS-1$ //$NON-NLS-1$
		mnRuta_1.setIcon(new ImageIcon(P_Principal.class.getResource("/presentacion/rutas.png"))); //$NON-NLS-1$
		mnRuta_1.setForeground(Color.BLACK);
		mnRuta_1.setFont(new Font("Verdana", Font.BOLD, 20)); //$NON-NLS-1$
		mnRuta_1.setBorder(null);
		mnRuta_1.setBackground(Color.WHITE);
		menuRuta.add(mnRuta_1);
		
		menuRutasDisponibles = new JMenuItem(MessagesPrincipal.getString("P_Principal.menuRutasDisponibles.text")); //$NON-NLS-1$
		menuRutasDisponibles.addActionListener(new BtnRutasDisponiblesActionListener());
		mnRuta_1.add(menuRutasDisponibles);
		
		RutaCrear = new JMenuItem(MessagesPrincipal.getString("P_Principal.RutaCrear.text")); //$NON-NLS-1$
		RutaCrear.addActionListener(new BtnRutaCrearActionListener());
		mnRuta_1.add(RutaCrear);
		
		RutaInscritos = new JMenuItem(MessagesPrincipal.getString("P_Principal.RutaInscritos.text")); //$NON-NLS-1$
		RutaInscritos.addActionListener(new BtnRutaInscritosActionListener());
		mnRuta_1.add(RutaInscritos);
		
		JMenuBar menuActividades = new JMenuBar();
		menuActividades.setForeground(Color.BLACK);
		menuActividades.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		menuActividades.setBackground(Color.WHITE);
		menuActividades.setBounds(37, 270, 242, 65);
		pnlBotones.add(menuActividades);
		
		JLabel lblVaciaAct = new JLabel("       "); //$NON-NLS-1$
		lblVaciaAct.setForeground(Color.BLACK);
		menuActividades.add(lblVaciaAct);
		
		JMenu mnActiv = new JMenu(MessagesPrincipal.getString("P_Principal.mnActiv.text")); //$NON-NLS-1$
		mnActiv.setForeground(Color.BLACK);
		mnActiv.setBorder(null);
		mnActiv.setFont(new Font("Verdana", Font.BOLD, 20)); //$NON-NLS-1$
		mnActiv.setIcon(new ImageIcon(P_Principal.class.getResource("/presentacion/actividades.png"))); //$NON-NLS-1$
		menuActividades.add(mnActiv);
		
		JMenuItem mntmVerActividades = new JMenuItem(MessagesPrincipal.getString("P_Principal.mntmVerActividades.text")); //$NON-NLS-1$
		mntmVerActividades.addActionListener(new BtnVerActividadeesActionListener());
		mnActiv.add(mntmVerActividades);
		
		JMenuItem mntmPromocionesAct = new JMenuItem(MessagesPrincipal.getString("P_Principal.mntmPromocionesAct.text")); //$NON-NLS-1$
		mntmPromocionesAct.addActionListener(new BtnPromocionesActActionListener());
		mnActiv.add(mntmPromocionesAct);
		
		JMenuItem mntmHistorialAct = new JMenuItem(MessagesPrincipal.getString("P_Principal.mntmHistorialAct.text")); //$NON-NLS-1$
		mntmHistorialAct.addActionListener(new BtnHistorialActActionListener());
		mnActiv.add(mntmHistorialAct);
		
		JMenuItem mntmInscritosAct = new JMenuItem(MessagesPrincipal.getString("P_Principal.mntmInscritosAct.text")); //$NON-NLS-1$
		mntmInscritosAct.addActionListener(new BtnInscritosActActionListener());
		mnActiv.add(mntmInscritosAct);
		
		JMenuBar menuBungalows = new JMenuBar();
		menuBungalows.setBackground(Color.WHITE);
		menuBungalows.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		menuBungalows.setBounds(37, 140, 242, 65);
		pnlBotones.add(menuBungalows);
		
		JLabel lblVaciaBunga = new JLabel("       "); //$NON-NLS-1$
		menuBungalows.add(lblVaciaBunga);
		
		JMenu mnBungalows = new JMenu(MessagesPrincipal.getString("P_Principal.mnBungalows.text")); //$NON-NLS-1$
		mnBungalows.setForeground(Color.BLACK);
		mnBungalows.setIcon(new ImageIcon(P_Principal.class.getResource("/presentacion/bungalow.png"))); //$NON-NLS-1$
		mnBungalows.setFont(new Font("Verdana", Font.BOLD, 20)); //$NON-NLS-1$
		menuBungalows.add(mnBungalows);
		
		JMenuItem mntmBungalows = new JMenuItem(MessagesPrincipal.getString("P_Principal.mntmBungalows.text")); //$NON-NLS-1$
		mntmBungalows.addActionListener(new BtnBungalowsActionListener());
		mnBungalows.add(mntmBungalows);
		JMenuItem mntmPromosBungalow = new JMenuItem(MessagesPrincipal.getString("P_Principal.mntmPromosBungalow.text")); //$NON-NLS-1$
		mntmPromosBungalow.addActionListener(new BtnPromosBungalowsActionListener());
		
		mnBungalows.add(mntmPromosBungalow);
		
		JMenuItem mntmBungalowReservas = new JMenuItem(MessagesPrincipal.getString("P_Principal.mntmBungalowReservas.text")); //$NON-NLS-1$
		mntmBungalowReservas.addActionListener(new BtnReservasBungalowsActionListener());
		mnBungalows.add(mntmBungalowReservas);
		
		JMenuBar menuParcelas = new JMenuBar();
		menuParcelas.setBackground(Color.WHITE);
		menuParcelas.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		menuParcelas.setBounds(37, 10, 242, 65);
		pnlBotones.add(menuParcelas);
		
		JLabel lblVaciaParcela = new JLabel("       "); //$NON-NLS-1$
		menuParcelas.add(lblVaciaParcela);
		
		JMenu mnParcela = new JMenu(MessagesPrincipal.getString("P_Principal.mnParcela.text")); //$NON-NLS-1$
		mnParcela.setForeground(Color.BLACK);
		mnParcela.setFont(new Font("Verdana", Font.BOLD, 20)); //$NON-NLS-1$
		mnParcela.setIcon(new ImageIcon(P_Principal.class.getResource("/presentacion/parcelas.png"))); //$NON-NLS-1$
		menuParcelas.add(mnParcela);
		
		JMenuItem mntmParcelas = new JMenuItem(MessagesPrincipal.getString("P_Principal.mntmParcelas.text")); //$NON-NLS-1$
		mntmParcelas.addActionListener(new BtnParcelasActionListener());
		mnParcela.add(mntmParcelas);
		
		JMenuItem mntmReservasParcela = new JMenuItem(MessagesPrincipal.getString("P_Principal.mntmReservasParcela.text")); //$NON-NLS-1$
		mntmReservasParcela.addActionListener(new BtnReservasParcelasActionListener());
		mnParcela.add(mntmReservasParcela);
		btnVolver.addActionListener(new BtnLogoZorroActionListener());

		pnlContenido = new JPanel();
		pnlContenido.setBounds(303, 0, 1001, 575);
		pnlContenido.setBorder(new RoundedBorder(10));
		pnlPantallaPrincipal.add(pnlContenido);
		pnlContenido.setLayout(new CardLayout(0, 0));

		lblZorroEligeOpcion = new JLabel(""); //$NON-NLS-1$
		lblZorroEligeOpcion.setHorizontalAlignment(SwingConstants.CENTER);
		lblZorroEligeOpcion.setIcon(new ImageIcon(P_Principal.class.getResource("/presentacion/zorroGrandeTransparencia.png"))); //$NON-NLS-1$
		pnlContenido.add(lblZorroEligeOpcion, "lblZorro"); //$NON-NLS-1$
		
		panelLogoZorro = new V_LogoZorro();
		pnlContenido.add(panelLogoZorro, "panellogoZorro"); //$NON-NLS-1$
		
		panelRuta = new V_Ruta(pnlContenido);
		pnlContenido.add(panelRuta, MessagesPrincipal.getString("P_Principal.0")); //$NON-NLS-1$
		
		rutaElegida = new V_RutaElegida(pnlContenido);
		pnlContenido.add(rutaElegida, MessagesPrincipal.getString("P_Principal.23")); //$NON-NLS-1$
		
		panelHistorialActividades = new V_ActHistorial();
		pnlContenido.add(panelHistorialActividades, "panelHistorialActividades"); //$NON-NLS-1$
		
		actInscribirse = new V_inscribirse();
		pnlContenido.add(actInscribirse, "actInscribirse"); //$NON-NLS-1$
		
		rutaInscribirse = new V_RutaInscribirse();
		pnlContenido.add(rutaInscribirse, "rutaInscribirse"); //$NON-NLS-1$
		
		reservar = new V_Reserva();
		pnlContenido.add(reservar, "reservar"); //$NON-NLS-1$

		CardLayout c1 = (CardLayout)(pnlContenido.getLayout());
		c1.show(pnlContenido, "panellogoZorro"); //$NON-NLS-1$

	}
	
	private Icon nuevoIcono(String nombre) {
		Icon icon = null;
		//MessagesP_Login.getString("P_Login.50"); 
		
		if(MessagesP_Login.getString("P_Login.48") == nombre) icon = new ImageIcon(P_Principal.class.getResource("/presentacion/PerfilMj.png")); //$NON-NLS-1$ //$NON-NLS-2$
		if(MessagesP_Login.getString("P_Login.46") == nombre) icon = new ImageIcon(P_Principal.class.getResource("/presentacion/PerfilAdri.png")); //$NON-NLS-1$ //$NON-NLS-2$
		if(MessagesP_Login.getString("P_Login.50") == nombre) icon = new ImageIcon(P_Principal.class.getResource("/presentacion/PerfilMaria.png"));; //$NON-NLS-1$ //$NON-NLS-2$  
		if(MessagesP_Login.getString("P_Login.48") != nombre && 
				MessagesP_Login.getString("P_Login.46") != nombre &&
				MessagesP_Login.getString("P_Login.50") != nombre) icon = iconAux;
		return icon;
	}

	private class BtnReservasParcelasActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			reservasP = new V_VerReservasParcelas();
			pnlContenido.add(reservasP, "reservasP"); //$NON-NLS-1$
			CardLayout c1 = (CardLayout)(pnlContenido.getLayout());
			c1.show(pnlContenido, "reservasP"); //$NON-NLS-1$
		}
	}
	
	private class BtnReservasBungalowsActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			reservasB = new V_VerReservasBungalows();
			pnlContenido.add(reservasB, "reservasB"); //$NON-NLS-1$
			CardLayout c1 = (CardLayout)(pnlContenido.getLayout());
			c1.show(pnlContenido, "reservasB"); //$NON-NLS-1$
		}
	}
	
	
	private class BtnRutaCrearActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			panelRutaCrear = new V_RutaCrear();
			pnlContenido.add(panelRutaCrear, "RutaCrear"); //$NON-NLS-1$
			CardLayout c1 = (CardLayout)(pnlContenido.getLayout());
			c1.show(pnlContenido, "RutaCrear"); //$NON-NLS-1$
		}
	}
	
	private class BtnRutasDisponiblesActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			panelRuta = new V_Ruta(pnlContenido);
			pnlContenido.add(panelRuta, "Ruta"); //$NON-NLS-1$
			CardLayout c1 = (CardLayout)(pnlContenido.getLayout());
			c1.show(pnlContenido, "Ruta"); //$NON-NLS-1$
		}
	}
	
	private class BtnRutaInscritosActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			panelRutaInscritos = new V_RutaInscritos();
			pnlContenido.add(panelRutaInscritos, "RutaInscritos"); //$NON-NLS-1$
			CardLayout c1 = (CardLayout)(pnlContenido.getLayout());
			c1.show(pnlContenido, "RutaInscritos"); //$NON-NLS-1$
		}
	}
	private class BtnVerActividadeesActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			panelActividades = new V_Actividades(pnlContenido);
			pnlContenido.add(panelActividades, "Actividades"); //$NON-NLS-1$
			CardLayout c1 = (CardLayout)(pnlContenido.getLayout());
			c1.show(pnlContenido, "Actividades"); //$NON-NLS-1$
		}
	}
	private class BtnHistorialActActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			panelHistorialActividades = new V_ActHistorial();
			pnlContenido.add(panelHistorialActividades, "panelHistorialActividades"); //$NON-NLS-1$
			CardLayout c1 = (CardLayout)(pnlContenido.getLayout());
			c1.show(pnlContenido, "panelHistorialActividades"); //$NON-NLS-1$
		}	
	}

	private class BtnBungalowsActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			panelBungalow = new V_Bungalow(pnlContenido);
			pnlContenido.add(panelBungalow, "Bungalow"); //$NON-NLS-1$
			CardLayout c1 = (CardLayout)(pnlContenido.getLayout());
			c1.show(pnlContenido, "Bungalow"); //$NON-NLS-1$
		}
	}
	private class BtnPromocionesActActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			panelActividadesPromociones = new V_PromocionesActividades(pnlContenido);
			pnlContenido.add(panelActividadesPromociones, "panelActividadesPromociones"); //$NON-NLS-1$
			CardLayout c1 = (CardLayout)(pnlContenido.getLayout());
			c1.show(pnlContenido, "panelActividadesPromociones"); //$NON-NLS-1$
		}
	}
	
	private class BtnPromosBungalowsActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			panelBungalowsPromociones = new V_BungalowsPromociones(pnlContenido);
			pnlContenido.add(panelBungalowsPromociones, "panelBungalowsPromociones"); //$NON-NLS-1$
			CardLayout c1 = (CardLayout)(pnlContenido.getLayout());
			c1.show(pnlContenido, "panelBungalowsPromociones"); //$NON-NLS-1$
		}
	}
	private class BtnInscritosActActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			panelInscritosActividades = new V_inscritos();
			pnlContenido.add(panelInscritosActividades, "ActividadesInscritos"); //$NON-NLS-1$
			CardLayout c1 = (CardLayout)(pnlContenido.getLayout());
			c1.show(pnlContenido, "ActividadesInscritos"); //$NON-NLS-1$
		}
	}
	
	private class BtnParcelasActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			panelParcela = new V_Parcela(pnlContenido);
			pnlContenido.add(panelParcela, "Parcela"); //$NON-NLS-1$
			CardLayout c1 = (CardLayout)(pnlContenido.getLayout());
			c1.show(pnlContenido, "Parcela"); //$NON-NLS-1$
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
			c1.show(pnlContenido, "panellogoZorro"); //$NON-NLS-1$
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
				pnlContenido.add(panelActividades, "Actividades"); //$NON-NLS-1$
		    	c1.show(pnlContenido, "Actividades"); //$NON-NLS-1$
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
			P_Ayuda frmAyuda = new P_Ayuda(nombreAux,iconAux);
			frmAyuda.getFrame().setVisible(true);
			frmPrincipal.dispose();
		}
	}
}