package Session06;

import java.util.Scanner;


class Student {
    String studName;
    int studAge;

    void initialize() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Name: ");
        studName = scan.nextLine();
        System.out.println("Enter Age: ");
        studAge = scan.nextInt();
    }
    void display(){
        System.out.println("Student Name: " + studName);
        System.out.println("Student Age " + studAge);
    }

    public static void main(String[] args) {
        Student objStudent = new Student();
        objStudent.initialize();
        objStudent.display();
    }
}
