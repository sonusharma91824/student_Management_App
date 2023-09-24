//package com.student.manage;
//import java.io.BufferedReader;
//import java.io.InputStreamReader;
//import java.io.IOException;
//
//public class Start {
//
//    public static void main(String[] args) throws IOException {
//        System.out.println("Welcome to Student Management App");
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//        while (true) {
//            System.out.println("PRESS 1 to ADD student");
//            System.out.println("PRESS 2 to Delete student");
//            System.out.println("Press 3 to display student");
//            System.out.println("Press 4 to exit app ");
//            int c = Integer.parseInt(br.readLine());
//
//            if (c == 1) {
//                // Add student...
//                System.out.println("Enter user name:");
//                String name = br.readLine();
//
//                System.out.println("Enter user phone:");
//                String phone = br.readLine();
//
//                System.out.println("Enter user city:");
//                String city = br.readLine();
//
//                // Create student object to store student
//                Student st = new Student(name, phone, city);
//                 StudentDao.insertStudentToDB(st);  
//               boolean answer = StudentDao.insertStudentToDB(st);
//                 if(answer)
//                 {
//                	 System.out.println("Student is added successfully.....");
//                 }
//                 else
//                 {
//                	 System.out.println("somenting went wrong ....");
//                 }
//                 System.out.println(st);
//                // Add further code to store the student or perform necessary operations
//            } else if (c == 2) {
//                // Delete student...
//            } else if (c == 3) {
//                // Display student...
//            } else if (c == 4) {
//                // Exit
//                break;
//            } else {
//                System.out.println("Invalid input. Please try again.");
//            }
//        }
//
//        System.out.println("Thank you for using my Application.....");
//        System.out.println("See you soon.....bye bye");
//    }
//}


package com.student.manage;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Start {

    public static void main(String[] args) throws IOException {
        System.out.println("Welcome to Student Management App");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            System.out.println("PRESS 1 to ADD student");
            System.out.println("PRESS 2 to Delete student");
            System.out.println("Press 3 to display student");
            System.out.println("Press 4 to exit app ");
            int c = Integer.parseInt(br.readLine());

            if (c == 1) {
                // Add student...
                System.out.println("Enter user name:");
                String name = br.readLine();

                System.out.println("Enter user phone:");
                String phone = br.readLine();

                System.out.println("Enter user city:");
                String city = br.readLine();

                // Create student object to store student
                Student st = new Student(name, phone, city);

                boolean answer = StudentDao.insertStudentToDB(st);
                if (answer) {
                    System.out.println("Student is added successfully.....");
                } else {
                    System.out.println("Something went wrong ....");
                }
                System.out.println(st);
                // Add further code to store the student or perform necessary operations
            } else if (c == 2) {
                // Delete student...
            } else if (c == 3) {
                // Display student...
            } else if (c == 4) {
                // Exit
                break;
            } else {
                System.out.println("Invalid input. Please try again.");
            }
        }

        System.out.println("Thank you for using my Application.....");
        System.out.println("See you soon.....bye bye");
    }
}

