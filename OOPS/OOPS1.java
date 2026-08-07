package OOPS;

public class OOPS1 {
public static void main(String[] args){
    Student s1 = new Student("Sai");
    System.out.println(s1.name);
}

 static class Student{
    String name;
    int age;

    Student(String name){
        this.name= name;
    }
    }
}

