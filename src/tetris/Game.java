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
    private ZShape test;
    private ArrayList<Shape> shapes;
    private boolean rotateLeft;
    private boolean moveLeft;
    private boolean moveRight;
    
    public Game()   {
        super();
        setSize(1200, 960);
        timer = new Timer();
        timer.scheduleAtFixedRate(new ScheduleTask(), 1000, 1000/24);
        
        
        test = new ZShape(100, 100);
        
        
        shapes = new ArrayList<>();
        for (int i = 0; i < 100; i++) {

            if (i % 5 == 0) {
               shapes.add(new IShape((int) (Math.random() * 900), -50));
            }
            if (i % 4 == 0) {
               shapes.add(new OShape((int) (Math.random() * 900), -50));
            }
            if (i % 3 == 0) {
               shapes.add(new TShape((int) (Math.random() * 900), -50));
            }
            if (i % 2 == 0) {
               shapes.add(new LShape((int) (Math.random() * 900), -50));
            }
            if (i % 5 == 0) {
               shapes.add(new ZShape((int) (Math.random() * 900), -50));
            }
        }      
    }
    
    
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        this.setBackground(Color.BLACK);
        
        
        Graphics2D g2d = (Graphics2D)g;
        
        test.draw(g);
        
        if (rotateLeft == true) {
            //g.clearRect(test.getX(), test.getY(), 20, 50);
            
            test.rotateLeft(g);
            
            //Rectangle rect = new Rectangle(test.getX(), test.getY(), 20, 20);
            //g2d.rotate(Math.toRadians(45));
            //g.setColor(Color.red);
            //g2d.fill(rect);
            
        }
        
        for (Shape shape : shapes) {
            shape.draw(g);
        }
        
        
        
    }
    
    
    
    private class ScheduleTask extends TimerTask {
    
        @Override
        public void run() {
            
            test.update();
            
            for (Shape s : shapes) {
                s.update();
                s.wallCollisions();
            }
        
            for (int i = 0; i < shapes.size(); i++) {
                shapes.get(i).setDx(5);
                
            }
            
            /*
            for (int i = 0; i < shapes.size(); i++) {
                for (int j = i + 1; j < shapes.size(); j++) {
                    if (shapes.get(i).getX() + shapes.get(i).getSizeX() >= shapes.get(j).getX() && shapes.get(i).getY() + shapes.get(i).getSizeY() >= shapes.get(j).getY()) {
                        if (shapes.get(j).getX() + shapes.get(j).getSizeX() >= shapes.get(i).getX() && shapes.get(j).getY() == shapes.get(i).getX()) {
                        
                        }
                    }
                }
            }
            */
                    
            for (int i = 0; i < shapes.size(); i++) {
                for (int j = 0; j < shapes.size(); j++) {
                  if(shapes.get(i).getX() + shapes.get(i).getSizeX() >= shapes.get(j).getX() && shapes.get(i).getX() <= shapes.get(j).getX() + shapes.get(j).getSizeX())    {
                      if (shapes.get(i).getY() + shapes.get(i).getSizeY() >= shapes.get(j).getY() && shapes.get(i).getY() <= shapes.get(j).getY() + shapes.get(j).getSizeY()) {
                      
                        shapes.get(i).setDx(0);
                        shapes.get(j).setDx(0);
                        shapes.get(i).setDy(0);
                        shapes.get(j).setDy(0);
                      }
                    }  
                }
            }
            //have to figure out how to get one at a time, especially for the way to get one to drop down at a time
            for (Shape s : shapes) {
                if (moveLeft == true) {
                    s.setDx(-5);
                }
                if (moveRight == true) {
                    s.setDx(5);
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
          rotateLeft = true;
        }
    }
}


