package edu.progmatic;

import edu.progmatic.children.Gym;
import edu.progmatic.children.RandomChild;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

public class TestSpringConfig {
    @Bean
    @Scope (scopeName = "prototype")
    public GezaBa gezaBaWithOneRandom() {
        return new GezaBa(this.gymWithOneRandom());
    }


    @Bean
    @Scope (scopeName = "prototype")

    private Gym gymWithOneRandom() {
        Gym gym = new Gym();
        RandomChild rc = new RandomChild();
        gym.addChild(rc);
        return gym;
    }
    @Bean
    @Scope (scopeName = "prototype")

    public GezaBa gezaBaWithNoOne() {
        return new GezaBa(this.gymWithNoOne());
    }

    @Bean
    @Scope (scopeName = "prototype")

    private Gym gymWithNoOne() {
        Gym gym = new Gym();
//        RandomChild rc = new RandomChild();
//        gym.addChild(rc);
        return gym;
    }
}
