import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TicTacToeTest {
    @Test
    void testGameBoardStartsEmpty(){
        TicTacToe ticTacToe = new TicTacToe();
        boolean empty = ticTacToe.empty();
        assertTrue(empty);
    }
    @Test
    void testTwoPlayersCanPlayTheGame() {
        TicTacToe ticTacToe = new TicTacToe();
        String userName1 = ticTacToe.firstPlayerName("Chibuzo");
        String userName2 = ticTacToe.secondPlayerName("Kimberly");
        assertNotEquals(userName1, userName2);
        assertNotEquals(userName2, userName1);
    }
    @Test
    void testPlayerCanPlayInAnyDirection() {
        TicTacToe ticTacToe = new TicTacToe();
        ticTacToe.playerCanPlayInAnyDirection();

        Position userChoose = Position.X;

        if (Direction : testPlayerCanPlayInAnyDirection(); {

        })

        if (Direction Direction moveUp;
        moveUp = Direction.NORTH);

        moveUp = Direction.NORTH;
        Direction moveDown = Direction.WEST;
        Direction turnRight = Direction.SOUTH;
        Direction turnLeft = Direction.EAST;


        assertTrue(userChoose);


        assertTrue();

        switch (userChoose) {

            case EMPTY:
                Direction userChoose1 = Direction.NORTH;
                Direction u
                break;

            case :

        }


        Position position (ticTacToe);

        switch (ticTacToe) {

        }
        ticTacToe.FirstPlayerPla


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

    private void assertTrue(Position userChoose) {
    }

    void testThatFirstPlayerCanMakeXMove() {


    }

}

