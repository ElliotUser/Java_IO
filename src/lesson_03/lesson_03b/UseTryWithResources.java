package lesson_03.lesson_03b;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class UseTryWithResources {
    public static void main(String[] args) {
        String text = "Использование метода try/catch с ресурсами";
        byte[] buffer = text.getBytes();

        try (FileOutputStream stream = new FileOutputStream("src"+File.separator+"lesson_03"+File.separator+"lesson_03b"+File.separator+"file.txt")){
            for(byte eachBufferElement : buffer) {
                stream.write(eachBufferElement);
            }
        }catch(IOException e){
            System.out.println("Input/Output error");
        }
    }
}
