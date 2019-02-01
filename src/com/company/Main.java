package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Person Igor = Person.createPerson(16, "Igor"); //вызов метода-фабрики
        System.out.println(Igor);
    }
}

class Person{
    String name;
    int age;

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public static Person createPerson (int age, String name){ //метод-фабрика использует конструктор для постоения обьектов
        return new Person(age, name);                         // возвращает екземпляр класса
    }
}