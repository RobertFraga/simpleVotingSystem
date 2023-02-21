import java.util.Scanner;

public class vote {

    static int Robert = 0;
    static int William = 0;
    static int Fraga = 0;
    static int Almaden = 0;
    static int Tabacon = 0;

    public static void votingsection() {
        Scanner input = new Scanner(System.in);

        System.out.print("\033[H\033[2J");
        System.out.flush();

        System.out.println("\n=*=*=*=*=*=*=*=*=*=*=*= Voting Section =*=*=*=*=*=*=*=*=*=*=*=\n");

        System.out.println("1.Robert");
        System.out.println("2.William");
        System.out.println("3.Fraga");
        System.out.println("4.Almaden");
        System.out.println("5.Tabacon\n");

        System.out.print("Choose a number to Vote: ");
        String pick = input.nextLine();

        switch (pick){
            case "1":
                Robert++;
                vote.Respond();
                break;

            case "2":
                William++;
                vote.Respond();
                break;

            case "3":
                Fraga++;
                vote.Respond();
                break;

            case "4":
                Almaden++;
                vote.Respond();
                break;

            case "5":
                Tabacon++;
                vote.Respond();
                break;

            default:
                vote.votingsection();
        }

    }


    public static void leadingcandidate() {
        Scanner input = new Scanner(System.in);

        System.out.print("\033[H\033[2J");
        System.out.flush();

        System.out.println("\n=*=*=*=*=*=*=*=*=*=*=*= Leading Candidate =*=*=*=*=*=*=*=*=*=*=*=\n");


        System.out.println("1.Robert  = " + Robert );
        System.out.println("2.William = " + William);
        System.out.println("3.Fraga   = " + Fraga);
        System.out.println("4.Almaden = " + Almaden);
        System.out.println("5.Tabacon = " + Tabacon);

        System.out.print("Enter '0' to exit: ");
        String exit = input.nextLine();

        switch (exit){
            case "0":
                board.mainboard();
                break;

            default:
                vote.leadingcandidate();

        }
    }


    public static void Respond() {
        Scanner input = new Scanner(System.in);

        System.out.print("\033[H\033[2J");
        System.out.flush();

        System.out.println("\n=*=*=*=*=*=*=*=* Your respond is accepted =*=*=*=*=*=*=*=*=\n");


        System.out.println("1.Robert  = " + Robert );
        System.out.println("2.William = " + William);
        System.out.println("3.Fraga   = " + Fraga);
        System.out.println("4.Almaden = " + Almaden);
        System.out.println("5.Tabacon = " + Tabacon);

        System.out.print("Enter '0' to exit: ");
        String exit = input.nextLine();

        switch (exit){
            case "0":
                front.main(null);
                break;

            default:
                vote.leadingcandidate();

        }
    }

}
