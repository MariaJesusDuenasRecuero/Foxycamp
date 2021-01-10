package presentacion;

import java.awt.BorderLayout; 
import java.awt.Color;
import java.awt.Font;
import java.awt.Rectangle;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;

public class V_RutaInscritos extends JPanel {
	private JTable TableInscritos;
	private JScrollPane scrollPane;
	/**
	 * Create the panel.
	 */
	public V_RutaInscritos() {
		setBounds(new Rectangle(0, 0, 1001, 530));
		setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		scrollPane = new JScrollPane();
		scrollPane.setFont(new Font("Verdana", Font.PLAIN, 16));
		scrollPane.setAutoscrolls(true);
		scrollPane.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Inscritos a la ruta", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		scrollPane.setBounds(0, 0, 1001, 530);
		panel.add(scrollPane);
		
		TableInscritos = new JTable();
		TableInscritos.setSelectionBackground(new Color(255, 228, 181));
		TableInscritos.setFocusable(false);
		TableInscritos.setGridColor(Color.GRAY);
		TableInscritos.setFont(new Font("Verdana", Font.PLAIN, 16));
		TableInscritos.getTableHeader().setFont(new Font("Verdana",Font.BOLD,16));
		TableInscritos.getTableHeader().setBackground(new Color(255, 165, 0));
		TableInscritos.getTableHeader().setForeground( Color.BLACK);
		
				
		scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		//TableInscritos.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		TableInscritos.setAutoCreateRowSorter(true);
		TableInscritos.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
			},
			new String[] {
				"Nombre", "Apellidos", "DNI", "Email", "Tel\u00E9fono", "Pagado", "Informaci\u00F3n adicional"
			}
		) {
			Class[] columnTypes = new Class[] {
				String.class, String.class, String.class, String.class, String.class, Boolean.class, String.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		TableInscritos.getColumnModel().getColumn(0).setResizable(false);
		TableInscritos.getColumnModel().getColumn(4).setPreferredWidth(69);
		TableInscritos.getColumnModel().getColumn(5).setPreferredWidth(48);
		TableInscritos.getColumnModel().getColumn(6).setPreferredWidth(114);
		scrollPane.setViewportView(TableInscritos);
	}

}
