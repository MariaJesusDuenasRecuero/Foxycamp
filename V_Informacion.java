package presentacion;

import javax.swing.JPanel;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;

import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;

import java.awt.Color;
import java.awt.Component;


import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.SwingConstants;
import java.awt.ScrollPane;
import java.awt.Panel;
import java.awt.Rectangle;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import javax.swing.border.EtchedBorder;

public class V_Informacion extends JPanel {

	private JPanel contentPane;
	private JButton  btnContrasenia;
	private JTextField txtNombre;
	private JTextField txtApellidos;
	private JTextField txtCiudad;
	private JTextField txtEmail;
	private JTextField txtCodigoP;
	private JTextField txtTelefono;
	
	private Color colorResaltado = new Color (255,255,210);
	private Color colorBlanco = new Color (255,255,255);
	/**
	 * Create the panel.
	 */
	public V_Informacion() {
		setLayout(new BorderLayout(0, 0));
		setBounds(new Rectangle(10, 50, 1001, 530));
		JPanel panel = new JPanel();
		add(panel, BorderLayout.CENTER);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{50, 85, 81, 0, 66, 95, 120, 260, 119, 50, 0};
		gbl_panel.rowHeights = new int[]{0, 0, 0, 30, 0, 30, 0, 30, 0, 30, 0, 30, 0, 30, 0, 0, 19, 0, 0};
		gbl_panel.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		
		JLabel lblInformacion = new JLabel(MessagesV_Informacion.getString("V_Informacion.lblInformacion.text")); //$NON-NLS-1$
		lblInformacion.setFont(new Font("Verdana", Font.BOLD, 20)); //$NON-NLS-1$
		GridBagConstraints gbc_lblInformacion = new GridBagConstraints();
		gbc_lblInformacion.gridwidth = 3;
		gbc_lblInformacion.insets = new Insets(0, 0, 5, 5);
		gbc_lblInformacion.gridx = 1;
		gbc_lblInformacion.gridy = 1;
		panel.add(lblInformacion, gbc_lblInformacion);
		
		JLabel lblNombre = new JLabel(MessagesV_Informacion.getString("V_Informacion.lblNombre.text")); //$NON-NLS-1$
		lblNombre.setFont(new Font("Verdana", Font.BOLD, 16)); //$NON-NLS-1$
		GridBagConstraints gbc_lblNombre = new GridBagConstraints();
		gbc_lblNombre.anchor = GridBagConstraints.WEST;
		gbc_lblNombre.fill = GridBagConstraints.VERTICAL;
		gbc_lblNombre.insets = new Insets(0, 0, 5, 5);
		gbc_lblNombre.gridx = 1;
		gbc_lblNombre.gridy = 3;
		panel.add(lblNombre, gbc_lblNombre);
		
		JLabel lblCambiarFoto = new JLabel(MessagesV_Informacion.getString("V_Informacion.lblCambiarFoto.text")); //$NON-NLS-1$
		lblCambiarFoto.setFont(new Font("Verdana", Font.BOLD, 16)); //$NON-NLS-1$
		GridBagConstraints gbc_lblCambiarFoto = new GridBagConstraints();
		gbc_lblCambiarFoto.insets = new Insets(0, 0, 5, 5);
		gbc_lblCambiarFoto.gridx = 7;
		gbc_lblCambiarFoto.gridy = 3;
		panel.add(lblCambiarFoto, gbc_lblCambiarFoto);
		
		txtNombre = new JTextField();
		txtNombre.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				e.getComponent().setBackground(colorResaltado);
			}
			@Override
			public void focusLost(FocusEvent e) {
				e.getComponent().setBackground(colorBlanco);
			}
		});
		GridBagConstraints gbc_txtNombre = new GridBagConstraints();
		gbc_txtNombre.gridwidth = 2;
		gbc_txtNombre.insets = new Insets(0, 0, 5, 5);
		gbc_txtNombre.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtNombre.gridx = 1;
		gbc_txtNombre.gridy = 4;
		panel.add(txtNombre, gbc_txtNombre);
		txtNombre.setColumns(10);
		
		JLabel lblApellidos = new JLabel(MessagesV_Informacion.getString("V_Informacion.lblApellidos.text")); //$NON-NLS-1$
		lblApellidos.setFont(new Font("Verdana", Font.BOLD, 16)); //$NON-NLS-1$
		GridBagConstraints gbc_lblApellidos = new GridBagConstraints();
		gbc_lblApellidos.anchor = GridBagConstraints.WEST;
		gbc_lblApellidos.insets = new Insets(0, 0, 5, 5);
		gbc_lblApellidos.gridx = 1;
		gbc_lblApellidos.gridy = 5;
		panel.add(lblApellidos, gbc_lblApellidos);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), MessagesV_Informacion.getString("V_Informacion.scrollPane.borderTitle"), TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0))); //$NON-NLS-1$
		GridBagConstraints gbc_scrollPane = new GridBagConstraints();
		gbc_scrollPane.gridheight = 10;
		gbc_scrollPane.gridwidth = 3;
		gbc_scrollPane.insets = new Insets(0, 0, 5, 5);
		gbc_scrollPane.fill = GridBagConstraints.BOTH;
		gbc_scrollPane.gridx = 6;
		gbc_scrollPane.gridy = 4;
		panel.add(scrollPane, gbc_scrollPane);
		
		JLabel lblFoto = new JLabel(""); //$NON-NLS-1$
		scrollPane.setViewportView(lblFoto);
		
		txtApellidos = new JTextField();
		txtApellidos.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				e.getComponent().setBackground(colorResaltado);
			}
			@Override
			public void focusLost(FocusEvent e) {
				e.getComponent().setBackground(colorBlanco);
			}
		});
		GridBagConstraints gbc_txtApellidos = new GridBagConstraints();
		gbc_txtApellidos.gridwidth = 4;
		gbc_txtApellidos.insets = new Insets(0, 0, 5, 5);
		gbc_txtApellidos.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtApellidos.gridx = 1;
		gbc_txtApellidos.gridy = 6;
		panel.add(txtApellidos, gbc_txtApellidos);
		txtApellidos.setColumns(10);
		
		JLabel lblCiudad = new JLabel(MessagesV_Informacion.getString("V_Informacion.lblCiudad.text")); //$NON-NLS-1$
		lblCiudad.setFont(new Font("Verdana", Font.BOLD, 16)); //$NON-NLS-1$
		GridBagConstraints gbc_lblCiudad = new GridBagConstraints();
		gbc_lblCiudad.anchor = GridBagConstraints.WEST;
		gbc_lblCiudad.insets = new Insets(0, 0, 5, 5);
		gbc_lblCiudad.gridx = 1;
		gbc_lblCiudad.gridy = 7;
		panel.add(lblCiudad, gbc_lblCiudad);
		
		txtCiudad = new JTextField();
		txtCiudad.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				e.getComponent().setBackground(colorResaltado);
			}
			@Override
			public void focusLost(FocusEvent e) {
				e.getComponent().setBackground(colorBlanco);
			}
		});
		GridBagConstraints gbc_txtCiudad = new GridBagConstraints();
		gbc_txtCiudad.gridwidth = 2;
		gbc_txtCiudad.insets = new Insets(0, 0, 5, 5);
		gbc_txtCiudad.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtCiudad.gridx = 1;
		gbc_txtCiudad.gridy = 8;
		panel.add(txtCiudad, gbc_txtCiudad);
		txtCiudad.setColumns(10);
		
		JLabel lblEmail = new JLabel(MessagesV_Informacion.getString("V_Informacion.lblEmail.text")); //$NON-NLS-1$
		lblEmail.setFont(new Font("Verdana", Font.BOLD, 16)); //$NON-NLS-1$
		GridBagConstraints gbc_lblEmail = new GridBagConstraints();
		gbc_lblEmail.anchor = GridBagConstraints.WEST;
		gbc_lblEmail.insets = new Insets(0, 0, 5, 5);
		gbc_lblEmail.gridx = 1;
		gbc_lblEmail.gridy = 9;
		panel.add(lblEmail, gbc_lblEmail);
		
		txtEmail = new JTextField();
		txtEmail.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				e.getComponent().setBackground(colorResaltado);
			}
			@Override
			public void focusLost(FocusEvent e) {
				e.getComponent().setBackground(colorBlanco);
			}
		});
		GridBagConstraints gbc_txtEmail = new GridBagConstraints();
		gbc_txtEmail.gridwidth = 4;
		gbc_txtEmail.insets = new Insets(0, 0, 5, 5);
		gbc_txtEmail.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtEmail.gridx = 1;
		gbc_txtEmail.gridy = 10;
		panel.add(txtEmail, gbc_txtEmail);
		txtEmail.setColumns(10);
		
		JLabel lblCodigoPostal = new JLabel(MessagesV_Informacion.getString("V_Informacion.lblCodigoPostal.text")); //$NON-NLS-1$
		lblCodigoPostal.setFont(new Font("Verdana", Font.BOLD, 16)); //$NON-NLS-1$
		GridBagConstraints gbc_lblCodigoPostal = new GridBagConstraints();
		gbc_lblCodigoPostal.insets = new Insets(0, 0, 5, 5);
		gbc_lblCodigoPostal.gridx = 1;
		gbc_lblCodigoPostal.gridy = 11;
		panel.add(lblCodigoPostal, gbc_lblCodigoPostal);
		
		txtCodigoP = new JTextField();
		txtCodigoP.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				e.getComponent().setBackground(colorResaltado);
			}
			@Override
			public void focusLost(FocusEvent e) {
				e.getComponent().setBackground(colorBlanco);
			}
		});
		GridBagConstraints gbc_txtCodigoP = new GridBagConstraints();
		gbc_txtCodigoP.gridwidth = 2;
		gbc_txtCodigoP.insets = new Insets(0, 0, 5, 5);
		gbc_txtCodigoP.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtCodigoP.gridx = 1;
		gbc_txtCodigoP.gridy = 12;
		panel.add(txtCodigoP, gbc_txtCodigoP);
		txtCodigoP.setColumns(10);
		
		JLabel lblTelefono = new JLabel(MessagesV_Informacion.getString("V_Informacion.lblTelefono.text")); //$NON-NLS-1$
		lblTelefono.setFont(new Font("Verdana", Font.BOLD, 16)); //$NON-NLS-1$
		GridBagConstraints gbc_lblTelefono = new GridBagConstraints();
		gbc_lblTelefono.anchor = GridBagConstraints.WEST;
		gbc_lblTelefono.insets = new Insets(0, 0, 5, 5);
		gbc_lblTelefono.gridx = 1;
		gbc_lblTelefono.gridy = 13;
		panel.add(lblTelefono, gbc_lblTelefono);
		
		txtTelefono = new JTextField();
		txtTelefono.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				e.getComponent().setBackground(colorResaltado);
			}
			@Override
			public void focusLost(FocusEvent e) {
				e.getComponent().setBackground(colorBlanco);
			}
		});
		GridBagConstraints gbc_txtTelefono = new GridBagConstraints();
		gbc_txtTelefono.gridwidth = 2;
		gbc_txtTelefono.insets = new Insets(0, 0, 5, 5);
		gbc_txtTelefono.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtTelefono.gridx = 1;
		gbc_txtTelefono.gridy = 14;
		panel.add(txtTelefono, gbc_txtTelefono);
		txtTelefono.setColumns(10);
		
		JButton btnCargarFoto = new JButton(MessagesV_Informacion.getString("V_Informacion.btnCargarFoto.text")); //$NON-NLS-1$
		btnCargarFoto.setFont(new Font("Verdana", Font.BOLD, 16)); //$NON-NLS-1$
		btnCargarFoto.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				JFileChooser fcAbrir = new JFileChooser();
				int valorDevuelto = fcAbrir.showOpenDialog(contentPane);
				//Recoger el nombre del fichero seleccionado por el usuario
				if (valorDevuelto == JFileChooser.APPROVE_OPTION) {
					File file = fcAbrir.getSelectedFile();
					//En este punto la aplicaci�n se deber�a encargar de realizar la operaci�n sobre el fichero
					System.out.println(MessagesV_Informacion.getString("V_Informacion.10") + file.getName()); //$NON-NLS-1$
					lblFoto.setIcon(new ImageIcon(file.getAbsolutePath()));
				}
			}
		});
		GridBagConstraints gbc_btnCargarFoto = new GridBagConstraints();
		gbc_btnCargarFoto.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnCargarFoto.gridwidth = 3;
		gbc_btnCargarFoto.insets = new Insets(0, 0, 5, 5);
		gbc_btnCargarFoto.gridx = 6;
		gbc_btnCargarFoto.gridy = 14;
		btnCargarFoto.setBackground(new Color(255, 165, 0));
		btnCargarFoto.setBorder(new RoundedBorder(4));
		panel.add(btnCargarFoto, gbc_btnCargarFoto);
		
		JButton btnGuardarCambios = new JButton(MessagesV_Informacion.getString("V_Informacion.btnGuardarCambios.text")); //$NON-NLS-1$
		btnGuardarCambios.setFont(new Font("Tahoma", Font.BOLD, 16)); //$NON-NLS-1$
		btnGuardarCambios.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				JFileChooser fcAbrir = new JFileChooser();
				int valorDevuelto = fcAbrir.showOpenDialog(contentPane);
				//Recoger el nombre del fichero seleccionado por el usuario
				if (valorDevuelto == JFileChooser.APPROVE_OPTION) {
					File file = fcAbrir.getSelectedFile();
					//En este punto la aplicaci�n se deber�a encargar de realizar la operaci�n sobre el fichero
					System.out.println(MessagesV_Informacion.getString("V_Informacion.12") + file.getName()); //$NON-NLS-1$
					lblFoto.setIcon(new ImageIcon(file.getAbsolutePath()));
				}
			}
		});
		GridBagConstraints gbc_btnGuardarCambios = new GridBagConstraints();
		gbc_btnGuardarCambios.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnGuardarCambios.gridwidth = 2;
		gbc_btnGuardarCambios.insets = new Insets(0, 0, 0, 5);
		gbc_btnGuardarCambios.gridx = 5;
		gbc_btnGuardarCambios.gridy = 17;
		btnGuardarCambios.setBackground(new Color(255, 165, 0));
		btnGuardarCambios.setBorder(new RoundedBorder(4));
		panel.add(btnGuardarCambios, gbc_btnGuardarCambios);


		

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
