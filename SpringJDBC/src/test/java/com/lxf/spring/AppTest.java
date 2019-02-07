package com.lxf.spring;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        StringBuffer name = new StringBuffer(0);
        for (int j=0; j<20; ++j) {
            char ch = (char) ( (int) ( Math.random() * 58 ) + 65 );
            name.append(ch);
        }

        System.out.println(  name.toString()  );
        assertTrue( true );
    }
}
