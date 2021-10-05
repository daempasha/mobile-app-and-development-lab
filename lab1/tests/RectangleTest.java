import org.junit.jupiter.api.Test;

class RectangleTest {

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
    }

    @Test
    void smallRectangle() {
        Rectangle smallRectangle = new Rectangle(5, 2);
        double area = 5*2;
        assert smallRectangle.area() == area;
    }

    @Test
    void bigRectangle() {
        Rectangle bigRectangle = new Rectangle(25, 10);
        double area = 25*10;
        assert bigRectangle.area() == area;
    }

}