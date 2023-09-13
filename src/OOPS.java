class Pen{
    String color;
    String type;

    public void write(){
        System.out.println("write something");
    }
    public void printColor(){
        System.out.println(this.color);
    }
}
class Student{
    String name;
    int age;
    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
    Student(Student s2){
//        System.out.println("constructor called");
        this.age = s2.age;
        this.name = s2.name;
    }

    Student(){

    }
}
/////////////////////////////////////////////////////////////////////////////////////////
//Inheritence
class shape{
    String color;
}
class Triangle extends shape {

}
//////////////////////////////////////////
//Abstract

abstract class Animal{
       abstract void walk();
    }
class Horse extends Animal{
    public void walk(){
        System.out.println("walk on 4 legs");
    }
}
class Chicken extends Animal{
    public void walk(){
        System.out.println("walk on 2 legs");
    }
}

public class OOPS {
    public static void main(String[] args) {
        //Polymorphism
//        Student s1 = new Student();
//        s1.name = "Ritik";
//        s1.age = 23;
//        Student s2 = new Student(s1);
//        s2.printInfo();
        //Inheritence
        Triangle t = new Triangle();
        t.color = "red";
        //Abstract
        Horse horse = new Horse();
        horse.walk();
        Chicken chicken = new Chicken();
        chicken.walk();


    }
}
