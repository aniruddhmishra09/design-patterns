package com.designpatterns.level1;

import util.PrintObjectDetailsUtils;

public class TestSingletonLevel1WithSerialization {
    public static void main(String[] args) {
        SingletonLevel1Class obj1 = SingletonLevel1Class.getInstance();
        SingletonLevel1Class obj2 = SingletonLevel1Class.getInstance();

        PrintObjectDetailsUtils.print("obj1", obj1);
        PrintObjectDetailsUtils.print("obj2", obj2);
    }
}
