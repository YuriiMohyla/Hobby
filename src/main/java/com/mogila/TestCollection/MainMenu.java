package com.mogila.TestCollection;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainMenu {

    static public void printMainMenu() throws IOException {
        System.out.println("Welcome to program");
        System.out.println("1. Work with ArrayList");
        System.out.println("2. Work with LinkedList");
        System.out.println("3. Work with HashSet");
        System.out.println("4. Work with TreeSet");
        System.out.println("5. Work with HashMap");
        System.out.println("6. Work with TreeMap");
        System.out.println("7. Report for all");
        System.out.println("8. Exit");
        selectAction();
    }

    static public void selectAction() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int selectedId;
        Collection collection = new Collection();
        int report [][] = new int[6][3];

        while (true) {
            System.out.print("Input the number: ");
            selectedId = Integer.parseInt(reader.readLine());
            switch (selectedId) {
                case 1:
                    System.out.println("You are working with ArrayList:");
                    report[0][0] =(int)collection.GenerateArrayList();
                    System.out.println("GenerateArrayList "+report[0][0]+"ms");
                    report[0][1] = (int)collection.GetElementArrayList();
                    System.out.println("GetElementArrayList "+report[0][1]+"ms");
                    report[0][2] = (int)collection.RemoveArrayList();
                    System.out.println("RemoveArrayList "+report[0][2]+"ms");
                    break;
                case 2:
                    System.out.println("You are working with LinkedList:");
                    report[1][0] = (int)collection.GenerateLinkedList();
                    System.out.println("GenerateLinkedList "+report[1][0]+"ms");
                    report[1][1] = (int)collection.GetElementLinkedList();
                    System.out.println("GetElementLinkedList "+report[1][1]+"ms");
                    report[1][2] = (int)collection.RemoveLinkedList();
                    System.out.println("RemoveLinkedList "+report[1][2]+"ms");
                    break;
                case 3:
                    System.out.println("You are working with HashSet:");
                    report[2][0] = (int)collection.GenerateHashSet();
                    System.out.println("GenerateHashSet "+report[2][0]+"ms");
                    report[2][1] = (int)collection.GetHashSet();
                    System.out.println("GetHashSet "+report[2][1]+"ms");
                    report[2][2] = (int)collection.RemoveHashSet();
                    System.out.println("RemoveHashSet "+report[2][2]+"ms");
                    break;
                case 4:
                    System.out.println("You are working with TreeSet:");
                    report[3][0] = (int)collection.GenerateTreeSet();
                    System.out.println("GenerateTreeSet "+report[3][0]+"ms");
                    report[3][1] = (int)collection.GetTreeSet();
                    System.out.println("GetTreeSet "+report[3][1]+"ms");
                    report[3][2] = (int)collection.RemoveTreeSet();
                    System.out.println("RemoveTreeSet "+report[3][2]+"ms");
                    break;
                case 5:
                    System.out.println("You are working with HashMap:");
                    report[4][0] = (int)collection.GenerateHashMap();
                    System.out.println("GenerateHashMap "+report[4][0]+"ms");
                    report[4][1] = (int)collection.GetHashMap();
                    System.out.println("GetHashMap "+report[4][1]+"ms");
                    report[4][2] = (int)collection.RemoveHashMap();
                    System.out.println("RemoveHashMap "+report[4][2]+"ms");
                    break;
                case 6:
                    System.out.println("You are working with TreeMap:");
                    report[5][0] = (int)collection.GenerateTreeMap();
                    System.out.println("GenerateTreeMap "+report[5][0]+"ms");
                    report[5][1] = (int)collection.GetTreeMap();
                    System.out.println("GetTreeMap "+report[5][1]+"ms");
                    report[5][2] = (int)collection.RemoveTreeMap();
                    System.out.println("RemoveTreeMap "+report[5][2]+"ms");
                    break;
                case 7:
                    System.out.println("\t\t\t add \t remove \t getElement");
                    System.out.println(" Arraylist\t"+report[0][0]+"\t\t\t"+report[0][1]+"\t\t\t"+report[0][2]);
                    System.out.println("Linkedlist\t"+report[1][0]+"\t\t\t"+report[1][1]+"\t\t\t"+report[1][2]);
                    System.out.println("   HashSet\t"+report[2][0]+"\t\t\t"+report[2][1]+"\t\t\t"+report[2][2]);
                    System.out.println("   TreeSet\t"+report[3][0]+"\t\t\t"+report[3][1]+"\t\t\t"+report[3][2]);
                    System.out.println("   HashMap\t"+report[4][0]+"\t\t\t"+report[4][1]+"\t\t\t"+report[4][2]);
                    System.out.println("   TreeMap\t"+report[5][0]+"\t\t\t"+report[5][1]+"\t\t\t"+report[5][2]);
                    break;
                case 8:
                    System.exit(0);
                default:
                    System.out.println("Wrong input");
            }
        }
    }

}
