package com.designpatterns.level1;

import java.io.Serializable;

public class SingletonLevel1Class implements Serializable {
    private static SingletonLevel1Class singleton = new SingletonLevel1Class();

    private SingletonLevel1Class(){

    }

    public static SingletonLevel1Class getInstance(){
        return singleton;
    }
}
