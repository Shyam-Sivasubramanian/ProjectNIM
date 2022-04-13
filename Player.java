package projectNIM;

public class Player {
    int pile; 
    String name;
    int Score; 

    public Player(int Pile, String Name, int score){
        pile = Pile;
        name = Name;
        Score = score;
    }
    public int getPile(){
        return pile;
    }
    
    public String getName(){
        return name;
    }
    public int getScore(){
        return Score;
    }

    public void setScore(int scoir){
        Score = scoir;
    }
    public void setPile(int ply){
        pile = ply;
    }


    
}
