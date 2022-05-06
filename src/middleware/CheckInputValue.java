package middleware;

public class CheckInputValue {
	
	//入力された文字を判定する
	public boolean checkInt1_8(String str) {
		//一桁の数字以外は受け付けない
		if(str.length() == 1) {
			if(0xFF10 <= str.charAt(0) && str.charAt(0) <= 0xFF19) {
				//大文字だったら小文字に変換して判定する
				str = ToUpToDown.toHalfNum(str);
			}
			if(str.matches("[1-8]")) {
			return true;
			}	
		}
		return false;
	}
	//入力された文字を変換する
	public int changeInt1_8(String str) {
		//上とセットで使用する
		int num = 0;
		//大文字数字の場合は変換して返す
		if(0xFF10 <= str.charAt(0) && str.charAt(0) <= 0xFF19) {
			str = ToUpToDown.toHalfNum(str);
		}
		num = Integer.parseInt(str);
		return num;
	}
}