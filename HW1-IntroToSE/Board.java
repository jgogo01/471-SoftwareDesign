import java.util.ArrayList;
import java.util.List;

public class Board{
    private List<Square> square;

    Board(){
        square = new ArrayList<>();
        square.add(new Square("KMITL"));
        square.add(new Square("CU"));
        square.add(new Square("TU"));
        square.add(new Square("KU"));
        square.add(new Square("HWP"));
        square.add(new Square("THK"));
    }

    public Square getSquare(Square oldLoc, int fvTot) {
        return square.get((square.indexOf(oldLoc) + fvTot) % square.size());
    }
}
