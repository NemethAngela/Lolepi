//Németh Angéla, Szoft/I/2/E, 2023-05/23 
//Feladat 0358

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach; 
import org.junit.jupiter.api.Test;

public class CalcTest {
    MainFrame mainFrame;

    @BeforeEach     
    public void initEach() {
        this.mainFrame = new MainFrame();
    }

    @Test   
    public void testCalcParalelepipedonElso() {
        double actual = this.mainFrame.calcParalelepipedonVolume(10, 20, 30);
        double expected = 6000;
        assertEquals(expected, actual, 0.01);
    }

    @Test  
    public void testCalcParalelepipedonMasodik() {     
        double actual = this.mainFrame.calcParalelepipedonVolume(5, 9, 13);
        double expected = 585;
        assertEquals(expected, actual, 0.01);
    }
}