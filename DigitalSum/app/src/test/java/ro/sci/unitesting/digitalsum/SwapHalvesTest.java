package ro.sci.unitesting.digitalsum;

import junit.framework.TestCase;

/**
 * Created by Claudiu on 9/6/2015.
 */
public class SwapHalvesTest extends TestCase {

    SwapHalves objectTest1 =new SwapHalves();

    public void testOddNumbers(){
        String result = objectTest1.swapping("123");
        assertEquals("312",result);
    }
    public void testEvenNumbers(){
        String result = objectTest1.swapping("1234");
        assertEquals("3412",result);
    }
    public void testNull(){
        String result = objectTest1.swapping(null);
        assertEquals("",result);
    }
    public void testSpecialCharacters(){
        String result = objectTest1.swapping("@@##$$");
        assertEquals("#$$@@#",result);
    }
    public void testNumbersAndCharacters(){
        String result = objectTest1.swapping("1qaz2wsx");
        assertEquals("2wsx1qaz",result);
    }

}