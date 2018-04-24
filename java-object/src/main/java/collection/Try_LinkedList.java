package collection;


import java.util.Iterator;
import java.util.LinkedList;

/**
 * see
 * 1. Try_LinkedListTset
 * 2.
 */

public class Try_LinkedList {

    public static void main(String[] args) {


        LinkedList<String> list = new LinkedList<>();


        list.add("Kent");
        list.add("Ice");
        list.add("Kevin");
        list.addFirst("Tomaz");
        list.addLast("Neyo");


        for (String s : list) {
            System.out.println(s);
        }

        int index = list.indexOf("Kevin");
        System.out.println("Kevin index = " + index);


        Iterator<String> it = list.descendingIterator();

    }

}
