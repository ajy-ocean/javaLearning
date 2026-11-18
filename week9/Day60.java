
import java.io.*;

public class Day60 {

    public static void main(String[] args) {

        File file = new File("C:\\Users\\arj69\\Music\\numbers.txt");
        File copyFile = new File("C:\\Users\\arj69\\Music\\numbers_copy.txt");

        // Part A: Write text using BufferedOutputStream
        String message = "Java Buffered Streams\n"
                + "Learning File Handling\n"
                + "Day 60 Practice\n";

        try (BufferedOutputStream bos =
                     new BufferedOutputStream(new FileOutputStream(file))) {

            byte[] data = message.getBytes();
            bos.write(data);

            System.out.println("Part A: Data written successfully.");

        } catch (IOException e) {
            e.printStackTrace();
        }


        // Part B: Read using BufferedInputStream
        System.out.println("\nPart B: Reading file:");

        try (BufferedInputStream bis =
                     new BufferedInputStream(new FileInputStream(file))) {

            int data;

            while ((data = bis.read()) != -1) {
                System.out.print((char) data);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }


        // Part C: Append text and flush
        String appendMessage = "Buffered Output Is Efficient\n";

        try (BufferedOutputStream bos =
                     new BufferedOutputStream(
                             new FileOutputStream(file, true))) {

            byte[] data = appendMessage.getBytes();
            bos.write(data);

            bos.flush();

            System.out.println("\nPart C: Data flushed successfully.");

        } catch (IOException e) {
            e.printStackTrace();
        }


        // Part D: Copy file using buffered streams
        try (
                BufferedInputStream bis =
                        new BufferedInputStream(new FileInputStream(file));

                BufferedOutputStream bos =
                        new BufferedOutputStream(new FileOutputStream(copyFile))
        ) {

            byte[] buffer = new byte[1024];
            int bytesRead;

            while ((bytesRead = bis.read(buffer)) != -1) {

                bos.write(buffer, 0, bytesRead);
            }

            bos.flush();

            System.out.println("Part D: File copied successfully.");

        } catch (IOException e) {
            e.printStackTrace();
        }


        // Part E: Read copied file using byte array of size 5
        System.out.println("\nPart E: Verifying copied file:");

        try (BufferedInputStream bis =
                     new BufferedInputStream(new FileInputStream(copyFile))) {

            byte[] buffer = new byte[5];
            int bytesRead;

            while ((bytesRead = bis.read(buffer)) != -1) {

                System.out.print(
                        new String(buffer, 0, bytesRead)
                );
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("\n\nDay 60 Practical Completed!");
    }
}

/*
1. Why is BufferedInputStream more efficient than FileInputStream for many small reads?

BufferedInputStream stores data in an internal buffer. It reduces frequent access to the underlying file, making reading more efficient.

2. What happens if we forget to call flush() but correctly close BufferedOutputStream?

When close() is called, BufferedOutputStream automatically flushes pending data before closing the stream.

3. Can we use BufferedInputStream to read a PDF file? Explain.

Yes. PDF files contain binary data. BufferedInputStream reads bytes, so it can read PDF files. We should not convert the entire PDF content into characters because that can corrupt the data.

4. What is the difference between flush() and close()?

flush() sends pending buffered data to the underlying output stream but keeps the stream open.

close() flushes pending data and closes the stream.

5. Why do we wrap FileOutputStream inside BufferedOutputStream instead of replacing it entirely?

FileOutputStream performs the actual writing to the file. BufferedOutputStream improves efficiency by temporarily storing data in memory before sending it to FileOutputStream.
 */