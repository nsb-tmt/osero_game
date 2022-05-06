package view;

public class ShowBoard {
	
	//駒を表示し、駒の数を数える
	public void showboard(String[][] board) {
		
		
		for(int i=0; i<9; i++) {
//		for(String[][] val : board) {

			String[] vals = board[i];
			for(String val : vals) {
				System.out.print("｜"+ val);

			}
			//一行目最後の配列を表示したら改行して折り返す
			System.out.println("｜");
			for(int j=0; j<vals.length; j++) {
				System.out.print("　―");
			}
			System.out.println("");
		}
	}
		
}