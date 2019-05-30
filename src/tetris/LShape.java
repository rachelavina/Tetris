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
public class LShape extends Shape{
    
    public LShape(int x, int y) {
        super(x, y); //super calls the character constructor
      sizeX = 25;
      sizeY = 75;
      sizeBoundX = 25;
      sizeBoundY = 25;
      place1X = x;
      place1Y = y;
      place2X = x;
      place2Y = y;
    }
    
    @Override
    public void draw(Graphics g)  {
        Graphics2D g2d = (Graphics2D) g;
        g.setColor(Color.PINK);
        /*g.fillRect(x, y, 25, 75);
        g.fillRect(x + 25,y + 50, 25, 25);
        
        bound1 = new Rectangle(x, y, 25, 75);
        bound2 = new Rectangle(x + 25, y + 50, 25, 25);
        
        g.setColor(Color.WHITE);
        g2d.draw(bound1);
        g.setColor(Color.orange);
        g2d.draw(bound2);*/
        
        g.fillRect(place1X, place1Y, sizeX, sizeY);
        g.fillRect(place2X, place2Y, sizeBoundY, sizeBoundY);
        
        bound1 = new Rectangle(place1X, place1Y, sizeX, sizeY);
        bound2 = new Rectangle(place2X, place2Y, sizeBoundX, sizeBoundY);
        
        
    }

    
    public void positionOne (Graphics g)   {
        Graphics2D g2d = (Graphics2D) g;
        g.setColor(Color.PINK);
        g.fillRect(x, y, 25, 75);
        g.fillRect(x + 25,y + 50, 25, 25);  
        bound1 = new Rectangle (x, y, 25, 75);
        bound2 = new Rectangle (x + 25, y + 50, 25, 25);
        
        //sizePlaceholderX = sizeX;
        //sizePlaceholderY = sizeY;
        //sizeX = sizePlaceholderY;
        //sizeY = sizePlaceholderX;
        
        sizeX = 25;
        sizeY = 75;
        
        place1X = x;
        place1Y = y;
        place2X = x+25;
        place2Y = y+50;
    }
    
    public void positionTwo (Graphics g)    {
        Graphics2D g2d = (Graphics2D) g;
        g.setColor(Color.PINK);
        g.fillRect(x, y, 75, 25);
        g.fillRect(x, y + 25, 25, 25);
        bound1 = new Rectangle (x, y, 75, 25);
        bound2 = new Rectangle (x, y + 25, 25, 25);
        
        //sizePlaceholderX = sizeX;
        //sizePlaceholderY = sizeY;
        //sizeX = sizePlaceholderY;
        //sizeY = sizePlaceholderX;
        
        sizeX = 75;
        sizeY = 25;
        
        place1X = x;
        place1Y = y;
        place2X = x;
        place2Y = y+25;
    }
    
    public void positionThree (Graphics g)  {
        Graphics2D g2d = (Graphics2D) g;
        g.setColor(Color.PINK);
        g.fillRect(x + 25, y, 25, 75);
        g.fillRect(x, y, 25, 25);
        bound1 = new Rectangle (x + 25, y, 25, 75);
        bound2 = new Rectangle (x, y, 25, 25);
        
        //sizePlaceholderX = sizeX;
        //sizePlaceholderY = sizeY;
        //sizeX = sizePlaceholderY;
        //sizeY = sizePlaceholderX;
        
        sizeX = 25;
        sizeY = 75;
        
        place1X = x + 25;
        place1Y = y;
        place2X = x;
        place2Y = y;
    }
    
    public void positionFour (Graphics g)   {
        Graphics2D g2d = (Graphics2D) g;
        g.setColor(Color.PINK);
        g.fillRect(x, y + 25, 75, 25);
        g.fillRect(x + 50, y, 25, 25);
        bound1 = new Rectangle (x, y + 25, 75, 25);
        bound2 = new Rectangle (x + 50, y, 25, 25);
        
        sizeX = 75;
        sizeY = 25;
        
        place1X = x;
        place1Y = y + 25;
        place2X = x+50;
        place2Y = y;
    }
}
