package com.bartholome.picnblapplication;


import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {

    private final int STATE_BLUE = 1;
    private final int STATE_RED = 2;
    private final int STATE_YELLOW = 3;
    private final int STATE_GREEN = 4;

    @Test
    public void addition_isCorrect() {
        assertEquals(4, 2 + 2);
    }

    @Test
    public void addition_isNotCorrect() { assertEquals(6, 2 + 2 + 2);
    }

    @Test
    public void case_Test_With_Arrow_State_At1()
    {
        int state = 0;
        int arrowState = 1;
            switch (state) {
                case STATE_BLUE:
                    arrowState = STATE_BLUE;
                    break;
                case STATE_RED:
                    arrowState = STATE_RED;
                    break;
                case STATE_YELLOW:
                    arrowState = STATE_YELLOW;
                    break;
                case STATE_GREEN:
                    arrowState = STATE_GREEN;
                    break;
            }
        assertEquals(STATE_RED, arrowState);
    }

}