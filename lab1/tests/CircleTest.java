import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
    }

    @Test
    void smallCircle() {
        Circle smallCircle = new Circle(5);
        double area = Math.PI * 5 * 5;
        assert smallCircle.area() == area;
    }

    @Test
    void bigCircle() {
        Circle smallCircle = new Circle(25);
        double area = Math.PI * 25 * 25;
        assert smallCircle.area() == area;
    }

}