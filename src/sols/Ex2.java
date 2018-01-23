package sols;

import java.io.*;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Ex2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fileName = scanner.nextLine();
        List<String> lines = getLines(fileName);
        System.out.println(lines);
        Collections.reverse(lines);
        String[] splits = fileName.split(".");
        String newFileName = fileName.split("\\.")[0]+"_"+System.currentTimeMillis()+fileName.split("\\.")[1];
        save(newFileName,lines);


    }

    private static List<String> getLines(String filePath) {

        String line = null;
        List<String> lines = new LinkedList<>();
        try {
            FileReader reader = new FileReader(filePath);
            BufferedReader bufferedReader = new BufferedReader(reader);

            while((line = bufferedReader.readLine())!=null){

                lines.add(line);

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return lines;
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
