import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.concurrent.*;

public class MainPage extends JFrame implements ActionListener{
    JButton b1,b2;
    JLabel l1;
    public MainPage(){
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Assets/#1.png"));
        Image i2 = i1.getImage().getScaledInstance(1600, 1000, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel label = new JLabel(i3);
        label.setBounds(0, 0, 1600, 1000);
        add(label);
        l1=new JLabel("Click Here...!!!");
        l1.setFont(new Font("Tahoma",Font.BOLD,20));
        l1.setForeground(Color.WHITE);
        l1.setBounds(730,550,160,30);
        label.add(l1);
        b1=new JButton(i3);
        b1.setBounds(680,375,240,250);
        b1.setOpaque(false);
        b1.setContentAreaFilled(false);
        b1.setBorderPainted(false);
        b1.addActionListener(this);
        label.add(b1);
        b2=new JButton("CLOSE");
        b2.setForeground(Color.WHITE);
        b2.setFont(new Font("Tahoma",Font.BOLD,30));
        b2.setBounds(730,900,140,40);
        b2.setOpaque(false);
        b2.setContentAreaFilled(false);
        b2.setBorderPainted(false);
        b2.addActionListener(this);
        label.add(b2);
        ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(4);
        Runnable task1 = () -> {
            l1.setForeground(Color.GREEN);
            l1.setVisible(true);
        };
        Runnable task2 = () -> {
            l1.setForeground(Color.RED);
            l1.setVisible(true);
        };
        Runnable task3 = () -> {
            l1.setForeground(Color.YELLOW);
            l1.setVisible(true);
        };
        Runnable task4 = () -> {
            l1.setForeground(Color.BLUE);
            l1.setVisible(true);
        };
        scheduler.scheduleAtFixedRate(task1, 0, 500, TimeUnit.MILLISECONDS);
        scheduler.scheduleAtFixedRate(task2, 0, 1000, TimeUnit.MILLISECONDS);
        scheduler.scheduleAtFixedRate(task3, 0, 1500, TimeUnit.MILLISECONDS);
        scheduler.scheduleAtFixedRate(task4, 0, 2000, TimeUnit.MILLISECONDS);
        setSize(1600,1000);
        setLayout(null);
        setUndecorated(true);
        setLocationRelativeTo(null);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==b1){
            setVisible(false);
            new Login1().setVisible(true);
        }else{
            System.exit(0);
        }
    }
    public static void main(String[] args){
        new MainPage();
    }
}