package com.misak.crudApi.dao;

import com.misak.crudApi.model.Person;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Component
public class UserDaoImpl implements UserDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public EntityManager getEntityManager() {
        return this.entityManager;
    }

    @Override
    public List<Person> index() {
        return getEntityManager().createQuery("select u from Person u").getResultList();
    }

    @Override
    public Person show(int id) {
        return getEntityManager().find(Person.class, id);
    }

    @Override
    public void save(Person person) {
        getEntityManager().persist(person);
    }

    @Override
    public void update(Person person) {
        getEntityManager().merge(person);
    }

    @Override
    public void delete(int id) {
        getEntityManager()
                .createQuery("delete from Person where id=: id")
                .setParameter("id", id)
                .executeUpdate();
    }

}
