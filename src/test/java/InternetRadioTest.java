import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class InternetRadioTest {

    private InternetRadio internetradio;

    @Before
    public void before() {
        internetradio = new InternetRadio();
    }

    @Test
    public void canTuneToStation() {
        assertEquals("Tuned to: Radio 1", internetradio.tune("Radio 1"));
    }

}
