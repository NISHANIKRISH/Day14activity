package com;

import java.awt.List;
import java.util.ArrayList;
import java.util.function.Consumer;

public class PersonDemo {
    public static void main(String[] args) {
        // Create instances of the Person class
        Person person1 = new Person("Alice", "alice@example.com");
        Person person2 = new Person("Bob", "bob@example.com");
        Person person3 = new Person("Charlie", "charlie@example.com");

        java.util.List<Person> personList = new ArrayList<>();
        personList.add(person1);
        personList.add(person2);
        personList.add(person3);

        Consumer<Person> printPersonInfo = PersonDemo::printPerson;

        personList.forEach(printPersonInfo);
    }

    private static void printPerson(Person person) {
        System.out.println("Person Name: " + person.personName +
                           ", Email: " + person.emailId);
    }
}