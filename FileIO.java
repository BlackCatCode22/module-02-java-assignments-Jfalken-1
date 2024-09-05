// JF
// 9/5/2024
// FileIO

import java.io.*;

public class FileIO {
    public static void main(String[] args) {

        String[] names = {"Jim", "Jimmy", "Jimbo"};
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));

            writer.write("\nWriting to a file");
            writer.write("\nAnother line.");
            writer.write("\nOne more line");


            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try {
            BufferedReader reader = new BufferedReader(new FileReader("output.txt"));
            String line;
            while ((line = reader.readLine()) != null)
                System.out.println(reader.readLine());
            reader.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}