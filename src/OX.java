public class OX {
    private String[][] table = {
            {" " , "0" , "1" , "2"} ,
            {"0" , "-" , "-" , "-"} ,
            {"1" , "-" , "-" , "-"} ,
            {"2" , "-" , "-" , "-"} ,
    };
    private String player;
    private int countX;
    private int countO;
    private int countDraw;
    public OX() {
        player = "X";
        countX = 0;
        countO = 0;
        countDraw = 0;
    }

    public boolean put(int col, int row) {
        if(!table[row+1][col+1].equals("-")) {
            return false;
        }
        table[row + 1][col + 1] = getCurrentPlayer();
        return true;

    }


    public String getTableString() {
        String result="";
        for(int row = 0; row<table.length; row++){
            for( int col=0; col<table[row].length;col++){
                result = result + table[row][col];
            }
            result = result + "\n";
        }

        return result;
    }

    public String getCurrentPlayer() {
        return player;
    }

    public int getCountX() {
        return countX;
    }

    public int getCountO() {
        return countO;
    }

    public int getCountDraw() {
        return countDraw;
    }

    public boolean checkWin(int col, int row) {
        for( row=0; row <3; row++) {
            if(table[row+1][col+1].equals("-")){
                return false;
            }
        }
        return true;
    }

    public void switchPlayer() {
        if( player == "X") {
            player = "O";
        } else {
            player ="X";
        }
    }
}
