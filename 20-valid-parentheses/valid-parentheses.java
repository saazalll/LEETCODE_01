class Solution {
    private boolean CompareOpeningAndClosing(char openingBracket, char closingBracket){
        return ((openingBracket == '(' && closingBracket ==')') || (openingBracket == '[' && closingBracket == ']') || (openingBracket == '{' && closingBracket == '}') );
    }
    public boolean isValid(String s) {
        Stack <Character> stack = new Stack <>();
        // s contains all the brackets
        // pick the bracket one by one

        for(char singleBracket : s.toCharArray()){
            if(singleBracket =='(' || singleBracket == '{' || singleBracket == '['){
                stack.push(singleBracket); // opening bracket push in stack
            }
            // if it is not opening bracket
            else if(!stack.isEmpty() && CompareOpeningAndClosing(stack.peek(), singleBracket)){
                stack.pop();
            }
            else{
                return false;
            }
        }
        return stack.isEmpty();
        
    }
}