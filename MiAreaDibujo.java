package presentacion;

import java.awt.Graphics;  
import java.util.ArrayList;
import javax.swing.JLabel;

public class MiAreaDibujo extends JLabel	
{
	private ArrayList<ObjetoGrafico> objetosGraficos = new ArrayList<ObjetoGrafico>();

	public MiAreaDibujo(){
	}
	void addObjetoGrafico(ObjetoGrafico objg) {
		objetosGraficos.add(objg);
	}
	public ObjetoGrafico getUltimoObjetoGrafico()
	{
		return objetosGraficos.get(objetosGraficos.size()-1);
	}

	//Aqui es donde se van a realizar todo lo que tiene q ver con pitar 
	public void paint(Graphics g){
		super.paint(g);
		for (int i = 0; i < objetosGraficos.size(); i++) {
			ObjetoGrafico objg = objetosGraficos.get(i);
			if (objg instanceof ImagenGrafico)
			{
				g.drawImage(((ImagenGrafico)objg).getImagen(), objg.getX(),
						objg.getY(), null);
			}
			//Recibe esquina, ancho y alto
			else if (objg instanceof DibujaLinea)
			{
				g.setColor(((DibujaLinea)objg).getColor());
		//		int w = ((RectanguloGrafico)objg).getX1() - objg.getX();
				int h = ((DibujaLinea)objg).getY1() - objg.getY();
				g.drawLine(objg.getX(),objg.getY(), 3, h);
			}
			else { //Es un objeto de tipo TextoGrafico
				g.setColor(((TextoGrafico)objg).getColor());
				g.drawString(((TextoGrafico)objg).getTexto(),objg.getX(),objg.getY());
			}

		} 
	}
}

