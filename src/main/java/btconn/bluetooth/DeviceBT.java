package btconn.bluetooth;

public class DeviceBT {
    private String name;
    private String address;
    private String conn_string;
    public DeviceBT()
    {

    }
    public DeviceBT(String name, String address)
    {
        this.name = name;
        this.address = address;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setAddress(String address)
    {
        this.name = address;
    }
}
