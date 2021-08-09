import javax.swing.*;
import java.awt.*;
import java.util.jar.JarEntry;

public class Main{

    private Main(){
        JFrame jFrame = new JFrame("Swing App");
        jFrame.setSize(300,125);
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        JLabel firstnamel = new JLabel("Fisrt Name");
        JLabel lastnamelbl = new JLabel("Last Name");
        JTextField firstnamef = new JTextField(10);
        JTextField lastnamef = new JTextField(10);
        JPanel jPanel = new JPanel();
        jPanel.setLayout(new GridLayout(3,2,5,5));
        jPanel.add(firstnamel);
        jPanel.add(lastnamelbl);
        jPanel.add(firstnamef);
        jPanel.add(lastnamef);
        jFrame.setContentPane(jPanel);
        jFrame.setVisible(true);


    }

    public static void main(String[] args) {
        new Main();
    }
}