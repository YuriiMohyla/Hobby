package com.mogila;
import com.mogila.hobby.Hobby;
import java.util.Scanner;

public class Test {
    public static void main( String[] args ) {
        Run();
    }

    private static void Run() {
        int year;
        char group;
        float cost;
        byte group_number;
        double time;
        boolean optional;
        long count;
        short count_hours;
        String name;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите значения в порядку int, char, float, byte, double, boolean, long, short, String:");
        year = scanner.nextInt();
        group = scanner.next().charAt(0);
        cost = scanner.nextFloat();
        group_number = scanner.nextByte();
        time = scanner.nextDouble();
        optional = scanner.nextBoolean();
        count = scanner.nextLong();
        count_hours = scanner.nextShort();
        name = scanner.next();

        Hobby hobby1 = new Hobby(year, group, cost, group_number, time, optional, count, count_hours, name);
        Hobby hobby2 = new Hobby(2019, 'A',  250, "Ivan_King");
        Hobby hobby3 = new Hobby();

        Hobby[] array_of_hobby = {hobby1, hobby2, hobby3};

        for (int i = 0; i < array_of_hobby.length ; i++) {
            System.out.println(array_of_hobby[i]);
        }
    }
}
