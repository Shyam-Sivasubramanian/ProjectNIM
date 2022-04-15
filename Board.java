package projectNIM;
import java.util.Random;

public class Board{
int yo;
    public Board(){
        yo = 0;
    }

    public int populate(){
        Random r = new Random();
        int numPile = r.nextInt(50);
        return numPile;
    }
}
