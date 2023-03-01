import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Login1 extends JFrame implements ActionListener,MouseListener{
    JPanel p;
    JLabel l0,l1,l2,l3,label1,label2,label3;
    JTextField tf;
    JButton b1,b2,b3;
    @SuppressWarnings("rawtypes")
    JComboBox cb;
    public Login1(){
        p=new JPanel();
        p.setBounds(750,200,450,500);
        ImageIcon i7=new ImageIcon(ClassLoader.getSystemResource("Assets/#2.png"));
        Image i8=i7.getImage().getScaledInstance(350,200,Image.SCALE_DEFAULT);
        ImageIcon i9=new ImageIcon(i8);
        label3=new JLabel(i9);
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
        l1.setBounds(20,80,180,40);
        p.add(l1);
        l3=new JLabel("Sign in as:");
        l3.setFont(new Font("Big Space",Font.BOLD,25));
        l3.setForeground(Color.WHITE);
        l3.setBounds(20,160,180,30);
        p.add(l3);
        //noinspection rawtypes
        cb=new JComboBox();
        cb.setBounds(20,200,320,40);
        cb.addMouseListener(this);
        p.add(cb);
        l2=new JLabel();
        l2.setFont(new Font("Tahoma",Font.PLAIN,15));
        l2.setForeground(Color.WHITE);
        l2.setBounds(60,300,200,20);
        p.add(l2);
        ImageIcon i4=new ImageIcon(ClassLoader.getSystemResource("Assets/#3.jpg"));
        Image i5=i4.getImage().getScaledInstance(40,40,Image.SCALE_DEFAULT);
        ImageIcon i6=new ImageIcon(i5);
        label2=new JLabel(i6);
        label2.setBounds(20,320,40,40);
        p.add(label2);
        tf=new JTextField();
        tf.setFont(new Font("Tahoma",Font.PLAIN,20));
        tf.setBounds(60,320,280,40);
        tf.setEditable(false);
        tf.addMouseListener(this);
        p.add(tf);
        b1=new JButton("Login");
        b1.setFont(new Font("Colona MT",Font.BOLD,25));
        b1.setForeground(Color.WHITE);
        b1.setBounds(30,400,120,30);
        b1.setOpaque(false);
        b1.setContentAreaFilled(false);
        b1.setBorderPainted(false);
        b1.addMouseListener(this);
        b1.addActionListener(this);
        p.add(b1);
        b2=new JButton("Cancel");
        b2.setFont(new Font("Colona MT",Font.BOLD,25));
        b2.setForeground(Color.WHITE);
        b2.setBounds(200,400,120,30);
        b2.setOpaque(false);
        b2.setContentAreaFilled(false);
        b2.setBorderPainted(false);
        b2.addMouseListener(this);
        b2.addActionListener(this);
        p.add(b2);
        b3=new JButton("Register");
        b3.setFont(new Font("Colona MT",Font.BOLD,25));
        b3.setForeground(Color.WHITE);
        b3.setBounds(100,440,150,30);
        b3.setOpaque(false);
        b3.setContentAreaFilled(false);
        b3.setBorderPainted(false);
        b3.addMouseListener(this);
        b3.addActionListener(this);
        p.add(b3);
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("Assets/#7.jpg"));
        Image i2=i1.getImage().getScaledInstance(1800,1000,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        label1=new JLabel(i3);
        label1.setBounds(0,0,1800,1000);
        add(label1);
        label1.add(p);
        p.setOpaque(false);
        p.setLayout(null);
        p.setBackground(Color.WHITE);
        p.addMouseListener(this);
        setSize(1800,1000);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }
    public void mouseClicked(MouseEvent e){
        if(e.getSource()==tf){
            tf.setEditable(true);
        }
    }
    public void mouseEntered(MouseEvent e){l2.setText("Enter your Username");}
    public void mouseExited(MouseEvent e){l2.setText("");}
    public void mousePressed(MouseEvent e){}
    public void mouseReleased(MouseEvent e){}
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==b1){
            setVisible(false);
            new Login2().setVisible(true);
        }else if(ae.getSource()==b2){
            setVisible(false);
            new MainPage().setVisible(true);
        }else{
            System.exit(0);
        }
    }
}