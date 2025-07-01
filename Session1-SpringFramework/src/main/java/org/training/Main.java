package org.training;

import org.springframework.context.support.ClassPathXmlApplicationContext;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

//        CricketCoach c1 = new CricketCoach();
//        System.out.println(c1.Play());
//
//        TennisCoach c2 = new TennisCoach();
//        System.out.println(c2.Play());
//

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

        Coach c1 = (Coach) context.getBean("coach1");
//        System.out.println(c1.Play());
//        System.out.println(c1.hashCode());

//        System.out.println(c1.kitGranted());

//        Coach c2 = (Coach) context.getBean("coach1");
//        System.out.println(c2.hashCode());
//        System.out.println(c2.Play());

        Coach c2 = (Coach) context.getBean("coach2");
        System.out.println(c2.kitGranted());
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

        }
    }
