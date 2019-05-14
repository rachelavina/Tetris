/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tetris;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;

/**
 *
 * @author 628972
 */
public class ZShape extends Shape{
    
    public ZShape(int x, int y) {
        super(x, y); //super calls the character constructor
      sizeX = 75;
      sizeY = 50;
      sizeBoundX = 50;
      sizeBoundY = 25;
    }
    
    @Override
    public void draw(Graphics g)  {
        Graphics2D g2d = (Graphics2D) g;
        g.setColor(Color.CYAN);
        g.fillRect(x, y, 50, 25);
        g.fillRect(x + 25,y + 25, 50, 25);
       //drawPolygon(g, 100, 100, 100, 150, 120, 150, 120, 200, 140, 200, 140, 125, 120, 125, 120, 100);
        bound1 = new Rectangle(x, y, sizeX, sizeY);
        bound2 = new Rectangle(x + 25, y + 25, sizeBoundX, sizeBoundY);
    }
    
    public void rotateLeft(Graphics g)  {
        Graphics2D g2d = (Graphics2D) g;
        g.setColor(Color.BLACK);
        g.fillRect(x, y, 300, 300);
        g.setColor(Color.CYAN);
        g.fillRect(x + 25, y, 25, 50);
        g.fillRect(x, y + 25, 25, 50);
        sizeX = sizePlaceholder;
        sizeX = sizeY;
        sizeY = sizePlaceholder;
    }
}
