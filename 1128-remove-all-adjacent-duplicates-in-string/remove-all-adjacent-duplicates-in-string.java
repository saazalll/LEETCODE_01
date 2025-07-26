class Solution {
    public String removeDuplicates(String s) {
        StringBuilder stack = new StringBuilder();
        char letters[] = s.toCharArray();

        for(char letter : letters){
            if(stack.length() > 0 && stack.charAt(stack.length()-1) == letter){
                stack.deleteCharAt(stack.length()-1);
            }
            else{
                stack.append(letter);
            }
        }
        return stack.toString();
        
    }
}