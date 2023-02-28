import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Login2 extends JFrame implements ActionListener,MouseListener{
    JPanel p;
    JLabel l0,l1,l2,l3,l4,label1,label2,label3,label4,label5;
    JPasswordField pf;
    JButton b1,b2;
    public Login2(){
        p=new JPanel();
        p.setBounds(750,200,450,500);
        ImageIcon i13=new ImageIcon(ClassLoader.getSystemResource("Pics/#2.png"));
        Image i14=i13.getImage().getScaledInstance(350,200,Image.SCALE_DEFAULT);
        ImageIcon i15=new ImageIcon(i14);
        label3=new JLabel(i15);
        label3.setBounds(450,0,350,200);
        add(label3);
        l0=new JLabel("Gaming  Login  Page");
        l0.setFont(new Font("I Am A Designer",Font.PLAIN,45));
        l0.setForeground(Color.ORANGE);
        l0.setBounds(720,80,600,50);
        add(l0);
        l1=new JLabel("Defiant");
        l1.setFont(new Font("The Devil Net",Font.BOLD,35));
        l1.setForeground(Color.GREEN);
        l1.setBounds(10,20,180,40);
        p.add(l1);
        l2=new JLabel("Welcome Back!");
        l2.setFont(new Font("GodOfWar",Font.BOLD,35));
        l2.setForeground(Color.CYAN);
        l2.setBounds(10,80,320,40);
        p.add(l2);
        l4=new JLabel("Sign in to Defiant Store");
        l4.setFont(new Font("Tahoma",Font.BOLD,15));
        l4.setForeground(Color.WHITE);
        l4.setBounds(15,130,180,20);
        p.add(l4);
        ImageIcon i10=new ImageIcon(ClassLoader.getSystemResource("Pics/#9.png"));
        Image i11=i10.getImage().getScaledInstance(110,20,Image.SCALE_DEFAULT);
        ImageIcon i12=new ImageIcon(i11);
        label4=new JLabel(i12);
        label4.setBounds(200,130,110,20);
        p.add(label4);
        l3=new JLabel();
        l3.setFont(new Font("Tahoma",Font.PLAIN,15));
        l3.setForeground(Color.WHITE);
        l3.setBounds(60,260,200,20);
        p.add(l3);
        ImageIcon i7=new ImageIcon(ClassLoader.getSystemResource("Pics/#5.png"));
        Image i8=i7.getImage().getScaledInstance(40,40,Image.SCALE_DEFAULT);
        ImageIcon i9=new ImageIcon(i8);
        label3=new JLabel(i9);
        label3.setBounds(20,280,40,40);
        p.add(label3);
        pf=new JPasswordField();
        pf.setFont(new Font("Tahoma",Font.BOLD,20));
        pf.setBounds(60,280,250,40);
        pf.setEditable(false);
        p.add(pf);
        ImageIcon i4=new ImageIcon(ClassLoader.getSystemResource("Pics/#4.png"));
        Image i5=i4.getImage().getScaledInstance(40,40,Image.SCALE_DEFAULT);
        ImageIcon i6=new ImageIcon(i5);
        label1=new JLabel(i6);
        label1.setBounds(310,280,40,40);
        p.add(label1);
        ImageIcon i16=new ImageIcon(ClassLoader.getSystemResource("Pics/#6.png"));
        Image i17=i16.getImage().getScaledInstance(40,40,Image.SCALE_DEFAULT);
        ImageIcon i18=new ImageIcon(i17);
        label5=new JLabel(i18);
        label5.setBounds(310,280,40,40);
        p.add(label5);
        b1=new JButton("Switch User");
        b1.setFont(new Font("Colona MT",Font.BOLD,25));
        b1.setForeground(Color.WHITE);
        b1.setBounds(10,400,180,30);
        b1.setOpaque(false);
        b1.setContentAreaFilled(false);
        b1.setBorderPainted(false);
        b1.addMouseListener(this);
        b1.addActionListener(this);
        p.add(b1);
        b2=new JButton("Continue");
        b2.setFont(new Font("Colona MT",Font.BOLD,25));
        b2.setForeground(Color.WHITE);
        b2.setBounds(200,400,150,30);
        b2.setOpaque(false);
        b2.setContentAreaFilled(false);
        b2.setBorderPainted(false);
        b2.addMouseListener(this);
        b2.addActionListener(this);
        p.add(b2);
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("Pics/#7.jpg"));
        Image i2=i1.getImage().getScaledInstance(1800,1000,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        label2=new JLabel(i3);
        label2.setBounds(0,0,1800,1000);
        add(label2);
        label2.add(p);
        p.setOpaque(false);
        p.setLayout(null);
        p.setBackground(Color.WHITE);
        label1.addMouseListener(this);
        p.addMouseListener(this);
        pf.addMouseListener(this);
        setSize(1800,1000);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }
    public void mouseClicked(MouseEvent e){
        if(e.getSource()==pf){
            pf.setEditable(true);
        }
    }
    public void mouseEntered(MouseEvent e){l3.setText("Enter your Password");}
    public void mouseExited(MouseEvent e){l3.setText("");}
    public void mousePressed(MouseEvent e){
        if(e.getSource()==label1){
            pf.setEchoChar('\u0000');
            label1.setVisible(false);
        }else{
            pf.setEchoChar('*');
        }
    }
    public void mouseReleased(MouseEvent e){
        if(e.getSource()==label1){
            pf.setEchoChar('*');
            label1.setVisible(true);
        }
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==b1){
            setVisible(false);
            new Login1().setVisible(true);
        }else{
            setVisible(false);
            new Loading().setVisible(true);
        }
    }
}