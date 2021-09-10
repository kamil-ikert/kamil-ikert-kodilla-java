package com.kodilla.patterns.singleton;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LoggerTestSuite {

    @Test
    public void testGetLastLog() {
        //given
        Logger.INSTANCE.log("First log");
        //when
        String actualLog = Logger.INSTANCE.getLastLog();
        assertEquals("First log", actualLog);
    }
}
