package com.company;

public class Main {

    public static void main(String[] args) {

    Noutbuk noutbuk = new Noutbuk();
    noutbuk.setLaptopName("Thinkpad");
    noutbuk.setMemory(256);
    noutbuk.setColor("Black");
    noutbuk.setCPU("Windows");

        System.out.println(noutbuk.getLaptopName()+" "+noutbuk.getMemory()+" "
                           +noutbuk.getColor()+" "+noutbuk.getCPU());

    }
}
