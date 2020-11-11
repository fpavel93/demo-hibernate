package com.naya.demohibernate;

import com.naya.demohibernate.dao.PersonDao;
import com.naya.demohibernate.dao.PersonDaoImpl;
import com.naya.demohibernate.model.Person;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DemoHibernateApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoHibernateApplication.class, args);
    }

}
