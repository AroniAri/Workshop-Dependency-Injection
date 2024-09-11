package se.lexicon.config;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import se.lexicon.data_access.StudentDao;

@Configuration

public class ComponenScanConfig {
    AnnotationConfigApplicationContext context =
        new AnnotationConfigApplicationContext("se.lexicon");
    StudentDao studentDao = context.getBean(StudentDao.class);
}
