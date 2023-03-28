package day17;

public class ChessBoard {
    private ChessPiece[][] piece;

    public ChessBoard(ChessPiece[][] piece) {
        this.piece = piece;
    }

    public void print() {
        for (int i = 0; i < piece.length; i++) {
            for (int j = 0; j < piece.length; j++) {
                System.out.print(piece[i][j].getName());
            }
            System.out.println();
        }
    }
}
