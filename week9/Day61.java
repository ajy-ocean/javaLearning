
import java.io.*;

public class Day61 {

    public static void main(String[] args) {

        File file = new File("C:\\Users\\arj69\\Music\\employees.dat");


        // ==========================================
        // PART A, C AND F: WRITE EMPLOYEE DATA
        // ==========================================

        try (
                DataOutputStream dos = new DataOutputStream(
                        new BufferedOutputStream(
                                new FileOutputStream(file)
                        )
                )
        ) {

            // Employee 1
            dos.writeInt(101);
            dos.writeUTF("Rahul");
            dos.writeDouble(45000.50);
            dos.writeBoolean(true);
            dos.writeInt(25);
            dos.writeUTF("IT");

            // Employee 2
            dos.writeInt(102);
            dos.writeUTF("Priya");
            dos.writeDouble(52000.75);
            dos.writeBoolean(true);
            dos.writeInt(27);
            dos.writeUTF("HR");

            // Employee 3
            dos.writeInt(103);
            dos.writeUTF("Amit");
            dos.writeDouble(38000.00);
            dos.writeBoolean(false);
            dos.writeInt(24);
            dos.writeUTF("Finance");

            System.out.println("Employee data saved successfully!");

        } catch (IOException e) {

            System.out.println("Writing Error: " + e.getMessage());
            return;
        }


        // ==========================================
        // PART B, C, D AND F: READ EMPLOYEE DATA
        // ==========================================

        System.out.println("\n========== EMPLOYEE DETAILS ==========");

        try (
                DataInputStream dis = new DataInputStream(
                        new BufferedInputStream(
                                new FileInputStream(file)
                        )
                )
        ) {

            int count = 1;

            while (true) {

                // Temporary variables for one complete record

                int id;
                String name;
                double salary;
                boolean active;
                int age;
                String department;

                try {

                    // Read employee information in writing order

                    id = dis.readInt();
                    name = dis.readUTF();
                    salary = dis.readDouble();
                    active = dis.readBoolean();
                    age = dis.readInt();
                    department = dis.readUTF();

                } catch (EOFException e) {

                    System.out.println(
                            "\nEnd of file reached successfully!"
                    );

                    break;
                }

                // Display only after complete record is read

                System.out.println("\nEmployee " + count);
                System.out.println("-------------------------");

                System.out.println("ID: " + id);
                System.out.println("Name: " + name);
                System.out.println("Salary: " + salary);
                System.out.println("Active: " + active);
                System.out.println("Age: " + age);
                System.out.println("Department: " + department);

                count++;
            }

        } catch (IOException e) {

            System.out.println("Reading Error: " + e.getMessage());
        }


        // ==========================================
        // PART E: FILE INFORMATION
        // ==========================================

        System.out.println("\n========== FILE INFORMATION ==========");

        System.out.println("File Name: " + file.getName());
        System.out.println("File Exists: " + file.exists());
        System.out.println("File Size: " + file.length() + " bytes");


        // ==========================================
        // PART E: THEORY QUESTIONS AND ANSWERS
        // ==========================================

        /*

        Q1. Why use writeInt() instead of converting
            employee ID into a String?

        Answer:
        writeInt() stores the employee ID as a four-byte
        integer in binary form. It avoids converting the
        number into text and allows us to retrieve it
        directly using readInt().


        Q2. Why must reading order match writing order?

        Answer:
        Data streams do not automatically store field names.
        Therefore, the reader must know the sequence and
        corresponding data types used by the writer.


        Q3. Why does employees.dat look unreadable in Notepad?

        Answer:
        Because it contains binary data rather than
        ordinary human-readable text.


        Q4. What is the purpose of writeUTF()?

        Answer:
        It writes a String using modified UTF-8 encoding
        with a two-byte length prefix. readUTF() uses
        that prefix to read the String.


        Q5. What happens when FileOutputStream is created
            without append mode?

        Answer:
        It overwrites the existing file contents.
        If the file does not exist, it creates a new file.


        Q6. What is the purpose of Age and Department
            in the Bonus Challenge?

        Answer:
        Age is stored using writeInt() and readInt().
        Department is stored using writeUTF() and readUTF().
        Both fields are added to every employee record.


        */


    }
}
