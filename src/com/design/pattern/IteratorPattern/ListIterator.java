package com.design.pattern.IteratorPattern;

import java.util.List;

/**
 * @Classname ListIterator
 * @Description
 * @Date 2021/3/21 17:41
 * @Created by white
 */
public class ListIterator<E> implements Iterator<E> {
    private List<E> list;
    private int index = 0;
    ListIterator(List<E> list){
        this.list = list;
    }
    @Override
    public boolean hasNext() {
        return index<list.size();
    }

    @Override
    public E next() {
        return list.get(index++);
    }
}