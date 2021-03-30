package com.design.pattern.IteratorPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @Classname MainStarter
 * @Description
 * @Date 2021/3/21 17:48
 * @Created by white
 */
public class MainStarter {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(4);
        list.add("1111");
        list.add("2222");
        list.add("3333");
        list.add("4444");
        ListIterator<String> iterator = new ListIterator<String>(list);
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        Integer[] arr = {1,2,3,4};
        int count = 0;
        ArrayIterator<Integer> i = new ArrayIterator<Integer>(arr);
        while (i.hasNext()){
            count += i.next();
        }
        System.out.println(count);
    }
}