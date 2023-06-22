package managment;


import java.util.HashSet;
import java.util.Set;

public class Game {
    private Board Board;
    private Player player1;
    private Player player2;
    private Move move;
    private int turn=0;
    protected Set<Integer> places = new HashSet<Integer>();

    // Constructor initializes the game with a board and players
    public Game(Board Board,Player player1,Player player2){
        this.Board=Board;
        this.player1=player1;
        this.player2=player2;
        move = new Move(Board);
        play_game();
    }

    // It runs the game and switches turns, until one wins or draw
    public void play_game(){
        while(true){
            Board.display();
            if(turn%2==0){
                move.do_move(player1);
            }else{
                move.do_move(player2);
            }
            turn++;
            if(turn==(Board.get_size()*Board.get_size()) && Board.is_draw(player1,player2)){
                Board.display();
                System.out.println();
                System.out.println("Draw");
                break;
            }else if(Board.is_winner(player1.get_symbol())){
                Board.display();
                System.out.println();
                System.out.println(player1.get_name()+ " is the winner.");
                break;
            }else if(Board.is_winner(player2.get_symbol())){
                Board.display();
                System.out.println();
                System.out.println(player2.get_name()+ " is the winner.");
                break;
            }


        }
    }
}
