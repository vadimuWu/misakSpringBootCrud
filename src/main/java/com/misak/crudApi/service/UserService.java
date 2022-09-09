package com.misak.crudApi.service;

import com.misak.crudApi.model.Person;

import java.util.List;

public interface UserService {
    List<Person> index();

    Person show(int id);

    void save(Person person);

    void update(Person person);

    void delete(int id);
}
