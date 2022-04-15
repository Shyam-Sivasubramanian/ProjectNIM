package projectNIM;
import java.util.Random;

public class Game {
int x;
    public Game(){
        x=0;
    }
   

    public int goFirst(){
        Random r = new Random();
        int y = r.nextInt(2);
        return y;
    }

    
}
