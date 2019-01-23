package lesson_05;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        try (FileInputStream stream = new FileInputStream("src"+File.separator+"lesson_04"+File.separator+"file.txt")){

            int symbol;

            while((symbol = stream.read()) != -1){
                System.out.print((char) symbol);
            }
        }catch(IOException e){
            System.out.println("Input error");
        }
    }
}
