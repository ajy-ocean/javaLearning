
import java.io.*;

public class Day59 {

    public static void main(String[] args) {

        File file = new File("C:\\Users\\arj69\\Music\\numbers.txt");
        File copyFile = new File("C:\\Users\\arj69\\Music\\numbers_copy.txt");

        // Part A: Write numbers into numbers.txt
        byte[] numbers = {10, 20, 30, 40, 50};
        try (FileOutputStream fos = new FileOutputStream(file)) {
            fos.write(numbers);
            System.out.println("Part A: Numbers written successfully.");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // Part B: Read numbers.txt
        try (FileInputStream fis = new FileInputStream(file)) {
            int data;
            System.out.print("Part B: Numbers from numbers.txt: ");
            while ((data = fis.read()) != -1) {
                System.out.print(data + " ");
            }
            System.out.println();
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // Part C: Copy numbers.txt into numbers_copy.txt
        try (FileInputStream input = new FileInputStream(file);
             FileOutputStream output = new FileOutputStream(copyFile)) {
            byte[] buffer = new byte[1024];
            int bytesRead;
            while ((bytesRead = input.read(buffer)) != -1) {
                output.write(buffer, 0, bytesRead);
            }
            System.out.println("Part C: File copied successfully.");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // Part D: Read and verify numbers_copy.txt
        try (FileInputStream fis = new FileInputStream(copyFile)) {
            int data;
            System.out.print("Part D: Numbers from numbers_copy.txt: ");
            while ((data = fis.read()) != -1) {
                System.out.print(data + " ");
            }
            System.out.println();
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
