1. How to simplify the input?
- Removing the first character.
2. Combine solutions for the simpler inputs into solution for the original problem:
- First, remove the first character of the string. Then call getSubsets on the smaller string. The solutions to the string is obtain by appending the removed first character to each of the solutions of the smaller string.
- Notice that we also need to add all the subsets of the shorter string into the result array of the original string.
3. Solution to the simplest input:
- The simplest input is obtained after the last character is removed. Now we have an empty string. It has only one subset, itself.
4. Implementation: (I can make this more space-efficient by avoiding object creation in each recursion but I'm too lazy to do it right now) 