package com.kodilla.exception.io;

import com.kodilla.exception.test.ExceptionHandling;
import com.kodilla.exception.test.SecondChallenge;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class SecondChallengeTestSuite {

    @Test

    void probablyIWillThrowExceptionTest() {
        //Given
        SecondChallenge snd = new SecondChallenge();

        //When & Then
        assertThrows(Exception.class, () -> snd.probablyIWillThrowException (0.5, 5.5));

    }
}
