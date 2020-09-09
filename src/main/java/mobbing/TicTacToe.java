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

  public Player getWinner() {
    if (getWinner(0,1,2) != null) return currentPlayer;
    if (getWinner(3,4,5) != null) return currentPlayer;
    if (getWinner(6,7,8) != null) return currentPlayer;
    if (getWinner(0,3,6) != null) return currentPlayer;
    if (getWinner(1,4,7) != null) return currentPlayer;
    if (getWinner(2,5,8) != null) return currentPlayer;
    if (getWinner(0,4,8) != null) return currentPlayer;
    if (getWinner(2,4,6) != null) return currentPlayer;
    return null;
  }

  private Player getWinner(int x, int y, int z) {
    if (board[x] == currentPlayer && board[y] == currentPlayer && board[z] == currentPlayer) return currentPlayer;
    return null;
  }
}
