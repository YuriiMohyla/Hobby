package com.mogila;
import com.mogila.hobby.Fishing;
import com.mogila.hobby.Hobby;
import com.mogila.hobby.HobbyException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Logger;

public class Test {
    final static Logger logger = Logger.getLogger(String.valueOf(Test.class));
    public static void main(final String[] args) throws IOException {
        run();
    }
    private static void run() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите название рыбалки, кол-во часов, группу и название рыбы:");
        String name = reader.readLine();
        int hoursFish = Integer.parseInt(reader.readLine());
        char groupFish = (char) reader.read();
        reader.skip(1L); //Вызов метода skip для верного считывания следующей строки
        String favFish = reader.readLine();
        Hobby fishing = new Fishing(name, hoursFish, groupFish, favFish);
        System.out.println("Введите число для проверки исключений:");
        int a = Integer.parseInt(reader.readLine());
        try {
            fishing.tellAboutHobby(a);
            logger.info("Число больше 10 = "+ a );
        } catch (HobbyException ex) {
            System.out.println("Ошибка число меньше 10");
            logger.info("Введенное число меньше 10 = "+ a);
        } finally {
            System.out.println("Попробуйте еще раз");
        }
    }
}
