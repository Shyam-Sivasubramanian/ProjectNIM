package projectNIM;


import java.util.Scanner;

public class  GameRunner {
    // different colors for better readability 
    public static final String TEXT_RESET = "\u001B[0m";
    public static final String TEXT_GREEN = "\u001B[32m";
    public static final String TEXT_RED = "\u001B[31m";
    public static final String TEXT_PURPLE = "\u001B[35m";
    public static void main(String args[]){
        // intro
        System.out.println("Nim is played starting with piles or rows of objects. \nPlayers take turns taking any number of objects from one of the piles.\n" + TEXT_RED +  "Whoever takes the last of the objects wins! \n" + TEXT_RESET + " However, one is only allowed to take at most one half of the pile on a single turn!\n" + TEXT_PURPLE+  "GLHF!" + TEXT_RESET);
        Scanner sc = new Scanner(System.in); // scanner

        //inputs
        System.out.println(TEXT_RED + "P1 : Enter your name" + TEXT_RESET);
        String name = sc.nextLine();
        System.out.println(TEXT_GREEN  + "P2 : Enter your name " + TEXT_RESET);
        String name2 = sc.nextLine();
        int score = 0; // default scores


        Board b = new Board(); // board object
        // making the player objs
        Player p1 = new Player(b.populate(), name, score);
        Player p2 = new Player(b.populate(), name2, score);
        Game g = new Game(); // making a game obj

        int pile1 = p1.getPile();
        int pile2 = p2.getPile();
        
        System.out.println(p1.getName() + " and " + p2.getName() + ", welcome to Nim!");
        System.out.println("\n \n \n ---------------------------------------");
        System.out.println("Pile A: " +  pile1  + " Pile B " + pile2);


        int flip = g.goFirst(); // determining who goes first
        if (flip == 1){
            System.out.println(TEXT_RED + "Player 2 goes first" + TEXT_RESET);  
        } else {
            System.out.println(TEXT_GREEN + "Player 1 goes first" + TEXT_RESET);
        }
        int rot = 0;
        boolean play = true;
        while (play){
            int half1 = pile1 /2;
            int half2 = pile2 /2;

            System.out.println("Enter the pile you wish to take from");
            String pileChoice = sc.nextLine();
            pileChoice = pileChoice.toLowerCase();
            if(pileChoice.equals("a")){
                rot++;
                System.out.println("Choose a quantity between 0 and " + half1  + "  inclusive to take from the pile");
                int pileDrive = sc.nextInt();
                if(pileDrive > half1){
                    System.out.println("CHEATER DETECTED - YOU LOSE A TURN!");
                    continue;
                } else if( pileDrive < 0){
                    System.out.println("CHEATER DETECTED - YOU LOSE A TURN!");
                    continue;
                }
                pile1 -= pileDrive;
                pile2+= pileDrive;
                
                
            }
            else if(pileChoice.equals("b")){
                rot++;
                System.out.println("Choose a quantity between 0 and " + half2  + "to take from the pile");
                int pd2 = sc.nextInt();
                if (pd2 > half2){
                    System.out.println("CHEATER DETECTED - YOU LOSE A TURN!");
                    continue;
                } else if( pd2 < 0){
                    System.out.println("you are actually dumb");
                    continue;
                }
                pile2 -= pd2;
                pile1 += pd2;
            }
        }






        sc.close();
    }
    

}
