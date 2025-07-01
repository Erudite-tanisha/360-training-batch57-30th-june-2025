package org.training;

public class CricketCoach implements Coach{

    SportsKit kit;

    public CricketCoach(SportsKit kit) {
        this.kit = kit;
    }

    @Override
    public String Play() {
        return "Playing Cricket";
    }

    @Override
    public String kitGranted() {
        return kit.kitGranted();
    }
}
