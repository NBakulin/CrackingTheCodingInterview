# Are two strings permutations of each other

### Problem Description

Implement an algorithm that detects whether a string is a permutation of another string.

### Solution

For this problem I decided to use a HashMap (the reason for that is that the character set is not defined so arrays cannot be used. As for the lists - we can use them but will lose in data access speed then).

#### Time and space complexity
* TC = `O(n + m) in general or O(n * (m + n)) in the worst case` we traverse the first string once and build a HashMap of the used characters and their quantity within the string. Then we go through the second sting and do the opposite action (we decrement characters count, if it's `null` or less than `0`, we return `false`). In the worst case HashMap access can be done in `O(n)` time complexity, that's why the worst case scenario will be `O(n * (n + m))`)
* SC = `O(n)` in the worst case (if all characters of the first string are unique) we will need to store all of its characters in the HashMap.

#### Possible improvements
We can compare strings' lengths and use one with the smaller length (to make less calls to the HashMap).
