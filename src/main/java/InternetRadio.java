public class InternetRadio implements IConnect {

    public String connect(String data) {
        return "connecting to " + data + " network";
    }


    public String tune(String station) {
        return("Tuned to: " + station);
    }

}
