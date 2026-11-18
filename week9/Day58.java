
import java.io.*;

public class Day58 {

    public static void main(String[] args) {

        // File path
        File file = new File("C:\\Users\\arj69\\Music\\employee.txt");

        // 1. Writing employee details
        System.out.println("1. WRITING EMPLOYEE DETAILS");
        System.out.println("------------------------------");

        try (FileWriter writer = new FileWriter(file)) {
            writer.write("Employee ID: 101");
            writer.write("\n");
            writer.write("Employee Name: Rahul");
            writer.write("\n");
            writer.write("Department: IT");
            writer.write("\n");
            writer.write("Salary: 45000");
            writer.write("\n");

            System.out.println("Employee details written successfully.");

        } catch (IOException e) {
            System.out.println("Error: Unable to write employee details to the file.");
            System.out.println("Reason: " + e.getMessage());
        }

        System.out.println("==============");

        // 2. Appending employee details
        System.out.println("2. APPENDING EMPLOYEE DETAILS");
        System.out.println("------------------------------");

        try (FileWriter writer = new FileWriter(file, true)) {
            writer.write("Employee ID: 102");
            writer.write("\n");
            writer.write("Employee Name: Priya");
            writer.write("\n");
            writer.write("Department: HR");
            writer.write("\n");
            writer.write("Salary: 50000");
            writer.write("\n");

            System.out.println("Additional employee details appended successfully.");

        } catch (IOException e) {
            System.out.println("Error: Unable to append employee details to the file.");
            System.out.println("Reason: " + e.getMessage());
        }

        System.out.println("==============");

        // 3. Reading file using FileReader
        System.out.println("3. READING FILE USING FILEREADER");
        System.out.println("------------------------------");

        try (FileReader reader = new FileReader(file)) {
            int data;

            while ((data = reader.read()) != -1) {
                System.out.print((char) data);
            }

        } catch (IOException e) {
            System.out.println("Error: Unable to read employee details using FileReader.");
            System.out.println("Reason: " + e.getMessage());
        }

        System.out.println();
        System.out.println("==============");

        // 4. Reading file using BufferedReader
        System.out.println("4. READING FILE USING BUFFEREDREADER");
        System.out.println("------------------------------");

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {

            String line;

            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }

        } catch (IOException e) {
            System.out.println("Error: Unable to read employee details using BufferedReader.");
            System.out.println("Reason: " + e.getMessage());
        }

        System.out.println("==============");

        // 5. Writing department details using BufferedWriter
        System.out.println("5. WRITING DEPARTMENT DETAILS USING BUFFEREDWRITER");
        System.out.println("------------------------------");

        File departmentFile = new File("C:\\Users\\arj69\\Music\\department.txt");

        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(departmentFile))) {

            bufferedWriter.write("Department Details");
            bufferedWriter.newLine();

            bufferedWriter.write("------------------");
            bufferedWriter.newLine();

            bufferedWriter.write("Department: Development");
            bufferedWriter.newLine();

            bufferedWriter.write("Manager: Amit");
            bufferedWriter.newLine();

            bufferedWriter.write("Employees: 25");
            bufferedWriter.newLine();

            bufferedWriter.write("Location: Mumbai");
            bufferedWriter.newLine();

            System.out.println("Department details written successfully.");

        } catch (IOException e) {
            System.out.println("Error: Unable to write department details to the file.");
            System.out.println("Reason: " + e.getMessage());
        }

        System.out.println("==============");
        System.out.println("PROGRAM EXECUTED SUCCESSFULLY");
    }
}

/*
What is the difference between FileReader and BufferedReader?
-> First of all, BufferedReader is an efficient way to read a file.
It uses a buffer that improves performance. Both FileReader and
BufferedReader are used to read files, but BufferedReader is
preferred when reading large files because of buffering and
performance. FileReader reads character by character, whereas
BufferedReader provides readLine() to read an entire line.

What is the difference between FileWriter and BufferedWriter?
-> Similar to reading, BufferedWriter improves writing performance
by using a buffer. FileWriter writes characters directly, whereas
BufferedWriter provides convenient methods like newLine().

Why does FileReader.read() return an int instead of a char?
-> Because we need an indication that we have reached EOF
(End Of File). The value -1 is used for this purpose.
Since char cannot represent -1, read() returns an int.
We convert it to char while printing.

What is the difference between read() and readLine()?
-> read() reads one character at a time.
readLine() reads an entire line as a String.

Why is try-with-resources preferred over manually calling close()?
-> We don't have to worry about closing the resource because
it happens automatically. The resource must implement
AutoCloseable (or Closeable).
*/
