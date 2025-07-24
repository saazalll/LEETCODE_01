class Solution {
    public String decodeString(String s) {
        Stack <Integer> countStack = new Stack <>(); // it contains number
        Stack<StringBuilder> stringStack = new Stack <>(); // expression result is stored
        StringBuilder currentString = new StringBuilder(); // current string result store here
        int num = 0; // fetch number from string expression

        // traverse the input expression

        for(char SingleChar : s.toCharArray()){
            if(Character.isDigit(SingleChar)){
                // convert char into int
                num = num*10 +(SingleChar - '0');
            }
            else if(SingleChar == '['){
                countStack.push(num);
                stringStack.push(currentString);
                num = 0;
                currentString = new StringBuilder();
            }
            else if(SingleChar == ']'){
                int repeat = countStack.pop();
                StringBuilder temp = stringStack.pop();
                for(int i = 1; i<= repeat; i++){
                    temp.append(currentString);
                }
                currentString = temp;
            }
            else{
                currentString.append(SingleChar);
            }
        }
        return currentString.toString();


        
    }
}