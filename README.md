# Program-algorithm-to-sort-strings-based-on-ASCII-values
Java program to sort strings based on ascii values of character and numbers
Author: Siddhant Tanpure

Requirements: 

1) The sort should be case sensitive (ASCII sort order).
2) The strings will be ASCII characters only.
3) No negative numbers are allowed (i.e. the ‘-‘ character is just an ordinary non-digit character).
4) The period character should be treated as a character, not as a decimal place.
5) The numbers should be treated as base-ten numbers.
6) The sort order should be the same with all leading zeroes removed from all numbers. On the other hand, if two strings are equal, except for having different lengths (because of leading zeroes) their sort order is undefined.
7) Numbers up to 9,999,999,999 should be supported.

Examples:
1) Input = ["100","23","83","65","24","4","2"]
Answer = [2,4,23,24,65,83,100]

3) Input = ["t9.txt", "t34.txt", "t010.txt", "t00.txt", "t1.txt", "t.txt", "t30.txt", "t007.txt"]
Answer = ["t.txt", "t00.txt", "t1.txt", "t007.txt", "t9.txt", "t010.txt", "t30.txt", "t34.txt"]

4) Input = ["127.0.0.1","127.0.0.5","127.0.0.3","127.68.23.43","127.34.62.23"]
Answer = ["127.0.0.1", "127.0.0.3", "127.0.0.5", "127.34.62.23", "127.68.23.43"]

5) Input = ["t.txt", "4", "2", "t30.txt", "127.0.0.1", "24", "127.0.0.5", "a"]
Answer = ["2", "4", "24", "127.0.0.1", "127.0.0.5", "a", "t.txt", "t30.txt"]


Happy Coding!!!
