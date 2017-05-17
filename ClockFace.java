/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clockface;

import java.awt.*;
import javax.swing.JFrame;
/**
 *
 * @author kendrabooker
 */
public class ClockFace extends Canvas{

    /**
     * @param args the command line arguments
     */
    public void paint(Graphics g){
    
        g.setColor(Color.white);
        g.fillOval(250, 145, 275, 275);
        
        g.setColor(Color.red);
        g.drawString("12", 380, 175);
        
        g.setColor(Color.red);
        g.drawString("6", 380, 390);
        
        g.setColor(Color.red);
        g.drawString("9", 260, 290);
        
        g.setColor(Color.red);
        g.drawString("3", 500, 290);
        
        g.setColor(Color.black);
        g.fillOval(382, 278, 15, 15);
        
        g.setColor(Color.black);
        g.drawLine(390,285,410,225);
        
        g.setColor(Color.black);
        g.drawLine(390,285,350,255);
        
    }
    
    
    public static void main(String[] args) {
        
        JFrame win = new JFrame("ClockFace");
        win.setSize(800,600);
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ClockFace canvas = new ClockFace();
        win.add( canvas );
        win.setVisible(true);

    }
    
}
