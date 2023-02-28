import javax.swing.*;
import java.awt.*;
import java.net.*;
import java.util.concurrent.*;

public class Test extends JFrame{
    Test(){
        ScheduledExecutorService scheduler = Executors.newSingleThreadScheduledExecutor();
        Runnable task = () -> System.exit(0);
        scheduler.schedule(task,3000,TimeUnit.MILLISECONDS);
        scheduler.shutdown();
        URL url = Test.class.getResource("Pics/#11.gif");
        assert url!=null;
        ImageIcon icon = new ImageIcon(url);
        Image i2=icon.getImage().getScaledInstance(400,220,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel label = new JLabel(i3);
        add(label);
        setUndecorated(true);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }
}