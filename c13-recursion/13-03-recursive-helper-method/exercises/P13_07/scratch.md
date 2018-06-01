1: How do we simplify the input?
- Have an int called "start" that represents the index of the first character of the base substring. We simplify the base string to base substrings by increment this int by one.
2: Turn solutions for smaller inputs to solution for the original problem?
- First check the beginning substring of base substring against the target string. If match, return the index of the first character of the substring. If not, increment "start" by one and check the smaller substring
3: Find solutions for the simplest inputs?
- The simplest input is when the base substring has the same length with the target string. If they match, return the index of the first character of the substring. If not, return -1.
4: Implement and try to come up with a general helper method