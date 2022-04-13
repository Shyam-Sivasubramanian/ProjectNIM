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
        System.out.println(TEXT_PURPLE  + "Enter the number of sticks you want in both piles" + TEXT_RESET);
        int piles = sc.nextInt();
        int score = 0; // default scores

        // making the player objs
        Player p1 = new Player(piles, name, score);
        Player p2 = new Player(piles, name2, score);
        System.out.println(p1.getName() + " and " + p2.getName() + ", welcome to Nim!");
        System.out.println("\n \n \n ---------------------------------------");
        Game g = new Game(); // making a game obj
        int flip = g.goFirst(); // determining who goes first
        if (flip == 1){
            System.out.println(TEXT_RED + "Player 2 goes first" + TEXT_RESET);  
        } else {
            System.out.println(TEXT_GREEN + "Player 1 goes first" + TEXT_RESET);
        }








    }
    

}
