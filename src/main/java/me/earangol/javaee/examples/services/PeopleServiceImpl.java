package me.earangol.javaee.examples.services;

import me.earangol.javaee.examples.entities.Person;
import me.earangol.javaee.examples.services.spec.PeopleService;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 * This file is subject to the terms and conditions defined in
 * file 'LICENSE.txt', which is part of this source code package.
 *
 * Created with IntelliJ IDEA.
 */
@Stateless
public class PeopleServiceImpl implements PeopleService {

    @PersistenceContext
    private EntityManager em;

    @Override
    public List<Person> fetchAll() {
        return em.createNamedQuery(Person.Q_FIND_ALL, Person.class).getResultList();
    }

    @Override
    public Person create(Person p) {
        em.persist(p);
        return p;
    }

    @Override
    public void remove(long id) {
        Person p = em.find(Person.class, id);
        em.remove(p);
    }
}
