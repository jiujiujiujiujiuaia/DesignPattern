package com.company.JdkFeature;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;

public class Person {
    private String name;

    Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static int compareName(Person a, Person b) {
        return a.getName().compareTo(b.getName());
    }

    public static void main(String[] args) {
        Person a = new Person("3");
        Person b = new Person("1");
        Person c = new Person("2");
        List<Person> people = new ArrayList<>();
        people.add(a);
        people.add(b);
        people.add(c);

        Person[] people1 = people.toArray(new Person[people.size()]);
        Arrays.sort(people1,Person::compareName);
        for(Person p:people1) System.out.println(p.name);

    }
}

