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
public class IShape extends Shape{
    public IShape(int x, int y) {
        super(x, y); //super calls the character constructor
      sizeX = 25;
      sizeY = 100;
    }
    

    
    @Override
    public void draw(Graphics g)  {
        Graphics2D g2d = (Graphics2D) g;
        g.setColor(Color.GREEN);
        g.fillRect(x, y, 25, 100);
        
       //drawPolygon(g, 100, 100, 100, 150, 120, 150, 120, 200, 140, 200, 140, 125, 120, 125, 120, 100);
       
    }
    
    public void rotateLeft(Graphics g)  {
        Graphics2D g2d = (Graphics2D) g;
        g.setColor(Color.BLACK);
        g.fillRect(x, y, 300, 300);
        g.setColor(Color.GREEN);
        g.fillRect(x, y + 20, 100, 25);  
        sizeX = sizePlaceholder;
        sizeX = sizeY;
        sizeY = sizePlaceholder; //add another placeholder if this doesnt work, all the shapes should just swap x and y
    }   
    
}