class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        int[] result = new int[k];

        int[][] map = new int[mat.length][2];

        for (int i = 0; i < mat.length; i++) {
            int soldier = 0;
            for (int j = 0; j < mat[i].length; j++) {
                if(mat[i][j] == 1) {
                    soldier++;
                }
            }
            map[i][0] = i;
            map[i][1] = soldier;
        }

        Arrays.sort(map,(o1, o2) -> o1[1]!=o2[1]? o1[1]-o2[1] : o1[0]-o2[0]);

        for (int i = 0; i < k; i++) {
            result[i] = map[i][0];
        }
        return result;
    }
    
}