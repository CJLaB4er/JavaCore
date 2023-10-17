package Sem1.HW;

import java.util.Scanner;

public class Input {
    static String InputNote() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nAdd a note.");
        if (scanner.hasNext()) {
            return scanner.nextLine();
        }
        return null;
    }
    static String InputChoice(){
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNext()){
            return scanner.nextLine();
        }
        System.out.println("The line was empty.");
        return null;
    }

}
