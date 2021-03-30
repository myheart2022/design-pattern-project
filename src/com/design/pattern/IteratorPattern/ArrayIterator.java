package com.design.pattern.IteratorPattern;

/**
 * @Classname ArrayIterator
 * @Description
 * @Date 2021/3/21 17:12
 * @Created by white
 */
public class ArrayIterator<E> implements Iterator<E> {
    private E[] arr;
    private int index = 0;
    ArrayIterator(E[] arr){
        this.arr = arr;
    }
    @Override
    public boolean hasNext() {
        return index<arr.length;
    }

    @Override
    public E next() {
        return arr[index++];
    }
}