package org.training;

public class TennisCoach implements Coach{

    SportsKit kit;

    public void setKit(SportsKit sportsKit) {
        this.kit = sportsKit;
    }

    @Override
    public String Play() {
        return "Playing Tennis";
    }

    @Override
    public String kitGranted() {
        return kit.kitGranted();
    }
}
