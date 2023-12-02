# All string characters occur only once

### Problem Description

Implement an algorithm detecting whether all characters of a string occur only once.

### Follow-up

What if the usage of additional data structures is prohibited?

### Solutions

#### Base solution

I decided to create a set to store seen characters. Initially I was thinking creating an int[26] array (for lowercase English letters only) but then thought that the description does not say which characters can be used.
For every character of a string we just check whether it already exists within the set. If it does, we return `false`. If not, we add a new character to the set and continue traverse.

##### Time and space complexity
* TC = `O(n)` in the worst case (all characters within the string are unique) set will contain the same characters as the string does.
* SC = `O(n)` since we may traverse the full string.

#### Follow-up solution

TBD
