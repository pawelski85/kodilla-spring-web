package com.kodilla.patterns.strategy.social;

import com.kodilla.patterns.strategy.social.predictors.FacebookPublisher;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserTestSuite {
    @Test
    void testDefaultSharingStrategies() {
        //Given
        User steven = new Millenials("Steven Links");
        User john = new YGeneration("John Hemerald");
        User kodilla = new ZGeneration("Kodilla");

        //When
        String stevenShouldTakeAPicture = steven.predict();
        System.out.println("Steven should: " + stevenShouldTakeAPicture);
        String johnShouldShareAPost = john.predict();
        System.out.println("John should: " + johnShouldShareAPost);
        String kodillaShouldTwit = kodilla.predict();
        System.out.println("Kodilla should: " + kodillaShouldTwit);

        //Then
        assertEquals("[Millenials user] take a picture", stevenShouldTakeAPicture);
        assertEquals("[Y generation user] share a post", johnShouldShareAPost);
        assertEquals("[Z generation user] twit", kodillaShouldTwit);
    }

    @Test
    void testIndividualSharingStrategy() {
        //Given
        User steven = new Millenials("Steven Links");

        //When
        String stevenShoulTakeApicture = steven.predict();
        System.out.println("Steven should: " + stevenShoulTakeApicture);
        steven.sharePost(new FacebookPublisher());
        stevenShoulTakeApicture = steven.predict();
        System.out.println("Steven now should: " + stevenShoulTakeApicture);

        //Then
        assertEquals("[Y generation user] share a post", stevenShoulTakeApicture);
    }
}
