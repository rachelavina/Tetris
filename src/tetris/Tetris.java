/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tetris;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JFrame;

/**
 *
 * @author 628972
 */
public class Tetris {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       JFrame j = new JFrame("Tetris");
        Game c = new Game();
        j.add(c);
        j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        j.setSize(1200, 960);
        j.setVisible(true);
        j.setLocationRelativeTo(null);
        j.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                c.keyPressed(e);
            }
            @Override
            public void keyReleased(KeyEvent e) {
                c.keyReleased(e);
            }
        });
    }
    
}