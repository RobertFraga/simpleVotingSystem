import java.util.Scanner;

public class board {
    public static void mainboard() {
        Scanner input = new Scanner(System.in);


        System.out.print("\033[H\033[2J");
        System.out.flush();

        // the main dashboard of the system
        System.out.println("\n=*=*=*=*=*=*=*=*=*=*=*= Welcome to Main Board =*=*=*=*=*=*=*=*=*=*=*=\n");

        System.out.println("1. Vote");
        System.out.println("2. Leading Candidate");
        System.out.println("3. Exit");

        System.out.print("Choose a number to navigate: ");
        String number = input.nextLine();

        switch (number){
            case "1":
                vote.votingsection();
            break;

            case "2":
                vote.leadingcandidate();
            break;

            case "3":
                System.exit(0);
            break;

            default:
                board.mainboard();

        }
    }
}
