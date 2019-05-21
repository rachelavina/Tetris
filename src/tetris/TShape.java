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
public class TShape extends Shape{
    
    public TShape(int x, int y) {
        super(x, y); //super calls the character constructor
      sizeX = 75;
      sizeY = 25; // I changed this to 25 and I hope that this is correct now
      sizeBoundX = 25;
      sizeBoundY = 25;
    }
    
    @Override
    public void draw(Graphics g)  {
        Graphics2D g2d = (Graphics2D) g;
        g.setColor(Color.BLUE);
        g.fillRect(x, y, 75, 25);
        g.fillRect(x + 25,y + 25, 25, 25);
        
        bound1 = new Rectangle(x, y, 75, 25);
        bound2 = new Rectangle(x + 25, y + 25, 25, 25);
        
        g.setColor(Color.WHITE);
        g2d.draw(bound1);
        g.setColor(Color.orange);
        g2d.draw(bound2);
    }
    
    public void rotateLeft(Graphics g)  {
        Graphics2D g2d = (Graphics2D) g;
        g.setColor(Color.BLACK);
        g.fillRect(x, y, 300, 300);
        g.setColor(Color.BLUE);
        g.fillRect(x + 25, y, 25, 75);
        g.fillRect(x + 25, y + 25, 25, 25);
        //sizePlaceholderX = sizeX;
        //sizePlaceholderY = sizeY;
        //sizeX = sizePlaceholderY;
        //sizeY = sizePlaceholderX;
    }
    
    public void positionOne (Graphics g)   {
        Graphics2D g2d = (Graphics2D) g;
        g.setColor(Color.BLUE);
        g.fillRect(x, y, 75, 25);
        g.fillRect(x + 25,y + 25, 25, 25);
        //sizePlaceholderX = sizeX;
        //sizePlaceholderY = sizeY;
        //sizeX = sizePlaceholderY;
        //sizeY = sizePlaceholderX;
        //bound1 = new Rectangle(x, y, sizeX, sizeY);
        //bound2 = new Rectangle(x + 25, y + 25, sizeBoundX, sizeBoundY);
        bound1 = new Rectangle (x, y, 75, 25);
        bound2 = new Rectangle (x + 25, y + 25, 25, 25);
    }
    
    public void positionTwo (Graphics g)    {
        Graphics2D g2d = (Graphics2D) g;
        g.setColor(Color.BLUE);
        g.fillRect(x + 25, y, 25, 75);
        g.fillRect(x, y + 25, 25, 25);
        //sizePlaceholderX = sizeX;
        //sizePlaceholderY = sizeY;
        //sizeX = sizePlaceholderY;
        //sizeY = sizePlaceholderX;
        //bound1 = new Rectangle(x + 25, y, sizeX, sizeY);
        //bound2 = new Rectangle(x, y + 25, sizeBoundX, sizeBoundY);
        bound1 = new Rectangle (x + 25, y, 25, 75);
        bound2 = new Rectangle (x, y + 25, 25, 25);
    }
    
    public void positionThree (Graphics g)  {
        Graphics2D g2d = (Graphics2D) g;
        g.setColor(Color.BLUE);
        g.fillRect(x, y + 25, 75, 25);
        g.fillRect(x + 25, y, 25, 25);
        //sizePlaceholderX = sizeX;
        //sizePlaceholderY = sizeY;
        //sizeX = sizePlaceholderY;
        //sizeY = sizePlaceholderX;
        //bound1 = new Rectangle(x, y + 25, sizeX, sizeY);
        //bound2 = new Rectangle(x + 25, y, sizeBoundX, sizeBoundY);
        bound1 = new Rectangle (x, y + 25, 75, 25);
        bound2 = new Rectangle (x + 25, y, 25, 25);
    }
    
    public void positionFour (Graphics g)   {
        Graphics2D g2d = (Graphics2D) g;
        g.setColor(Color.BLUE);
        g.fillRect(x, y, 25, 75);
        g.fillRect(x + 25, y + 25, 25, 25);
        //sizePlaceholderX = sizeX;
        //sizePlaceholderY = sizeY;
        //sizeX = sizePlaceholderY;
        //sizeY = sizePlaceholderX;
        //bound1 = new Rectangle(x, y, sizeX, sizeY);
        //bound2 = new Rectangle(x + 25, y + 25, sizeBoundX, sizeBoundY);
        bound1 = new Rectangle (x, y, 25, 75);
        bound2 = new Rectangle (x + 25, y + 25, 25, 25);
    }
}
