package Sem1.HW;

public class Main {
    public static void main(String[] args) {
        boolean flag = true;
//        Print.StartPrint();
        while (flag) {
            Print.ChoicePrint();
            String ch = Input.InputChoice();
            if (!ch.isEmpty()) {
                switch (ch) {
                    case ("1"):
                        Write.WriteToFile();
                        break;
                    case ("2"):
                        Print.PrintAllNotes();
                        break;
                    case ("3"):
                        flag = false;
                        System.out.println("Program completed.");
                        break;
                    default:
                        System.out.println("Something went wrong, try again.");
                        break;
                }
            }
        }

    }
}
