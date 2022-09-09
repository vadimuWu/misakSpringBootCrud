package com.misak.crudApi.service;

import com.misak.crudApi.dao.UserDao;
import com.misak.crudApi.model.Person;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
@AllArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserDao userDao;

    @Override
    public List<Person> index() {
        return userDao.index();
    }

    @Override
    public Person show(int id) {
        return userDao.show(id);
    }

    @Override
    public void save(Person person) {
        userDao.save(person);
    }

    @Override
    public void update(Person person) {
        userDao.update(person);
    }

    @Override
    public void delete(int id) {
        userDao.delete(id);
    }
}
