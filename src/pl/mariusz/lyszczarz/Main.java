package pl.mariusz.lyszczarz;

import javax.swing.*;
import java.awt.*;

/**
 * Program służący do nauki aplikacji okienkowych przy użyciu Swing
 * @author Mariusz Lyszczarz
 */
public class Main {
    JFrame frame;
    final int widthScreen;
    final int heightScreen;
    int widthWindow = 600;
    int heightWindow = 388;
    JPanel panelChoiceLvl;
    JRadioButton radioButtonEasy;
    JRadioButton radioButtonMedium;
    JRadioButton radioButtonHard;
    JPanel panelChoiceTask;
    JLabel labelField;
    JComboBox<String> comboBoxType;
    JButton buttonGenerateTask;
    JPanel panelTask;
    JPanel panelText;
    JLabel labelSolution;
    JPanel panelSolution;
    JPanel panelChoice;
    JButton buttonClearAll;
    JButton buttonConfirm;
    JButton buttonSubmit;


    public Main() {
        this.frame = new JFrame();

        frame.setTitle("Swing Application");

        Dimension dimension = new Dimension();
        dimension.setSize(widthWindow,heightWindow);

        widthScreen = Toolkit.getDefaultToolkit().getScreenSize().width;
        heightScreen = Toolkit.getDefaultToolkit().getScreenSize().height;
        frame.setLocation((int)(widthScreen/2-dimension.getWidth()/2),(int)(heightScreen/2-dimension.getHeight()/2));
        frame.setIconImage(Toolkit.getDefaultToolkit().getImage("light_bulb.png"));

        initComponent();
        frame.setSize(dimension);
        frame.setVisible(true);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

}

    public void initComponent(){
        buttonGenerateTask = new JButton("Generuj zadanie");
        buttonClearAll = new JButton("Wyczyść wszystko");
        buttonConfirm = new JButton("Potwierdź");
        buttonSubmit = new JButton("Zatwierdź");

        radioButtonEasy = new JRadioButton("Easy");
        radioButtonMedium = new JRadioButton("Medium");
        radioButtonHard = new JRadioButton("Hard");

        labelField = new JLabel("Wybierz dziedzinę:");

        labelSolution = new JLabel("Twoje rozwiązanie:");
        comboBoxType = new JComboBox<>();
        comboBoxType.addItem("Całki");
        comboBoxType.addItem("Różniczkowanie");

        panelChoiceLvl = new JPanel();
        panelChoiceTask = new JPanel();
        panelTask = new JPanel();
        panelText = new JPanel();
        panelSolution = new JPanel();
        panelChoice = new JPanel();

        panelChoiceLvl.setSize(widthWindow,60);
        panelChoiceLvl.setBackground(Color.GRAY);
        panelChoiceLvl.setLayout(null);

        radioButtonEasy.setSize(radioButtonEasy.getPreferredSize());
        radioButtonEasy.setLocation(widthWindow/2-50-radioButtonEasy.getWidth(),(int)(panelChoiceLvl.getHeight()/2-radioButtonEasy.getPreferredSize().getHeight()/2));

        radioButtonMedium.setSize(radioButtonMedium.getPreferredSize());
        radioButtonMedium.setLocation((int)(widthWindow/2-radioButtonMedium.getPreferredSize().getWidth()/2),(int)(panelChoiceLvl.getHeight()/2-radioButtonMedium.getPreferredSize().getHeight()/2));

        radioButtonHard.setSize(radioButtonHard.getPreferredSize());
        radioButtonHard.setLocation(widthWindow/2+50,(int)(panelChoiceLvl.getHeight()/2-radioButtonHard.getPreferredSize().getHeight()/2));

        panelChoiceLvl.add(radioButtonEasy);
        panelChoiceLvl.add(radioButtonMedium);
        panelChoiceLvl.add(radioButtonHard);

        panelChoiceTask.setSize(widthWindow,60);
        panelChoiceTask.setLocation(0,panelChoiceLvl.getHeight());
        panelChoiceTask.setBackground(Color.GRAY);
        panelChoiceTask.add(labelField);
        panelChoiceTask.add(comboBoxType);
        panelChoiceTask.add(buttonGenerateTask);

        panelTask.setSize(widthWindow,60);
        panelTask.setLocation(0,panelChoiceTask.getLocation().y+panelChoiceTask.getHeight());
        panelTask.setBackground(Color.lightGray);

        panelText.setSize(widthWindow,60);
        panelText.setLocation(0,panelTask.getLocation().y+panelTask.getHeight());
        panelText.setBackground(Color.GRAY);
        panelText.add(labelSolution);

        panelSolution.setSize(widthWindow,60);
        panelSolution.setLocation(0,panelText.getLocation().y+panelText.getHeight());
        panelSolution.setBackground(Color.lightGray);

        panelChoice.setSize(widthWindow,60);
        panelChoice.setLocation(0,panelSolution.getLocation().y+panelSolution.getHeight());
        panelChoice.setBackground(Color.GRAY);
        panelChoice.add(buttonClearAll);
        panelChoice.add(buttonConfirm);
        panelChoice.add(buttonSubmit);

        panelChoice.setLayout(null);

        buttonClearAll.setSize(buttonClearAll.getPreferredSize());
        buttonClearAll.setLocation(widthWindow/2-100-buttonClearAll.getWidth(),(int)(panelChoice.getHeight()/2-buttonClearAll.getPreferredSize().getHeight()/2));

        buttonConfirm.setSize(buttonConfirm.getPreferredSize());
        buttonConfirm.setLocation((int)(widthWindow/2-buttonConfirm.getPreferredSize().getWidth()/2),(int)(panelChoice.getHeight()/2-buttonConfirm.getPreferredSize().getHeight()/2));

        buttonSubmit.setSize(buttonSubmit.getPreferredSize());
        buttonSubmit.setLocation(widthWindow/2+100,(int)(panelChoice.getHeight()/2-buttonSubmit.getPreferredSize().getHeight()/2));

        Container container = frame.getContentPane();
        container.setLayout(null);
        container.add(panelChoiceLvl);
        container.add(panelChoiceTask);
        container.add(panelTask);
        container.add(panelText);
        container.add(panelSolution);
        container.add(panelChoice);


    }

    public static void main(String[] args) {
        new Main();
    }
}
