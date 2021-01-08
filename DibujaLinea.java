package presentacion;

import java.awt.Color;
import java.io.Serializable;

public class DibujaLinea extends ObjetoGrafico implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Color color;

	public DibujaLinea(int x, int y, int x1, int y1, Color color) {
		super(x, y, x1, y1);
		this.color = color;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
