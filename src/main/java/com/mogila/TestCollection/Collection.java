package com.mogila.TestCollection;

import com.mogila.hobby.Football;
import com.mogila.hobby.Hobby;

import java.util.*;

public class Collection {
    private long timeStart;
    private long timeEnd;
    private final int collectionSize = 10000;
    private ArrayList<Hobby> arrayList = new ArrayList<>();
    private LinkedList<Hobby> linkedList = new LinkedList<>();
    private HashSet<Hobby> hashSet = new HashSet<>();
    private TreeSet<Hobby> treeSet = new TreeSet<>(new HobbyComp());
    private HashMap<Integer,Hobby> hashMap = new HashMap<>();
    private TreeMap<Integer,Hobby> treeMap = new TreeMap<>();
    //ArrayList methods
    public long GenerateArrayList() {
        timeStart = System.currentTimeMillis();
        for (int i = 0; i < collectionSize; i++) {
            arrayList.add(new Football("Test",i,'t',"Test"));
        }
        timeEnd = System.currentTimeMillis();
        return timeEnd - timeStart;
    }
    public long RemoveArrayList() {
        timeStart = System.currentTimeMillis();
        for(int i = 0; i < collectionSize; i++) {
            arrayList.remove(0);
        }
        timeEnd = System.currentTimeMillis();
        return timeEnd - timeStart;
    }
    public long GetElementArrayList() {
        timeStart = System.currentTimeMillis();
        for(int i = 0; i < collectionSize; i++) {
            arrayList.get(i);
        }
        timeEnd = System.currentTimeMillis();
        return timeEnd - timeStart;
    }
    //LinkedList methods
    public long GenerateLinkedList() {
        timeStart = System.currentTimeMillis();
        for (int i = 0; i < collectionSize; i++) {
            linkedList.add(new Football("Test",i,'t',"Test"));
        }
        timeEnd = System.currentTimeMillis();
        return timeEnd - timeStart;
    }
    public long RemoveLinkedList() {
        timeStart = System.currentTimeMillis();
        for (int i = 0; i < collectionSize; i++) {
            linkedList.remove(0);
        }
        timeEnd = System.currentTimeMillis();
        return timeEnd - timeStart;
    }
    public long GetElementLinkedList() {
        timeStart = System.currentTimeMillis();
        for (int i = 0; i < collectionSize; i++) {
            linkedList.get(i);
        }
        timeEnd = System.currentTimeMillis();
        return timeEnd - timeStart;
    }
    //HashSet methods
    public long GenerateHashSet() {
        timeStart = System.currentTimeMillis();
        for (int i = 0; i < collectionSize; i++) {
            hashSet.add(new Football("Test",i,'t',"Test"));
        }
        timeEnd = System.currentTimeMillis();
        return timeEnd - timeStart;
    }
    public long RemoveHashSet() {
        Iterator iterator = hashSet.iterator();
        timeStart = System.currentTimeMillis();

        while (iterator.hasNext()) {
            Football x = (Football) iterator.next();
            iterator.remove();
        }
        timeEnd = System.currentTimeMillis();
        return timeEnd - timeStart;
    }
    public long GetHashSet() {
        Iterator iterator = hashSet.iterator();
        timeStart = System.currentTimeMillis();
        while (iterator.hasNext()) {
            hashSet.iterator().getClass();
            iterator.next();
        }
        timeEnd = System.currentTimeMillis();
        return timeEnd - timeStart;
    }
    //TreeSet methods
    public long GenerateTreeSet() {
        timeStart = System.currentTimeMillis();
        for (int i = 0; i < collectionSize; i++) {
            treeSet.add(new Football("Test",i,'t',"Test"));
        }
        timeEnd = System.currentTimeMillis();
        return timeEnd - timeStart;
    }
    public long RemoveTreeSet() {
        Iterator iterator = treeSet.iterator();
        timeStart = System.currentTimeMillis();
        while (iterator.hasNext()) {
            Football x = (Football) iterator.next();
            iterator.remove();
        }
        timeEnd = System.currentTimeMillis();
        return timeEnd - timeStart;
    }
    public long GetTreeSet() {
        Iterator iterator = treeSet.iterator();
        timeStart = System.currentTimeMillis();
        while (iterator.hasNext()) {
            treeSet.iterator().getClass();
            iterator.next();
        }
        timeEnd = System.currentTimeMillis();
        return timeEnd - timeStart;
    }
    //HashMap methods
    public long GenerateHashMap() {
        timeStart = System.currentTimeMillis();
        for (int i = 0; i < collectionSize; i++) {
            hashMap.put(i, new Football("Test",i,'t',"Test"));
        }
        timeEnd = System.currentTimeMillis();
        return timeEnd - timeStart;
    }
    public long RemoveHashMap() {
        timeStart = System.currentTimeMillis();
        for (int i = 0; i < collectionSize; i++) {
            hashMap.remove(i);
        }
        timeEnd = System.currentTimeMillis();
        return timeEnd - timeStart;
    }
    public long GetHashMap() {
        timeStart = System.currentTimeMillis();
        for (int i = 0; i< collectionSize; i++) {
            hashMap.get(i);
        }
        timeEnd = System.currentTimeMillis();
        return timeEnd - timeStart;
    }

    //TreeMap methods
    public long GenerateTreeMap() {
        timeStart = System.currentTimeMillis();
        for (int i = 0; i < collectionSize; i++) {
            treeMap.put(i, new Football("Test",i,'t',"Test"));
        }
        timeEnd = System.currentTimeMillis();
        return timeEnd - timeStart;
    }
    public long RemoveTreeMap() {
        timeStart = System.currentTimeMillis();
        for (int i = 0; i < collectionSize; i++) {
            treeMap.remove(i);
        }
        timeEnd = System.currentTimeMillis();
        return timeEnd - timeStart;
    }
    public long GetTreeMap() {
        timeStart = System.currentTimeMillis();
        for (int i = 0; i< collectionSize; i++) {
            treeMap.get(i);
        }
        timeEnd = System.currentTimeMillis();
        return timeEnd - timeStart;
    }
}

class HobbyComp implements Comparator<Hobby>{
    @Override
    public int compare(Hobby e1, Hobby e2) {
        if(e1.getCountOfHours() > e2.getCountOfHours()){
            return 1;
        } else {
            return -1;
        }
    }
}