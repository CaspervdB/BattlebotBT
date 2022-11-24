package btconn;

public class Main {

    public static void main(String[] args)
    {
        ConnectionBT connectionBT = new ConnectionBT("This is my fancy BT connection");
        try{
            ConnectionDB connectionDB = new ConnectionDB();
            connectionDB.executeQuery("SELECT * FROM `users`");
        }catch (Exception ex) {
            ex.printStackTrace();
        }

        System.out.println(connectionBT.getConn());
    }
}
