package presentacion;

import javax.swing.JPanel;
import java.awt.Rectangle;
import javax.swing.JScrollPane;
import java.awt.BorderLayout;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;

import java.awt.Font;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import java.awt.Color;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.ScrollPaneConstants;

public class V_inscritos extends JPanel {
	private JTable TableInscritos;
	private JScrollPane scrollPane;

	/**
	 * Create the panel.
	 */
	public V_inscritos() {
		setBounds(new Rectangle(0, 0, 1001, 530));
		setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		scrollPane = new JScrollPane();
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane.setBounds(0, 0, 1147, 611);
		scrollPane.setFont(new Font("Verdana", Font.PLAIN, 16));
		scrollPane.setAutoscrolls(true);
		scrollPane.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Inscritos a las actividades", TitledBorder.LEADING, TitledBorder.TOP, null, Color.BLACK));
		panel.add(scrollPane);
		
		TableInscritos = new JTable();
		TableInscritos.setSelectionBackground(new Color(255, 228, 181));
		TableInscritos.setFocusable(false);
		TableInscritos.setGridColor(Color.GRAY);
		TableInscritos.setFont(new Font("Verdana", Font.PLAIN, 16));
		TableInscritos.getTableHeader().setFont(new Font("Verdana",Font.BOLD,16));
		TableInscritos.getTableHeader().setBackground(new Color(255, 165, 0));
		TableInscritos.getTableHeader().setForeground( Color.BLACK);
		TableInscritos.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		TableInscritos.setAutoCreateRowSorter(true);
		TableInscritos.setModel(new DefaultTableModel(
			new Object[][] {
				{"NATACI\u00D3N", "TARDE", "JUAN", "MARTINEZ RUIZ", "05964229Z", "juanm@gmail.com", new Integer(926568526), null, Boolean.TRUE, "Diab\u00E9tico"},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, "", null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, Boolean.TRUE, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
			},
			new String[] {
				"Actividad", "Horario", "Nombre", "Apellidos", "DNI", "Correo electr\u00F3nico", "Tel\u00E9fono", "Precio", "Pagado", "Informaci\u00F3n adicional"
			}
		) {
			Class[] columnTypes = new Class[] {
				String.class, String.class, String.class, String.class, String.class, String.class, Integer.class, Double.class, Boolean.class, String.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		TableInscritos.getColumnModel().getColumn(0).setResizable(false);
		TableInscritos.getColumnModel().getColumn(0).setPreferredWidth(160);
		TableInscritos.getColumnModel().getColumn(1).setPreferredWidth(166);
		TableInscritos.getColumnModel().getColumn(2).setPreferredWidth(194);
		TableInscritos.getColumnModel().getColumn(3).setResizable(false);
		TableInscritos.getColumnModel().getColumn(3).setPreferredWidth(179);
		TableInscritos.getColumnModel().getColumn(4).setPreferredWidth(194);
		TableInscritos.getColumnModel().getColumn(4).setMinWidth(16);
		TableInscritos.getColumnModel().getColumn(5).setResizable(false);
		TableInscritos.getColumnModel().getColumn(5).setPreferredWidth(215);
		TableInscritos.getColumnModel().getColumn(6).setPreferredWidth(211);
		TableInscritos.getColumnModel().getColumn(7).setPreferredWidth(152);
		TableInscritos.getColumnModel().getColumn(8).setPreferredWidth(48);
		TableInscritos.getColumnModel().getColumn(9).setPreferredWidth(273);
		scrollPane.setViewportView(TableInscritos);
		
		
	}
	
}
