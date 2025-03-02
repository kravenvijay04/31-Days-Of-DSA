class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int n = grid.length;
        int size = n*n;

        for(int[] arr: grid){
            for(int val:arr){
                map.put(val,map.getOrDefault(val,0)+1);
            }
        }
        int missing=0;int repeated=0;
        for(int i=1;i<=size;i++){
            int count = map.getOrDefault(i,0);
            if(count==2) repeated=i;
            else if(count==0) missing=i;
        }

        return new int[]{repeated,missing};
    }
}