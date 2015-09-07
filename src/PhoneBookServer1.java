/**
 * Created by Piotr on 2015-05-31.
 */


import javax.naming.Context;
import javax.naming.InitialContext;

public class PhoneBookServer1 {


    public static void main(String[] args) {

        try {

            PhoneDirectory ref = new PhoneDirectory();

            Context ctx = new InitialContext();
            ctx.rebind("PhoneBookService", ref);

            System.out.println("Start serwera");


        } catch (Exception e) {
            e.printStackTrace();


        }


    }

}

