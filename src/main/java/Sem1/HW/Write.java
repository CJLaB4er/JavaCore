package Sem1.HW;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;

public class Write {
    static void WriteToFile(){
        try (FileWriter fileWriter = new FileWriter(".\\src\\main\\java\\Sem1\\HW\\notes.txt", true)){
            Date date = new Date();
            fileWriter.write(date + ": " + Input.InputNote() + "\n");
            System.out.println("Note added.");
        } catch (IOException e) {
            System.out.println("Something went wrong!");
        }
    }
}
