package OOPS;

public class Inheritance {
   public static void main(String[] args){
    Fish Shark = new Fish();
    Shark.eat();   
    Shark.breath();     //Single Level Inheritance
    Shark.mate();

    Mammals ape = new Mammals();
    ape.eat();
    ape.swim();         //Multi level Inheritance
    ape.ears();
   }
}

class Animal{
    String color;

    void eat() {
        System.out.println("eats");
    }

    void breath() {
        System.out.println("Breathes");
    }

    void mate() {
        System.out.println("Mates");
    }
}

class Fish extends Animal{
    int fins;

    void swim(){
        System.out.println("Swims in water");
    }
}

class Mammals extends Fish{
    int legs;

    void ears(){
        System.out.println("Hears a lots of things");
    }
}
