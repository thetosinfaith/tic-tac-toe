import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TicTacToeTest {

    @Test
    void testGameBoardStartsEmpty(){
        TicTacToe ticTacToe = new TicTacToe();
        boolean game = ticTacToe.gameBoard();
        assertTrue(game);
    }
    @Test
    void testTwoPlayersCanPlayTheGame(){
        TicTacToe ticTacToe = new TicTacToe();
        String userName1 = ticTacToe.firstPlayerName("Chibuzo");
        String userName2 = ticTacToe.secondPlayerName("Kimberly");
        assertNotEquals(userName1, userName2);
        assertNotEquals(userName2, userName1);


//    void testAllowTwoHumanPlayers() {
//        TicTacToe ticTacToe = new TicTacToe();
//
//        ticTacToe.hasTwoHumanPlayers("Paul", "Daniel");
//        assertTrue(ticTacToe.hasTwoHumanPlayers("Paul", "Daniel"));
//        System.out.println("Game have two human players");
//
//        assertEquals("Samuel", ticTacToe.getFirstPlayerName("Samuel"), "First player name should be Samuel");
//        assertEquals("Charles", ticTacToe.getSecond  PlayerName())

    }
    void testThatFirstPlayerCanMakeXMove() {


    }

}

