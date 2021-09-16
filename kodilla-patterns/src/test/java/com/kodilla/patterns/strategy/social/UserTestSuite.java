package com.kodilla.patterns.strategy.social;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class UserTestSuite {

    @Test
    public void testDefaultSharingStrategies() {

        //Given
        User millennials = new Millenials("Piotr");
        User yGeneration = new YGeneration("Grzegorz");
        User zGeneration = new ZGeneration("Robert");

        //When
        String twitter = millennials.sharePost();
        String facebook = yGeneration.sharePost();
        String snapchat = zGeneration.sharePost();

        //Then
        Assert.assertEquals("Twitter", twitter);
        Assert.assertEquals("Facebook", facebook);
        Assert.assertEquals("Snapchat", snapchat);
    }

    @Test
    public void testIndividualSharingStrategy() {

        //Given
        User millenials = new Millenials("Cristine");
        millenials.setSocialPublisher(new FacebookPublisher());

        //When
        String facebook = millenials.sharePost();

        //Then
        Assert.assertEquals("Facebook", facebook);
    }
}
