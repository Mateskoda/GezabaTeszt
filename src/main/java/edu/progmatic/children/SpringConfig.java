package edu.progmatic.children;

import edu.progmatic.GezaBa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.stereotype.Component;

@Configuration
public class SpringConfig {

//    @Bean
//    public GezaBa gezaBaWithOneDullStudent() {
//        return new GezaBa(this.gymWithOneDullStudent());
//    }
//
//    @Bean
//    public Gym gymWithOneDullStudent() {
//        Gym gym = new Gym();
//        DullChild dc = new DullChild();
//        gym.addChild(dc);
//        return gym;
//    }
//    @Bean
//    public GezaBa gezaBaWithTwoDullStudents() {
//        return new GezaBa(this.gymWithTwoDullStudents());
//    }
//
//    @Bean
//    public Gym gymWithTwoDullStudents() {
//        Gym gym = new Gym();
//        DullChild dc = new DullChild();
//        DullChild dc2 = new DullChild();
//        gym.addChild(dc);
//        gym.addChild(dc2);
//        return gym;
//    }
//    @Bean
//    public GezaBa gezaBaWithOneDullOneRandom() {
//        return new GezaBa(this.gymWithOneDullOneRandom());
//    }
//
//    @Bean
//    public Gym gymWithOneDullOneRandom() {
//        Gym gym = new Gym();
//        DullChild dc = new DullChild();
//        RandomChild rc = new RandomChild();
//        gym.addChild(dc);
//        gym.addChild(rc);
//        return gym;
//    }
//    @Bean
//    public GezaBa gezaBaWithOneRandom() {
//        return new GezaBa(this.gymWithOneRandom());
//    }
//
//    @Bean
//    public Gym gymWithOneRandom() {
//        Gym gym = new Gym();
//        RandomChild rc = new RandomChild();
//        gym.addChild(rc);
//        return gym;
//    }
}


