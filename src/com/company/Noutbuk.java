package com.company;

public class Noutbuk {
   private String laptopName;    //noutbuktun aty
   private int memory;        //pamyat
   private String color;    //Color color;
   private String CPU;     //processor

    public String getLaptopName() {
        return laptopName;
    }

    public void setLaptopName(String laptopName) {
        if (!laptopName.matches("[A-Za-z]*")){
            System.out.println("Noutbuktun aty tamgalar menen gana jazylat");
        }else {
            this.laptopName = laptopName;
        }
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        if (memory<0){
            System.out.println(" Noutbuktun pamiaty ters bolboit ");
        }else {
            this.memory = memory;
        }
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getCPU() {
        return CPU;
    }

    public void setCPU(String CPU) {
        this.CPU = CPU;
    }
}
