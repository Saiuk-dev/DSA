package OOPS;

public class CopyConstructor {
    public static void main(String[] args){
        Student s1 = new Student();
        s1.name = "Sai";
        s1.roll = 456;
        s1.password = "abcd";
        s1.marks[0] = 100;
        s1.marks[1] = 80;
        s1.marks[2] = 88;

        Student s2 = new Student(s1);
        s2.password = "zyz";

        for(int i=0; i<3; i++){
            System.out.println(s2.marks[i]);
        }
    }
}

class Student{
    String name;
    int roll;
    String password;
    int marks[] = new int[3];

    Student(Student s1){
      //  marks = new int[3];
        this.name = s1.name;
        this.roll = s1.roll;

        //this.marks[0] = s1.marks[0];
        //this.marks[1] = s1.marks[1];
        //this.marks[2] = s1.marks[2];
        this.marks = s1.marks;
    }

    Student(String name){ //parameterized constructor
       // marks = new int[3];
        this.name= name;
    }

     Student(int roll){ //parameterized constructor
      //  marks = new int[3];
        this.roll=roll;
    }

    Student() {
    // default constructor
   // marks = new int[3];

   // Student(){
  //      this.password = password;
    //}
}
}
