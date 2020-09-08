package mobbing;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

public class TicTacToeTest {
  TicTacToe game = new TicTacToe();

  @Test
  public void createEmptyBoard() {
    assertTrue(game.isEmpty());
  }

  @Test
  public void whenBoardCreated_currentPlayerIsX() {
    assertEquals(game.currentPlayer(), Player.X);
  }

  @Test
  public void whenMoveMade_boardIsNotEmpty() {
    game.place(1);

    assertFalse(game.isEmpty());
  }

  @Test
  public void whenMoveMade_cellIsSet() {
    game.place(1);

    assertSame(game.getMove(1), Player.X);
  }
}
