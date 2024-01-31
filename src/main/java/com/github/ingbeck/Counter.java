package com.github.ingbeck;

public class Counter {

    private static int totalCount = 0;
    private int instanceCount = 0;

    public Counter(){
        Counter.incrementTotalCount();
    }

    public static void incrementTotalCount(){
        totalCount++;
    }

    public void incrementInstanceCount(){
        instanceCount++;
    }

    public static int getTotalCount() {
        return totalCount;
    }

    @Override
    public String toString() {
        return "Counter{" +
                "instanceCount=" + instanceCount + ", " +
                "totalCount=" + getTotalCount() +
                '}';
    }
}
