//Németh Angéla, Szoft/I/2/E, 2023-05/23 
//Feladat 0358

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class InputTest {
    MainFrame mainFrame;

    @BeforeEach
    public void initEach() {
        this.mainFrame = new MainFrame();
    }

    @Test
    public void testCheckInput() {
        boolean actual = this.mainFrame.checkInput("a", "2", "4");
        assertFalse(actual);        
    }

    @Test
    public void testCheckInputNum() {
        boolean actual = this.mainFrame.checkInput("10", "20", "30.5");
        assertTrue(actual);
    }
}
