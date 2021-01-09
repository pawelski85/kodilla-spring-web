package com.kodilla.patterns.strategy.social.predictors;

import com.kodilla.patterns.strategy.social.SocialPublisher;

public class TwitterPublisher implements SocialPublisher {
    @Override
    public String share() {
        return "[Z generation user] twit";
    }
}
