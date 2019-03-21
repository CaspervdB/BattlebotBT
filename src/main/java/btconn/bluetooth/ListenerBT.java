package btconn.bluetooth;

import javax.bluetooth.DeviceClass;
import javax.bluetooth.DiscoveryListener;
import javax.bluetooth.RemoteDevice;
import javax.bluetooth.ServiceRecord;
import java.util.ArrayList;

public class ListenerBT implements DiscoveryListener {

    /// this is the array which will collect the devices when found
    private ArrayList<DeviceBT> devices;
    /// this is a boolean representing the state of the listener
    private boolean listening;
    public ListenerBT()
    {
        devices = new ArrayList<DeviceBT>();
        listening = true;
    }

    public void deviceDiscovered(RemoteDevice remoteDevice, DeviceClass deviceClass) {
        listening = true;
        DeviceBT btDevice = new DeviceBT();
        try{
            btDevice.setName(remoteDevice.getFriendlyName(false));
        }catch (Exception ex)
        {
            btDevice.setName("Unknown");
        }
        btDevice.setAddress(remoteDevice.getBluetoothAddress());
        try{
            btDevice.createConn_string();
            this.devices.add(btDevice);
        }catch (Exception ex)
        {

        }
    }

    public void servicesDiscovered(int i, ServiceRecord[] serviceRecords) {
        listening = true;
    }

    public void serviceSearchCompleted(int i, int i1) {
        listening = false;
    }

    public void inquiryCompleted(int i) {
        listening = false;
    }

    public boolean isRunning()
    {
        return listening;
    }
}
