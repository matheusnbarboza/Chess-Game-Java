package chess.pieces;

import boardgame.Board;
import chess.ChessPiece;
import chess.Color;

public class Bishop extends ChessPiece {

	public Bishop(Board board, Color color, Integer moveCount) {
		super(board, color, moveCount);
	}

	// -----
	
	@Override
	public String toString() {
		return "B";
	}
}
