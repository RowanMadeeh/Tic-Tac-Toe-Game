package managment;

public class Board {
    private int n;
    private String[][] grid;

    // Constructor to set n and book space for n x n grid
    public Board(int n){
        this.n=n;
        grid= new String[n][n];
        int cnt=1;
        for(int i=0;i<this.n;i++){
            for(int j=0;j<this.n;j++){
                String ch= Integer.toString(cnt);
                grid[i][j]=ch;
                cnt++;
            }
        }
    }

    // updates Board with players' moves
    public void update(int x,int y, String symbol){
        grid[x][y]=symbol;
    }

    // Display the board and the pieces on it
    public void display(){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(grid[i][j]);
                if(j!=n-1){
                    System.out.print(" | ");
                }
            }
            System.out.println();
            for(int k=0;k<n*n;k++){
                System.out.print('_');
            }
            System.out.println();
        }
    }

    // Returns true if symbol owner wins
    public boolean is_winner(String symbol){
        boolean check=false;

        // checking horizontally
        for(int i=0;i<n;i++){
            check = true;
            for (int j = 0; j <n ; j++) {
                if(grid[i][j]!=symbol){
                    check=false;
                    break;
                }
            }
            if(check){
                return true;
            }
        }

        // checking vertically
        for(int i=0;i<n;i++){
            check = true;
            for (int j = 0; j <n ; j++) {
                if(grid[j][i]!=symbol){
                    check=false;
                    break;
                }
            }
            if(check){
                return true;
            }
        }

        // checking main diagonal
        check = true;
        for(int i=0;i<n;i++){
            if(grid[i][i]!=symbol){
                check=false;
                break;
            }
        }
        if(check){
            return true;
        }

        // checking other diagonal
        check = true;
        for(int i=0;i<n;i++){
            if(grid[n-i-1][i]!=symbol){
                check=false;
                break;
            }
        }
        if(check){
            return true;
        }

        // none of the winning conditions were met
        return false;
    }

    // Return true if board status indicates a draw
    public boolean is_draw(Player player1,Player player2 ){
        if(!is_winner(player1.get_symbol()) && !is_winner(player2.get_symbol()) ){
            return true;
        }
        return false;
    }

    // returns size of board
    public int get_size(){
        return n;
    }
}
