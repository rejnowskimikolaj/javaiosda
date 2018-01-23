import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Zad1 {

    private static List<String> notes = Arrays.asList("do;re;mi;fa;sol;la;si;do".split(";"));

    public static void main(String[] args) {

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        String filePath = "src/resources/";

        System.out.println("podaj nazwę pliku: ");

        filePath+= scanner.nextLine();
        System.out.println("podaj ilość linii:");
        int numberOfLines = scanner.nextInt();
        try {


            FileWriter fileWriter = new FileWriter(filePath);

            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for(int i=0;i<numberOfLines;i++){
                int element = random.nextInt(notes.size());
                bufferedWriter.write(notes.get(element));
                bufferedWriter.newLine();
            }

            bufferedWriter.close();
        }

        catch(IOException ex) {

            System.out.println( "Error writing to file '"+ filePath + "'");

        }

    }

}
