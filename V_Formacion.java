package presentacion;

import javax.swing.JPanel;

import java.awt.Color;
import java.awt.GridBagLayout;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import java.awt.Rectangle;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.Font;
import javax.swing.JTextArea;
import javax.swing.border.Border;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class V_Formacion extends JPanel {
	private JTextField txtIdioma;

	/**
	 * Create the panel.
	 */
	public V_Formacion() {
		Border border = BorderFactory.createLineBorder(Color.BLACK);
		setBackground(Color.LIGHT_GRAY);
		setBounds(new Rectangle(313, 11, 978, 521));
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0};
		gridBagLayout.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{1.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		JPanel panel = new JPanel();
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.fill = GridBagConstraints.BOTH;
		gbc_panel.gridx = 0;
		gbc_panel.gridy = 0;
		add(panel, gbc_panel);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{47, 0, 0, 193, 234, 285, 0};
		gbl_panel.rowHeights = new int[]{0, 0, 0, 44, 38, 41, 0, 32, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panel.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		
		JLabel lblFormacion = new JLabel("Formacion");
		lblFormacion.setFont(new Font("Verdana", Font.BOLD, 20));
		GridBagConstraints gbc_lblFormacion = new GridBagConstraints();
		gbc_lblFormacion.insets = new Insets(0, 0, 5, 5);
		gbc_lblFormacion.gridx = 1;
		gbc_lblFormacion.gridy = 1;
		panel.add(lblFormacion, gbc_lblFormacion);
		
		JLabel lblFormacionActual = new JLabel("Formacion actual");
		lblFormacionActual.setFont(new Font("Verdana", Font.BOLD, 11));
		GridBagConstraints gbc_lblFormacionActual = new GridBagConstraints();
		gbc_lblFormacionActual.anchor = GridBagConstraints.WEST;
		gbc_lblFormacionActual.insets = new Insets(0, 0, 5, 5);
		gbc_lblFormacionActual.gridx = 1;
		gbc_lblFormacionActual.gridy = 3;
		panel.add(lblFormacionActual, gbc_lblFormacionActual);
		
		JTextArea txtFormacion = new JTextArea();
		txtFormacion.setBorder(BorderFactory.createCompoundBorder(border, 
	               BorderFactory.createEmptyBorder(10, 10, 10, 10)));
		GridBagConstraints gbc_txtFormacion = new GridBagConstraints();
		gbc_txtFormacion.gridwidth = 3;
		gbc_txtFormacion.gridheight = 3;
		gbc_txtFormacion.insets = new Insets(0, 0, 5, 5);
		gbc_txtFormacion.fill = GridBagConstraints.BOTH;
		gbc_txtFormacion.gridx = 3;
		gbc_txtFormacion.gridy = 3;
		panel.add(txtFormacion, gbc_txtFormacion);
		
		JLabel lblIdioma = new JLabel("Aniadir idioma");
		lblIdioma.setFont(new Font("Verdana", Font.BOLD, 11));
		GridBagConstraints gbc_lblIdioma = new GridBagConstraints();
		gbc_lblIdioma.fill = GridBagConstraints.VERTICAL;
		gbc_lblIdioma.anchor = GridBagConstraints.WEST;
		gbc_lblIdioma.insets = new Insets(0, 0, 5, 5);
		gbc_lblIdioma.gridx = 1;
		gbc_lblIdioma.gridy = 7;
		panel.add(lblIdioma, gbc_lblIdioma);
		
		txtIdioma = new JTextField();
		txtIdioma.setBorder(BorderFactory.createCompoundBorder(border, 
	               BorderFactory.createEmptyBorder(10, 10, 10, 10)));
		GridBagConstraints gbc_txtIdioma = new GridBagConstraints();
		gbc_txtIdioma.gridwidth = 2;
		gbc_txtIdioma.insets = new Insets(0, 0, 5, 5);
		gbc_txtIdioma.fill = GridBagConstraints.BOTH;
		gbc_txtIdioma.gridx = 3;
		gbc_txtIdioma.gridy = 7;
		panel.add(txtIdioma, gbc_txtIdioma);
		txtIdioma.setColumns(10);
		
		JLabel lblActualizar = new JLabel("Actualizar CV");
		lblActualizar.setFont(new Font("Verdana", Font.BOLD, 11));
		GridBagConstraints gbc_lblActualizar = new GridBagConstraints();
		gbc_lblActualizar.anchor = GridBagConstraints.WEST;
		gbc_lblActualizar.insets = new Insets(0, 0, 5, 5);
		gbc_lblActualizar.gridx = 1;
		gbc_lblActualizar.gridy = 9;
		panel.add(lblActualizar, gbc_lblActualizar);
		
		JLabel lblCV = new JLabel("");
		lblCV.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				JFileChooser fcAbrir = new JFileChooser();
				int valorDevuelto = fcAbrir.showOpenDialog(panel);
				//Recoger el nombre del fichero seleccionado por el usuario
				if (valorDevuelto == JFileChooser.APPROVE_OPTION) {
					File file = fcAbrir.getSelectedFile();
					//En este punto la aplicación se debería encargar de realizar la operación sobre el fichero
					System.out.println("Fichero seleccionado: " + file.getName());
					lblCV.setIcon(new ImageIcon(file.getAbsolutePath()));
				}
			}
		});
		lblCV.setToolTipText("Clickea para subir curriculum");
		lblCV.setIcon(new ImageIcon(V_Formacion.class.getResource("/presentacion/uploadFile.png")));
		GridBagConstraints gbc_lblCV = new GridBagConstraints();
		gbc_lblCV.anchor = GridBagConstraints.WEST;
		gbc_lblCV.insets = new Insets(0, 0, 5, 5);
		gbc_lblCV.gridx = 3;
		gbc_lblCV.gridy = 9;
		panel.add(lblCV, gbc_lblCV);
		
		JButton btnGuardarCambios = new JButton("Guardar cambios");
		btnGuardarCambios.setBorderPainted(false);
		btnGuardarCambios.setBounds(37, 498, 242, 33);
		
		btnGuardarCambios.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		GridBagConstraints gbc_btnGuardarCambios = new GridBagConstraints();
		gbc_btnGuardarCambios.gridwidth = 2;
		gbc_btnGuardarCambios.insets = new Insets(0, 0, 0, 5);
		gbc_btnGuardarCambios.gridx = 4;
		gbc_btnGuardarCambios.gridy = 14;
		btnGuardarCambios.setFont(new Font("Verdana", Font.BOLD, 13));
		btnGuardarCambios.setBorder(new RoundedBorder(4));
		btnGuardarCambios.setForeground(new Color(0,0,0));
		btnGuardarCambios.setBackground(new Color(244, 164, 96));
		panel.add(btnGuardarCambios, gbc_btnGuardarCambios);
	}

}
