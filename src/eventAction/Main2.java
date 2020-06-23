package eventAction;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Program show how to operate events
 * ActionListener implements in argument method addActionListener as class anonymous
 * Use lambda expressions
 * @Author Mariusz Lyszczarz
 */
public class Main2 extends JFrame {
    JButton foo;

    public Main2(){
        super("hello world");
        this.setSize(400,200);
        this.setDefaultCloseOperation(3); //zamykanie okna
        initComponent();
        this.setVisible(true);
    }

    void initComponent(){
        foo = new JButton("Print \"foo\" to console");
        foo.addActionListener(s-> System.out.println("foo"));
        //foo.addActionListener((s)-> System.out.println("foo"));

        Container container = this.getContentPane();
        container.add(foo);
    }

    public static void main(String[] args) {
        new Main2();
    }
}
