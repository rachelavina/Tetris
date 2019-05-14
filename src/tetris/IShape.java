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
        bound1 = new Rectangle(x, y, sizeX, sizeY);
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