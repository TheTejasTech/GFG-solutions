class Solution {
    public boolean ValidCorner(int mat[][]) {
        // Code here
        int n = mat.length;
        int m = mat[0].length;
 
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) { 
                for (int col1 = 0; col1 < m; col1++) {
                    if (mat[i][col1] == 1 && mat[j][col1] == 1) { 
                        for (int col2 = col1 + 1; col2 < m; col2++) {
                            if (mat[i][col2] == 1 && mat[j][col2] == 1) {
                                return true; // Found a rectangle
                            }
                        }
                    }
                }
            }
        }

        return false;
    }
}