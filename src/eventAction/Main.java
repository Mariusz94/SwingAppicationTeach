package eventAction;

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
    JButton foo;

    public Main(){
        super("hello world");
        this.setSize(400,200);
        this.setDefaultCloseOperation(3); //zamykanie okna
        initComponent();
        this.setVisible(true);
    }

    void initComponent(){
        foo = new JButton("Print \"foo\" to console");
        foo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("foo");
            }
        });

        Container container = this.getContentPane();
        container.add(foo);
    }

    public static void main(String[] args) {
        new Main();
    }
}
