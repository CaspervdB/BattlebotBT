package btconn.bluetooth;

public class DeviceBT {
    private String name;
    private String address;
    private String conn_string;
    public DeviceBT()
    {

    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setAddress(String address)
    {
        this.name = address;
    }

    public void createConn_string() throws Exception
    {
        if(address == null)
        {
            throw new Exception("The address is empty");
        }else{
            conn_string = String.format("btspp://%s:1;authenticate=false;encrypt=false;master=false", address);
        }
    }
}
