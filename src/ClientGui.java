import javax.swing.*;
import java.awt.*;

/**
 * Created by Piotr on 2015-05-31.
 */
public class ClientGui {


    JFrame frame;
    JPanel panel;
    JTextField nameGetNumberButton;
    JButton getPhoneNumberButton;
    JButton addPhoneNumberButton;
    JButton replacePhoneNumberButton;

    JPanel panelGetNumber;
    JTextField addNumberTextField;
    JTextField addNameTextField;
    JPanel panelAddNumber;
    JTextField numberForReplaceTextField;
    JTextField nameForReplaceTextField;
    JPanel panelReplace;
    JPanel answerPanel;
    JLabel answerLabel;


    public ClientGui() {
        guiInit();
    }


    private void guiInit() {

        frame = new JFrame("Client");
        frame.setLayout(new GridLayout(4, 2));

        panel = new JPanel(new GridLayout(2, 1));

        nameGetNumberButton = new JTextField("wpisz imie");

        getPhoneNumberButton = new JButton("getPhoneNumber");
        addPhoneNumberButton = new JButton("addPhoneNumber");
        replacePhoneNumberButton = new JButton("replacePhoneNumber");


        panelGetNumber = new JPanel(new GridLayout(1, 2));
        panelGetNumber.add(nameGetNumberButton);
        panelGetNumber.add(getPhoneNumberButton);


        addNumberTextField = new JTextField("wpisz numer");
        addNameTextField = new JTextField("wpisz imie");
        panelAddNumber = new JPanel(new GridLayout(1, 3));
        panelAddNumber.add(addNameTextField);
        panelAddNumber.add(addNumberTextField);
        panelAddNumber.add(addPhoneNumberButton);


        numberForReplaceTextField = new JTextField("wpisz numer");
        nameForReplaceTextField = new JTextField("wpisz imie");
        panelReplace = new JPanel(new GridLayout(1, 3));
        panelReplace.add(nameForReplaceTextField);
        panelReplace.add(numberForReplaceTextField);
        panelReplace.add(replacePhoneNumberButton);


        answerPanel = new JPanel(new GridLayout(1, 1));
        answerLabel = new JLabel("Odpowiedz od serwera");
        answerPanel.add(answerLabel);


        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        frame.add(panelGetNumber);
        frame.add(panelAddNumber);
        frame.add(panelReplace);
        frame.add(answerLabel);


        frame.setSize(400, 500);
        frame.setVisible(true);


    }


    public static void main(String args[]) {


    }


}
