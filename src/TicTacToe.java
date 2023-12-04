public class TicTacToe {
    private String firstPlayerName;
    private String secondPlayerName;

    public void setFirstPlayerName(String name) {
        this.firstPlayerName = name;
    }

    public String getFirstPlayerName() {
        return this.firstPlayerName;
    }


    public boolean gameBoard() {
        return true;
    }

    public String firstPlayerName(String userName) {
        firstPlayerName = userName;
        return firstPlayerName;
    }

    public String secondPlayerName(String userName) {
        secondPlayerName = userName;
        return secondPlayerName;
    }
}