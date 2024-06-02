function countWays(n, k) {
  const MOD = 10 ** 9 + 7;

  // Base cases
  if (n === 1) {
    return k;
  }
  if (n === 2) {
    return (k * (k - 1)) % MOD;
  }

  // dp array to store number of ways to arrange i balloons
  const dp = new Array(n + 1).fill(0);

  // Initialize base cases
  dp[1] = k;
  dp[2] = (k * (k - 1)) % MOD;

  // Fill the dp array using the recurrence relation
  for (let i = 3; i <= n; i++) {
    dp[i] = (dp[i - 1] * (k - 1)) % MOD;
  }

  // Return the result for n balloons
  return dp[n];
}

// Example usage:
console.log(countWays(2, 3)); // Output: 6
console.log(countWays(1, 8)); // Output: 8
console.log(countWays(3, 1)); // Output: 0
