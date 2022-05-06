package middleware;

public class ToUpToDown {
	//入力された数字を大文字、小文字に変換する
	
	public static String toWidthNum(String s) {
		StringBuilder sb = new StringBuilder(s);
		for(int i=0; i<s.length(); i++) {
			char c = s.charAt(i);
			if(0x30 <= c && c <= 0x39) {
				sb.setCharAt(i, (char)(c + 0xFEE0));
			}
		}
		return sb.toString();
		
	}
	public static String toHalfNum(String s) {
		StringBuilder sb = new StringBuilder(s);
		for(int i=0; i<s.length(); i++) {
			char c = s.charAt(i);
			if(0xFF10 <= c && c <= 0xFF19) {
				sb.setCharAt(i, (char)(c - 0xFEE0));
			}
		}
		return sb.toString();
		
	}
	
	//入力された大文字数字かそうでないかを判断する
	public static boolean checkNum(String s) {
		char c = s.charAt(1);
		if(0xFF10 <= c && c <= 0xFF19) {
			return true;
		}
		return false;
	}
	public static boolean checkNum(int i) {
		return true;
	}
	
}