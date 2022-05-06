package model;

public class CopyBoard {
	public String[][] copysaveBoard(String[][] board) {
		//平方の配列を入れる前提
		String[][] saveBoard = new String[board.length][board[0].length];
		
		for(int i=0; i<saveBoard.length; i++) {
			for(int j=0; j<saveBoard[i].length; j++) {
				String str = board[i][j];
				saveBoard[i][j] = str;
			}
		}
		return saveBoard;
	}
}
