import java.util.LinkedList;
import java.util.List;

public class MGame{
    private int N;
    private int roundCount = 0;
    private List<Die> dice;
    private Board board;
    private List<Player> players;

    MGame(int N, String[] name){
        this.N = N;
        this.board = new Board();
        this.dice = new LinkedList<>();
        this.players = new LinkedList<>();

        //Hard Code For 2 Die in MGame
        dice.add(new Die());
        dice.add(new Die());

        for(int i = 0; i < name.length; i++){
            Player player = new Player(name[i], dice, board);
            this.players.add(player);
        }
    }

    public void playGame(){
        while(roundCount < N){
            roundCount++;
            playRound();
        }
    }

    public void playRound(){
        for(int i = 0; i < players.size(); i++){
            players.get(i).takeTurn();
            players.get(i).printName();
            players.get(i).printNameLocation();
            players.get(i).printDice();
        }
    }
}
