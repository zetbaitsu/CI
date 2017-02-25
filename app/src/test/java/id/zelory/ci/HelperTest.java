package id.zelory.ci;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

/**
 * Created on : February 26, 2017
 * Author     : zetbaitsu
 * Name       : Zetra
 * GitHub     : https://github.com/zetbaitsu
 */
public class HelperTest {
    @Test
    public void whatIfNegative() throws Exception {
        assertEquals("Negative", Helper.whatIf(-3));
        assertNotEquals("Negative", Helper.whatIf(3));
    }
}