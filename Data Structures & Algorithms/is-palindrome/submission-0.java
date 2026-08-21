class Solution {
    public boolean isPalindrome(String s) {
        
        boolean isPalindrome;
        String word = s.replaceAll("[^a-zA-Z0-9 ]", "").toLowerCase().replace(" ", ""); 
        StringBuilder stringBuilder = new StringBuilder(word);
        String reversedWord = stringBuilder.reverse().toString();
        if(word.equals(reversedWord)){
            isPalindrome = true;
        }else{
            isPalindrome = false;
        }
        return isPalindrome;
    }
}
