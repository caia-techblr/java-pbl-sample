package org.gitam.cseblr;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * Unit test sample.
 */
public class SimpleTest {

    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue() {
        assertTrue(true);
    }
     /**
     * Another Test :-)
     */
    @Test
    public void simpleAddition() {
        assertEquals(2+3, 5, "2+3 is not equal to 5"); 
    }
}
