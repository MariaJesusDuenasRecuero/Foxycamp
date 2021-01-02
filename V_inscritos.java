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

public class V_inscritos extends JPanel {
	private JTable TableInscritos;
	private JScrollPane scrollPane;

	/**
	 * Create the panel.
	 */
	public V_inscritos() {
		setBounds(new Rectangle(0, 0, 1065, 530));
		setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(new Rectangle(0, 0, 1006, 532));
		add(panel);
		panel.setLayout(null);
		
		scrollPane = new JScrollPane(TableInscritos);
		scrollPane.setFont(new Font("Verdana", Font.PLAIN, 16));
		scrollPane.setAutoscrolls(true);
		scrollPane.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Inscritos a las actividades", TitledBorder.LEADING, TitledBorder.TOP, null, Color.BLACK));
		scrollPane.setBounds(0, 0, 1001, 530);
		panel.add(scrollPane);
		
		TableInscritos = new JTable();
		TableInscritos.setSelectionBackground(new Color(255, 228, 181));
		TableInscritos.setFocusable(false);
		TableInscritos.setGridColor(new Color(255, 204, 153));
		TableInscritos.setFont(new Font("Verdana", Font.PLAIN, 16));
		TableInscritos.getTableHeader().setFont(new Font("Verdana",Font.BOLD,16));
		TableInscritos.getTableHeader().setBackground(new Color(255, 165, 0));
		TableInscritos.getTableHeader().setForeground( Color.BLACK);
		
				
		scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		TableInscritos.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		TableInscritos.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null, null, null, null, null},
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
		TableInscritos.getColumnModel().getColumn(0).setPreferredWidth(150);
		TableInscritos.getColumnModel().getColumn(1).setResizable(false);
		TableInscritos.getColumnModel().getColumn(1).setPreferredWidth(150);
		TableInscritos.getColumnModel().getColumn(2).setResizable(false);
		TableInscritos.getColumnModel().getColumn(2).setPreferredWidth(150);
		TableInscritos.getColumnModel().getColumn(3).setResizable(false);
		TableInscritos.getColumnModel().getColumn(3).setPreferredWidth(150);
		TableInscritos.getColumnModel().getColumn(4).setPreferredWidth(150);
		TableInscritos.getColumnModel().getColumn(5).setResizable(false);
		TableInscritos.getColumnModel().getColumn(5).setPreferredWidth(186);
		TableInscritos.getColumnModel().getColumn(6).setPreferredWidth(150);
		TableInscritos.getColumnModel().getColumn(7).setResizable(false);
		TableInscritos.getColumnModel().getColumn(8).setResizable(false);
		TableInscritos.getColumnModel().getColumn(8).setPreferredWidth(81);
		TableInscritos.getColumnModel().getColumn(9).setResizable(false);
		TableInscritos.getColumnModel().getColumn(9).setPreferredWidth(203);
		scrollPane.setViewportView(TableInscritos);
		
		
	}
	
}
