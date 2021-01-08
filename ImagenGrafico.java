package presentacion;

import java.io.Serializable;
import java.awt.Image;

public class ImagenGrafico extends ObjetoGrafico implements Serializable{
	private Image imagen;
	
	public ImagenGrafico(int x, int y, int x1, int y1, Image imagen) {
		super (x, y, x1, y1);
		this.imagen = imagen;
	}
	public ImagenGrafico(int x, int y, Image imagen) {
		super(x,y);
		this.imagen = imagen;
	}
	public void setImagen(Image imagen) {this.imagen = imagen;}
	public Image getImagen() {return imagen;}
}
