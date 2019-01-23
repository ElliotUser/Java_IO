package lesson_06;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFile {
    public static void main(String[] args) {

        try (FileInputStream inputStream = new FileInputStream("src"+File.separator+"interesting_resources")) {
            File directory = new File("src"+File.separator+"lesson_06"+File.separator+"folder");
            if(!directory.exists()) directory.mkdir();

            try (FileOutputStream outputStream = new FileOutputStream("src"+File.separator+"lesson_06"+File.separator+"folder"+File.separator+"file_06.txt")){
                byte[] bytes = new byte[inputStream.available()];
                int length;

                while((length = inputStream.read(bytes)) != -1){
                    outputStream.write(bytes, 0, length);
                }
            }catch(IOException e){
                System.out.println("Output error");
            }
        }catch(IOException e){
            System.out.println("Input error");
        }
    }
}
