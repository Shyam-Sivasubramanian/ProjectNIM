package projectNIM;

public class Player {
    int pile; 
    String name;
    int Score; 

    public Player(){
        pile = 0;
        name = "";
        Score = 0;
    }

    public Player(int Pile, String Name, int score){
        pile = Pile;
        name = Name;
        Score = score;
    }

    
}
