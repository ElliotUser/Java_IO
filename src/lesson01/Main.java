package lesson01;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        String path = File.separator+"Users"+File.separator+"user"+File.separator+"Work"+File.separator+"вконтакте.txt";
        File file = new File(path);

        System.out.println("File name: "+file.getName() + "\n" );
        System.out.println("Absolutely path: "+ file.getAbsolutePath()+"\n");

        System.out.println("Parent directory: "+file.getParent());
        System.out.println("File length " + file.length()+" bytes \n");

        System.out.println("File "+(file.exists() ? "exists" : "does not exist"));
        System.out.println("File "+(file.canWrite() ? "writable" : "does not write"));

        System.out.println("File "+(file.isDirectory() ? "is directory" : "is not directory"));
        System.out.println("File "+(file.isFile() ? "is regular" : "isn't regular"));

        System.out.println("File "+(file.isHidden() ? "file is hidden" : "file isn't hidden"));



    }
}
