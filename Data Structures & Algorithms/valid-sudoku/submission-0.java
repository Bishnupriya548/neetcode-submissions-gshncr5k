class Solution {
    public boolean isValidSudoku(char[][] board) {
          int rows[][]=new int[9][9];
        int cols[][]=new int[9][9];
        int boxes[][]=new int[9][9];
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(board[i][j]!='.'){
                    int num=board[i][j]-'0';
                    int k=(i/3)*3+j/3;
                                       if (rows[i][num - 1] > 0 ||
                        cols[j][num - 1] > 0 ||
                        boxes[k][num - 1] > 0) {
                        return false;
                    }

                    rows[i][num - 1]++;
                    cols[j][num - 1]++;
                    boxes[k][num - 1]++;
                }
            }
        }
        return true;
    }
}
