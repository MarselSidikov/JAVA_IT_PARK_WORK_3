package ru.itpark;

import ru.itpark.lists.ArrayList;
import ru.itpark.lists.Iterator;
import ru.itpark.lists.LinkedList;
import ru.itpark.lists.List;

public class MainLists {

    public static void printList(List list) {
        Iterator iterator = list.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(10);
        arrayList.add(5);
        arrayList.add(1);
        arrayList.add(8);
        arrayList.add(2);

        LinkedList linkedList = new LinkedList();
        linkedList.addToBegin(6);
        linkedList.addToBegin(8);
        linkedList.addToBegin(9);
        linkedList.addToBegin(1);

        printList(arrayList);
        System.out.println("------------");
        printList(linkedList);
    }
}
