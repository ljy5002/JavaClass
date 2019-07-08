package org.dimigo.OneProject;

import java.util.Scanner;

public class Display {
    public static void main(String[] args) {
       Hello();
        MenuHelp();
    }

    public static void Hello(){
        System.out.println("Hello, This is your advisor Y.");
        System.out.println("Enter 'help' to see some function.");
    }

    public static void MenuHelp(){
        Scanner scanner= new Scanner(System.in);
        String h = scanner.next();
        if(h.equals("help")) {
            System.out.println("---------Functions---------");
            System.out.println("(1)Bring the location.");
        }
        else if(h.equals("1")||h.equals("location")){
            locations();
        }
        else{
            System.out.println("Wrong Command.");
        }
    }

    private static void locations() {
        System.out.println("hello");
    }

}
