import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
class TicTacToeTest {

    @Test
    void testAllowTwoHumanPlayers() {
        TicTacToe ticTacToe = new TicTacToe();













        ticTacToe.hasTwoHumanPlayers("Paul", "Daniel");
        assertTrue(ticTacToe.hasTwoHumanPlayers("Paul", "Daniel"));
        System.out.println("Game have two human players");

        assertEquals("Samuel", ticTacToe.getFirstPlayerName("Samuel"), "First player name should be Samuel");
        assertEquals("Charles", ticTacToe.getSecond  PlayerName())

    }
    void testThatFirstPlayerCanMakeXMove() {


    }

}

