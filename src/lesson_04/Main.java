package lesson_04;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String text = "Hello Java";
        byte[] bytes = text.getBytes();

        try (FileOutputStream stream = new FileOutputStream("src"+File.separator+"lesson_04"+File.separator+"file.txt")){
            for(byte eachByte : bytes) {
                stream.write(eachByte);
            }
        }catch(IOException e){
            System.out.println("Input/Output error");
        }
    }
}
