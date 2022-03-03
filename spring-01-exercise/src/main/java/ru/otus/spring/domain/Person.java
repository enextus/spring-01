package ru.otus.spring.domain;

public class Person {
    private final String sex;
    private final String name;
    private final int age;

    public Person(String sex, String name, int age) {
        this.sex = sex;
        this.name = name;
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
