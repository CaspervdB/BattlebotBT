package btconn.bluetooth;

public class ConnectionBT {

    private String conn;
    private String command;
    public ConnectionBT(String conn)
    {
        this.conn = conn;
        command = "This is my command";
    }

    public String getConn(){
        return conn;
    }

    public String getCommand()
    {
        return command;
    }
}
