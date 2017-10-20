package ru.itpark;

import ru.itpark.lists.ArrayList;
import ru.itpark.lists.Iterator;
import ru.itpark.lists.List;

public class MainArrayList {

    public static void main(String[] args) {
	    ArrayList list = new ArrayList();
	    list.add(10);
	    list.add(5);
	    list.add(1);
	    list.add(8);
	    list.add(2);

        Iterator iterator = list.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }
}
