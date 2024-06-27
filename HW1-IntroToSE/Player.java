import java.util.List;

public class Player{
    private String name;
    private List<Die> dice;
    private Board board;
    private Piece piece;

    private int fvTot;
    private Square oldLoc;
    private Square newLoc;

    Player(String name, List<Die> dice, Board board){
        this.name = name;
        this.dice = dice;
        this.board = board;
        this.piece = new Piece();
    }

    public void printName(){
        System.out.println(this.name);
    }

    public void printNameLocation(){
        System.out.println(piece.getLocation().getName());
    }

    public void printDice(){
        for(int i = 0; i < dice.size(); i++){
            System.out.println(dice.get(i).getFaceValue());
        }
    }

    public void takeTurn(){
        for(int i = 0; i < dice.size(); i++){
            int fv;
            dice.get(i).roll();
            fv = dice.get(i).getFaceValue();
            fvTot += fv;
        }

        oldLoc = piece.getLocation();
        newLoc = board.getSquare(oldLoc, fvTot);
        piece.setLocation(newLoc);
    };
}
