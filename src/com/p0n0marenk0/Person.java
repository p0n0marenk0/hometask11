package com.p0n0marenk0;

public class Person {
    private String name;
    private String secondName;
    private int age;
    private double weight;
    private double growth;

    public Person(String name, String secondName, int age, double weight, double growth) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.growth = growth;
        this.secondName = secondName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        if (!secondName.isEmpty()){
            this.secondName = secondName;
        }else{
            System.out.println("Ошибка! Фамилия не может быть пустым!");
        }
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getGrowth() {
        return growth;
    }

    public void setGrowth(double growth) {
        if (growth <= 290.0 && growth >= 140.0) {
            this.growth = growth;
        } else {
            System.out.println("Ошибка! Рост может быть введен только от 1.40м до 2.90м");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
    if (!name.isEmpty()){
        this.name = name;
    }else{
        System.out.println("Ошибка! Имя не может быть пустым!");
    }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (0 < age && age <= 100) {
            this.age = age;
        } else {
            System.out.println("Ошибка! Возраст не может быть отрицательным или больше чем 120 лет");
        }
    }
}
