package OOPS;

public class OOPS1 {
public static void main(String[] args){
    Student s1 = new Student("Sai");
    Student s2 = new Student();
    Student s3 = new Student(24);
    System.out.println(s1.name);
    System.out.println(s3.age);
}

 static class Student{
    String name;
    int age;

    Student(String name){ //parameterized constructor
        this.name= name;
    }

    Student(int age){ //parameterized constructor
        this.age=age;
    }

    Student(){ //non-parameterized constructor
        System.out.println("Hi its Sai");
    }
    }
}

