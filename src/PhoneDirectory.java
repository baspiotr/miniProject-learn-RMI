/**
 * Created by Piotr on 2015-05-31.
 */


import javax.rmi.PortableRemoteObject;
import java.rmi.RemoteException;
import java.util.HashMap;
import java.util.Map;

public class PhoneDirectory extends PortableRemoteObject implements PhoneDirectoryInterface {

    private Map pbMap = new HashMap();


    public PhoneDirectory() throws RemoteException {

        super();

        pbMap.put("Piotr", "505848355");
        pbMap.put("Joanna", "506448745");
        pbMap.put("Pawe³", "123431213");
        pbMap.put("Adam", "123454321");


    }

    public String getPhoneNumber(String name) {
        return (String) pbMap.get(name);
    }


    public boolean addPhoneNumber(String name, String num) {
        if (pbMap.containsKey(name)) return false;
        pbMap.put(name, num);
        return true;
    }

    public boolean replacePhoneNumber(String name, String num) {
        if (!pbMap.containsKey(name)) return false;
        pbMap.put(name, num);
        return true;
    }

}
