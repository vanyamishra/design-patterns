package com.pattern.builder;

public class Client {
    public static void main(String[] args) throws Exception {
        PerfumeBottleBuilder perfumeBottleBuilder = new PerfumeBottleBuilder();
        Director director = new Director(perfumeBottleBuilder);
        director.construct(true);

        Bottle bottle = perfumeBottleBuilder.getResult();
        
        System.out.println("Bottle Title: "+bottle.title);
        System.out.println("Bottle Capacity: "+bottle.capacity);
        
    }
}
