package catch_the_rat;
import static catch_the_rat.Start.jf;
import java.awt.Color;
import java.awt.Font;
import javax.swing.*;

public class Finish extends JFrame{
    JButton retry = new JButton();
    JButton exit = new JButton();
    public Finish(int i) {
        JLabel l1 = new JLabel("Final Score: " + i);
        l1.setFont(new Font("BOLD", 1, 30)); 
        l1.setForeground(new Color(0, 255, 100));
        l1.setBounds(600,340,600,40);
        jf.add(l1);
        
        if (i != 0) {
            ImageIcon img1 = new ImageIcon("caught.gif");
            JLabel bg1 = new JLabel();
            bg1.setIcon(img1);
            jf.add(bg1);
            bg1.setBounds(540, 50, 320, 320);
        } else {
            ImageIcon img1 = new ImageIcon("uncaught.gif");
            JLabel bg1 = new JLabel();
            bg1.setIcon(img1);
            jf.add(bg1);
            bg1.setBounds(560, 100, 320, 320);
        }
        retry.setBackground(new java.awt.Color(64, 64, 64));
        retry.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 15)); 
        retry.setForeground(new java.awt.Color(51, 153, 255));
        retry.setText("Retry");
        retry.setBorderPainted(false);
        retry.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jf.add(retry);
        retry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
                    jf.getContentPane().removeAll();
                    new Start();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
        retry.setBounds(630, 380, 120, 30);
        
        exit.setBackground(new java.awt.Color(64, 64, 64));
        exit.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 15)); 
        exit.setForeground(new java.awt.Color(51, 153, 255));
        exit.setText("exit");
        exit.setBorderPainted(false);
        exit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jf.add(exit);
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
                    jf.dispose();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
        exit.setBounds(630, 430, 120, 30);
        
        ImageIcon img = new ImageIcon("background.jpg");
        JLabel bg = new JLabel();
        bg.setIcon(img);
        jf.add(bg);
        setTitle("Score");
        jf.validate();
        jf.repaint();
    }
}
