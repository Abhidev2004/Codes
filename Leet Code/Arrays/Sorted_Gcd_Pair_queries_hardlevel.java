// You are given an integer array nums of length n and an integer array queries.

// Let gcdPairs denote an array obtained by calculating the GCD of all possible pairs (nums[i], nums[j]), where 0 <= i < j < n, and then sorting these values in ascending order.

// For each query queries[i], you need to find the element at index queries[i] in gcdPairs.

// Return an integer array answer, where answer[i] is the value at gcdPairs[queries[i]] for each query.

// The term gcd(a, b) denotes the greatest common divisor of a and b.

 

// Example 1:

// Input: nums = [2,3,4], queries = [0,2,2]

// Output: [1,2,2]

// Explanation:

// gcdPairs = [gcd(nums[0], nums[1]), gcd(nums[0], nums[2]), gcd(nums[1], nums[2])] = [1, 2, 1].

// After sorting in ascending order, gcdPairs = [1, 1, 2].

// So, the answer is [gcdPairs[queries[0]], gcdPairs[queries[1]], gcdPairs[queries[2]]] = [1, 2, 2].

// Example 2:

// Input: nums = [4,4,2,1], queries = [5,3,1,0]

// Output: [4,2,1,1]

// Explanation:

// gcdPairs sorted in ascending order is [1, 1, 1, 2, 2, 4].

// Example 3:

// Input: nums = [2,2], queries = [0,0]

// Output: [2,2]

// Explanation:

// gcdPairs = [2].

 

// Constraints:

// 2 <= n == nums.length <= 105
// 1 <= nums[i] <= 5 * 104
// 1 <= queries.length <= 105
// 0 <= queries[i] < n * (n - 1) / 2

class SortedGcdPairQueries {
    public int[] gcdValues(int[] nums, long[] queries) {
        // Find the maximum value in the array to bound our math
        int maxVal = 0;
        for (int num : nums) {
            maxVal = Math.max(maxVal, num);
        }
        
        // STEP 1: Count the exact frequency of every number in nums
        int[] freq = new int[maxVal + 1];
        for (int num : nums) {
            freq[num]++;
        }
        
        // STEP 2: Count how many pairs have a GCD that is a MULTIPLE of i
        // We use a long[] because the total pairs can exceed the 32-bit int limit
        long[] gcdPairsCount = new long[maxVal + 1];
        
        for (int i = 1; i <= maxVal; i++) {
            long multiplesCount = 0;
            // Jump by i to find all multiples (i, 2i, 3i, etc.)
            for (int j = i; j <= maxVal; j += i) {
                multiplesCount += freq[j];
            }
            // Combinatorics: Pick 2 from the available multiples ( n * (n-1) / 2 )
            gcdPairsCount[i] = multiplesCount * (multiplesCount - 1) / 2;
        }
        
        // STEP 3: Inclusion-Exclusion to find EXACT GCD counts
        // Loop backwards from maxVal down to 1
        for (int i = maxVal; i >= 1; i--) {
            for (int j = i * 2; j <= maxVal; j += i) {
                // Subtract the pairs whose GCD is a larger multiple of i
                gcdPairsCount[i] -= gcdPairsCount[j];
            }
        }
        
        // STEP 4: Convert exact counts to prefix sums
        // This tells us the total number of pairs with a GCD <= i
        for (int i = 1; i <= maxVal; i++) {
            gcdPairsCount[i] += gcdPairsCount[i - 1];
        }
        
        // STEP 5: Process the queries using Binary Search
        int[] result = new int[queries.length];
        
        for (int i = 0; i < queries.length; i++) {
            long target = queries[i];
            
            // Standard binary search to find the first index where the prefix sum > target
            int low = 1;
            int high = maxVal;
            
            while (low < high) {
                int mid = low + (high - low) / 2;
                if (gcdPairsCount[mid] > target) {
                    high = mid;
                } else {
                    low = mid + 1;
                }
            }
            
            result[i] = low;
        }
        
        return result;
    }
}