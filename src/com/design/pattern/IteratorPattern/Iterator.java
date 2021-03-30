package com.design.pattern.IteratorPattern;

/**
 * @Classname Iterator
 * @Description 迭代器接口
 * @Date 2021/3/21 17:07
 * @Created by white
 */
public interface Iterator<E> {
    boolean hasNext();
    E next();
}