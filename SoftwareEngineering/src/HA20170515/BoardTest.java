package HA20170515;

import static org.junit.Assert.*;

import org.junit.Test;

public class BoardTest {

	@Test
	public void emptyBoard() {
		Board board = new Board();
		assertFalse(board.hasWinner());
	}
	
	@Test
	public void setValidMarkNoWinner() throws InvalidPositionException {
		Board board = new Board();
		board.setMark("X", 0, 2);
		assertFalse(board.hasWinner());
	}

	@Test
	public void setValidMarkWinner() throws InvalidPositionException {
		Board board = new Board();
		board.setMark("X", 0, 2);
		assertFalse(board.hasWinner());
		board.setMark("X", 0, 1);
		assertFalse(board.hasWinner());
		board.setMark("X", 0, 0);
	}
	
	@Test (expected = InvalidPositionException.class)
	public void invalidMark() throws InvalidPositionException {
		Board board = new Board();
		board.setMark("X", 3, 1);
	}
}
