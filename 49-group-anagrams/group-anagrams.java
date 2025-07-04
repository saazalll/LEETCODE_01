class Solution {
    //
    // boolean isAnagram(String first , String second){
    //     if(first.length()!=second.length()){
    //         return false;
    //     }
    //     char[]x = first.toCharArray();
    //     char[]y = second.toCharArray();
    //     Arrays.sort(x);
    //     Arrays.sort(y);
    //     return Arrays.equals(x,y);  //if same it will return true otherwise false.
    // }
    // public List<List<String>> groupAnagrams(String[] strs) {
    //     List<List<String>>bigList = new ArrayList<>();
    //     for (String word : strs){
    //         boolean added = false; // flag to check is it already in the list 

    //         for (List < String> smallList : bigList){
    //             if(isAnagram(smallList.get(0),word)){
    //                 smallList.add(word);
    //                 added = true;
    //                 break;
    //             }
    //         }
    //         if(!added){
    //             List <String> newSmallList = new ArrayList<>();
    //             newSmallList.add(word);
    //             bigList.add(newSmallList);
    //         }
    //     }
    //     return bigList;


        
    // }
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>>Map = new HashMap<>();

        for(String word : strs){
            char w[] = word.toCharArray();
            Arrays.sort(w);
            String key = new String(w);
            Map.computeIfAbsent(key, k-> new ArrayList<>()).add(word); 
        }
        return new ArrayList<>(Map.values());

    }

}