package model;

public class CountBoardPiece {
	
	public String countPiece(String[][] b, String name,String piece) {
		int count = 0;
		for(int i=0; i<b.length; i++) {
			for(int j=0; j<b.length; j++) {
				if(b[i][j] == piece) {
					count++;
				}
			}
		}
		
		return name + "の数 : " + count;
	}
}