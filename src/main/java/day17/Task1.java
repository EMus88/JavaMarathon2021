package day17;

import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {

        ChessPiece[] chessPieces = new ChessPiece[8];
        for (int i = 0; i < 4; i++) {
            chessPieces[i] = ChessPiece.PAWN_WHITE;
        }
        for (int i = 4; i < 8; i++) {
            chessPieces[i] = ChessPiece.ROOK_BLACK;
        }
        for (ChessPiece chessPiece : chessPieces) {
            System.out.print(chessPiece.getSymbol());
        }
    }
}