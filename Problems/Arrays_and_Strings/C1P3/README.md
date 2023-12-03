# Replace spaces with `%20`

### Problem Description

Implement a method that replaces all space characters (`' '`) within the input string with `'%20'`. Assume that the string can be stored within a `String` variable after replacements.

### Solution

I decided to use StringBuilder as it provides an efficient way to build Java strings.

#### Time and space complexity
* TC = `O(n)`
* SC = `O(n)` if the string consists of space characters only, space complexity will be `O(3 * n)` (we replace one character with three characters) which is `O(n)`

