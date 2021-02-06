package day17;


import java.io.FileNotFoundException;

import static java.util.Objects.isNull;

public class Task2 {
    public static void main(String[] args) {

        ChessPiece[][] chessPieces = new ChessPiece[8][8];
        for (int i = 0; i < chessPieces.length; i++) {
            for (int j = 0; j < chessPieces.length; j++) {
                chessPieces[i][j] = ChessPiece.EMPTY;// заполняем все поле пустыми элементами
            }
        }

// ==================== простой способ ==========================
//        chessPieces[0][0] = ChessPiece.ROOK_BLACK;
//        chessPieces[0][5] = ChessPiece.ROOK_BLACK;
//        chessPieces[0][6] = ChessPiece.KING_WHITE;
//        chessPieces[1][1] = ChessPiece.ROOK_WHITE;
//        chessPieces[1][4] = ChessPiece.PAWN_BLACK;
//        chessPieces[1][5] = ChessPiece.PAWN_BLACK;
//        chessPieces[1][7] = ChessPiece.PAWN_BLACK;
//        chessPieces[2][0] = ChessPiece.PAWN_BLACK;
//        chessPieces[2][2] = ChessPiece.KNIGHT_BLACK;
//        chessPieces[2][6] = ChessPiece.PAWN_BLACK;
//        chessPieces[3][0] = ChessPiece.QUEEN_BLACK;
//        chessPieces[3][3] = ChessPiece.BISHOP_WHITE;
//        chessPieces[4][3] = ChessPiece.BISHOP_BLACK;
//        chessPieces[4][4] = ChessPiece.PAWN_WHITE;
//        chessPieces[5][4] = ChessPiece.BISHOP_WHITE;
//        chessPieces[5][5] = ChessPiece.PAWN_WHITE;
//        chessPieces[6][0] = ChessPiece.PAWN_WHITE;
//        chessPieces[6][3] = ChessPiece.QUEEN_WHITE;
//        chessPieces[6][5] = ChessPiece.PAWN_WHITE;
//        chessPieces[6][7] = ChessPiece.PAWN_WHITE;
//        chessPieces[7][5] = ChessPiece.ROOK_WHITE;
//        chessPieces[7][6] = ChessPiece.KING_WHITE;


        ChessBoard chessBoard = new ChessBoard(chessPieces);

//======================сложный способ==================================================
        ChessPiece.PAWN_WHITE.setPlaces(new int[][]{{4, 4}, {5, 5}, {6, 0}, {6, 5}, {6, 7}}); //установка мест на доске
        ChessPiece.PAWN_BLACK.setPlaces(new int[][]{{1, 4}, {1, 5}, {1, 7}, {2, 0}, {2, 6}});
        ChessPiece.ROOK_WHITE.setPlaces(new int[][]{{1, 1}, {7, 5}});
        ChessPiece.ROOK_BLACK.setPlaces(new int[][]{{0, 0}, {0, 5}});
        ChessPiece.BISHOP_WHITE.setPlaces(new int[][]{{3, 3}, {5, 4}});
        ChessPiece.BISHOP_BLACK.setPlaces(new int[][]{{4, 3}});
        ChessPiece.KNIGHT_BLACK.setPlaces(new int[][]{{2, 2}});
        ChessPiece.QUEEN_WHITE.setPlaces(new int[][]{{6, 3}});
        ChessPiece.QUEEN_WHITE.setPlaces(new int[][]{{3, 0}});
        ChessPiece.KING_WHITE.setPlaces(new int[][]{{7, 6}});
        ChessPiece.KING_BLACK.setPlaces(new int[][]{{0, 6}});

        LoadFigure(chessPieces);
        chessBoard.print();

    }

    public static void LoadFigure(ChessPiece[][] chessPieces) {
        int indI = 0;
        int indJ = 0;
        ChessPiece[] chessPieces1 = { //массив из единиц фигур
                ChessPiece.PAWN_WHITE,
                ChessPiece.PAWN_BLACK,
                ChessPiece.ROOK_WHITE,
                ChessPiece.ROOK_BLACK,
                ChessPiece.KNIGHT_WHITE,
                ChessPiece.KNIGHT_BLACK,
                ChessPiece.BISHOP_WHITE,
                ChessPiece.BISHOP_BLACK,
                ChessPiece.QUEEN_WHITE,
                ChessPiece.QUEEN_BLACK,
                ChessPiece.KING_WHITE,
                ChessPiece.KING_BLACK
        };
        for (ChessPiece chessPiece : chessPieces1) { //заполнение шахмотной доски фигурами по указанным местам
            if (!isNull(chessPiece.getPlaces())) {
                for (int i = 0; i < chessPiece.getPlaces().length; i++) {
                    for (int j = 0; j < 2; j++) {
                        if (j == 0) {
                            indI = chessPiece.getPlaces()[i][j];
                        } else {
                            indJ = chessPiece.getPlaces()[i][j];
                        }
                    }
                    chessPieces[indI][indJ] = chessPiece;
                }
            }
        }
    }
}
