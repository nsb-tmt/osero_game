package osero;

import java.util.Scanner;

import config.StartConfig;
import middleware.CheckInputValue;
import model.CountBoardPiece;
import model.ReverseOsero;
import view.ShowBoard;

public class Main{
	protected enum Piece {
		WHITE("●"),
		BLACK("〇");
		final String piece;
		Piece(String piece){
			this.piece = piece;
		}
		public String getValue() {
			return this.piece;
		}
	}
	//オセロを作ります
	public static Piece psBlack = Piece.BLACK;
	public static Piece psWhite = Piece.WHITE;
	//ボードの大きさを決める
	final static int size = 8;
	public static String board[][] = new String[size + 1][size + 1];
	//入力用のフィールド
	static String x = "0";
	static String y = "0";
	//出力用のフィールド
	private static int inputX;
	private static int inputY;
	
	public static void main(String[] args) {
		
		//ゲームに必要なインスタンスの作成
		StartConfig StC = new StartConfig(board,psBlack.getValue(),psWhite.getValue());
		ShowBoard ShB = new ShowBoard();
		Scanner sc = new Scanner(System.in);
		ReverseOsero ReO = new ReverseOsero();
		CheckInputValue ChV = new CheckInputValue();
		CountBoardPiece CBP = new CountBoardPiece();
		
		System.out.println("オセロを開始します");
		System.out.println("");
		ShB.showboard(board);
		
		//座標入力フェーズ
		System.out.println("横の座標を１～８で入力してください");
		x = sc.next();
		while(!ChV.checkInt1_8(x)) {
			System.out.println("※正しい数値を入力してください");
			x = sc.next();
		}
		inputX = ChV.changeInt1_8(x);
		
		System.out.println("縦の座標を１～８で入力してください");
		String y = sc.next();
		while(!ChV.checkInt1_8(y)) {
			System.out.println("※正しい数値を入力してください");
			y = sc.next();
		}
		inputY = ChV.changeInt1_8(y);
		
		//駒を置く(表示の分１を加算）
		ReO.putPiece(inputX, inputY,psBlack.getValue());
		//結果を表示
		ShB.showboard(board);
		System.out.println(CBP.countPiece(board, "黒", psBlack.getValue()));
		System.out.println(CBP.countPiece(board, "白", psWhite.getValue()));
		
	}
		
}