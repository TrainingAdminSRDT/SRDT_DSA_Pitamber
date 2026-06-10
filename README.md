# Coding Questions

# 🧠 LeetCode Topic-Wise Tracker & Cheat Sheet

> **70 unique problems** organized by topic | Track your progress with checkboxes

> &#x20;Difficulty: 🟢 Easy · 🟡 Medium · 🔴 Hard

> &#x20;Status: `[ ]` Not Done · `[~]` In Progress · `[x]` Done

***

## 📋 Table of Contents

| # | Topic                                                                                                     | Count | Problems                                                                               |
| - | --------------------------------------------------------------------------------------------------------- | ----- | -------------------------------------------------------------------------------------- |
| 1 | Math                                | 15    | 7, 9, 13, 50, 66, 69, 202, 204, 231, 263, 326, 342, 367, 507, 1281                     |
| 2 | Bit Manipulation        | 3     | 190, 191, 405                                                                          |
| 3 | Array / Two Pointers | 18    | 26, 27, 35, 53, 88, 118, 121, 167, 169, 217, 219, 283, 349, 350, 867, 1207, 1726, 1929 |
| 4 | String                            | 13    | 3, 5, 6, 8, 14, 28, 58, 125, 242, 344, 383, 387, 657                                   |
| 5 | Hash Table                    | 3     | 49, 705, 771                                                                           |
| 6 | Stack                              | 1     | 20                                                                                     |
| 7 | Linked List                  | 2     | 21, 206                                                                                |
| 8 | Backtracking                | 15    | 17, 22, 37, 39, 40, 46, 47, 51, 52, 77, 78, 79, 90, 113, 216                           |

***

## 1. Math

### 🧩 Cheat Sheet

```
Key Patterns:
───────────────────────────────────────────────────────
▸ Digit extraction         : n % 10 → last digit; n /= 10 → strip digit
▸ Overflow guard           : check before multiply — if (x > INT_MAX/10) overflow
▸ Power of N check         : loop divide — while (n % base == 0) n /= base; return n == 1
▸ Fast power / exponentiation: while(n > 0) { if (n&1) res *= x; x *= x; n >>= 1; }
▸ Sieve of Eratosthenes    : bool[] sieve of size n; mark composites in O(n log log n)
▸ Prime check              : trial division up to sqrt(n)
▸ Perfect square check     : binary search or (int)sqrt(n)^2 == n
▸ Integer sqrt             : binary search on [0, x/2] for mid*mid <= x
▸ Roman numerals           : map each symbol; if curr > prev, subtract 2*prev instead of add
▸ Ugly number              : divide by 2, 3, 5 until remainder; check if == 1
───────────────────────────────────────────────────────
Edge cases: INT_MIN overflow on negation, n=0, n=1

```

### ✅ Problem List

| Done  | #    | Problem                                              | Difficulty | Link                                                                                     |
| ----- | ---- | ---------------------------------------------------- | ---------- | ---------------------------------------------------------------------------------------- |
| `[ ]` | 7    | Reverse Integer                                      | 🟡 Medium  | [→](https://leetcode.com/problems/reverse-integer/)                                      |
| `[ ]` | 9    | Palindrome Number                                    | 🟢 Easy    | [→](https://leetcode.com/problems/palindrome-number/)                                    |
| `[ ]` | 13   | Roman to Integer                                     | 🟢 Easy    | [→](https://leetcode.com/problems/roman-to-integer/)                                     |
| `[ ]` | 50   | Pow(x, n)                                            | 🟡 Medium  | [→](https://leetcode.com/problems/powx-n/)                                               |
| `[ ]` | 66   | Plus One                                             | 🟢 Easy    | [→](https://leetcode.com/problems/plus-one/)                                             |
| `[ ]` | 69   | Sqrt(x)                                              | 🟢 Easy    | [→](https://leetcode.com/problems/sqrtx/)                                                |
| `[ ]` | 202  | Happy Number                                         | 🟢 Easy    | [→](https://leetcode.com/problems/happy-number/)                                         |
| `[ ]` | 204  | Count Primes                                         | 🟡 Medium  | [→](https://leetcode.com/problems/count-primes/)                                         |
| `[ ]` | 231  | Power of Two                                         | 🟢 Easy    | [→](https://leetcode.com/problems/power-of-two/)                                         |
| `[ ]` | 263  | Ugly Number                                          | 🟢 Easy    | [→](https://leetcode.com/problems/ugly-number/)                                          |
| `[ ]` | 326  | Power of Three                                       | 🟢 Easy    | [→](https://leetcode.com/problems/power-of-three/)                                       |
| `[ ]` | 342  | Power of Four                                        | 🟢 Easy    | [→](https://leetcode.com/problems/power-of-four/)                                        |
| `[ ]` | 367  | Valid Perfect Square                                 | 🟢 Easy    | [→](https://leetcode.com/problems/valid-perfect-square/)                                 |
| `[ ]` | 507  | Perfect Number                                       | 🟢 Easy    | [→](https://leetcode.com/problems/perfect-number/)                                       |
| `[ ]` | 1281 | Subtract the Product and Sum of Digits of an Integer | 🟢 Easy    | [→](https://leetcode.com/problems/subtract-the-product-and-sum-of-digits-of-an-integer/) |

***

## 2. Bit Manipulation

### 🧩 Cheat Sheet

```
Key Patterns:
───────────────────────────────────────────────────────
▸ Count set bits (Hamming)  : Brian Kernighan — while(n) { count++; n &= (n-1); }
▸ Check power of 2          : n > 0 && (n & (n-1)) == 0
▸ Check power of 4          : power of 2 AND set bit at even position
                              n > 0 && (n & (n-1)) == 0 && (n & 0xAAAAAAAA) == 0
▸ Reverse bits              : loop 32 times, shift result left, OR in LSB of n, shift n right
▸ To hex                    : take 4 bits at a time (n & 0xF), map to "0123456789abcdef"
                              shift right by 4 each iteration; handle negative with mask
───────────────────────────────────────────────────────
Useful masks:
  0x55555555 → alternating 01 (even positions)
  0xAAAAAAAA → alternating 10 (odd positions)
  0x0F0F0F0F → low nibbles

```

### ✅ Problem List

| Done  | #   | Problem                         | Difficulty | Link                                                                |
| ----- | --- | ------------------------------- | ---------- | ------------------------------------------------------------------- |
| `[ ]` | 190 | Reverse Bits                    | 🟢 Easy    | [→](https://leetcode.com/problems/reverse-bits/)                    |
| `[ ]` | 191 | Number of 1 Bits                | 🟢 Easy    | [→](https://leetcode.com/problems/number-of-1-bits/)                |
| `[ ]` | 405 | Convert a Number to Hexadecimal | 🟢 Easy    | [→](https://leetcode.com/problems/convert-a-number-to-hexadecimal/) |

***

## 3. Array / Two Pointers

### 🧩 Cheat Sheet

```
Key Patterns:
───────────────────────────────────────────────────────
▸ Remove in-place          : slow/fast pointer — slow tracks write idx, fast scans
▸ Merge sorted arrays      : fill from back (index k=m+n-1) to avoid overwrite
▸ Binary search insert     : lo=0, hi=len; while(lo<hi){mid=(lo+hi)/2; ...}
▸ Kadane's (max subarray)  : curSum = max(num, curSum+num); maxSum = max(maxSum, curSum)
▸ Max profit (1 transaction): track minPrice seen so far; profit = price - minPrice
▸ Move zeroes              : two pointers — write non-zero to left, fill rest with 0
▸ Two Sum II (sorted)      : l=0, r=n-1; converge based on sum vs target
▸ Majority element         : Boyer-Moore voting — candidate + count; net vote
▸ Intersection of arrays   : sort both + two pointers, OR use HashSet
▸ Pascal's Triangle        : row[j] = prev[j-1] + prev[j]
▸ Transpose matrix         : result[j][i] = original[i][j]
▸ Contains Duplicate II    : sliding window of size k using HashSet
───────────────────────────────────────────────────────
Common complexities:
  In-place removal: O(n) time, O(1) space
  Merge sorted: O(m+n) time, O(1) space
  Kadane's: O(n) time, O(1) space

```

### ✅ Problem List

| Done  | #    | Problem                             | Difficulty | Link                                                                    |
| ----- | ---- | ----------------------------------- | ---------- | ----------------------------------------------------------------------- |
| `[ ]` | 26   | Remove Duplicates from Sorted Array | 🟢 Easy    | [→](https://leetcode.com/problems/remove-duplicates-from-sorted-array/) |
| `[ ]` | 27   | Remove Element                      | 🟢 Easy    | [→](https://leetcode.com/problems/remove-element/)                      |
| `[ ]` | 35   | Search Insert Position              | 🟢 Easy    | [→](https://leetcode.com/problems/search-insert-position/)              |
| `[ ]` | 53   | Maximum Subarray                    | 🟡 Medium  | [→](https://leetcode.com/problems/maximum-subarray/)                    |
| `[ ]` | 88   | Merge Sorted Array                  | 🟢 Easy    | [→](https://leetcode.com/problems/merge-sorted-array/)                  |
| `[ ]` | 118  | Pascal's Triangle                   | 🟢 Easy    | [→](https://leetcode.com/problems/pascals-triangle/)                    |
| `[ ]` | 121  | Best Time to Buy and Sell Stock     | 🟢 Easy    | [→](https://leetcode.com/problems/best-time-to-buy-and-sell-stock/)     |
| `[ ]` | 167  | Two Sum II - Input Array Is Sorted  | 🟡 Medium  | [→](https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/)    |
| `[ ]` | 169  | Majority Element                    | 🟢 Easy    | [→](https://leetcode.com/problems/majority-element/)                    |
| `[ ]` | 217  | Contains Duplicate                  | 🟢 Easy    | [→](https://leetcode.com/problems/contains-duplicate/)                  |
| `[ ]` | 219  | Contains Duplicate II               | 🟢 Easy    | [→](https://leetcode.com/problems/contains-duplicate-ii/)               |
| `[ ]` | 283  | Move Zeroes                         | 🟢 Easy    | [→](https://leetcode.com/problems/move-zeroes/)                         |
| `[ ]` | 349  | Intersection of Two Arrays          | 🟢 Easy    | [→](https://leetcode.com/problems/intersection-of-two-arrays/)          |
| `[ ]` | 350  | Intersection of Two Arrays II       | 🟢 Easy    | [→](https://leetcode.com/problems/intersection-of-two-arrays-ii/)       |
| `[ ]` | 867  | Transpose Matrix                    | 🟢 Easy    | [→](https://leetcode.com/problems/transpose-matrix/)                    |
| `[ ]` | 1207 | Unique Number of Occurrences        | 🟢 Easy    | [→](https://leetcode.com/problems/unique-number-of-occurrences/)        |
| `[ ]` | 1726 | Tuple with Same Product             | 🟡 Medium  | [→](https://leetcode.com/problems/tuple-with-same-product/)             |
| `[ ]` | 1929 | Concatenation of an Array           | 🟢 Easy    | [→](https://leetcode.com/problems/concatenation-of-array/)              |

***

## 4. String

### 🧩 Cheat Sheet

```
Key Patterns:
───────────────────────────────────────────────────────
▸ Sliding window (no repeat): HashMap of char→index; move left = map.get(c)+1
▸ Longest palindrome        : expand around center — odd (1 center) & even (2 centers)
▸ Zigzag conversion         : simulate rows with direction flip at top/bottom
▸ atoi (string to int)      : skip spaces → read sign → read digits → clamp to INT range
▸ Longest common prefix     : sort + compare first vs last (lexicographic), OR vertical scan
▸ strStr (find first occur) : KMP or sliding window match; return -1 if not found
▸ Length of last word        : trim trailing spaces, count from end
▸ Valid palindrome          : two pointers l/r, skip non-alphanumeric, compare lowercased
▸ Valid anagram             : frequency count array size 26; OR sort both strings
▸ Reverse string            : two pointer swap in-place
▸ Ransom note / unique char : frequency array or HashMap; O(n)
▸ Robot return to origin    : count L==R and U==D
───────────────────────────────────────────────────────
Common tricks:
  char freq array:  int[] freq = new int[26]; freq[c-'a']++
  Alphanumeric check: Character.isLetterOrDigit(c)
  Lowercase:          Character.toLowerCase(c)

```

### ✅ Problem List

| Done  | #   | Problem                                            | Difficulty | Link                                                                                   |
| ----- | --- | -------------------------------------------------- | ---------- | -------------------------------------------------------------------------------------- |
| `[ ]` | 3   | Longest Substring Without Repeating Characters     | 🟡 Medium  | [→](https://leetcode.com/problems/longest-substring-without-repeating-characters/)     |
| `[ ]` | 5   | Longest Palindromic Substring                      | 🟡 Medium  | [→](https://leetcode.com/problems/longest-palindromic-substring/)                      |
| `[ ]` | 6   | Zigzag Conversion                                  | 🟡 Medium  | [→](https://leetcode.com/problems/zigzag-conversion/)                                  |
| `[ ]` | 8   | String to Integer (atoi)                           | 🟡 Medium  | [→](https://leetcode.com/problems/string-to-integer-atoi/)                             |
| `[ ]` | 14  | Longest Common Prefix                              | 🟢 Easy    | [→](https://leetcode.com/problems/longest-common-prefix/)                              |
| `[ ]` | 28  | Find the Index of the First Occurrence in a String | 🟢 Easy    | [→](https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/) |
| `[ ]` | 58  | Length of Last Word                                | 🟢 Easy    | [→](https://leetcode.com/problems/length-of-last-word/)                                |
| `[ ]` | 125 | Valid Palindrome                                   | 🟢 Easy    | [→](https://leetcode.com/problems/valid-palindrome/)                                   |
| `[ ]` | 242 | Valid Anagram                                      | 🟢 Easy    | [→](https://leetcode.com/problems/valid-anagram/)                                      |
| `[ ]` | 344 | Reverse String                                     | 🟢 Easy    | [→](https://leetcode.com/problems/reverse-string/)                                     |
| `[ ]` | 383 | Ransom Note                                        | 🟢 Easy    | [→](https://leetcode.com/problems/ransom-note/)                                        |
| `[ ]` | 387 | First Unique Character in a String                 | 🟢 Easy    | [→](https://leetcode.com/problems/first-unique-character-in-a-string/)                 |
| `[ ]` | 657 | Robot Return to Origin                             | 🟢 Easy    | [→](https://leetcode.com/problems/robot-return-to-origin/)                             |

***

## 5. Hash Table

### 🧩 Cheat Sheet

```
Key Patterns:
───────────────────────────────────────────────────────
▸ Group anagrams            : sort each word → use sorted word as HashMap key
                              OR use frequency tuple as key
▸ Design HashSet            : array of booleans (size ~10^6) OR bucket array of lists
                              with hash function idx = val % size
▸ Jewels and stones         : put jewels in a HashSet; count stones in set
───────────────────────────────────────────────────────
Design HashSet internals:
  size = 769 (prime for good distribution)
  bucket[key % size].contains(key) → O(1) avg

```

### ✅ Problem List

| Done  | #   | Problem           | Difficulty | Link                                                  |
| ----- | --- | ----------------- | ---------- | ----------------------------------------------------- |
| `[ ]` | 49  | Group Anagrams    | 🟡 Medium  | [→](https://leetcode.com/problems/group-anagrams/)    |
| `[ ]` | 705 | Design HashSet    | 🟢 Easy    | [→](https://leetcode.com/problems/design-hashset/)    |
| `[ ]` | 771 | Jewels and Stones | 🟢 Easy    | [→](https://leetcode.com/problems/jewels-and-stones/) |

***

## 6. Stack

### 🧩 Cheat Sheet

```
Key Patterns:
───────────────────────────────────────────────────────
▸ Valid parentheses         : push opening brackets; on closing — check top matches
                              at end, stack must be empty
  Pairs: '(' → ')', '[' → ']', '{' → '}'
  Use a Map for pair lookup.
───────────────────────────────────────────────────────
Classic stack use cases:
  Balanced brackets, next greater element, monotonic stack, function call simulation

```

### ✅ Problem List

| Done  | #  | Problem           | Difficulty | Link                                                  |
| ----- | -- | ----------------- | ---------- | ----------------------------------------------------- |
| `[ ]` | 20 | Valid Parentheses | 🟢 Easy    | [→](https://leetcode.com/problems/valid-parentheses/) |

***

## 7. Linked List

### 🧩 Cheat Sheet

```
Key Patterns:
───────────────────────────────────────────────────────
▸ Reverse linked list       : prev=null, curr=head
                              while(curr) { next=curr.next; curr.next=prev; prev=curr; curr=next; }
                              return prev;
▸ Merge two sorted lists    : dummy head node trick; compare l1.val vs l2.val
                              attach smaller, advance pointer; attach remaining tail
───────────────────────────────────────────────────────
Always draw out pointer movements before coding.
Dummy node = safe way to handle edge cases (empty list, single node).

```

### ✅ Problem List

| Done  | #   | Problem                | Difficulty | Link                                                       |
| ----- | --- | ---------------------- | ---------- | ---------------------------------------------------------- |
| `[ ]` | 21  | Merge Two Sorted Lists | 🟢 Easy    | [→](https://leetcode.com/problems/merge-two-sorted-lists/) |
| `[ ]` | 206 | Reverse Linked List    | 🟢 Easy    | [→](https://leetcode.com/problems/reverse-linked-list/)    |

***

## 8. Backtracking

### 🧩 Cheat Sheet

```
Key Patterns:
───────────────────────────────────────────────────────
▸ Universal backtracking template:

  void backtrack(args, current, result) {
      if (base_case) { result.add(copy of current); return; }
      for (choice in choices) {
          if (is_valid(choice)) {
              make_choice(current, choice);
              backtrack(next_args, current, result);
              undo_choice(current, choice);    // ← CRITICAL: undo
          }
      }
  }

▸ Subsets (78)              : at each index, choose to include or skip
▸ Subsets II (90)           : sort first + skip duplicates (if i>start && nums[i]==nums[i-1])
▸ Permutations (46)         : use visited[] boolean array; all n! arrangements
▸ Permutations II (47)      : sort + skip duplicate at same recursion depth
▸ Combinations (77)         : choose k from [1..n], start index advances each call
▸ Combination Sum (39)      : candidates can reuse; start index stays same on reuse
▸ Combination Sum II (40)   : each element once; sort + skip duplicates at same level
▸ Combination Sum III (216) : k numbers from 1-9 summing to n; no reuse
▸ Letter Combos (17)        : phone pad map → recurse per digit
▸ Generate Parentheses (22) : track open/close counts; open<n → add '('; close<open → add ')'
▸ N-Queens (51/52)          : place queen per row; check col + diag conflicts
                              use sets: cols, diag1 (r-c), diag2 (r+c)
▸ Sudoku Solver (37)        : find empty cell → try 1-9 → check row/col/box validity
▸ Word Search (79)          : DFS from each cell; mark visited with '#'; restore on backtrack
▸ Path Sum II (113)         : DFS on tree; track path; add copy when leaf reached with sum=0
───────────────────────────────────────────────────────
Pruning tips:
  Sort input array when duplicates exist → skip adjacent equal elements at same depth
  Use remaining target to prune (if remaining < 0, return early)
  Constraint propagation in Sudoku/N-Queens speeds things up significantly

```

### ✅ Problem List

| Done  | #   | Problem                               | Difficulty | Link                                                                      |
| ----- | --- | ------------------------------------- | ---------- | ------------------------------------------------------------------------- |
| `[ ]` | 17  | Letter Combinations of a Phone Number | 🟡 Medium  | [→](https://leetcode.com/problems/letter-combinations-of-a-phone-number/) |
| `[ ]` | 22  | Generate Parentheses                  | 🟡 Medium  | [→](https://leetcode.com/problems/generate-parentheses/)                  |
| `[ ]` | 37  | Sudoku Solver                         | 🔴 Hard    | [→](https://leetcode.com/problems/sudoku-solver/)                         |
| `[ ]` | 39  | Combination Sum                       | 🟡 Medium  | [→](https://leetcode.com/problems/combination-sum/)                       |
| `[ ]` | 40  | Combination Sum II                    | 🟡 Medium  | [→](https://leetcode.com/problems/combination-sum-ii/)                    |
| `[ ]` | 46  | Permutations                          | 🟡 Medium  | [→](https://leetcode.com/problems/permutations/)                          |
| `[ ]` | 47  | Permutations II                       | 🟡 Medium  | [→](https://leetcode.com/problems/permutations-ii/)                       |
| `[ ]` | 51  | N-Queens                              | 🔴 Hard    | [→](https://leetcode.com/problems/n-queens/)                              |
| `[ ]` | 52  | N-Queens II                           | 🔴 Hard    | [→](https://leetcode.com/problems/n-queens-ii/)                           |
| `[ ]` | 77  | Combinations                          | 🟡 Medium  | [→](https://leetcode.com/problems/combinations/)                          |
| `[ ]` | 78  | Subsets                               | 🟡 Medium  | [→](https://leetcode.com/problems/subsets/)                               |
| `[ ]` | 79  | Word Search                           | 🟡 Medium  | [→](https://leetcode.com/problems/word-search/)                           |
| `[ ]` | 90  | Subsets II                            | 🟡 Medium  | [→](https://leetcode.com/problems/subsets-ii/)                            |
| `[ ]` | 113 | Path Sum II                           | 🟡 Medium  | [→](https://leetcode.com/problems/path-sum-ii/)                           |
| `[ ]` | 216 | Combination Sum III                   | 🟡 Medium  | [→](https://leetcode.com/problems/combination-sum-iii/)                   |

***

## 📊 Progress Summary

> Update this as you go

| Topic                | Total  | Done  | Progress        |
| -------------------- | ------ | ----- | --------------- |
| Math                 | 15     | 0     | `░░░░░░░░░░` 0% |
| Bit Manipulation     | 3      | 0     | `░░░░░░░░░░` 0% |
| Array / Two Pointers | 18     | 0     | `░░░░░░░░░░` 0% |
| String               | 13     | 0     | `░░░░░░░░░░` 0% |
| Hash Table           | 3      | 0     | `░░░░░░░░░░` 0% |
| Stack                | 1      | 0     | `░░░░░░░░░░` 0% |
| Linked List          | 2      | 0     | `░░░░░░░░░░` 0% |
| Backtracking         | 15     | 0     | `░░░░░░░░░░` 0% |
| **TOTAL**            | **70** | **0** | **0%**          |

***

## 🗒️ Notes

***

*Generated from problem IDs: 1281, 231, 7, 202, 405, 263, 507, 204, 191, 190, 326, 342, 367, 69, 344, 58, 125, 1929, 283, 169, 387, 49, 217, 349, 1726, 657, 118, 867, 9, 13, 14, 20, 21, 27, 28, 383, 705, 771, 1207, 78, 46, 77, 17, 22, 39, 40, 79, 51, 50, 206, 90, 216, 47, 52, 37, 113, 66, 3, 5, 6, 8, 242, 26, 35, 53, 88, 121, 167, 219, 350*
