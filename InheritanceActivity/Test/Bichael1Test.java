import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Bichael1Test {

    @Test
    void setDamaged() {
        Bichael1 myBike = new Bichael1("bichael", "Gray", 21, 26.0, false);
        assertEquals("Bike is not damaged", myBike.toString());
    }
}