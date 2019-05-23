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
      sizeX = 50;
      sizeY = 25;
      sizeBoundX = 50;
      sizeBoundY = 25;
    }
    
    @Override
    public void draw(Graphics g)  {
        Graphics2D g2d = (Graphics2D) g;
        g.setColor(Color.CYAN);
        g.fillRect(x, y, 50, 25);
        g.fillRect(x + 25,y + 25, 50, 25);
        
        bound1 = new Rectangle(x, y, 50, 25);
        bound2 = new Rectangle(x + 25, y + 25, 50, 25);
        
        g.setColor(Color.WHITE);
        g2d.draw(bound1);
        g.setColor(Color.orange);
        g2d.draw(bound2);
    }
    
    public void rotateLeft(Graphics g)  {
        Graphics2D g2d = (Graphics2D) g;
        //g.setColor(Color.BLACK);
        //g.fillRect(x, y, 300, 300);
        g.setColor(Color.CYAN);
        g.fillRect(x + 25, y, 25, 50);
        g.fillRect(x, y + 25, 25, 50);
        sizePlaceholderX = sizeX;
        sizePlaceholderY = sizeY;
        sizeX = sizePlaceholderY;
        sizeY = sizePlaceholderX;
    }
    
    public void positionOne (Graphics g)    {
        Graphics2D g2d = (Graphics2D) g;
        //g.setColor(Color.BLACK);
        //g.fillRect(x, y, 300, 300);
        g.setColor(Color.CYAN);
        g.fillRect(x, y, 50, 25);
        g.fillRect(x + 25, y + 25, 50, 25);
        //sizePlaceholderX = sizeX;
        //sizePlaceholderY = sizeY;
        //sizeX = sizePlaceholderY;
        //sizeY = sizePlaceholderX;
        //bound1 = new Rectangle(x, y, sizeX, sizeY);
        //bound2 = new Rectangle(x + 25, y + 25, sizeBoundX, sizeBoundY);
        
        bound1 = new Rectangle(x, y, 50, 25);
        bound2 = new Rectangle(x +25, y +25, 50, 25);
    }
    
    public void positionTwo (Graphics g)    {
        Graphics2D g2d = (Graphics2D) g;
        //g.setColor(Color.BLACK);
        //g.fillRect(x, y, 300, 300);
        g.setColor(Color.CYAN);
        g.fillRect(x + 25, y, 25, 50);
        g.fillRect(x, y + 25, 25, 50);
        //sizePlaceholderX = sizeX;
        //sizePlaceholderY = sizeY;
        //sizeX = sizePlaceholderY;
        //sizeY = sizePlaceholderX;
        //bound1 = new Rectangle(x + 25, y, sizeX, sizeY);
        //bound2 = new Rectangle(x, y + 25, sizeBoundY, sizeBoundX);
        
        bound1 = new Rectangle(x + 25, y, 25, 50);
        bound2 = new Rectangle(x, y + 25, 25, 50);
    }
    
    public void positionThree (Graphics g)  {
        Graphics2D g2d = (Graphics2D) g;
        //g.setColor(Color.BLACK);
        //g.fillRect(x, y, 300, 300);
        g.setColor(Color.CYAN);
        g.fillRect(x, y, 50, 25);
        g.fillRect(x + 25, y + 25, 50, 25);
        //sizePlaceholderX = sizeX;
        //sizePlaceholderY = sizeY;
        //sizeX = sizePlaceholderY;
        //sizeY = sizePlaceholderX;
        //bound1 = new Rectangle(x, y, sizeX, sizeY);
        //bound2 = new Rectangle(x + 25, y + 25, sizeBoundX, sizeBoundY);
        
        bound1 = new Rectangle(x, y, 50, 25);
        bound2 = new Rectangle(x + 25, y + 25, 50, 25);
    }
    
    public void posiionFour (Graphics g)    {
        Graphics2D g2d = (Graphics2D) g;
        //g.setColor(Color.BLACK);
        //g.fillRect(x, y, 300, 300);
        g.setColor(Color.CYAN);
        g.fillRect(x + 25, y, 25, 50);
        g.fillRect(x, y + 25, 25, 50);
        //sizePlaceholderX = sizeX;
        //sizePlaceholderY = sizeY;
        //sizeX = sizePlaceholderY;
        //sizeY = sizePlaceholderX;
        //bound1 = new Rectangle(x + 25, y, sizeX, sizeY);
        //bound2 = new Rectangle(x, y + 25, sizeBoundY, sizeBoundX);
        
        bound1 = new Rectangle(x + 25, y, 25, 50);
        bound2 = new Rectangle(x, y + 25, 25, 50);
    }
}
