package Sem1.HW;


import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Print {
    /*Данный метод убран, так как не смог пока побороть проблему русской кодировки*/
//    static void StartPrint() {
//        System.out.println("Данное приложение способно добавлять заметки и выводить список заметок.");
//    }

    static void ChoicePrint() {
        System.out.println("select one of the actions:");
        System.out.println(
                        "1 - Add a note.\n" +
                        "2 - List notes.\n" +
                        "3 - Close the program."
        );
    }

    static void PrintAllNotes() {
        try (FileReader fileReader = new FileReader(".\\src\\main\\java\\Sem1\\HW\\notes.txt")) {
            int c;
            while ((c = fileReader.read()) != -1){
                System.out.print((char)c);
            }
        } catch (IOException e) {
            System.out.println("Failed to open file.");
        }
        ;
    }
}
