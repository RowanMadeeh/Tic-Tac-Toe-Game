package managment;
import java.util.*;
public class Move {
    private Board Board;
    private Set<Integer> places = new HashSet<Integer>();

    // Constructor to set board for move class
    public Move(Board Board){
        this.Board=Board;
    }

    // checks player's choice and then updates Board with player's choice
    public managment.Board do_move(Player player){
        int choice =player.get_move();
        // checks if place is already taken
        if(places.contains(choice)){
            while(places.contains(choice)){
                System.out.println("Place is already taken please choose a new one.");
                choice =player.get_move();
            }
        }
        places.add(choice);
        int cnt=1;
        for(int i=0;i<Board.get_size();i++){
            for (int j = 0; j <Board.get_size() ; j++) {
                if(choice==cnt){
                    Board.update(i,j, player.get_symbol());
                    i=Board.get_size();
                    j=Board.get_size();
                }else{
                    cnt++;
                }
            }
        }
        return Board;
    }
}
