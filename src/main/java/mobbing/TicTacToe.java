package mobbing;

import java.util.Arrays;
import java.util.Objects;

import static mobbing.Player.O;
import static mobbing.Player.X;

public class TicTacToe {
  private Player currentPlayer = X;
  private Player[] board = new Player[9];

  public boolean isEmpty() {
    return Arrays.stream(board).allMatch(Objects::isNull);
  }

  public Player currentPlayer() {
    return currentPlayer;
  }

  public void place(int i) {
    board[i] = currentPlayer;
    currentPlayer = currentPlayer == X ? O : X;
  }

  public Player getMove(int i) {
    return board[i];
  }

  public int totalMarks() {
    return (int) Arrays.stream(board).filter(Objects::nonNull).count();
  }
}
