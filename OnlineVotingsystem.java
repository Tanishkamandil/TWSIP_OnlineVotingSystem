import java.util.Scanner;


public class OnlineVotingsystem {
   public static void main(String[] args) {


         Scanner sc = new Scanner(System.in);

        
        int PartyA = 0;
        int PartyB = 0;
        int PartyC = 0;

        System.out.println("Welcome to the Online Voting System");
        System.out.print("Please Enter Your Name:- ");
        String userName = sc.nextLine();

        
        System.out.print("Please Enter Your Age:-");
        int userAge = sc.nextInt();

        
        if (userAge >= 18) {
          
            System.out.println("Please select a Party to vote for:");
            System.out.println();

            System.out.println("1. Party A ");
            System.out.println("2. Party B ");
            System.out.println("3. Party C ");
            System.out.println("Enter the number corresponding to your choice... ");


            
            int userSelection = sc.nextInt();
            
            
            if (userSelection == 1) {
               PartyA++;
            } else if (userSelection == 2) {
                PartyB++;
            }
            else if(userSelection == 3){
                PartyC++;
            }

            
            System.out.println("Thank you for voting, " + userName + "!");
        } else {
           
            System.out.println("I'm sorry, you are not eligible to vote.");
        }

        System.out.println("Voting finished.");
        System.out.println();

        System.out.println("Results:");
        System.out.println();

        
        System.out.println("Party A : " + PartyA + " votes");
        System.out.println("Party B : " + PartyB + " votes");
        System.out.println("Party C: "  + PartyC + " votes");
       

        if (PartyA > PartyB && PartyA > PartyC) {
            System.out.println("Party A wins!");
        } else if (PartyB > PartyA && PartyB > PartyC) {
            System.out.println("Party B wins!");
        } else if (PartyC > PartyA && PartyC> PartyB) {
            System.out.println("Party C wins!");
        } else {
            System.out.println("It's a tie!");
        }

        sc.close();
    }
}


        
       

