//task1
//1. Создать класс Person который описывает человека, с полями: имя, фамилия, возраст, вес, рост.
//Создать один или несколько конструкторов которые гарантирует что у каждого есть имя, фамилия.
//Создать массив из 100 обьектов типа Person заполненных случайными данными
//(Например создать массив на несколько имен и выбирать из него случайным образом).
//1.1*.Обеспечить чтобы случайные данные (вес, рост, возраст) выглядели правдоподобно:
//не было человека весом 3 кг и ростом 180 итд.
package com.p0n0marenk0;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    private static final List<Person> list = new ArrayList<>();

    public static void main(String[] args) {
        Random random = new Random();
        String[] name = {"John", "Marcus", "Susan", "Henry", "Andrew"};
        String[] surname = {"Anderson", "Johnson", "Bush", "Dickson", "Gamble"};

        for (int i = 0; i < 100; i++) {
            int nameOfPerson = (int) Math.floor(Math.random() * name.length);
            int surnameOfPerson = (int) Math.floor(Math.random() * surname.length);
            int age = 1 + random.nextInt(100);
            double growth;
            if (age > 27) {
                growth = 160 + random.nextInt(46);
            } else {
                growth = roundDouble(6.25 * age + 63.75);
            }
            int bmi = 16 + random.nextInt(25); //body mass index for correct weight.
            double weight = roundDouble(bmi * (growth / 100) * (growth / 100));
            Person person = new Person(name[nameOfPerson], surname[surnameOfPerson], age, weight, growth);
            addPerson(person);
            System.out.println("name: " + list.get(i).getName() + " Surname: " + list.get(i).getSecondName() +
                    " Age: " + list.get(i).getAge() + "y.o Weight: " + list.get(i).getWeight() +
                    "kg. Growth: " + list.get(i).getGrowth() + "sm.");
        }
    }

    public static void addPerson(Person person) {
        list.add(person);
    }

    public static double roundDouble(double number) {
        return (Math.round(number * 100)) / 100.0;
    }
}
