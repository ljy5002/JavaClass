package org.dimigo.Collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {
    public static void main(String[] args) {
        //ArrayList 생성
        //object 데이터 타입 배열
        List list = new ArrayList();
        list.add(100);
        list.add("hello");
        list.get(0);

        String s = (String) list.get(0);
        List<String> list2 = new ArrayList<>();
        list2.add("사과");
        list2.add("베");
        list2.add("딸기");
        list2.add("딸기");
        list2.add(1,"포도");
        list2.set(1,"바나나");
        printList(list2);

        System.out.println(list2.get(2));
        System.out.println(list2.get(list2.size() - 1));

        list2.remove(0);
        printList(list2);

        list2.clear();

    }

    private static void printList(List<String> list2) {
        for(String s : list2){
            System.out.println(s + "|");
        }
        System.out.println();
    }
}
