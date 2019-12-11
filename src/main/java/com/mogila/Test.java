package com.mogila;
import com.mogila.hobby.Fishing;
import com.mogila.hobby.Hobby;
import com.mogila.hobby.HobbyException;

import java.io.*;
import java.util.LinkedList;

import org.apache.log4j.Logger;


public class Test  {
    final static Logger logger = Logger.getLogger(Test.class);
    public static void main(final String[] args) throws IOException, ClassNotFoundException {
       // MainMenu.printMainMenu();
        copyRun();

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
            logger.error("Введенное число меньше 10 = "+ a);
        } finally {
            System.out.println("Попробуйте еще раз");
        }
    }

    private static void copyRun() throws IOException, ClassNotFoundException {
        Fishing obj1 = new Fishing("name1",23,'A',"Okun");
        Fishing obj2 = new Fishing("name2",25,'A',"Okun");
        Fishing obj3 = new Fishing("name3",12,'B',"Karas");

        File file = new File("copy");
        file.mkdir();

        FileOutputStream outputStream = new FileOutputStream("input.bin");
        FileOutputStream outputStream2 = new FileOutputStream("copy/output.bin");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
        ObjectOutputStream objectOutputStream2 = new ObjectOutputStream(outputStream2);

        LinkedList<Hobby> listWrite = new LinkedList<>();
        LinkedList<Hobby> listRead = new LinkedList<>();

        listWrite.add(obj1);
        listWrite.add(obj2);
        listWrite.add(obj3);

        objectOutputStream.writeObject(listWrite);
        objectOutputStream.close();
        outputStream.close();

        FileInputStream fileInputStream = new FileInputStream("input.bin");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

        FileInputStream fileInputStream2 = new FileInputStream("copy/output.bin");
        ObjectInputStream objectInputStream2 = new ObjectInputStream(fileInputStream2);

        listRead = (LinkedList<Hobby>) objectInputStream.readObject();

        objectInputStream.close();
        fileInputStream.close();

        objectOutputStream2.writeObject(listRead);
        System.out.println(objectInputStream2.readObject());

        objectInputStream2.close();
        fileInputStream2.close();
        objectOutputStream2.close();
        outputStream2.close();

    }

}
