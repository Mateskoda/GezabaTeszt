package edu.progmatic;

import edu.progmatic.children.DullChild;
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
        return gym;
    }
    @Bean
    @Scope (scopeName = "prototype")
    public GezaBa gezaBaWithOneDullStudent() {
        return new GezaBa(this.gymWithOneDullStudent());
    }

    @Bean
    @Scope (scopeName = "prototype")
    private Gym gymWithOneDullStudent() {
        Gym gym = new Gym();
        DullChild dc = new DullChild();
        gym.addChild(dc);
        return gym;
    }
    @Bean
    @Scope (scopeName = "prototype")
    public GezaBa gezaBaWithTwoDullStudents() {
        return new GezaBa(this.gymWithTwoDullStudents());
    }

    @Bean
    @Scope (scopeName = "prototype")
    private Gym gymWithTwoDullStudents() {
        Gym gym = new Gym();
        DullChild dc = new DullChild();
        DullChild dc2 = new DullChild();
        gym.addChild(dc);
        gym.addChild(dc2);
        return gym;
    }
    @Bean
    @Scope (scopeName = "prototype")
    public GezaBa gezaBaWithOneDullOneRandom() {
        return new GezaBa(this.gymWithOneDullOneRandom());
    }

    @Bean
    @Scope (scopeName = "prototype")
    private Gym gymWithOneDullOneRandom() {
        Gym gym = new Gym();
        DullChild dc = new DullChild();
        RandomChild rc = new RandomChild();
        gym.addChild(dc);
        gym.addChild(rc);
        return gym;
    }
    @Bean
    @Scope (scopeName = "prototype")
    public GezaBa gezaBaWithThreeRandom() {
        return new GezaBa(this.gymWithThreeRandom());
    }

    @Bean
    @Scope (scopeName = "prototype")
    private Gym gymWithThreeRandom() {
        Gym gym = new Gym();
        RandomChild rc = new RandomChild();
        RandomChild rc2 = new RandomChild();
        RandomChild rc3 = new RandomChild();
        gym.addChild(rc);
        gym.addChild(rc2);
        gym.addChild(rc3);
        return gym;
    }
}
