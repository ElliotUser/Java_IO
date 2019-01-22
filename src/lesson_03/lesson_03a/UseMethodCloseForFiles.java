package lesson_03.lesson_03a;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class UseMethodCloseForFiles {
    public static void main(String[] args) {
        String text = "Явное использование метода close()";
        byte[] buffer = text.getBytes();

        FileOutputStream stream = null;

        try {
            stream = new FileOutputStream("src"+File.separator+"lesson_03"+File.separator+"lesson_03a"+File.separator+"file.txt");

            for(byte eachBufferElement : buffer) {
                stream.write(eachBufferElement);
            }
        }catch(IOException e){
            System.out.println("Input/Output error");
        }finally {
            try {
                if(stream != null)
                    stream.close();
            }catch(IOException e) {
                System.out.println("Error of closing file.txt");
            }
        }
    }
}
