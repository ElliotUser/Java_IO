package lesson_07;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String path = "src"+File.separator+"lesson_07";

        String text = "Hello World";
        char[] chars = new char[text.length()];
        text.getChars(0,chars.length, chars, 0);

        try (FileWriter writer = new FileWriter(path+File.separator+"file.txt")){
            for(char eachChar : chars) {
             writer.write(eachChar);
            }
        }catch(IOException e){
            System.out.println("Output error");
        }
    }
}
