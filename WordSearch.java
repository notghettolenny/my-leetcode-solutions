package leetcode;

public class WordSearch {
	public boolean exist(char[][] board, String word) {
        boolean isexist = false;
        char[] wordChar = word.toCharArray();
        for (int i = 0; i < board.length; i++) {
        	
			for (int j = 0; j < board[i].length; j++) {
				for (int k = 0; k < wordChar.length; k++) {
					if(board[i][j]==wordChar[i]){
						
					}
				}
			}
		}
        return isexist;
    }
	public static void main(String[] args) {
		
	}
}
