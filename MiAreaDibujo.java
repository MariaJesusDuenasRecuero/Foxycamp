package presentacion;

import java.awt.Graphics;  
import java.util.ArrayList;
import javax.swing.JLabel;

public class MiAreaDibujo extends JLabel	
{

	private static final long serialVersionUID = 1L;
	private ArrayList<ObjetoGrafico> objetosGraficos = new ArrayList<ObjetoGrafico>();

	public MiAreaDibujo() {
	}
	
	void addObjetoGrafico(ObjetoGrafico objg) {
		objetosGraficos.add(objg);
	}

	public ObjetoGrafico getUltimoObjetoGrafico(){
		return objetosGraficos.get(objetosGraficos.size()-1);
	}

	public void paint(Graphics g){
		super.paint(g);
		int w, h;
		for (int i = 0; i < objetosGraficos.size(); i++) {
			ObjetoGrafico objg = objetosGraficos.get(i);
			if (objg instanceof ImagenGrafico){
				g.drawImage(((ImagenGrafico)objg).getImagen(), objg.getX(),objg.getY(), null);
			}
			else if(objg instanceof DibujaLinea){
				g.setColor(((DibujaLinea)objg).getColor());
				if(((DibujaLinea)objg).getX1()>=objg.getX()) {
					w = ((DibujaLinea)objg).getX1() - objg.getX();
				}else {
					w = objg.getX() - ((DibujaLinea)objg).getX1();
				}
				if(((DibujaLinea)objg).getY2()>=objg.getY()) {
					h = ((DibujaLinea)objg).getY2() - objg.getY();
				}else {
					h = objg.getY() - ((DibujaLinea)objg).getY2();
				}
				g.drawLine(objg.getX(), objg.getY(), objg.getX1(),  objg.getY2());
			}else { 
				g.setColor(((TextoGrafico)objg).getColor());
				g.drawString(((TextoGrafico)objg).getTexto(),objg.getX(),objg.getY());
			}
		}
	}

}
