package com.github.ingbeck;

public class Counter {
    private static int totalCount = 0;
    private int instanceCount = 0;

    public Counter(){}

    public static void incrementTotalCount(){
        totalCount++;
    }

    public void incrementInstanceCount(){
        instanceCount++;
    }

    @Override
    public String toString() {
        return "Counter{" +
                "instanceCount=" + instanceCount +
                '}';
    }
}
