package com.misak.crudApi.dao;

import com.misak.crudApi.model.Person;

import javax.persistence.EntityManager;
import java.util.List;

public interface UserDao {

    EntityManager getEntityManager();

    List<Person> index();

    Person show(int id);

    void save(Person person);

    void update(Person person);

    void delete(int id);
}
