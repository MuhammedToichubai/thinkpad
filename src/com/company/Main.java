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

    Student student = new Student();
    student.setName("Dinara");
    student.setAge((byte)18);
    student.setGroup("Java-5");
        System.out.println(student.getName()+" "+student.getAge()+" "+student.getGroup());

    }
}
