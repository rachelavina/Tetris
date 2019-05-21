/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tetris;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.geom.Rectangle2D;
import javax.swing.ImageIcon;

/**
 *
 * @author 628972
 */
public class Shape {
    
    public int x;
    public int y;
    public int dx;
    public int dy;
    public int sizeX;
    public int sizeY;
    public int sizePlaceholderX;
    public int sizePlaceholderY;
    public int sizeBoundX;
    public int sizeBoundY;
    public Rectangle bound1;
    public Rectangle bound2;
    
    //Constructor
    public Shape()  {
        
        x = 300;
        y = 500;
        dx = 0;
        dy = 0;
    }
    
    public Shape(int x, int y)  {
        
        this.x = x;
        this.y = y;
        dx = 0;
        dy = 0;
        //ii = new ImageIcon(imgSrc);
        //img = ii.getImage();
        bound1 = new Rectangle (this.x, this.y, sizeX, sizeY);
        bound2 = new Rectangle (this.x, this.y, sizeBoundX, sizeBoundY);
    }
    
    
    
    public Rectangle getBound1() {
        return bound1;
    }

    public Rectangle getBound2()    {
        return bound2;
    }
 
    
    public void draw(Graphics g)   {
        Graphics2D g2d = (Graphics2D) g;
        g2d.draw(bound1);
        g2d.draw(bound2);
    }
    
    public void positionOne(Graphics g)   {
        
    }
    public void positionTwo(Graphics g)   {
        
    }
    public void positionThree(Graphics g)   {
        
    }
    public void positionFour(Graphics g)   {
        
    }
    

    
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getDx() {
        return dx;
    }

    public void setDx(int dx) {
        this.dx = dx;
    }

    public int getDy() {
        return dy;
    }

    public void setDy(int dy) {
        this.dy = dy;
    }

    public int getSizeX() {
        return sizeX;
    }

    public void setSizeX(int sizeX) {
        this.sizeX = sizeX;
    }

    public int getSizeY() {
        return sizeY;
    }

    public void setSizeY(int sizeY) {
        this.sizeY = sizeY;
    }
    
    
    public void update()    {
        x+=dx;
        y+=dy;
        bound1 = new Rectangle(this.x, this.y, sizeX, sizeY);
        bound2 = new Rectangle(this.x, this.y, sizeBoundX, sizeBoundY);// have to think about if the sizes are going to work for the second bound
    }
    
    public void move()  {
        dy = 5;
    }
    
    public void wallCollisions()    {
        if(x <= 5)    {
            x = 8;
        }
        
        if(x >= 1135 || x + 50 >= 1150)    {
            x = 1130;
        }
        
        if (y >= 730) {
            dy = 0;
        }
    }
    public void moveLeft()  {
        dx = -5;
    }
    public void moveRight() {
        dx = 5;
    }
    
}
