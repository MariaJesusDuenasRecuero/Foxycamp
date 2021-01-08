package presentacion;

import java.io.Serializable;

public class ObjetoGrafico implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int x,y,x1,y2;
	
	public ObjetoGrafico(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	
	public ObjetoGrafico(int x, int y, int x1, int y2) {
		super();
		this.x = x;
		this.y = y;
		this.x1 = x1;
		this.y2 = y2;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getX1() {
		return x1;
	}

	public void setX1(int x1) {
		this.x1 = x1;
	}

	public int getY2() {
		return y2;
	}

	public void setY2(int y2) {
		this.y2 = y2;
	}
}