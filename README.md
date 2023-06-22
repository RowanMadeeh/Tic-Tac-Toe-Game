# Tic-Tac-Toe-Game

The tic-tac-toe game is for two players. One player plays with the symbol that he chooses and the other plays with another symbol that he chooses.
The players take turns placing their marks on a grid of n-by-n squares (where n is a number for the grid chosen by one of the players)
The differnece that this tic-tac-toe game serves is that the game Board is not 3 by 3 but, n by n.

Rules for Tic-Tac-Toe:
  1) The game is played on a grid that is n squares by n squares.
  2) Players take turns putting their symbols in numbered squares.
  3) The first player to get n of her symbol in a row (up, down, across, or diagonally) is the winner.
  4) When all n*n squares are full, the game is over. If no player has n symbols in a row, the game ends in a tie.

The game is written in java language using 4 classes for which i will explain the role of each one in the following lines:

  . Class Player: It represents a game player. It has some attributes like player name and symbol. It also has a constructor and a method to ask the player for the next move. Also it has getter methods for name &                symbol. 

  . Class Board: It is a grid of n x n squares. It has methods that support updating it with a new move and symbol, displaying current board state, checking for winners and draw. 

  . Class Game: This is the game class that has one or more methods to run the game playing algorithm. It is possible that some of the Board class responsibilities (like checking winners and draw) are done here. Client code     should pass the board and players to it.

  . class Move: It represents an action taken to place a symbol on an x, y square in the grid. It checks if a move is valid or not before updating board.  
