package managment;

import java.util.Scanner;

public class Player {
    private String name;
    private String symbol;

    // Constructor to initiate player with name and symbol
    public Player(String name,String symbol){
        this.name=name;
        this.symbol=symbol;
    }

    // Get Player move
    public int get_move(){
        System.out.println(name +",Please enter your choice:");
        Scanner input= new Scanner(System.in);
        int choice=input.nextInt();
        return choice;
    }

    // Get symbol used by player
    public String get_symbol(){
        return symbol;
    }

    // Get name of player
    public String get_name(){
        return name;
    }
}
