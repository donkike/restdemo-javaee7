package me.earangol.javaee.examples.entities;

import javax.persistence.*;
import java.util.Objects;

/**
 * This file is subject to the terms and conditions defined in
 * file 'LICENSE.txt', which is part of this source code package.
 *
 * Created with IntelliJ IDEA.
 */
@Entity
@Table(name = "People")
@NamedQuery(name = Person.Q_FIND_ALL, query = "SELECT p FROM Person p")
public class Person {

    public static final String Q_FIND_ALL = "Person.findAll";

    // FIELDS

    @Id @GeneratedValue
    private Long id;

    private String firstName;

    private String lastName;

    // CONSTRUCTORS

    public Person() {
    }

    public Person(Long id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    // GETTERS AND SETTERS

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

}
