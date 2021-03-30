package com.design.pattern.prototypePattern;

import java.io.*;

/**
 * @Classname MainStarter
 * @Description
 * @Date 2021/3/29 16:31
 * @Created by white
 */
public class MainStarter {
    public static void main(String[] args) {
        Prototype prototype = new Prototype("A",1);
        Prototype prototype1 = prototype.clone();
        prototype1.setNum(2);
        System.out.println(prototype);
        System.out.println(prototype1);

        /**
         * 内部对象未被克隆，可以在clone方法添加对引用对象prototype的clone
         */
        PrototypePlus prototypePlus = new PrototypePlus("B",2,2,prototype);
        PrototypePlus prototypePlus1 = prototypePlus.clone();
        prototypePlus1.getPrototype().setName("BB");
        System.out.println(prototypePlus);
        System.out.println(prototypePlus1);

        File file = new File("testFile.txt");
        try(ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(file))){
            objectOutputStream.writeObject(prototypePlus);
        }catch (IOException e){
            e.printStackTrace();
        }

        try(ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(file))){
            prototypePlus1 = (PrototypePlus)objectInputStream.readObject();
        }catch (Exception e){
            e.printStackTrace();
        }
        prototypePlus1.getPrototype().setName("CC");
        System.out.println(prototypePlus);
        System.out.println(prototypePlus1);
    }
}