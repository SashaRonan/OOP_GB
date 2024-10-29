package Homeworks.Homework_05.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Person implements Serializable {
    private static final long serialVersionUID = 1L;
    private String name;
    private int birthYear;
    private Homeworks.Homework_04.model.Person mother;
    private Homeworks.Homework_04.model.Person father;
    private List<Homeworks.Homework_04.model.Person> children;

    public Person(String name, int birthYear) {
        this.name = name;
        this.birthYear = birthYear;
        this.children = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setMother(Homeworks.Homework_04.model.Person mother) {
        this.mother = mother;
    }

    public void setFather(Homeworks.Homework_04.model.Person father) {
        this.father = father;
    }

    public void addChild(Homeworks.Homework_04.model.Person child) {
        this.children.add(child);
    }

    public List<Homeworks.Homework_04.model.Person> getChildren() {
        return children;
    }

    public Homeworks.Homework_04.model.Person getMother() {
        return mother;
    }

    public Homeworks.Homework_04.model.Person getFather() {
        return father;
    }
}
