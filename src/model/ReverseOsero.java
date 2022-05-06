package model;
import osero.Main;

public class ReverseOsero {
	//入力した位置に駒を置く
	CopyBoard CB = new CopyBoard();
	public String[][] copyBoard = CB.copysaveBoard(Main.board);
	
	public void putPiece(int x,int y, String piece) {
		Main.board[x][y] = piece;
	}
	
	//左方向のメソッド
	public void reversLeft(int x,int y) {
		while (true) {
			//設置位置が左端なら終了
			if(x<2) {
				copyBoard = CB.copysaveBoard(Main.board);
				break;
			}
			if(Main.board[x-1][y] == Main.enemyOsero) {
				copyBoard[x-1][y] = Main.userosero;
			} else if (Main.board[x-1][y] == Main.userOsero) {
				Main.board = CB.copysaveBoard(copyBoard);
				break;
			} else {
				copyBoard = CB.copysaveBoard(Main.board);
				break;
			}
			x--;
		}
	}
	
}