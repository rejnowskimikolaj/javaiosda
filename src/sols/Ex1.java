package sols;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class Ex1 {

    private static List<String> loremLines = Arrays.asList("do;re;mi;fa;so;la;si;do".split(";"));

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Podaj nazwę pliku: ");
        String filePath = scanner.nextLine();
        System.out.println("Podaj ilość linii:");
        int number = scanner.nextInt();
        System.out.println(number);

        List<String> lines = new LinkedList<>();
        for(int i=0;i<number;i++){
            lines.add(loremLines.get(random.nextInt(loremLines.size())));
        }

        save(filePath,lines);
    }

    public static void save(String filePath,List<String> lines){
        try {
            FileWriter fileWriter = new FileWriter(filePath);

            BufferedWriter bufferedWriter =
                    new BufferedWriter(fileWriter);

            for(String line:lines){
                bufferedWriter.write(line+"\n");
            }

            bufferedWriter.close();
        }
        catch(IOException ex) {
            System.out.println( "Error writing to file '"+ filePath + "'");
        }
    }
}
