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
import java.awt.event.KeyEvent;

/**
 *
 * @author 628972
 */
public class IShape extends Shape{
    
    //int rotation;
    //public int position;
    
    public IShape(int x, int y) {
        super(x, y); //super calls the character constructor
      sizeX = 25;
      sizeY = 100;
      sizeBoundX = 25;
      sizeBoundY = 100;
    }
    

    
    @Override
    public void draw(Graphics g)  {
        Graphics2D g2d = (Graphics2D) g;
        g.setColor(Color.GREEN);
        //g.fillRect(x, y, 25, 100);
        
        //bound1 = new Rectangle(x, y, 25, 100);
        //bound2 = new Rectangle(x, y, 25, 100);
        //final int rotation = position;
        
        /*
        this didn't work, it basically just read the "rotation' as zero and painted it but then it 
        */
        g.setColor(Color.GREEN);
        g.fillRect(x, y, sizeX, sizeY);
        bound1 = new Rectangle (x, y, sizeX, sizeY);  

        
    }
 
    
    public void positionOne (Graphics g)    {
        Graphics2D g2d = (Graphics2D) g;
        g.setColor(Color.GREEN);
        g.fillRect(x, y, 25, 100);
        bound1 = new Rectangle (x, y, 25, 100);
        
        sizeX = 25;
        sizeY = 100;
        
    }
    
    public void positionTwo (Graphics g)    {
        Graphics2D g2d = (Graphics2D) g;
        g.setColor(Color.GREEN);
        g.fillRect(x, y, 100, 25);  
        bound1 = new Rectangle (x, y, 100, 25);
 
        sizeX = 100;
        sizeY = 25;
    }
    
    public void positionThree (Graphics g)  {
        Graphics2D g2d = (Graphics2D) g;
        g.setColor(Color.GREEN);
        g.fillRect(x, y, 25, 100);
        bound1 = new Rectangle (x, y, 25, 100);
        
        sizeX = 25;
        sizeY = 100;
    }
    
    public void positionFour (Graphics g)   {
        Graphics2D g2d = (Graphics2D) g;
        g.setColor(Color.GREEN);
        g.fillRect(x, y, 100, 25);  
        bound1 = new Rectangle (x, y, 100, 25);
        
        sizeX = 100;
        sizeY = 25;
    }

}