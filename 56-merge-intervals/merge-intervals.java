class Solution {
    public int[][] merge(int[][] intervals) {

        List<int[]> result = new ArrayList<>();
        Arrays.sort (intervals,(a,b) -> a[0]-b[0]);

        //traverse
        for (int[] interval : intervals){
            if(result.size() == 0 || result.get(result.size()-1)[1]<interval[0]){
                result.add(interval);
            }else{
                //overlapping happen

                result.get(result.size()-1)[1]= Math.max(result.get(result.size()-1)[1],interval[1]);
            }
        }
        return result.toArray(new int[result.size()][]);
    }
}