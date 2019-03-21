package btconn;

import btconn.bluetooth.ConnectionBT;
import btconn.database.ConnectionDB;

public class Main {

    public static void main(String[] args)
    {
        ConnectionBT connectionBT = new ConnectionBT("This is my fancy BT connection steen bij 101");
        try{
            ConnectionDB connectionDB = new ConnectionDB();
            connectionDB.executeQuery("SELECT * FROM `users`");
        }catch (Exception ex) {
            ex.printStackTrace();
        }

        System.out.println(connectionBT.getConn());
    }
}
