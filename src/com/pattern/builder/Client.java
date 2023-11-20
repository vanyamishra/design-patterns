package com.pattern.builder;

public class Client {
    public static void main(String[] args) throws Exception {
        
        PerfumeBottleBuilder perfumeBottleBuilder = new PerfumeBottleBuilder();
        Director director = new Director(perfumeBottleBuilder);
        director.construct();

        var bottle = perfumeBottleBuilder.getResult();
        System.out.println("Bottle Title: "+bottle.getTitle());
        System.out.println("Bottle Capacity: "+bottle.getCapacity());
        
        
        var tonerBottleBuilder = new TonerBottleBuilder();
        director = new Director(tonerBottleBuilder);
        director.construct();

        var tonerBottle = tonerBottleBuilder.getResult();
        System.out.println("Bottle Title: "+tonerBottle.getTitle());
        System.out.println("Bottle Capacity: "+tonerBottle.getCapacity());

    }
}
