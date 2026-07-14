# Given two strings s and t, determine if they are isomorphic.

# Two strings s and t are isomorphic if the characters in s can be replaced to get t.

# All occurrences of a character must be replaced with another character while preserving the order of characters. No two characters may map to the same character, but a character may map to itself.

 

# Example 1:

# Input: s = "egg", t = "add"

# Output: true

# Explanation:

# The strings s and t can be made identical by:

# Mapping 'e' to 'a'.
# Mapping 'g' to 'd'.
# Example 2:

# Input: s = "f11", t = "b23"

# Output: false

# Explanation:

# The strings s and t can not be made identical as '1' needs to be mapped to both '2' and '3'.

# Example 3:

# Input: s = "paper", t = "title"

# Output: true

 

# Constraints:

# 1 <= s.length <= 5 * 104
# t.length == s.length
# s and t consist of any valid ascii character.

class Isomorphic_String:
    def isIsomorphic(self, s: str, t: str) -> bool:
        map1 = {}
        map2 = {}
        for i in range(len(s)):
            if s[i] in map1:
                if map1[s[i]] != t[i]:
                    return False
            else:
                map1[s[i]] =t[i]

            if t[i] in map2:
                if map2[t[i]] != s[i]:
                    return False
            else:
                map2[t[i]] = s[i]
        return True