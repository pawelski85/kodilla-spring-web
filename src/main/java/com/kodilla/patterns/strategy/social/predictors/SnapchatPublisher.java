package com.kodilla.patterns.strategy.social.predictors;

import com.kodilla.patterns.strategy.social.SocialPublisher;

public class SnapchatPublisher implements SocialPublisher {
    @Override
    public String share() {
        return "[Millenials user] take a picture";
    }
}
