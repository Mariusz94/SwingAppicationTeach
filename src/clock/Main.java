package clock;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Time;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Main extends JFrame {
    JLabel text;
    JLabel clockText;
    JPanel panel;

    public Main(){
        super("hello world");
        this.setSize(400,200);
        initComponent();
        this.setDefaultCloseOperation(3);
        this.setVisible(true);
    }

    private void initComponent() {
        text = new JLabel("Czas");
        clockText = new JLabel();
        panel= new JPanel();

        panel.add(text);
        panel.add(clockText);

        Clock clock = new Clock();
        Timer time = new Timer(1000, clock);
        time.start();

        clockText.setText(getTime());

        Container container = this.getContentPane();
        container.add(panel);
    }

    public class Clock implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {


            clockText.setText(getTime());

        }
    }

    public String getTime(){
        GregorianCalendar gregorianCalendar = new GregorianCalendar();

        int h = gregorianCalendar.get(Calendar.HOUR_OF_DAY);
        int m = gregorianCalendar.get(Calendar.MINUTE);
        int s = gregorianCalendar.get(Calendar.SECOND);
        System.out.println(""+h + " : " + (m<10 ? "0"+m : m) + " : " +  (s<10 ? "0"+s : s));

        return ""+h + " : " + (m<10 ? "0"+m : m) + " : " + (s<10 ? "0"+s : s);
    }

    public static void main(String[] args) {
        new Main();
    }
}
