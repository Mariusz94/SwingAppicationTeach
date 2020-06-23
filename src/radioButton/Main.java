package radioButton;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Program show how to operate events
 * ActionListener implements in argument method addActionListener as class anonymous
 * @Author Mariusz Lyszczarz
 */
public class Main extends JFrame {
    JPanel panel;
    JRadioButton radioButton1;
    JRadioButton radioButton2;
    ButtonGroup buttonGroup;

    public Main(){
        super("hello world");
        this.setSize(400,200);
        this.setDefaultCloseOperation(3); //zamykanie okna
        initComponent();

        this.setVisible(true);
    }

    void initComponent(){
        panel = new JPanel();
        radioButton1 = new JRadioButton("Mały");
        radioButton2 = new JRadioButton("Duży");
        buttonGroup = new ButtonGroup();

        buttonGroup.add(radioButton1);
        buttonGroup.add(radioButton2);

        panel.add(radioButton1);
        panel.add(radioButton2);

        radioButton1.addActionListener((s)-> System.out.println("mały"));
        radioButton2.addActionListener((s)-> System.out.println("duży"));

        Container container = this.getContentPane();
        container.add(panel, BorderLayout.NORTH);
    }

    public static void main(String[] args) {
        new Main();
    }
}
