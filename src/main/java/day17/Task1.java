package day17;



public class Task1 {
    public static void main(String[] args) {
        ChessPiece[] chessPiece = {ChessPiece.PAWN_WHITE,ChessPiece.PAWN_WHITE,
                ChessPiece.PAWN_WHITE,ChessPiece.PAWN_WHITE, ChessPiece.ROOK_BLACK,
                ChessPiece.ROOK_BLACK,ChessPiece.ROOK_BLACK,ChessPiece.ROOK_BLACK,};

        for (ChessPiece piece: chessPiece){
            System.out.print(piece.getName());
        }
    }
}
