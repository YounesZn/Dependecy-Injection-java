package Presentation;

import METIER.Imetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PresVspring {
    public static void main(String[] args) {

        ApplicationContext context=new ClassPathXmlApplicationContext( "applicationContext.xml");
        Imetier metier=(Imetier) context.getBean("metier");
        System.out.println(metier.calcul());
    }
}
