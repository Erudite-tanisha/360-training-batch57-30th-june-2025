package org.training.Session2_Spring.Boot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class TennisCoach implements Coach{


    SportsKit kit;

    @Autowired
    public void setKit(SportsKit kit) {
        this.kit = kit;
    }

    @Override
    public String Play() {
        return "Playing Tennis!";
    }

    @Override
    public String KitGranted() {
        return kit.KitGranted();
    }
}

