package com.naya.demohibernate.services;

import com.naya.demohibernate.dao.PersonDao;
import com.naya.demohibernate.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.stream.Stream;

@Service
@Transactional(timeout = 1000)
public class PersonService {

    @Autowired
    private PersonDao personDao;

    @EventListener(ContextRefreshedEvent.class)
    public void saveManyPersons(){
        Stream.generate(Person::new)
                .limit(10)
                .forEach(personDao::savePerson);
    }
}
