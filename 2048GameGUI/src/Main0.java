import javax.swing.*;
import java.awt.*;

public class Main0{

    public static void main(String[] args) {
        JFrame frame1 = new JFrame();
        Panel1 panel = new Panel1();

        frame1.setLayout(new GridLayout(4,1));
        frame1.add(panel.panel0);
        frame1.add(panel.button);
        frame1.add(panel.panel1);
        frame1.add(panel);

        frame1.setSize(750,200);
        frame1.setTitle("Enter Your name & Click For Start The 2048 Game");
        frame1.setVisible(true);
        frame1.setLocationRelativeTo(null);
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame1.setAlwaysOnTop(true);
    }
}
