import java.io.File;
import java.io.IOException;

public class Day57 {
    public static void main(String[] args) {

        File file = new File("C:\\Users\\arj69\\Music\\employee.txt");
        System.out.println("Exists: " + file.exists());

        try {
            if (!file.exists()) {
                boolean created = file.createNewFile();
                System.out.println("File created: " + created);
            } else {
                System.out.println("File already exists");
            }
        } catch (IOException e) {
            System.out.println("An error occurred while creating the file.");
            e.printStackTrace();
        }

        System.out.println("Name: " + file.getName());
        System.out.println("Path: " + file.getAbsolutePath());
        System.out.println("Exists: " + file.exists());
        System.out.println("Is File: " + file.isFile());
        System.out.println("Length: " + file.length());
        System.out.println("Can Read: " + file.canRead());
        System.out.println("Can Write: " + file.canWrite());

        File companyDir = new File("C:\\Users\\arj69\\Music\\Company");
        boolean isCompanyCreated = companyDir.mkdir();
        System.out.println("Company directory created: " + isCompanyCreated);

        File nestedDir = new File("C:\\Users\\arj69\\Music\\Company\\HR\\Employees");
        boolean isNestedCreated = nestedDir.mkdirs();
        System.out.println("Nested directories created: " + isNestedCreated);

        File tempFile = new File("C:\\Users\\arj69\\Music\\temp.txt");

        try {
            if (tempFile.createNewFile()) {
                System.out.println("Temporary file created");
            } else {
                System.out.println("Temporary file already exists");
            }
            System.out.println("Before deletion: " + tempFile.exists());

            if (tempFile.delete()) {
                System.out.println("File deleted successfully");
            } else {
                System.out.println("Unable to delete file");
            }
            System.out.println("After deletion: " + tempFile.exists());

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}

/*
What is the difference between a File object and an actual physical file?
-> A File object is an abstract representation of a file path in Java memory, whereas a physical file is the actual data stored on the disk.

Why does createNewFile() require exception handling?
-> It throws a checked IOException to handle system-level errors like invalid paths, lack of write permissions, or disk I/O failures.

What is the difference between mkdir() and mkdirs()?
-> mkdir() creates only a single directory and fails if parent directories are missing, whereas mkdirs() creates the target directory along with any missing parent directories.

What does length() return, and in which unit?
-> It returns the size of the file as a long value in bytes (or 0L if it does not exist).

What happens if we call delete() on a file that doesn't exist?
-> It safely returns false without throwing any exception.

Does the File class read and write file contents? Explain.
-> No. The File class only manages metadata and directory structure (paths, creation, deletion); classes like FileReader, FileWriter, or Scanner are required to read or write content.
*/
