import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NetworkTest {

    Network network;
    Printer printer;
    Desktop desktop;

    @Before
    public void before() {
        network = new Network("CodeClan", 1);
        desktop = new Desktop("Keith's Desktop", "Apple", "Macbook Pro");
        printer = new Printer();
    }

    @Test
    public void hasName() {
        assertEquals("CodeClan", network.getName());
    }

    @Test
    public void deviceListStartsEmpty() {
        assertEquals(0, network.deviceCount());
    }

    @Test
    public void canConnectDesktop() {
        network.connect(desktop);
        assertEquals(1, network.deviceCount());
    }

    @Test
    public void canConnectPrinter() {
        network.connect(printer);
        assertEquals(1, network.deviceCount());
    }

    @Test
    public void shouldEmptyDeviceListAfterDisconnectingAll() {
        network.connect(desktop);
        network.disconnectAll();
        assertEquals(0, network.deviceCount());
    }

    @Test
    public void countFreeSlots() {
        network.connect(desktop);
        assertEquals(0, network.getFreeSlots());
    }

    @Test
    public void canAddDeviceWhenFreeSlot() {
        network.connect(desktop);
        assertEquals(1, network.deviceCount());
    }

    @Test
    public void cannotAddDeviceWhenNoFreeSlot() {
        network.connect(desktop);
        network.connect(printer);
        assertEquals(1, network.deviceCount());
    }

}
