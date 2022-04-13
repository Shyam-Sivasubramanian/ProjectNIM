package projectNIM;
import java.util.Random;

public class Game {

    public Game(){

    }
   

    public int goFirst(){
        Random r = new Random();
        int y = r.nextInt(2);
        return y;
    }
}
