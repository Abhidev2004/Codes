# You are given a binary string s of length n, where:

# '1' represents an active section.
# '0' represents an inactive section.
# You can perform at most one trade to maximize the number of active sections in s. In a trade, you:

# Convert a contiguous block of '1's that is surrounded by '0's to all '0's.
# Afterward, convert a contiguous block of '0's that is surrounded by '1's to all '1's.
# Return the maximum number of active sections in s after making the optimal trade.

# Note: Treat s as if it is augmented with a '1' at both ends, forming t = '1' + s + '1'. The augmented '1's do not contribute to the final count.

 

# Example 1:

# Input: s = "01"

# Output: 1

# Explanation:

# Because there is no block of '1's surrounded by '0's, no valid trade is possible. The maximum number of active sections is 1.

# Example 2:

# Input: s = "0100"

# Output: 4

# Explanation:

# String "0100" → Augmented to "101001".
# Choose "0100", convert "101001" → "100001" → "111111".
# The final string without augmentation is "1111". The maximum number of active sections is 4.
# Example 3:

# Input: s = "1000100"

# Output: 7

# Explanation:

# String "1000100" → Augmented to "110001001".
# Choose "000100", convert "110001001" → "110000001" → "111111111".
# The final string without augmentation is "1111111". The maximum number of active sections is 7.
# Example 4:

# Input: s = "01010"

# Output: 4

# Explanation:

# String "01010" → Augmented to "1010101".
# Choose "010", convert "1010101" → "1000101" → "1111101".
# The final string without augmentation is "11110". The maximum number of active sections is 4.
 

# Constraints:

# 1 <= n == s.length <= 105
# s[i] is either '0' or '1'


class MaximizeActiveSectionWithTrade1:
    def maxActiveSectionsAfterTrade(self, s: str) -> int:
        t = '1' + s + '1'
        n = len(t)

        # Step 1: break t into blocks of consecutive same characters
        blocks = []  # each entry: [character, length]
        i = 0
        while i < n:
            j = i
            while j < n and t[j] == t[i]:
                j += 1
            blocks.append([t[i], j - i])
            i = j

        # Step 2: total count of '1's currently in t
        total_ones = 0
        for ch, length in blocks:
            if ch == '1':
                total_ones += length

        # Step 3: try every interior '1'-block, find the best possible gain
        max_gain = 0
        for idx in range(len(blocks)):
            ch, length = blocks[idx]
            if ch == '1' and idx != 0 and idx != len(blocks) - 1:
                left_zero_len = blocks[idx - 1][1]
                right_zero_len = blocks[idx + 1][1]
                gain = left_zero_len + right_zero_len
                if gain > max_gain:
                    max_gain = gain

        # Step 4: subtract the 2 artificial boundary '1's we added
        return total_ones + max_gain - 2