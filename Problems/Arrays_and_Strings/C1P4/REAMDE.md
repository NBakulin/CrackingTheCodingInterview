# Check whether a string is a palindrome permutation

### Problem Description

Implement a method that checks whether a string is a palindrome permutation.

### Example
```
Input: "Tact coa"
Output: true
Explanation: possible permutations are "taco cat"" and "atco cta".
```

### Solution

First we count occurrence of each character of a string.
Then we check whether we have more than one unique character (in case we have only one char like "aaa", we cannot create a permutation).
Then we check whether the given string is a palindrome. To do so we need to ensure that every character occurs even times, only one character can occur odd times (in case it's in the center of a string).

#### Time and space complexity
* TC = `O(n)`
* SC = `O(n)` if the string consists of unique characters only.

