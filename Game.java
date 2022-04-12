package projectNIM;
import java.util.Random;

public class Game {

    public Game(){

    }
   

    public String goFirst(){
        Random r = new Random();
        int y = r.nextInt(2);
        if (y == 1){
            return "Player 1 goes first";
        }
        else if (y==0){
            return "Player 2 goes first";
        }
        return "non";
            


    }
}
    

