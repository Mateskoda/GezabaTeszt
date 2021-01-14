/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.progmatic;



import edu.progmatic.children.DullChild;
import edu.progmatic.children.RandomChild;
import edu.progmatic.children.SmartRandomChild;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author peti
 */
public class Simulator {
    private static final List<Class<? extends Child>> CLASSES = new ArrayList();
    int a = 0;
//    @Autowired
//    private static ApplicationContext context = new AnnotationConfigApplicationContext();

    public Simulator() {
    }

//    public class A implements ApplicationContextAware {
//        private ApplicationContext context;
//        public void setApplicationContext(ApplicationContext context) {
//            this.context = context;
//        }
//    }

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(
                edu.progmatic.children.SpringConfig.class);

        GezaBa gb = context.getBean("gezaBaWithOneDullStudent", GezaBa.class);
//        GezaBa gb2 = (GezaBa)context.getBean("gezaBaWithTwoDullStudents", GezaBa.class);
//        GezaBa gb3 = (GezaBa)context.getBean("gezaBaWithOneDullOneRandom", GezaBa.class);
//        GezaBa gb4 = (GezaBa)context.getBean("gezaBaWithOneRandom", GezaBa.class);

    }
}



