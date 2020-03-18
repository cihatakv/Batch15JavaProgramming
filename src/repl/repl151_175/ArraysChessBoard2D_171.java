package repl.repl151_175;

import java.util.Arrays;

public class ArraysChessBoard2D_171 {
    public static void main(String[] args) {
        String[][] chessBoard = new String[8][8];
        //WRITE YOUR CODE HERE


        for (int i = 0; i < 8; i++) {
            char iChar = 'a';
            for (int j = 0; j < 8; j++) {
                chessBoard[i][j] = (i + 1) + "" + iChar;
                iChar++;
            }
        }

        //DO NOT CHANGE
        System.out.println(Arrays.deepToString(chessBoard));
    }
}
/*
Given a 8x8 two-dimensional array of strings named chessboard.
Initialize values inside an array accordingly to the chess board.
So first element in the array, chessboard[0][0] should have a value "1a",
and last element in the array, chessboard[7][7] should have a value "8h".
*/