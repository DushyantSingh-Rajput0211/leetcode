class Solution {
    public boolean isValidSudoku(char[][] board) {
        // Declare the HashSets
        HashSet<Character>[] rows = new HashSet[9];
        HashSet<Character>[] cols = new HashSet[9];
        HashSet<Character>[] boxes = new HashSet[9];

        // Initialize the HashSets
        for(int i=0; i<9; i++){
            rows[i] = new HashSet<>();
            cols[i] = new HashSet<>();
            boxes[i] = new HashSet<>();
        }

        for(int r=0; r<9; r++) {
            for(int c=0; c<9; c++) {
                if(board[r][c] == '.')
                    continue;
                //Store each value in a char variable
                char value = board[r][c];
                // To find the index of each box - "VERY IMPORTANT"
                int index = r/3 * 3 + c/3;

                if(rows[r].contains(value) || cols[c].contains(value) || boxes[index].contains(value)) {
                    return false;
                }
                else {
                    rows[r].add(value);
                    cols[c].add(value);
                    boxes[index].add(value);
                }
            }
        }
        return true;
    }
}
