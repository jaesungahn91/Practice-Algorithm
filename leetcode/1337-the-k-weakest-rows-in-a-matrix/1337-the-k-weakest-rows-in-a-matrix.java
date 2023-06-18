class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        int[] result = new int[k];

        int[][] map = new int[mat.length][2];

        for (int i = 0; i < mat.length; i++) {
            int cnt = 0;
            int start = 0;
            int end = mat[0].length-1;
            while(start <= end){
                int mid = start + (end-start)/2;
                if(mat[i][mid] == 1){
                    start = mid+1;
                }else{
                    end = mid-1;
                }
            }
            map[i][0] = i;
            map[i][1] = start;
            cnt = 0;
        }

        Arrays.sort(map,(o1, o2) -> o1[1]!=o2[1]? o1[1]-o2[1] : o1[0]-o2[0]);

        for (int i = 0; i < k; i++) {
            result[i] = map[i][0];
        }
        return result;
    }
}