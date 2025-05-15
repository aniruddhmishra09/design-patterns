package com.designpatterns.level1;

import util.PrintObjectDetailsUtils;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class TestSingletonLevel1WithReflection {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        SingletonLevel1Class obj1 = SingletonLevel1Class.getInstance();
        SingletonLevel1Class obj2 = SingletonLevel1Class.getInstance();

        PrintObjectDetailsUtils.print("obj1", obj1);
        PrintObjectDetailsUtils.print("obj2", obj2);

        Class clazz = Class.forName("com.designpatterns.level1.SingletonLevel1Class");
        Constructor constructor = clazz.getDeclaredConstructor();
        constructor.setAccessible(true);
        SingletonLevel1Class obj3 = (SingletonLevel1Class) constructor.newInstance();
        PrintObjectDetailsUtils.print("obj3", obj3);
    }

}
