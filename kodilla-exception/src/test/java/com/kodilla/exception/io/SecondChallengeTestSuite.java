package com.kodilla.exception.io;


import com.kodilla.exception.test.SecondChallenge;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SecondChallengeTestSuite {

    @Test

    void probablyIWillThrowExceptionTest() {
        //Given
        SecondChallenge snd = new SecondChallenge();

        //When & Then
        assertAll(
                //error for x
                () -> assertThrows(Exception.class, () -> snd.probablyIWillThrowException (0.9, 46.4)),
                () -> assertThrows(Exception.class, () -> snd.probablyIWillThrowException (2.0, 46.4)),
                //error for y
                () -> assertThrows(Exception.class, () -> snd.probablyIWillThrowException (1.5, 1.5)),
                //both x,y correct
                () -> assertDoesNotThrow (() -> snd.probablyIWillThrowException (1.0, 1.0)),
                () -> assertDoesNotThrow (() -> snd.probablyIWillThrowException (1.5, 2.0)),
                () -> assertDoesNotThrow (() -> snd.probablyIWillThrowException (1.9, 3.0))
    );
    }
}
