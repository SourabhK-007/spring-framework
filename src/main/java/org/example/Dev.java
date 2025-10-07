package org.example;

public class Dev {

    private Laptop laptop;
//    public Dev(Laptop laptop){
//        this.laptop=laptop;
//        System.out.println("Dev const");
//    }


    public Laptop getLaptop() {
        return laptop;
    }

    public void setLaptop(Laptop laptop) {
        this.laptop = laptop;
    }

    public void build(){
        laptop.compile();
       System.out.println("Building app");
   }
}
