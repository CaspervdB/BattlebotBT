package btconn;

import btconn.bluetooth.ConnectionBT;
import btconn.database.ConnectionDB;
import btconn.database.UserCommand;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args)
    {
        try{
            ConnectionDB connectionDB = new ConnectionDB();
//            connectionDB.inserQuery("INSERT INTO `user_command`(`user_id`, `cmd_id`) VALUES (%d, '%s') ", 9981, "w");
//            connectionDB.inserQuery("INSERT INTO `user_command`(`user_id`, `cmd_id`) VALUES (%d, '%s') ", 9981, "a");
//            connectionDB.inserQuery("INSERT INTO `user_command`(`user_id`, `cmd_id`) VALUES (%d, '%s') ", 9981, "s");
//            connectionDB.inserQuery("INSERT INTO `user_command`(`user_id`, `cmd_id`) VALUES (%d, '%s') ", 9981, "d");
            while(true) {
//                ArrayList<UserCommand> userCommands = connectionDB.executeQueryus("SELECT * FROM `user_cmd`");
//                for (UserCommand userCommand : userCommands) {
//                    System.out.println(userCommand.toString() + "\n");
//                    connectionDB.delete(userCommand.getId());
//                }
            }
        }catch (Exception ex) {
            ex.printStackTrace();
        }

    }
}
