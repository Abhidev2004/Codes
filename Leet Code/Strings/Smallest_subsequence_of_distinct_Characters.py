# iven a string s, return the lexicographically smallest subsequence of s that contains all the distinct characters of s exactly once.

 

# Example 1:

# Input: s = "bcabc"
# Output: "abc"
# Example 2:

# Input: s = "cbacdcbc"
# Output: "acdb"
 

# Constraints:

# 1 <= s.length <= 1000
# s consists of lowercase English letters.

class Solution:
    def smallestSubsequence(self, s: str) -> str:
        last = {}
        for i in range(len(s)):
            last[s[i]] = i

        stack = []
        seen = set()

        for i in range(len(s)):
            ch = s[i]

            if ch in seen:
                continue

            while stack and ch < stack[-1] and last[stack[-1]] > i:
                seen.remove(stack.pop())

            stack.append(ch)
            seen.add(ch)

        return "".join(stack)