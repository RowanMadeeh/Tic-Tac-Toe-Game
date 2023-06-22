
import managment.Board;
import managment.Game;
import managment.Player;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // take first player info
        System.out.println("Please enter first player name:");
        Scanner input= new Scanner(System.in);
        String p1name =input.next();
        System.out.println("Please enter first player symbol:");
        String p1symbol =input.next();
        Player player1=new Player(p1name,p1symbol);

        // take second player info
        System.out.println("Please enter second player name");
        String p2name =input.next();
        System.out.println("Please enter second player symbol:");
        String  p2symbol =input.next();
        // checks if the symbol is taken by other player
        while(p1symbol==p2symbol){
            System.out.println("Symbol is used please choose another one");
            p2symbol =input.next();
        }
        Player player2=new Player(p2name,p2symbol);

        // take board size and initialize the Board
        System.out.println("Please enter board size(size should be greater than or equal to 3):");
        int board_size =input.nextInt();
        while(board_size<3){
             System.out.println("Invalid size!! size should be greater than or equal to 3.");
             System.out.println("Please enter board size(size should be greater than or equal to 3):");
             board_size =input.nextInt();
        }
        Board gameBoard=new Board(board_size);

        //start the game
        new Game(gameBoard,player1,player2);
    }
}