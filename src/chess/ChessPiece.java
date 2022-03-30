package chess;

import boardgame.Board;
import boardgame.Piece;

public class ChessPiece extends Piece {
	
	private Color color;
	private Integer moveCount;

	public ChessPiece(Board board, Color color, Integer moveCount) {
		super(board);
		this.color = color;
	}
	
	// -----
	
	public ChessPosition getChessPosition() {
		
	}
	
	protected boolean isThereOpponentPiece(Position position) {
		
	}
	
	protected void increaseMoveCount() {
		
	}
	
	protected void decreaseMoveCount() {
		
	}
	
	// -----
	
	public Color getColor() {
		return color;
	}
}
