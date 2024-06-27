import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    private final Main testing = new Main();

    @Test
    void media1() {
        double media = (Double) testing.media(4.12, 7.65, 10.7);
        assertEquals(7.489999999999999, media, "La media di 4,7,10 dovrebbe essere 7");
    }

    @Test
    void media2() {
        double media = (Double) testing.media(50.3, 7.1, 100.678);
        assertEquals(52.69266666666667, media, "La media di 4,7,10 dovrebbe essere 7");
    }

    @Test
    void media3() {
        double media = (Double) testing.media(501.3, 64.1, -15.678);
        assertEquals(183.24066666666667, media, "La media di 4,7,10 dovrebbe essere 7");
    }

    @Test
    void nullCase() {
        Double media = null;
        assertNull(media, "La media è null");
    }
}
