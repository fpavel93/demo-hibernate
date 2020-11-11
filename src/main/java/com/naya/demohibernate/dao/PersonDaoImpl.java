package com.naya.demohibernate.dao;

import com.naya.demohibernate.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;

@Repository
public class PersonDaoImpl implements PersonDao {

    @Autowired
    private EntityManager entityManager;

    @Override
    public void savePerson(Person person){
        entityManager.persist(person);
    }

}
