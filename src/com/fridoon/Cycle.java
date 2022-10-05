package com.fridoon;

public class Cycle {

    public void ride(Cycle cycle){
        System.out.println("ride of Cycle");
    }

    public static void start(Cycle cycle){
        cycle.ride(new Cycle());
        System.out.println("Start riding");
    }


    public static void main(String[] args) {
        Unicycle unicycle= new Unicycle();
        start(unicycle);
    }
}
