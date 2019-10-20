package com.mogila;
import com.mogila.hobby.Fishing;
import com.mogila.hobby.Football;
import com.mogila.hobby.Hobby;


public class Test {
    public static void main( String[] args ) {
        Run();
    }

    private static void Run() {
       Hobby football = new Football("Football", 10, 'A', "Ronaldo");
       Hobby fishing = new Fishing("Fishing", 7, 'B', "Karas");

       Hobby [] hobbys = {football, fishing};

        for (Hobby temp: hobbys) {
                temp.tellAboutHobby();
        }
    }
}
