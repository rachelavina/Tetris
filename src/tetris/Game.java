/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tetris;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import javax.swing.JPanel;
import java.util.Timer;
import java.util.TimerTask;

/**
 *
 * @author 628972
 */
public class Game extends JPanel{

    private Timer timer;
    private ArrayList<Shape> shapes;
    private boolean moveLeft;
    private boolean moveRight;
    private boolean moving;
    private int pieces = 0;
    private boolean over;
    private int position;
    
    public Game()   {
        super();
        setSize(1200, 960);
        timer = new Timer();
        timer.scheduleAtFixedRate(new ScheduleTask(), 1000, 1000/24);

        
        
        shapes = new ArrayList<>();
        for (int i = 0; i < 100; i++) {

            if (i % 5 == 0) {
               shapes.add(new IShape((int) (Math.random() * 900), -100));
            }
            if (i % 4 == 0) {
               shapes.add(new OShape((int) (Math.random() * 900), -100));
            }
            if (i % 3 == 0) {
               shapes.add(new TShape((int) (Math.random() * 900), -100));
            }
            if (i % 2 == 0) {
               shapes.add(new LShape((int) (Math.random() * 900), -100));
            }
            if (i % 5 == 0) {
               shapes.add(new ZShape((int) (Math.random() * 900), -100));
            }
        }      
    }
    
    
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        this.setBackground(Color.BLACK);
        g.setFont(new Font("TimesRoman", Font.PLAIN, 24));
        
        Graphics2D g2d = (Graphics2D)g;
        
        
        for (int i = 0; i < shapes.size(); i++) {
            if (shapes.get(i).getDy() > 0) {

    
        if (position == 0) {
            shapes.get(i).positionOne(g);
        }
        if (position == 1) {
            shapes.get(i).positionTwo(g);
        }
        if (position == 2) {
            shapes.get(i).positionThree(g);
        }
        if (position == 3) {
            shapes.get(i).positionFour(g);
        }
        if (position == 4) {
            position = 0;
            shapes.get(i).positionOne(g);
        }
        
        if (position == -1) {
            shapes.get(i).positionFour(g);
        }
        if (position == -2) {
            shapes.get(i).positionThree(g);
        }
        if (position == -3) {
            shapes.get(i).positionTwo(g);
        }
        if (position == -4) {
            position = 0;
            shapes.get(i).positionOne(g);
            }            
        }
        else {
            shapes.get(i).draw(g);
        }
        
    }
        
        
        
        
        for (Shape shape: shapes) {
             if (over == true) {
                g.setFont(new Font("TimesRoman", Font.PLAIN, 100));
                g.setColor(Color.white);
                g.drawString("Game Over", 325, 400);
             }
        }
 
        
        
        
    }
    
    
    
    private class ScheduleTask extends TimerTask {
    
        @Override
        public void run() {
            
             for (Shape s : shapes) {
                s.update();
                s.wallCollisions();   
            }

            

            //make a seperate method for drop next line
            
            for (Shape s : shapes) {
                if  (s.getDy()> 0)  {
                    moving = true;
                }
                
            }
            if (moving != true) {
                
                newPiece();
                
                pieces++;

            }

            if (moving == true) {
                if (moveLeft == true) {
                shapes.get(pieces - 1).moveLeft();
            }
                if (moveRight == true) {
                shapes.get(pieces -1).moveRight();
            }
                if (moveLeft == false && moveRight == false) {
                    shapes.get(pieces - 1).setDx(0);
                }
        
            }
            
            
            
            for (int i = 0; i < shapes.size(); i++) {
              for (int j = i + 1; j < shapes.size(); j++)    {
                hitBound(shapes.get(i), shapes.get(j));
                }
            }
            
            for (int i = 0; i < shapes.size(); i++) {
                if (i < pieces) {
                    if (shapes.get(i).getY() <= 10 && shapes.get(i).getDy() == 0) {
                        over = true;
                    }
                }
            }
            
            
            moving = false;
            
        System.out.println(position);
         
            for (Shape s : shapes) {
                if (position >= 4 || position <= -4) {
                   position = 0;
                }
            }
            
            
        repaint();
        
        }
    }
    
    
    
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            moveLeft = true;
            
        }
        if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            moveRight = true;
        }
    }
    
    public void keyReleased(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_A)    {
            position--;
        }
        if (e.getKeyCode() == KeyEvent.VK_D)    {
            position++;
        }
        if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            moveLeft = false;
          
        }
        if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            moveRight = false;
           
        }
    }
    
    
    public void hitBound(Shape s1, Shape s2)    {
        if (s1.getY() > 0 && s2.getY() > 0) {
            if (s1.getBound1().intersects(s2.getBound1()) || s1.getBound2().intersects(s2.getBound2()) || s1.getBound1().intersects(s2.getBound2()) || s1.getBound2().intersects(s2.getBound1())) {
                s1.setDx(0);
                s2.setDx(0);
                s1.setDy(0);
                s2.setDy(0);
            }  
        }
    }
    

    public void newPiece()  {
        shapes.get(pieces).move();
    }
    
    
}


