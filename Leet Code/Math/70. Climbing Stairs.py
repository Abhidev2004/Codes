# You are climbing a staircase. It takes n steps to reach the top.

# Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?

 

# Example 1:

# Input: n = 2
# Output: 2
# Explanation: There are two ways to climb to the top.
# 1. 1 step + 1 step
# 2. 2 steps
# Example 2:

# Input: n = 3
# Output: 3
# Explanation: There are three ways to climb to the top.
# 1. 1 step + 1 step + 1 step
# 2. 1 step + 2 steps
# 3. 2 steps + 1 step
 

# Constraints:

# 1 <= n <= 45
 

class ClimbingStairs:
    def climbStairs(self, n: int) -> int:
        # Base cases
        if n <= 2:
            return n
        
        # Track the number of ways for the previous two steps
        one_step_back = 2  # Ways to reach step 2
        two_steps_back = 1 # Ways to reach step 1
        
        # Calculate ways iteratively up to n
        for _ in range(3, n + 1):
            current = one_step_back + two_steps_back
            two_steps_back = one_step_back
            one_step_back = current
            
        return one_step_back
