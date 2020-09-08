package mobbing;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class TicTacToeTest {
  TicTacToe game = new TicTacToe();

  @Test
  public void createEmptyBoard() {
    assertTrue(game.isEmpty());
  }

  @Test
  public void afterFirstMove_boardIsNotEmpty() {
    assertEquals(game.currentPlayer(), Player.X);
  }
}
