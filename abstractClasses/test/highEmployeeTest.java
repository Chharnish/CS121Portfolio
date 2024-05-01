import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class highEmployeeTest {

    @Test
    void printData() {
        highEmployee Jeremy = new highEmployee("Jeremy", 991017255, 95324.29, 'A', "CEO");
        assertEquals("Here is the employee file: \nEmployee Name: Jeremy \nEmployee id: 991017255 \nEmployee salary: 95324.29 \nEmployee Access Level: A\nEmployee Administration level: CEO", Jeremy.printData());
    }
}