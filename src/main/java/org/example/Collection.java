package org.example;

import java.util.ArrayList;
import java.util.List;


public class Collection {
    
    List<Integer> list = new ArrayList<>(10);
    
    void addElement(int element)
    {
        list.add(element);
    }

    int position(int element)
    {
        return list.indexOf(element);
    }

    void removeElement(int element)
    {
        list.remove(list.indexOf(element));
    }

    void print() {
        System.out.print(list);
        System.out.println();
    }
}
