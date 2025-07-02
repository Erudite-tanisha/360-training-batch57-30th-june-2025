package org.training.Session2_Spring.Boot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class CricketCoach implements Coach{

    SportsKit kit;


    public CricketCoach(@Autowired SportsKit kit) {
        this.kit = kit;
    }

    @Override
    public String Play() {
        return "Playing Cricket!";
    }

    @Override
    public String KitGranted() {
        return kit.KitGranted();
    }
}
