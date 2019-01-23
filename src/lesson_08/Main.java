package lesson_08;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String path = "src"+ File.separator+"interesting_resources";
        try (FileReader reader = new FileReader(path)){
            int symbol;

            while((symbol = reader.read()) != -1){
                System.out.print((char)symbol);
            }
        }catch(IOException e){
            System.out.println("Input error");
        }
    }
}
