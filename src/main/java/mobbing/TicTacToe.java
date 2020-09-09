package mobbing;

import java.util.Arrays;
import java.util.Objects;

public class TicTacToe {
  private Player currentPlayer = Player.X;
  private Player[] board = new Player[9];

  public boolean isEmpty() {
    return Arrays.stream(board).allMatch(Objects::isNull);
  }

  public Player currentPlayer() {
    return currentPlayer;
  }

  public void place(int i) {
    board[i] = currentPlayer;
//    currentPlayer =
  }

  public Player getMove(int i) {
    return board[i];
  }
}
