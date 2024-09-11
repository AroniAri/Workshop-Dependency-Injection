package se.lexicon.util;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

public class Main {
      public static void main(String[] args){
          AnnotationConfigApplicationContext context =
                  new AnnotationConfigApplicationContext(ComponentScan.class);
          UserInputService userInputService =context.getBean(UserInputService.class);
}
    }
