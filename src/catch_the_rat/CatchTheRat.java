package catch_the_rat;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;
import java.util.Scanner;
import static catch_the_rat.Start.jf;

class CatchTheRat implements ActionListener{
    JLabel rat, l2;
    Timer timer;
    Random r;
    static int i = 0, counter = 10;
    public CatchTheRat(int k) {
        i = 0;
        counter = 10;
        rat = new JLabel(new ImageIcon("rat.png"));
        jf.add(rat);
        rat.setBounds(400,50,82,100);
        
        final JLabel l1 = new JLabel("Your Score: 0");
        l1.setFont(new Font("BOLD", 1, 15)); 
        l1.setForeground(new Color(255, 255, 255));
        l1.setBounds(1200,1,100,40);
        jf.add(l1);
        
        l2 = new JLabel("Chances left: 10");
        l2.setFont(new Font("BOLD", 1, 15)); 
        l2.setForeground(new Color(255, 255, 255));
        l2.setBounds(1200,20,130,40);
        jf.add(l2);
        
        r = new Random();

        // Create a timer and call it for every k seconds
        timer = new Timer(k, this);
        timer.start();
        
        // Add mouselistener, notify when user clicks it!
        rat.addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent me) {
                // Create a beep sound when clicked to notify
                Toolkit.getDefaultToolkit().beep();

                System.out.println("Caught!");
                i++;
                l1.setText("Your Score: " + i);
            }
        });
            
        ImageIcon img = new ImageIcon("background.jpg");
        JLabel bg = new JLabel();
        bg.setIcon(img);
        jf.add(bg);
        jf.setTitle("Catch The Rat");
        jf.validate();
        jf.repaint();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        rat.setLocation(r.nextInt(jf.getWidth()-75),r.nextInt(jf.getHeight()-75));
        counter--;
        if (counter == 0) {
            System.out.println(counter);
            counter = 10;
            timer.stop();
            jf.getContentPane().removeAll();
            new Finish(i);
        } else {
            l2.setText("Chances Left: " + counter); 
        }
    }
    
    
}