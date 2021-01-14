package edu.progmatic;

import edu.progmatic.children.Gym;
import edu.progmatic.children.RandomChild;
import org.springframework.context.annotation.Bean;

public class TestSpringConfig {
//    @Bean
//    public GezaBa gezaBaWithOneRandom() {
//        return new GezaBa(this.gymWithOneRandom());
//    }
//
//    @Bean
//    private Gym gymWithOneRandom() {
//        Gym gym = new Gym();
//        RandomChild rc = new RandomChild();
//        gym.addChild(rc);
//        return gym;
//    }
    @Bean
    public GezaBa gezaBaWithNoOne() {
        return new GezaBa(this.gymWithNoOne());
    }

    @Bean
    private Gym gymWithNoOne() {
        Gym gym = new Gym();
//        RandomChild rc = new RandomChild();
//        gym.addChild(rc);
        return gym;
    }
}
