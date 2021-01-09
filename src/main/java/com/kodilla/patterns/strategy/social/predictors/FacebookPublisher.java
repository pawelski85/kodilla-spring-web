package com.kodilla.patterns.strategy.social.predictors;

import com.kodilla.patterns.strategy.social.SocialPublisher;

public class FacebookPublisher implements SocialPublisher {
    @Override
    public String share() {
        return "[Y generation user] share a post";
    }
}
