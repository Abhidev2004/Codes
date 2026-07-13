# An integer has sequential digits if and only if each digit in the number is one more than the previous digit.

# Return a sorted list of all the integers in the range [low, high] inclusive that have sequential digits.

 

# Example 1:

# Input: low = 100, high = 300
# Output: [123,234]
# Example 2:

# Input: low = 1000, high = 13000
# Output: [1234,2345,3456,4567,5678,6789,12345]
 

# Constraints:

# 10 <= low <= high <= 10^9

class Solution:
    def sequentialDigits(self, low: int, high: int) -> list[int]:
        sequence = "123456789"
        result = []
        
        min_len = len(str(low))
        max_len = len(str(high))
        
        for length in range(min_len, max_len + 1):

            for start in range(10 - length):

                num = int(sequence[start:start + length])
                if low <= num <= high:
                    result.append(num)
                    
        return result
        