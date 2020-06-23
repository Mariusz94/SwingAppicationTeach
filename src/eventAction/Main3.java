package eventAction;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Program show how to operate events
 * ActionListener implements in Main class then pass to argument method addActionListener
 * @Author Mariusz Lyszczarz
 */
public class Main3 extends JFrame implements ActionListener {
    JButton foo;

    public Main3(){
        super("hello world");
        this.setSize(400,200);
        this.setDefaultCloseOperation(3); //zamykanie okna
        initComponent();
        this.setVisible(true);
    }

    void initComponent(){
        foo = new JButton("Print \"foo\" to console");
        foo.addActionListener(this);

        Container container = this.getContentPane();
        container.add(foo);
    }

    public static void main(String[] args) {
        new Main3();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("foo");
    }
}
