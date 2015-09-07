import javax.naming.Context;
import javax.naming.InitialContext;
import javax.rmi.PortableRemoteObject;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Piotr on 2015-05-31.
 */
public class PhoneDirectoryClient {


    public static void main(String args[]) {


        System.out.println("Client start");

        try {


            Context ctx = new InitialContext();
            Object objref = ctx.lookup("PhoneBookService");
            PhoneDirectoryInterface phoneDirectory = (PhoneDirectoryInterface) PortableRemoteObject.narrow(objref, PhoneDirectoryInterface.class);


            ClientGui gui = new ClientGui();

            gui.getPhoneNumberButton.addActionListener(new ActionListener() {
                String name;

                @Override
                public void actionPerformed(ActionEvent e) {

                    name = gui.nameGetNumberButton.getText();

                    try {
                        gui.answerLabel.setText(phoneDirectory.getPhoneNumber(name));
                    } catch (Exception r) {
                        r.printStackTrace();
                    }

                }
            });


            gui.addPhoneNumberButton.addActionListener(new ActionListener() {
                String nr, name;

                @Override
                public void actionPerformed(ActionEvent e) {


                    name = gui.addNameTextField.getText();
                    nr = gui.addNumberTextField.getText();

                    try {

                        if (phoneDirectory.addPhoneNumber(name, nr)) {
                            gui.answerLabel.setText("dodano " + name + " z nr= " + nr);
                        }

                    } catch (Exception r) {
                        r.printStackTrace();
                    }


                }
            });


            gui.replacePhoneNumberButton.addActionListener(new ActionListener() {
                String nr, name;

                @Override
                public void actionPerformed(ActionEvent e) {

                    nr = gui.numberForReplaceTextField.getText();
                    name = gui.nameForReplaceTextField.getText();

                    try {

                        if (phoneDirectory.replacePhoneNumber(name, nr)) {
                            gui.answerLabel.setText("zamieniono " + name + " na nr= " + nr);
                        }

                    } catch (Exception r) {
                        r.printStackTrace();
                    }


                }
            });


        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
