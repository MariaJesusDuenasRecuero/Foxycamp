package presentacion;

import javax.swing.AbstractCellEditor;
import javax.swing.DefaultCellEditor;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.JPanel;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.Vector;

import java.util.*;
import javax.swing.table.*;

import javax.swing.JScrollPane;
import java.awt.BorderLayout;
import javax.swing.JTable;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellEditor;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumn;

import presentacion.P_Login.RoundedBorder;

import java.awt.Font;
import java.awt.Graphics;
import java.awt.Insets;

import javax.swing.border.TitledBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.border.BevelBorder;
import javax.swing.border.Border;
import javax.swing.border.EtchedBorder;
import java.awt.Color;
import java.awt.Component;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.ScrollPaneConstants;
import javax.swing.ListSelectionModel;

public class V_inscritos extends JPanel {
	private JPanel panel;
	private JPanel panel_1;
	private JButton btnBorrarFila;
	private JButton btnAniadirFila;
	private JScrollPane scrollPane;
	private JComboBox comboBoxP;
	private JComboBox comboBoxA;
	private TableColumn columnaActividad;
	private TableColumn columnaPago;
	private TableColumn columnaFoto;
	private JTable miTabla;

	/**
	 * Create the panel.
	 */
	@SuppressWarnings({ "unchecked", "rawtypes", "unused" })
	public V_inscritos() {
		setBounds(new Rectangle(0, 0, 1001, 530));
		setLayout(new BorderLayout(0, 0));

		panel = new JPanel();
		panel.setBorder(new TitledBorder(null, MessagesV_Inscritos.getString("V_inscritos.panel.borderTitle"), TitledBorder.LEADING, TitledBorder.TOP, //$NON-NLS-1$
				null, null));
		add(panel, BorderLayout.CENTER);
		panel.setLayout(new BorderLayout(0, 0));

		panel_1 = new JPanel();
		panel.add(panel_1, BorderLayout.SOUTH);

		btnBorrarFila = new JButton(MessagesV_Inscritos.getString("V_inscritos.btnBorrarFila.text")); //$NON-NLS-1$
		btnBorrarFila.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MiModeloTabla modeloTabla = (MiModeloTabla) miTabla.getModel();
				int n= miTabla.getSelectedRow();
				if (n != -1) modeloTabla.eliminaFila(miTabla.getSelectedRow());
				modeloTabla.fireTableDataChanged();
			}
		});
		btnBorrarFila.setIcon(new ImageIcon(V_inscritos.class.getResource("/presentacion/IconoBorrar.png"))); //$NON-NLS-1$
		btnBorrarFila.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnBorrarFila.setForeground(Color.BLACK);
		btnBorrarFila.setToolTipText(MessagesV_Inscritos.getString("V_inscritos.btnBorrarFila.toolTipText")); //$NON-NLS-1$
		btnBorrarFila.setFont(new Font("Verdana", Font.BOLD, 16)); //$NON-NLS-1$
		btnBorrarFila.setBackground(new Color(244, 164, 96));
		btnBorrarFila.setBorder(new RoundedBorder(10));

		panel_1.add(btnBorrarFila);

		btnAniadirFila = new JButton(MessagesV_Inscritos.getString("V_inscritos.btnAniadirFila.text")); //$NON-NLS-1$
		

		btnAniadirFila.setIcon(new ImageIcon(V_inscritos.class.getResource("/presentacion/IconAnadir.png"))); //$NON-NLS-1$
		btnAniadirFila.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnAniadirFila.setForeground(Color.BLACK);
		btnAniadirFila.setToolTipText(MessagesV_Inscritos.getString("V_inscritos.btnAniadirFila.toolTipText")); //$NON-NLS-1$
		btnAniadirFila.setFont(new Font("Verdana", Font.BOLD, 12)); //$NON-NLS-1$
		btnAniadirFila.setBackground(new Color(244, 164, 96));
		btnAniadirFila.setBorder(new RoundedBorder(10));

		panel_1.add(btnAniadirFila);

		scrollPane = new JScrollPane();
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		panel.add(scrollPane, BorderLayout.CENTER);

		miTabla = new JTable();

		MiModeloTabla modeloTabla = new MiModeloTabla();
		miTabla.setModel(modeloTabla);
		miTabla.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		miTabla.setSelectionBackground(new Color(255, 228, 181));
        miTabla.setFocusable(true);
        miTabla.setGridColor(Color.GRAY);
        miTabla.setFont(new Font("Verdana", Font.PLAIN, 16)); //$NON-NLS-1$
        miTabla.getTableHeader().setFont(new Font("Verdana", Font.BOLD, 16)); //$NON-NLS-1$
        miTabla.getTableHeader().setBackground(new Color(255, 165, 0));
        miTabla.getTableHeader().setForeground(Color.BLACK);
		miTabla.setRowHeight(100);
		miTabla.getColumnModel().getColumn(8).setPreferredWidth(200);
		miTabla.getColumnModel().getColumn(7).setPreferredWidth(200);
		miTabla.getColumnModel().getColumn(6).setPreferredWidth(200);
		miTabla.getColumnModel().getColumn(5).setPreferredWidth(200);
		miTabla.getColumnModel().getColumn(4).setPreferredWidth(200);
		miTabla.getColumnModel().getColumn(3).setPreferredWidth(200);
		miTabla.getColumnModel().getColumn(2).setPreferredWidth(200);
		miTabla.getColumnModel().getColumn(1).setPreferredWidth(200);
		miTabla.getColumnModel().getColumn(0).setPreferredWidth(200);
		scrollPane.setViewportView(miTabla);

		
		columnaFoto = miTabla.getColumnModel().getColumn(0);
        columnaFoto.setCellEditor(new ColumnaFotoEditor());


        columnaPago = miTabla.getColumnModel().getColumn(6);
        comboBoxP = new JComboBox();
        comboBoxP.addItem(MessagesV_Inscritos.getString("V_inscritos.6")); //$NON-NLS-1$
        comboBoxP.addItem(MessagesV_Inscritos.getString("V_inscritos.0")); //$NON-NLS-1$
        columnaPago.setCellEditor(new DefaultCellEditor(comboBoxP));

        columnaActividad = miTabla.getColumnModel().getColumn(3);
        columnaFoto.setCellEditor(new ColumnaFotoEditor());
        comboBoxA = new JComboBox();
        comboBoxA.addItem(MessagesV_Inscritos.getString("V_inscritos.8")); //$NON-NLS-1$
        comboBoxA.addItem(MessagesV_Inscritos.getString("V_inscritos.9")); //$NON-NLS-1$
        comboBoxA.addItem(MessagesV_Inscritos.getString("V_inscritos.10")); //$NON-NLS-1$
        comboBoxA.addItem(MessagesV_Inscritos.getString("V_inscritos.11")); //$NON-NLS-1$
        comboBoxA.addItem(MessagesV_Inscritos.getString("V_inscritos.12")); //$NON-NLS-1$
        comboBoxA.addItem(MessagesV_Inscritos.getString("V_inscritos.13")); //$NON-NLS-1$
        columnaActividad.setCellEditor(new DefaultCellEditor(comboBoxA));
		
		
		
		
		
		
		btnAniadirFila.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				MiModeloTabla modeloTabla = (MiModeloTabla) miTabla.getModel();
				Object[] nuevaFila = {new ImageIcon(getClass().getClassLoader().getResource("presentacion/iconFilaFox.png")) , "", "", "", "", 0, "", "", ""}; //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$ //$NON-NLS-6$ //$NON-NLS-7$ //$NON-NLS-8$
				modeloTabla.aniadeFila(nuevaFila);
				modeloTabla.fireTableDataChanged();
			}
		});
		
		Object[] fila_ejemplo= {new ImageIcon(getClass().getClassLoader().getResource("presentacion/iconFilaFox.png")), "Adrián", "Ruiz Esteban", MessagesV_Inscritos.getString("V_inscritos.1"), "05724093Z", "666-666-666", MessagesV_Inscritos.getString("V_inscritos.28"), MessagesV_Inscritos.getString("V_inscritos.29"), MessagesV_Inscritos.getString("V_inscritos.30")}; //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$ //$NON-NLS-6$ //$NON-NLS-7$ //$NON-NLS-8$ //$NON-NLS-9$
		modeloTabla.aniadeFila(fila_ejemplo);
		
	}

	class MiModeloTabla extends AbstractTableModel {
		private String[] nombreColumnas = { MessagesV_Inscritos.getString("V_inscritos.2"), MessagesV_Inscritos.getString("V_inscritos.3"), MessagesV_Inscritos.getString("V_inscritos.4"), MessagesV_Inscritos.getString("V_inscritos.5"), MessagesV_Inscritos.getString("V_inscritos.7"), MessagesV_Inscritos.getString("V_inscritos.15"), MessagesV_Inscritos.getString("V_inscritos.14"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$ //$NON-NLS-6$ //$NON-NLS-7$
				MessagesV_Inscritos.getString("V_inscritos.38"), MessagesV_Inscritos.getString("V_inscritos.39") }; //$NON-NLS-1$ //$NON-NLS-2$
		private Class[] columnTypes = new Class[] {Object.class, String.class, String.class, String.class, String.class, Integer.class, String.class, String.class, String.class};

		private Vector datos = new Vector();

		public int getColumnCount() {
			return nombreColumnas.length;
		}

		public int getRowCount() {
			return datos.size();
		}

		public String getColumnName(int col) {
			return nombreColumnas[col];
		}

		public Object getValueAt(int row, int col) {
			Object[] fila = (Object[]) datos.elementAt(row);
			return fila[col];
		}

		public Class getColumnClass(int c) {
			return getValueAt(0, c).getClass();
		}

		public boolean isCellEditable(int row, int col) {
			return true;
		}

		public void setValueAt(Object value, int row, int col) {
			if (row < getRowCount() && col < getColumnCount()) {
				Object[] fila = (Object[]) datos.elementAt(row);
				fila[col] = value;
				fireTableCellUpdated(row, col);
			}
		}

		public void eliminaFila(int row) {
			datos.remove(row);
		}

		public void aniadeFila(Object[] row) {
			datos.add(row);
		}
	}

	class RoundedBorder implements Border {

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

	public class ColumnaFotoEditor extends AbstractCellEditor implements TableCellEditor {
		private JButton boton = new JButton();
		ImageIcon fotoCelda;

		public ColumnaFotoEditor() {
			boton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent actionEvent) {
					JFileChooser fcAbrir = new JFileChooser();
					int valorDevuelto = fcAbrir.showDialog(boton, MessagesV_Inscritos.getString("V_inscritos.40")); //$NON-NLS-1$
					if (valorDevuelto == JFileChooser.APPROVE_OPTION) {
						File file = fcAbrir.getSelectedFile();
						cambiarFoto(new ImageIcon(file.getAbsolutePath()));
					}
				}
			});
		}

		public void cambiarFoto(ImageIcon imag) {
			if (imag != null) {
				fotoCelda = imag;
				boton.setIcon(imag);
			}
		}

		public Object getCellEditorValue() {
			return fotoCelda;
		}

		public Component getTableCellEditorComponent(JTable table, Object value, boolean isSelected, int row,
				int column) {
			cambiarFoto((ImageIcon) value);
			return boton;
		}
	}

}
