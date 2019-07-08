package org.dimigo.Collection;

import java.util.HashMap;
import java.util.Map;

public class HashMapTest {
    public static void main(String[] args) {
        //Map( key, value)로 구성
        Map<String, Integer> map = new HashMap<>();
        map.put("kor", 100);
        map.put("mat", 100);
        map.put("emg", 100);
        map.put("eng", 100);
        map.remove("emp",100);
        printMap(map);

    }

    private static void printMap(Map<String, Integer> map) {
    for(String key : map.keySet()){
        System.out.println(key + ":" + map.get(key));
    }
        System.out.println();
    }
}
