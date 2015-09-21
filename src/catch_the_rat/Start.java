package catch_the_rat;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.Image;
import java.awt.Point;
import java.awt.Toolkit;
import java.util.Scanner;
import javax.swing.*;

public class Start extends JFrame{
    static JFrame jf = new JFrame();
    JButton easy = new JButton();
    JButton medium = new JButton();
    JButton hard = new JButton();
    public Start() {
        jf.getContentPane().removeAll();
        JLabel l1 = new JLabel("CATCH THE RAT");
        l1.setFont(new Font("Berlin Sans FB Demi", 1, 30)); 
        l1.setForeground(new java.awt.Color(51, 153, 255));
        l1.setBounds(580,50,600,40);
        jf.add(l1);
                
        JLabel l3 = new JLabel("Choose a playing mode:");
        l3.setFont(new Font("BOLD", 1, 15)); 
        l3.setForeground(new Color(255, 255, 255));
        l3.setBounds(600,250,600,40);
        jf.add(l3);
        
        easy.setBackground(new java.awt.Color(64, 64, 64));
        easy.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 15)); 
        easy.setForeground(new java.awt.Color(51, 153, 255));
        easy.setText("EASY");
        easy.setBorderPainted(false);
        easy.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jf.add(easy);
        easy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
                    jf.getContentPane().removeAll();
                    new CatchTheRat(1000);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
        easy.setBounds(630, 300, 120, 30);
        
        medium.setBackground(new java.awt.Color(64, 64, 64));
        medium.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 15)); 
        medium.setForeground(new java.awt.Color(51, 153, 255));
        medium.setText("MEDIUM");
        medium.setBorderPainted(false);
        medium.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jf.add(medium);
        medium.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
                    jf.getContentPane().removeAll();
                    new CatchTheRat(900);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
        medium.setBounds(630, 350, 120, 30);
        
        hard.setBackground(new java.awt.Color(64, 64, 64));
        hard.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 15)); 
        hard.setForeground(new java.awt.Color(51, 153, 255));
        hard.setText("HARD");
        hard.setBorderPainted(false);
        hard.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jf.add(hard);
        hard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
                    jf.getContentPane().removeAll();
                    new CatchTheRat(500);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
        hard.setBounds(630, 400, 120, 30);
        
        ImageIcon img1 = new ImageIcon("11.gif");
        JLabel bg1 = new JLabel();
        bg1.setIcon(img1);
        jf.add(bg1);
        bg1.setBounds(130, 300, 220, 220);
        
        img1 = new ImageIcon("rat.png");
        JLabel bg2 = new JLabel();
        bg2.setIcon(img1);
        jf.add(bg2);
        bg2.setBounds(1250, 0, 220, 220);
        
        img1 = new ImageIcon("cursor.png");
        JLabel bg3 = new JLabel();
        bg3.setIcon(img1);
        jf.add(bg3);
        bg3.setBounds(1250, 500, 220, 220);
        
        JLabel l2 = new JLabel("Copyright © 2014 - Designed and Developed By: Shubham Nanda");
        l2.setFont(new Font("Arial", Font.BOLD, 15)); 
        l2.setForeground(Color.red);
        l2.setBounds(480,630,600,40);
        jf.add(l2);
        
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Image image = toolkit.getImage("cursor.png");
        toolkit.getBestCursorSize(10, 10);
        Cursor c = toolkit.createCustomCursor(image , new Point(jf.getContentPane().getX(), jf.getContentPane().getY()), "img");
        jf.setCursor (c);
        
        ImageIcon img = new ImageIcon("background.jpg");
        JLabel bg = new JLabel();
        bg.setIcon(img);
        jf.add(bg);
        jf.setTitle("Catch me if you can");
        
        jf.validate();
        jf.repaint();
    }
    
    public static void main(String args[]) {
        new Start();
        jf.setDefaultCloseOperation(EXIT_ON_CLOSE);
        jf.setVisible(true);
        jf.setSize(1370, 740);
    }
}
