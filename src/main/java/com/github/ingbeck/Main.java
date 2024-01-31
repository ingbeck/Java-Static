package com.github.ingbeck;

public class Main {
    public static void main(String[] args) {

        Counter counter1 = new Counter();
        Counter counter2 = new Counter();
        Counter counter3 = new Counter();
        Counter counter4 = new Counter();

        //counter 1 - x3
        counter1.incrementInstanceCount();
        counter1.incrementInstanceCount();
        counter1.incrementInstanceCount();

        //counter 2 - x6
        counter2.incrementInstanceCount();
        counter2.incrementInstanceCount();
        counter2.incrementInstanceCount();
        counter2.incrementInstanceCount();
        counter2.incrementInstanceCount();
        counter2.incrementInstanceCount();

        //counter 3 - x1
        counter3.incrementInstanceCount();

        //counter 4 - x4
        counter4.incrementInstanceCount();
        counter4.incrementInstanceCount();
        counter4.incrementInstanceCount();
        counter4.incrementInstanceCount();

        //static count - x5
        Counter.incrementTotalCount();
        Counter.incrementTotalCount();
        Counter.incrementTotalCount();
        Counter.incrementTotalCount();
        Counter.incrementTotalCount();

        System.out.println(counter1);
        System.out.println(counter2);
        System.out.println(counter3);
        System.out.println(counter4);

    }
}