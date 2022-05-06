package config;

import middleware.ToUpToDown;

public class StartConfig {
	
	public StartConfig(String[][] board,String black,String white) {
		//コンストラクタで初期化
		bordInitValue(board);
		boardSetup(board,black,white);
	}
	
	public void bordInitValue(String[][] board) {
		for(int i=0; i<board.length; i++) {
			for(int j=0; j<board[i].length; j++) {
				board[i][j] = "　";
			}
		}
	}
	public void boardSetup(String[][] board,String black,String white) {
		//0は表示しないので飛ばす
		for(int i=1; i<board[0].length; i++) {
			String num = String.valueOf(i);
			board[0][i] = ToUpToDown.toWidthNum(num);
		}
		for(int i=1; i<board.length; i++) {
			String num = String.valueOf(i);
			board[i][0] = ToUpToDown.toWidthNum(num);
		}
		//ゲーム開始時のオセロを配置
		board[4][4] = black;
		board[4][5] = white;
		board[5][4] = white;
		board[5][5] = black;
		
	}
	

}

