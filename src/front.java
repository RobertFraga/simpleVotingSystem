import java.util.Scanner;

public class front {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("\033[H\033[2J");
        System.out.flush();

        System.out.println("\n=*=*=*=*=*=*=*=*=*=*=*= Simple Voting System =*=*=*=*=*=*=*=*=*=*=*=\n");


        System.out.print("Enter Voters Name: ");//ask user the name
        String Name = input.nextLine();
        System.out.print("Enter your Age: ");//ask user the user age
        int Age = input.nextInt();

        do{
            if(Age >= 18){
                board.mainboard();
            }

            else if(Age <= 17){
                System.out.print("\033[H\033[2J");
                System.out.flush();

                System.out.println("=*=*=*=*=*=*=*=*= You may enter wrong Age =*=*=*=*=*=*=*=*=*=");
                System.out.println("=*=*=*=*=*=*=*=*= Minor are not allow to Vote =*=*=*=*=*=*=*=*=*=\n");
                System.out.print("Try Again: ");
                Age = input.nextInt();
            }
        }while(Age <= 17);
        board.mainboard();
    }
}
