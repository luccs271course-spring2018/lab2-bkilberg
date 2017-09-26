# Answers
## Document outlining answers to the Lab 2 Questions

### What is the complexity of each of the four search methods in terms of array or list size n?
findTeamPosition (array) --> O(n) = 2.

findTeamPosition (list) --> O(n) = 2.

findTeamMinFunding --> O(n) = 3.

findTeamMinFundingFast --> O(n) = 2.

### What happens in the case of binary search if the array is not sorted?
In the case of a binary search with an unsorted array, there is a chance that the search will not find the desired search value. If there is a value that is higher than the search value, but to the left of the search value in the array, it will not find it in the search.
### What is the purpose of constructor argument validity checking?
The purpose of constructor argument validity checking is to cause the program to fail faster, instead of running for a long time knowing that it will eventually fail.
### What is the purpose of using the keyword final with variables and arguments?
The keyword final is used for final correctness in a program. "Final Correctness" does not allow a variable to be modified by the input or the program, if modification tried to occur, the program would throw and error.
### What are alternatives to using Optional and how do they compare?
The alternative to using Optional is to use null, however, if null were used, there would be null values in the program, and if they were ever referenced by the program, the program would throw another error.
