// Given a string s, reverse only all the vowels in the string and return it.

// The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in both lower and upper cases, more than once.

 

// Example 1:

// Input: s = "IceCreAm"

// Output: "AceCreIm"

// Explanation:

// The vowels in s are ['I', 'e', 'e', 'A']. On reversing the vowels, s becomes "AceCreIm".

// Example 2:

// Input: s = "leetcode"

// Output: "leotcede"

 

// Constraints:

// 1 <= s.length <= 3 * 105
// s consist of printable ASCII characters.

class Solution {
    public String reverseVowels(String s) {
        char[] ch = s. toCharArray();
        int left =0;
        int right =ch.length -1;
        while(left < right){
            while(left<right && !isVowel(ch[left])){
                left ++;
            }
            while(left <right && !isVowel(ch[right])){
                right --;
            }
            char t = ch[left];
            ch[left] =ch[right];
            ch[right] = t;
            left++;
            right--;
        }
        return new String(ch);
    }
    public boolean isVowel(char  c){
        c = Character.toLowerCase(c);
        return c =='a' || c =='e' || c=='i' || c=='o' || c=='u';
    }
}