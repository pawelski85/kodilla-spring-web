package com.kodilla.patterns.singleton;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LoggerTestSuite {

    private static Logger logger;

    @BeforeAll
    public static void createLog() {
        logger = Logger.LOG;
        logger.log("myapp.settings");
    }


    @Test
    void getLastLog() {
        //Given
        //When
        String logName = logger.getLastLog();
        System.out.println("Last Log =  " + logName);
        //Then
        assertEquals("myapp.settings", logName);
    }
}

