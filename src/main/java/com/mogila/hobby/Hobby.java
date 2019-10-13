package com.mogila.hobby;

public class Hobby {
    private int year;
    private char group;
    private float cost;
    private byte group_number;
    private double time;
    private boolean optional;
    private long count;
    private short count_hours;
    private String name;


    public Hobby() {
        super();
    }

    public Hobby(int year, char group, float cost, String name) {
        this.year = year;
        this.group = group;
        this.cost = cost;
        this.name = name;
    }

    public Hobby(int year, char group, float cost, byte group_number, double time, boolean optional, long count, short count_hours, String name) {
        this.year = year;
        this.group = group;
        this.cost = cost;
        this.group_number = group_number;
        this.time = time;
        this.optional = optional;
        this.count = count;
        this.count_hours = count_hours;
        this.name = name;
    }

    public Hobby(int year, String name) {
        this.year = year;
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public char getGroup() {
        return group;
    }

    public void setGroup(char group) {
        this.group = group;
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    public byte getGroup_number() {
        return group_number;
    }

    public void setGroup_number(byte group_number) {
        this.group_number = group_number;
    }

    public double getTime() {
        return time;
    }

    public void setTime(double time) {
        this.time = time;
    }

    public boolean isOptional() {
        return optional;
    }

    public void setOptional(boolean optional) {
        this.optional = optional;
    }

    public long getCount() {
        return count;
    }

    public void setCount(long count) {
        this.count = count;
    }

    public short getCount_hours() {
        return count_hours;
    }

    public void setCount_hours(short count_hours) {
        this.count_hours = count_hours;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Hobby{" +
                "year=" + year +
                ", group=" + group +
                ", cost=" + cost +
                ", group_number=" + group_number +
                ", time=" + time +
                ", optional=" + optional +
                ", count=" + count +
                ", count_hours=" + count_hours +
                ", name='" + name + '\'' +
                '}';
    }
}
