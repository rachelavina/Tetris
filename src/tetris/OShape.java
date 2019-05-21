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
public class OShape extends Shape{
    
    public OShape(int x, int y) {
        super(x, y); //super calls the character constructor
        sizeX = 50;
        sizeY = 50;
        sizeBoundX = 50;
        sizeBoundY = 50;
    }
    

    
    @Override
    public void draw(Graphics g)  {
        Graphics2D g2d = (Graphics2D) g;
        g.setColor(Color.RED);
        g.fillRect(x, y, 50,50);
        
        bound1 = new Rectangle(x, y, 50, 50);
        bound2 = new Rectangle(x, y, 50, 50);
    }
    
    public void rotateLeft(Graphics g)  {
        Graphics2D g2d = (Graphics2D) g;
        g.setColor(Color.BLACK);
        g.fillRect(x, y, 300, 300);
        g.setColor(Color.RED);
        g.fillRect(x, y, 50, 50); 
        //bound1 = new Rectangle(x, y, sizeX, sizeY);
    }
    
    public void positionOne(Graphics g)   {
        Graphics2D g2d = (Graphics2D) g;
        g.setColor(Color.BLACK);
        g.fillRect(x, y, 300, 300);
        g.setColor(Color.RED);
        g.fillRect(x, y, 50, 50);
       // bound1 = new Rectangle(x, y, sizeX, sizeY);
        bound1 = new Rectangle (x, y, 50, 50);
    }
    
    public void positionTwo (Graphics g)    {
        Graphics2D g2d = (Graphics2D) g;
        g.setColor(Color.BLACK);
        g.fillRect(x, y, 300, 300);
        g.setColor(Color.RED);
        g.fillRect(x, y, 50, 50);
        //bound1 = new Rectangle(x, y, sizeX, sizeY);
        bound1 = new Rectangle (x, y, 50, 50);
    }
    
    public void positionThree (Graphics g)  {
        Graphics2D g2d = (Graphics2D) g;
        g.setColor(Color.BLACK);
        g.fillRect(x, y, 300, 300);
        g.setColor(Color.RED);
        g.fillRect(x, y, 50, 50);
        //bound1 = new Rectangle(x, y, sizeX, sizeY);
        bound1 = new Rectangle (x, y, 50, 50);
    }
    
    public void positionFour (Graphics g)   {
        Graphics2D g2d = (Graphics2D) g;
        g.setColor(Color.BLACK);
        g.fillRect(x, y, 300, 300);
        g.setColor(Color.RED);
        g.fillRect(x, y, 50, 50);
        //bound1 = new Rectangle(x, y, sizeX, sizeY);
        bound1 = new Rectangle (x, y, 50, 50);
    }

    
}
