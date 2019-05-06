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
public class TShape extends Shape{
    
    public TShape(int x, int y) {
        super(x, y); //super calls the character constructor
      sizeX = 75;
      sizeY = 50;
    }
    
    @Override
    public void draw(Graphics g)  {
        Graphics2D g2d = (Graphics2D) g;
        g.setColor(Color.BLUE);
        g.fillRect(x, y, 75, 25);
        g.fillRect(x + 25,y + 25, 25, 25);
       //drawPolygon(g, 100, 100, 100, 150, 120, 150, 120, 200, 140, 200, 140, 125, 120, 125, 120, 100);
       
    }
    
    public void rotateLeft(Graphics g)  {
        Graphics2D g2d = (Graphics2D) g;
        g.setColor(Color.BLACK);
        g.fillRect(x, y, 300, 300);
        g.setColor(Color.BLUE);
        g.fillRect(x + 25, y, 25, 75);
        g.fillRect(x + 25, y + 25, 25, 25);
        sizeX = sizePlaceholder;
        sizeX = sizeY;
        sizeY = sizePlaceholder;
        
    }
}