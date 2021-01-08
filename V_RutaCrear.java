package presentacion;

import java.awt.BorderLayout;   
import java.awt.Color;
import java.awt.Component;
import java.awt.Cursor;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Image;
import java.awt.Insets;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import javax.swing.border.Border;
import javax.swing.text.MaskFormatter;

import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JScrollPane;
import javax.swing.JEditorPane;
import javax.swing.JFileChooser;
import javax.swing.JFormattedTextField;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JToolBar;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.io.File;
import java.text.ParseException;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
 
public class V_RutaCrear extends JPanel {
	private JTextField txtHoraInicio;
	private JTextField txtHoraFin;
	private JTextField txtAltitud;
	private JTextField txtDia;
	private ImageIcon imagen;
	private JPanel panel;
	private MiAreaDibujo MiAreaDibujo;
	JButton btnBorrar;
	JButton btnGuardar;
	//Area de dibujo personalizada (creada extendiendo de JLabel)
	
	int modo = -1;
	private Toolkit toolkit;
	
	private Cursor cursorTexto;
	private Cursor cursorHuella;
	private Cursor cursorIglesia;
	private Cursor cursorLapiz;
	private Cursor cursorRio;
	private Cursor cursorFuente;
	private Cursor cursorAnimales;
	private Cursor cursor;
	private JEditorPane Anotaciones;
	private Image imagTexto;
	private Image imagIglesia;
	private Image imagLapiz;
	private Image imagRio;
	private Image imagHuella;
	private Image imagFuente;
	private Image imagAnimales;
	private Image imagCursor;
	private JEditorPane Descripcion;
	
	private final int LAPIZ = 1;
	private final int IGLESIA = 2;
	private final int FUENTE = 3;
	private final int RIO = 4;			
	private final int TEXTO = 5;
	private final int ANIMALES = 6;
	
	//Variables para almacenar las coordenadas actuales
	private int x, y;
		
	private Color colorResaltado = new Color (255,255,210);
	private Color colorBlanco = new Color (255,255,255);
	
	private JTextField txtTexto = new JTextField();
	/**
	 * Create the panel.
	 */
	public V_RutaCrear() {
		setBackground(Color.WHITE);
		setBounds(new Rectangle(10, 50, 1001, 530));
		setLayout(new BorderLayout(0, 0));

		panel = new JPanel();
		panel.setBackground(Color.WHITE);
		add(panel, BorderLayout.CENTER);
		panel.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_1 = new JPanel();
		panel.add(panel_1, BorderLayout.CENTER);
		GridBagLayout gbl_panel_1 = new GridBagLayout();
		gbl_panel_1.columnWidths = new int[]{0, 155, 406, 186, 95, 9, 30, 23, 0};
		gbl_panel_1.rowHeights = new int[]{20, 0, 240, 0, 23, 53, 0, 0, 0, 0, 0, 19, 0, 0};
		gbl_panel_1.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, Double.MIN_VALUE};
		gbl_panel_1.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel_1.setLayout(gbl_panel_1);
		
		JLabel lblRecorridoRuta = new JLabel("Marque el recorrido de la ruta");
		lblRecorridoRuta.setFont(new Font("Verdana", Font.BOLD, 14));
		GridBagConstraints gbc_lblRecorridoRuta = new GridBagConstraints();
		gbc_lblRecorridoRuta.gridwidth = 2;
		gbc_lblRecorridoRuta.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblRecorridoRuta.insets = new Insets(0, 0, 5, 5);
		gbc_lblRecorridoRuta.gridx = 1;
		gbc_lblRecorridoRuta.gridy = 1;
		panel_1.add(lblRecorridoRuta, gbc_lblRecorridoRuta);
		
		JScrollPane scrollPane = new JScrollPane();
		GridBagConstraints gbc_scrollPane = new GridBagConstraints();
		gbc_scrollPane.gridheight = 2;
		gbc_scrollPane.gridwidth = 4;
		gbc_scrollPane.insets = new Insets(0, 0, 5, 5);
		gbc_scrollPane.fill = GridBagConstraints.BOTH;
		gbc_scrollPane.gridx = 1;
		gbc_scrollPane.gridy = 2;
		panel_1.add(scrollPane, gbc_scrollPane);
		
		MiAreaDibujo = new MiAreaDibujo();
		MiAreaDibujo.addMouseMotionListener(new MiAreaDibujoMouseMotionListener());
		MiAreaDibujo.addMouseListener(new MiAreaDibujoMouseListener());
		scrollPane.setViewportView(MiAreaDibujo);
		
		JToolBar toolBar = new JToolBar();
		toolBar.setEnabled(false);
		toolBar.setOrientation(SwingConstants.VERTICAL);
		GridBagConstraints gbc_toolBar = new GridBagConstraints();
		gbc_toolBar.gridheight = 2;
		gbc_toolBar.insets = new Insets(0, 0, 5, 5);
		gbc_toolBar.gridx = 5;
		gbc_toolBar.gridy = 2;
		panel_1.add(toolBar, gbc_toolBar);
		
		JButton btnMapa = new JButton(" Cargar mapa");
		btnMapa.setToolTipText("Pulsa para cargar mapa");
		btnMapa.addActionListener(new BtnMapaActionListener());
		btnMapa.setIcon(new ImageIcon(V_RutaCrear.class.getResource("/presentacion/mapa.png")));
		toolBar.add(btnMapa);
		
		JButton btnLapiz = new JButton("Marcar ruta");
		btnLapiz.setToolTipText("Pulsa para marcar la ruta");
		btnLapiz.addActionListener(new BtnLapizActionListener());
		btnLapiz.setIcon(new ImageIcon(V_RutaCrear.class.getResource("/presentacion/Lapiz.png")));
		toolBar.add(btnLapiz);
	
		
		JButton btnIglesia = new JButton("Monumento");
		btnIglesia.setToolTipText("Pulsa para añadir un monumento");
		btnIglesia.addActionListener(new BtnIglesiaActionListener());
		btnIglesia.setIcon(new ImageIcon(V_RutaCrear.class.getResource("/presentacion/iglesia.png")));
		toolBar.add(btnIglesia);
		
		JButton btnFuente = new JButton("Fuente");
		btnFuente.setToolTipText("Pulsa para añadir fuente/area de descanso");
		btnFuente.addActionListener(new BtnFuenteActionListener());
		btnFuente.setIcon(new ImageIcon(V_RutaCrear.class.getResource("/presentacion/fuente.png")));
		toolBar.add(btnFuente);
		
		JButton btnRio = new JButton("Paraje natural");
		btnRio.setToolTipText("Pulsa para añadir un paraje natural");
		btnRio.addActionListener(new BtnRioActionListener());
		btnRio.setIcon(new ImageIcon(V_RutaCrear.class.getResource("/presentacion/rio.png")));
		toolBar.add(btnRio);
		
		JButton btnTexto = new JButton("Añadir texto");
		btnTexto.setToolTipText("Pulsa para añadir texto");
		btnTexto.addActionListener(new BtnTextoActionListener());
		btnTexto.setIcon(new ImageIcon(V_RutaCrear.class.getResource("/presentacion/Texto.png")));
		toolBar.add(btnTexto);
		
		JButton btnAnimales = new JButton("Animales salvajes");
		btnAnimales.setToolTipText("Pulsa para insertar alerta por animal");
		btnAnimales.addActionListener(new BtnAnimalesActionListener());
		btnAnimales.setIcon(new ImageIcon(V_RutaCrear.class.getResource("/presentacion/huella.png")));
		toolBar.add(btnAnimales);
		
		JButton btnCursor = new JButton("");
		btnCursor.setToolTipText("Pulsa para volver al cursor por defecto");
		btnCursor.addActionListener(new BtnCursorActionListener());
		btnCursor.setIcon(new ImageIcon(V_RutaCrear.class.getResource("/presentacion/cursor.png")));
		toolBar.add(btnCursor);
		
		JLabel lblDescripcion = new JLabel("Inserte descripción de la ruta:");
		lblDescripcion.setFont(new Font("Verdana", Font.BOLD, 11));
		GridBagConstraints gbc_lblDescripcion = new GridBagConstraints();
		gbc_lblDescripcion.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblDescripcion.gridwidth = 2;
		gbc_lblDescripcion.insets = new Insets(0, 0, 5, 5);
		gbc_lblDescripcion.gridx = 1;
		gbc_lblDescripcion.gridy = 4;
		panel_1.add(lblDescripcion, gbc_lblDescripcion);
		
		Descripcion = new JEditorPane();
		GridBagConstraints gbc_Descripcion = new GridBagConstraints();
		Descripcion.addFocusListener(new DescripcionFocusListener());
		gbc_Descripcion.gridwidth = 6;
		gbc_Descripcion.insets = new Insets(0, 0, 5, 5);
		gbc_Descripcion.fill = GridBagConstraints.BOTH;
		gbc_Descripcion.gridx = 1;
		gbc_Descripcion.gridy = 5;
		panel_1.add(Descripcion, gbc_Descripcion);
		
		JLabel lblAnotaciones = new JLabel("Anotaciones:");
		lblAnotaciones.setFont(new Font("Verdana", Font.BOLD, 11));
		GridBagConstraints gbc_lblAnotaciones = new GridBagConstraints();
		gbc_lblAnotaciones.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblAnotaciones.insets = new Insets(0, 0, 5, 5);
		gbc_lblAnotaciones.gridx = 1;
		gbc_lblAnotaciones.gridy = 6;
		panel_1.add(lblAnotaciones, gbc_lblAnotaciones);
		
		 Anotaciones = new JEditorPane();
		GridBagConstraints gbc_Anotaciones = new GridBagConstraints();
		Anotaciones.addFocusListener(new AnotacionesFocusListener());
		gbc_Anotaciones.gridwidth = 2;
		gbc_Anotaciones.gridheight = 4;
		gbc_Anotaciones.insets = new Insets(0, 0, 5, 5);
		gbc_Anotaciones.fill = GridBagConstraints.BOTH;
		gbc_Anotaciones.gridx = 1;
		gbc_Anotaciones.gridy = 7;
		panel_1.add(Anotaciones, gbc_Anotaciones);
		
		JLabel lblHoraRuta = new JLabel("Hora de inicio de la ruta");
		lblHoraRuta.setFont(new Font("Verdana", Font.BOLD, 11));
		GridBagConstraints gbc_lblHoraRuta = new GridBagConstraints();
		gbc_lblHoraRuta.anchor = GridBagConstraints.WEST;
		gbc_lblHoraRuta.insets = new Insets(0, 0, 5, 5);
		gbc_lblHoraRuta.gridx = 3;
		gbc_lblHoraRuta.gridy = 7;
		panel_1.add(lblHoraRuta, gbc_lblHoraRuta);


		MaskFormatter formatoHoraInicio;
		try {
			formatoHoraInicio = new MaskFormatter("##':##'");
			formatoHoraInicio.setPlaceholderCharacter('h');
			txtHoraInicio= new JFormattedTextField(formatoHoraInicio);
			txtHoraInicio.setEnabled(false);
		
		}catch (ParseException e) {
			e.printStackTrace();
		}
		GridBagConstraints gbc_txtHoraInicio = new GridBagConstraints();
		txtHoraInicio.addFocusListener(new txtHoraInicioFocusListener());
		gbc_txtHoraInicio.insets = new Insets(0, 0, 5, 5);
		gbc_txtHoraInicio.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtHoraInicio.gridx = 4;
		gbc_txtHoraInicio.gridy = 7;
		txtHoraInicio.addActionListener(new TxtHoraInicioActionListener());
		panel_1.add(txtHoraInicio, gbc_txtHoraInicio);
		txtHoraInicio.setColumns(10);

		JLabel lblHoraFinRuta = new JLabel("Hora de fin de la ruta");
		lblHoraFinRuta.setFont(new Font("Verdana", Font.BOLD, 11));
		GridBagConstraints gbc_lblHoraFinRuta = new GridBagConstraints();
		gbc_lblHoraFinRuta.anchor = GridBagConstraints.WEST;
		gbc_lblHoraFinRuta.insets = new Insets(0, 0, 5, 5);
		gbc_lblHoraFinRuta.gridx = 3;
		gbc_lblHoraFinRuta.gridy = 8;
		panel_1.add(lblHoraFinRuta, gbc_lblHoraFinRuta);

		MaskFormatter formatoHoraFin;
		try {
			formatoHoraFin = new MaskFormatter("##':##'");
			formatoHoraFin.setPlaceholderCharacter('h');
			txtHoraFin= new JFormattedTextField(formatoHoraFin);
			txtHoraFin.setEnabled(false);
		
		}catch (ParseException e) {
			e.printStackTrace();
		}
		GridBagConstraints gbc_txtHoraFin = new GridBagConstraints();
		gbc_txtHoraFin.insets = new Insets(0, 0, 5, 5);
		txtHoraFin.addActionListener(new TxtHoraFinActionListener());
		txtHoraFin.addFocusListener(new txtHoraFinFocusListener());
		gbc_txtHoraFin.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtHoraFin.gridx = 4;
		gbc_txtHoraFin.gridy = 8;
		panel_1.add(txtHoraFin, gbc_txtHoraFin);
		txtHoraFin.setColumns(10);

		JLabel lblAltitud = new JLabel("Altitud de la ruta");
		lblAltitud.setFont(new Font("Verdana", Font.BOLD, 11));
		GridBagConstraints gbc_lblAltitud = new GridBagConstraints();
		gbc_lblAltitud.anchor = GridBagConstraints.WEST;
		gbc_lblAltitud.insets = new Insets(0, 0, 5, 5);
		gbc_lblAltitud.gridx = 3;
		gbc_lblAltitud.gridy = 9;
		panel_1.add(lblAltitud, gbc_lblAltitud);
		
		txtAltitud = new JTextField();
		txtAltitud.setEnabled(false);
		GridBagConstraints gbc_txtAltitud = new GridBagConstraints();
		txtAltitud.addActionListener(new TxtAltitudActionListener());
		txtAltitud.addFocusListener(new txtAltitudFocusListener());
		gbc_txtAltitud.insets = new Insets(0, 0, 5, 5);
		gbc_txtAltitud.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtAltitud.gridx = 4;
		gbc_txtAltitud.gridy = 9;
		panel_1.add(txtAltitud, gbc_txtAltitud);
		txtAltitud.setColumns(10);
		
		JLabel lblDia = new JLabel("Día de la ruta");
		lblDia.setFont(new Font("Verdana", Font.BOLD, 11));
		GridBagConstraints gbc_lblDia = new GridBagConstraints();
		gbc_lblDia.anchor = GridBagConstraints.WEST;
		gbc_lblDia.insets = new Insets(0, 0, 5, 5);
		gbc_lblDia.gridx = 3;
		gbc_lblDia.gridy = 10;
		panel_1.add(lblDia, gbc_lblDia);
		
		MaskFormatter DiaRuta;
		try {
			DiaRuta = new MaskFormatter("##'/##'/####'");
			DiaRuta.setPlaceholderCharacter('-');
			txtDia= new JFormattedTextField(DiaRuta);
			txtDia.setEnabled(false);
			txtDia.setToolTipText("dd/mm/yyyy");
			
		}catch (ParseException e) {
			e.printStackTrace();
		}
		GridBagConstraints gbc_txtDia = new GridBagConstraints();
		txtDia.addActionListener(new TxtDiaActionListener());
		txtDia.addFocusListener(new txtDiaFocusListener());
		gbc_txtDia.insets = new Insets(0, 0, 5, 5);
		gbc_txtDia.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtDia.gridx = 4;
		gbc_txtDia.gridy = 10;
		panel_1.add(txtDia, gbc_txtDia);
		txtDia.setColumns(10);
		
		btnBorrar = new JButton("Borrar");
		btnBorrar.setToolTipText("Pulsa para borrar los elementos de la ruta introducidos");
		btnBorrar.addActionListener(new BtnBorrarActionListener());
		GridBagConstraints gbc_btnBorrar = new GridBagConstraints();
		gbc_btnBorrar.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnBorrar.insets = new Insets(0, 0, 5, 5);
		gbc_btnBorrar.gridx = 1;
		gbc_btnBorrar.gridy = 11;
		btnBorrar.setFont(new Font("Verdana", Font.BOLD, 15));
		btnBorrar.setBackground(new Color(255, 165, 0));
		btnBorrar.setBorder(new RoundedBorder(3));
		panel_1.add(btnBorrar, gbc_btnBorrar);
		
		btnGuardar = new JButton("Guardar ruta");
		btnGuardar.setEnabled(false);
		btnGuardar.setToolTipText("Pulsa para guardar ruta");
		btnGuardar.addActionListener(new BtnGuardarActionListener());
		GridBagConstraints gbc_btnGuardar = new GridBagConstraints();
		gbc_btnGuardar.gridwidth = 2;
		gbc_btnGuardar.anchor = GridBagConstraints.EAST;
		gbc_btnGuardar.insets = new Insets(0, 0, 5, 5);
		gbc_btnGuardar.gridx = 5;
		gbc_btnGuardar.gridy = 11;
		btnGuardar.setFont(new Font("Verdana", Font.BOLD, 15));
		btnGuardar.setBackground(new Color(255, 165, 0));
		btnGuardar.setBorder(new RoundedBorder(3));
		panel_1.add(btnGuardar, gbc_btnGuardar);

		
		
		toolkit = Toolkit.getDefaultToolkit();
		imagTexto =	toolkit.getImage(getClass().getClassLoader().getResource("presentacion/Texto.png"));
		
		imagHuella =toolkit.getImage(getClass().getClassLoader().getResource("presentacion/huella.png"));
		
		imagAnimales =toolkit.getImage(getClass().getClassLoader().getResource("presentacion/huella.png"));
		
		imagLapiz = toolkit.getImage(getClass().getClassLoader().getResource("presentacion/Lapiz.png"));
		
		imagIglesia = toolkit.getImage(getClass().getClassLoader().getResource("presentacion/iglesia.png"));
		
		imagRio = toolkit.getImage(getClass().getClassLoader().getResource("presentacion/rio.png"));
		
		imagFuente = toolkit.getImage(getClass().getClassLoader().getResource("presentacion/fuente.png"));
		
		imagCursor = toolkit.getImage(getClass().getClassLoader().getResource("presentacion/cursor.png"));
		
		//Creación de los cursores
		cursorHuella = toolkit.createCustomCursor(imagHuella,new Point(0,0),"CURSOR_HUELLA");
		cursorTexto= toolkit.createCustomCursor(imagTexto,new Point(0,0),"CURSOR_TEXTO");
		cursorIglesia = toolkit.createCustomCursor(imagIglesia,new Point(0,0),"CURSOR_IGLESIA");
		cursorRio = toolkit.createCustomCursor(imagRio,new Point(0,0),"CURSOR_RIO");
		cursorFuente = toolkit.createCustomCursor(imagFuente,new Point(0,0),"CURSOR_FUENTE");
		cursorAnimales = toolkit.createCustomCursor(imagAnimales,new Point(0,0),"CURSOR_ANIMALES");
		
		
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

	private class BtnTextoActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			modo = TEXTO;
			panel.setCursor(cursorTexto);
		}
	}
	
	private class BtnIglesiaActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			modo = IGLESIA;
			panel.setCursor(cursorIglesia);
		}
	}
	private class BtnCursorActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			panel.setCursor(cursor);
		}
	}
	
	private class BtnLapizActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			modo = LAPIZ;
			panel.setCursor(cursorLapiz);
		}
	}
	
	private class BtnFuenteActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			modo = FUENTE;
			panel.setCursor(cursorFuente);
		}
	}
	
	private class BtnRioActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			modo = RIO;
			panel.setCursor(cursorRio);
		}
	}
	
	private class BtnAnimalesActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			modo = ANIMALES;
			panel.setCursor(cursorAnimales);
		}
	}

	
	private class MiAreaDibujoMouseMotionListener extends MouseMotionAdapter {
		@Override
		public void mouseDragged(MouseEvent e) {
			if (modo == LAPIZ && imagen!=null) {
				((DibujaLinea)MiAreaDibujo.getUltimoObjetoGrafico()).setX1(e.getX());
				((DibujaLinea)MiAreaDibujo.getUltimoObjetoGrafico()).setY1(e.getY());
				MiAreaDibujo.repaint();
				}
		}
	}
	private class BtnMapaActionListener implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			JFileChooser fcAbrir = new JFileChooser();
			int valorDevuelto = fcAbrir.showOpenDialog(panel);
			if (valorDevuelto == JFileChooser.APPROVE_OPTION) {
				File file = fcAbrir.getSelectedFile();
				imagen = new ImageIcon(file.getAbsolutePath());
				MiAreaDibujo.setIcon(imagen);
				txtHoraInicio.setEnabled(true);
			}
		}
	}
	private class DescripcionFocusListener extends FocusAdapter {
		@Override
		public void focusGained(FocusEvent e) {
			e.getComponent().setBackground(colorResaltado);
		}
		@Override
		public void focusLost(FocusEvent e) {
			e.getComponent().setBackground(colorBlanco);
		}
	}
	private class AnotacionesFocusListener extends FocusAdapter {
		@Override
		public void focusGained(FocusEvent e) {
			e.getComponent().setBackground(colorResaltado);
		}
		@Override
		public void focusLost(FocusEvent e) {
			e.getComponent().setBackground(colorBlanco);
		}
	}
	private class txtAltitudFocusListener extends FocusAdapter {
		@Override
		public void focusGained(FocusEvent e) {
			e.getComponent().setBackground(colorResaltado);
		}
		@Override
		public void focusLost(FocusEvent e) {
			e.getComponent().setBackground(colorBlanco);
		}
	}
	private class txtDiaFocusListener extends FocusAdapter {
		@Override
		public void focusGained(FocusEvent e) {
			e.getComponent().setBackground(colorResaltado);
		}
		@Override
		public void focusLost(FocusEvent e) {
			e.getComponent().setBackground(colorBlanco);
		}
	}
	private class txtHoraInicioFocusListener extends FocusAdapter {
		@Override
		public void focusGained(FocusEvent e) {
			e.getComponent().setBackground(colorResaltado);
		}
		@Override
		public void focusLost(FocusEvent e) {
			e.getComponent().setBackground(colorBlanco);
		}
	}
	private class txtHoraFinFocusListener extends FocusAdapter {
		@Override
		public void focusGained(FocusEvent e) {
			e.getComponent().setBackground(colorResaltado);
		}
		@Override
		public void focusLost(FocusEvent e) {
			e.getComponent().setBackground(colorBlanco);
		}
	}
	private class BtnGuardarActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			 JOptionPane.showMessageDialog(null, "Operación realizada");
		}
	}
	private class BtnBorrarActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			 txtHoraInicio.setText(null);
			 txtHoraInicio.setEnabled(false);
			 
			 txtHoraFin.setText(null);
			 txtHoraFin.setEnabled(false);
			 
			 txtDia.setText(null);
			 txtDia.setEnabled(false);
			 
			 txtAltitud.setText(null);
			 txtAltitud.setEnabled(false);
			 
			 Anotaciones.setText(null);
			 Descripcion.setText(null);
			 
			 MiAreaDibujo.setIcon(null);
			 
		}
	}
	
	private class TxtHoraInicioActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			txtHoraFin.setEnabled(true);
			txtHoraFin.requestFocus();
		}
	}
	
	private class TxtHoraFinActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			txtAltitud.setEnabled(true);
			txtAltitud.requestFocus();
		}
	}
	private class TxtAltitudActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			txtDia.setEnabled(true);
			txtDia.requestFocus();
		}
	}
	
	private class TxtDiaActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			btnGuardar.setEnabled(true);
		}
	}
	
	private class MiAreaDibujoMouseListener extends MouseAdapter {
		@Override
		public void mousePressed(MouseEvent e) {
			x = e.getX();
			y = e.getY();
			if (imagen != null){
				switch (modo) 
				{
				
				case IGLESIA:
					MiAreaDibujo.addObjetoGrafico(new ImagenGrafico(x,y,imagIglesia));
					MiAreaDibujo.repaint();
					break;
				case FUENTE:
					MiAreaDibujo.addObjetoGrafico(new ImagenGrafico(x,y,imagFuente));
					MiAreaDibujo.repaint();
					break;
				case RIO:
					MiAreaDibujo.addObjetoGrafico(new ImagenGrafico(x,y,imagRio));
					MiAreaDibujo.repaint();
					break;
				case ANIMALES:
					MiAreaDibujo.addObjetoGrafico(new ImagenGrafico(x,y,imagAnimales));
					MiAreaDibujo.repaint();
					break;
				case LAPIZ:
					MiAreaDibujo.addObjetoGrafico(new DibujaLinea(x,y,x,y,
							Color.RED));
					break;
				case TEXTO:
					txtTexto.setBounds(x, y, 200,30);
					txtTexto.setVisible(true);
					txtTexto.requestFocus();
					txtTexto.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent arg) {
							if(!txtTexto.getText().equals(""))
								MiAreaDibujo.addObjetoGrafico(new TextoGrafico(x, y+15, txtTexto.getText(),
										Color.BLACK));
							txtTexto.setText("");
							txtTexto.setVisible(false);
							MiAreaDibujo.repaint();
						}
					});
					MiAreaDibujo.add(txtTexto);
				}
			}

		}
	}
}
