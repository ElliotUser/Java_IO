package lesson_02;

import java.io.File;

//Каталоги(папки)
public class Main {
    public static void main(String[] args) {
        String path = "src"+File.separator+ "lesson_02"+File.separator+"backup";
        File directory = new File(path);

        if(directory.isDirectory()){
            String[] content = directory.list();

            if(content != null){
                for(String eachFile : content) {
                    File file = new File(path+File.separator+eachFile);
                    System.out.println(file.isDirectory() ? (eachFile + " is directory") : (eachFile + " isn't directory"));
                }
            }
        }

//        if(!directory.exists()){
//            System.out.println(directory.mkdir() ? "Successfully" : "Failed");
//        }else {
//            System.out.println("Already exists");
//        }
    }
}
