package com.uek223.firstgraphqlapp.domainmodels.apprentice;

import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Property;

@NodeEntity
public class Apprentice {

    @Id
    @GeneratedValue
    private Long id;
    @Property("name")
    private String name;
    @Property("company")
    private String company;
    @Property("age")
    private int age;
    @Property("apprenticeshipyear")
    private int apprenticeshipYear;

    public Apprentice() {}

    public Apprentice(Long id, String name, String company, int age, int apprenticeshipYear) {
        this.id = id;
        this.name = name;
        this.company = company;
        this.age = age;
        this.apprenticeshipYear = apprenticeshipYear;
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

    public int getApprenticeshipYear() {
        return apprenticeshipYear;
    }

    public void setApprenticeshipYear(int apprenticeshipYear) {
        this.apprenticeshipYear = apprenticeshipYear;
    }
}
