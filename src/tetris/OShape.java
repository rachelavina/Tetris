/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tetris;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

/**
 *
 * @author 628972
 */
public class OShape extends Shape{
    
    public OShape(int x, int y) {
        super(x, y); //super calls the character constructor
    sizeX = 50;
    sizeY = 50;
    }
    
    @Override
    public void draw(Graphics g)  {
        Graphics2D g2d = (Graphics2D) g;
        g.setColor(Color.RED);
        g.fillRect(x, y, 50,50);
       //drawPolygon(g, 100, 100, 100, 150, 120, 150, 120, 200, 140, 200, 140, 125, 120, 125, 120, 100);
       
    }
    
    public void rotateLeft(Graphics g)  {
        Graphics2D g2d = (Graphics2D) g;
        g.setColor(Color.BLACK);
        g.fillRect(x, y, 300, 300);
        g.setColor(Color.RED);
        g.fillRect(x, y, 50, 50); 
    }
    
    public void remove()    {
        
    }

    private void drawPolygon(Graphics g, int i, int i0, int i1, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
