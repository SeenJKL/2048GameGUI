import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Panel1 extends JPanel implements ActionListener{

    Timer timer = new Timer(1000,this);

    JPanel panel0 = new JPanel();
    JPanel panel1 = new JPanel();
    JLabel label = new JLabel("Please Enter Your Name: ");
    JTextField textField = new JTextField(40);
    JButton button = new JButton("Start The Game");
    String message = "";
    int count = 5;

    public Panel1() {
        panel1.setLayout(new FlowLayout());

        for (int i = 2; i <= 2048; i = 2*i){
            JLabel labelNum = new JLabel(String.valueOf(i));
            panel1.add(labelNum);
        }
        setLayout(new BorderLayout());

        panel0.add(label);
        panel0.add(textField);

        add(panel0, BorderLayout.NORTH);
        add(button, BorderLayout.CENTER);
        add(panel1, BorderLayout.SOUTH);

        textField.addActionListener(this);
        button.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource() == timer){
            count--;
            repaint();
        }
        if(count == 0){
            timer.stop();
            Main1.StartGame1();
        }
        if(e.getSource() == textField) {
                message = e.getActionCommand();
                repaint();
        }
        if(e.getActionCommand() == "Start The Game"){
            timer.start();
        }
    }
    protected void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        g.setFont(new Font("SansSerif", Font.BOLD, 12));
        g.setColor(Color.BLACK);
        g.drawString("Hello, " + message + " Game will start in " + count + " second", 100, 10);
    }
}
