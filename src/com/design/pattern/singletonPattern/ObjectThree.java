package com.design.pattern.singletonPattern;

/**
 * @Classname ObjectThree
 * @Description
 * @Date 2021/3/28 13:56
 * @Created by white
 */
public class ObjectThree {
    private static ObjectThree objectThree;
    private ObjectThree(){

    }
    public static synchronized ObjectThree getInstance(){
        if(objectThree==null){
            synchronized (ObjectThree.class){
                if(objectThree==null){
                    objectThree = new ObjectThree();
                }
            }
        }
        return objectThree;
    }
}