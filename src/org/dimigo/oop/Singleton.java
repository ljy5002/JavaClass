package org.dimigo.oop;

public class Singleton {
    private static Singleton instance = new Singleton();
    private Singleton(){
    }
    public static Singleton getInstance(){
        return instance;
    }

    public static synchronized Singleton getInstance2(){
        if(instance == null){
           // instance == new Singleton();
        }
        return instance;
    }
    public static void main(String[] args) {

    }
}
