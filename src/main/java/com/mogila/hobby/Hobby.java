package com.mogila.hobby;


import java.io.Serializable;

public abstract class Hobby implements Serializable {
    private String name;
    private int countOfHours;
    private char group;
    final int a = 10;   //переменная для обработки исключений
    private int PrivateField = 10;

    public Hobby(String name, int countOfHours, char group) {
        this.name = name;
        this.countOfHours = countOfHours;
        this.group = group;
    }
    public int test(int a, String b, double c) {
        System.out.println(b);
        return a;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCountOfHours() {
        return countOfHours;
    }

    public void setCountOfHours(int countOfHours) {
        this.countOfHours = countOfHours;
    }

    public char getGroup() {
        return group;
    }

    public void setGroup(char group) {
        this.group = group;
    }

    @Override
    public String toString() {
        return "Hobby{"
                + "name='" + name + '\''
                + ", count_of_hours=" + countOfHours
                + ", group=" + group + '}';
    }

    public abstract void tellAboutHobby(int args) throws HobbyException;
}



