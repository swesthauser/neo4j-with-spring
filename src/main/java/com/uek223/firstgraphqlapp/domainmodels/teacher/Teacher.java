package com.uek223.firstgraphqlapp.domainmodels.teacher;

import com.uek223.firstgraphqlapp.domainmodels.apprentice.Apprentice;
import org.neo4j.ogm.annotation.*;

import java.util.Collections;
import java.util.HashSet;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

import static org.neo4j.ogm.annotation.Relationship.OUTGOING;

@NodeEntity
public class Teacher{

    @Id
    @GeneratedValue
    private long id;
    @Property("name")
    private String name;
    @Property("company")
    private String company;
    @Property("age")
    private int age;


    public Teacher() {}

    public Teacher(Long id, String name, String company, int age) {
        this.id = id;
        this.name = name;
        this.company = company;
        this.age = age;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    //Relationship to Apprentice
    @Relationship(type = "TEACHES", direction = OUTGOING)
    public Set<Apprentice> students;

    public void teaches(Apprentice apprentice) {
        if (students == null) {
            students = new HashSet<>();
        }
        students.add(apprentice);
    }

    public String toString() {
        return this.name + " teaches -> "
                + Optional.ofNullable(this.students).orElse(
                Collections.emptySet()).stream()
                .map(Apprentice::getName)
                .collect(Collectors.toList());
    }

}