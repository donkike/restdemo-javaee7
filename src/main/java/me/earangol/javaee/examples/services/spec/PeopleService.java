package me.earangol.javaee.examples.services.spec;

import me.earangol.javaee.examples.entities.Person;

import java.util.List;

/**
 * This file is subject to the terms and conditions defined in
 * file 'LICENSE.txt', which is part of this source code package.
 *
 * Created with IntelliJ IDEA.
 */
public interface PeopleService {

    public List<Person> fetchAll();

    public Person create(Person p);

    public void remove(long id);

}
