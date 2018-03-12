import java.util.*;

public class Network {

    private String name;
    private ArrayList<IConnect> devices;
    private int capacity;

    public Network(String name, int capacity) {
        this.devices = new ArrayList<>();
        this.name = name;
        this.capacity = capacity;
    }

    public String getName() {
        return name;
    }

    public int deviceCount() {
        return devices.size();
    }

    public void connect(IConnect device) {
        if (devices.size() < capacity)
            devices.add(device);
    }

    public void disconnectAll() {
        devices.clear();
    }

    public int getFreeSlots() {
        return(capacity - devices.size());
    }
}