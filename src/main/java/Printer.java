public class Printer implements IConnect {

    public String print(String data) {
        return "Printing: " + data;
    }

    public String connect(String data) {
        return "connecting to " + data + " network";
    }

}
