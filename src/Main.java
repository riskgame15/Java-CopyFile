import java.io.*;

public class FileCopy {
    public static void main(String[] args) {
        String inputFilePath = "files/text.txt";
        String outputFilePath = "files/text-copy.txt";
        copyFile(inputFilePath, outputFilePath);
    }

    public static void copyFile(String inputFilePath, String outputFilePath) {
        try (
                FileReader fileReader = new FileReader(inputFilePath);
                BufferedReader bufferedReader = new BufferedReader(fileReader);
                FileWriter fileWriter = new FileWriter(outputFilePath);
                BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)
        ) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                bufferedWriter.write(line);
                bufferedWriter.newLine();
            }

        } catch (Exception e) {
            System.out.println("File not found OR content error");
        }
    }
}