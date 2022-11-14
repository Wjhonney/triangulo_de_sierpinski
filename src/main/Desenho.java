package main;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;

public class Desenho extends Canvas {

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        criaTriangulo(g);

    }

    private void criaTriangulo(Graphics g) {
        int abscissa = getWidth() - 5;            // abscissa
        int ordenada = getHeight() - 5;           // ordenada

        // triangulo preto
//		int[] vx = {0,largura/2,largura};
//		int[] vy = {altura,0,altura};
//		g.fillPolygon(vx,vy,3);
        // graphics, nivel, nivelMax, x1,y1,x2,y2,x3,y3
        
        int[] vx = {0, abscissa / 2, abscissa};
        int[] vy = {ordenada, 0, ordenada};
        g.fillPolygon(vx, vy, 3);

        criaTrianguloRecu(g, 0, 5, 0, ordenada, abscissa / 2, 0, abscissa, ordenada);

    }

    private void criaTrianguloRecu(Graphics g, int nivel, int nivelMax,
            double x1, double y1, double x2, double y2, double x3, double y3) {

        if (nivelMax == 1) {

            // desenhar
            // (x1 + x2) / 2, (y1 + y2) / 2, (x2 + x3) / 2, (y2 + y3) / 2, (x1 + x3) / 2, (y1 + y3) / 2)
            
             try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
             
            g.setColor(Color.WHITE);
            int[] vx = {(int) (x1 + x2) / 2, (int) (x2 + x3) / 2, (int) (x1 + x3) / 2};
            int[] vy = {(int) (y1 + y2) / 2, (int) (y2 + y3) / 2, (int) (y1 + y3) / 2};
            g.fillPolygon(vx, vy, 3);

//			try {
//                            Thread.sleep(2000);
//			} catch (InterruptedException e) {
//                            // TODO Auto-generated catch block
//                            e.printStackTrace();
//			}

        } else if (nivel < nivelMax) {

            // quebra triangulo
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }

            // desenhar
            g.setColor(Color.WHITE);
            int[] vx = {(int) (x1 + x2) / 2, (int) (x2 + x3) / 2, (int) (x1 + x3) / 2};
            int[] vy = {(int) (y1 + y2) / 2, (int) (y2 + y3) / 2, (int) (y1 + y3) / 2};
            g.fillPolygon(vx, vy, 3);

            // tringulo i
            criaTrianguloRecu(g, nivel, nivelMax - 1,
                    x1, y1, (x1 + x2) / 2, (y1 + y2) / 2, (x1 + x3) / 2, (y1 + y3) / 2);

            // triangulo ii
            criaTrianguloRecu(g, nivel, nivelMax - 1,
                    (x1 + x2) / 2, (y1 + y2) / 2, x2, y2, (x2 + x3) / 2, (y2 + y3) / 2);

            // tringulo iii
            criaTrianguloRecu(g, nivel, nivelMax - 1,
                    (x1 + x3) / 2, (y1 + y3) / 2, (x2 + x3) / 2, (y2 + y3) / 2, x3, y3);
        }

        /*if (nivel < nivelMax) {
			// chamada dos 3 triangulos
                        
			// triangulo esquerda
			criaTrianguloRecu(g, nivel + 1, nivelMax, x1, y1, (x1 + x2) / 2,
					(y1 + y2) / 2, (x1 + x3) / 2, (y1 + y3) / 2);
			// triangulo de cima
			criaTrianguloRecu(g, nivel + 1, nivelMax, (x1 + x2) / 2,
					(y1 + y2) / 2, x2, y2, (x2 + x3) / 2, (y2 + y3) / 2);
			// triangulo de direita
			criaTrianguloRecu(g, nivel + 1, nivelMax, (x1 + x3) / 2,
					(y1 + y3) / 2, (x2 + x3) / 2, (y2 + y3) / 2, x3, y3);
                        
                        // tringulo Branco
                        criaTrianguloRecu(g, nivel + 1, nivelMax, (x1 + x2) / 2,
					(y1 + y2) / 2, (x2 + x3) / 2, (y2 + y3) / 2, (x1 + x3) / 2, (y1 + y3) / 2);
                        
		} else {
			// desenhar
                        g.setColor(Color.WHITE);
			int[] vx = { x1, x2, x3 };
			int[] vy = { y1, y2, y3 };
			g.fillPolygon(vx, vy, 3);
			
			try {
                            Thread.sleep(2000);
			} catch (InterruptedException e) {
                            // TODO Auto-generated catch block
                            e.printStackTrace();
			}
		}*/
    }

}
