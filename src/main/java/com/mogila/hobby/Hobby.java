package com.mogila.hobby;

public abstract class Hobby {
    private String name;
    private int count_of_hours;
    private char group;

    public Hobby(String name, int count_of_hours, char group) {
        this.name = name;
        this.count_of_hours = count_of_hours;
        this.group = group;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCount_of_hours() {
        return count_of_hours;
    }

    public void setCount_of_hours(int count_of_hours) {
        this.count_of_hours = count_of_hours;
    }

    public char getGroup() {
        return group;
    }

    public void setGroup(char group) {
        this.group = group;
    }

    @Override
    public String toString() {
        return "Hobby{" +
                "name='" + name + '\'' +
                ", count_of_hours=" + count_of_hours +
                ", group=" + group +
                '}';
    }

    public abstract void tellAboutHobby();
}



