package org.collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {
    public static void main(String[] args) {
//        //1.list 계열
//        List list = new ArrayList();
//        list.add("나자바");
//        list.add(100);
//        list.add(new Dog("멍멍이"));
//
        List<String> list = new ArrayList<>();
        list.add("사과");
        list.add("배");
        list.add("딸기");
        list.add("딸기");
        list.add(1,"포도");
        list.set(2,"바나나");

        printlist(list);
        System.out.println(list.get(list.size()-1));
        list.remove(0);
        printlist(list);

        list.remove("딸기");
        printlist(list);

        list.clear();


    }

    private static void printlist(List<String> list) {
        for(String s : list){
            System.out.print(s + " | ");
        }
        System.out.println();

    }
}
