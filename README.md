# MathChallenges
A desktop application for various math challenges solutions.
## Main features
[x] Maximum prime number which is a sum of prime numbers.
## Getting started
1. Download or clone repository.
2. Open via  [Eclipse](https://www.eclipse.org/downloads/)
3. Run Main.java file
### sample execution 
![execute](https://github.com/avishsa/MathChallenges/blob/master/execute_example.png?raw=true)

**Example 1**   
entering max iterations - 5  
means that the 5th prime number, 11, would be the maximum prime number.
That mean that the max prime sum would be a summation of a sub group of {2,3,5,7,11}
The result is 23. 23 is a prime number, and it is the sum of {5,7,11} or alternativly {2,3,5,11}
Bigger sums can be 25,26,28 which neither of them is prime.
The way it is done:

1. list of sums is set to {0,2} max prime sum is set to 2
2. adding 3 to the list generate the following list : {0,2,3,5}, and the max prime sum: 5
3. adding 5 to the list generate the following list : {0,2,3,5,7,8,10},and the max prime sum: 7
4. adding 7 to the list generate the following list : {0,2,3,5,7,8,10,9,12,14,15,17},and the max prime sum: 17
5. adding 11 to the list generate the following list : {0,2,3,5,7,8,10,9,12,14,15,17,11,13,16,18,19,21,20,23,25,26,28},and the max prime sum: 23  

**Example 2**  
entering max iterations - 6  
means that the 5th prime number, 13, would be the maximum prime number.
That mean that the max prime sum would be a summation of a sub group of {2,3,5,7,11,13}
The result is 41. 41 is a prime number, and it is the sum of {2,3,5,7,11,13}  
continuing last exection:  
adding 13 to the list generate the following list : {0,2,3,5,7,8,10,9,12,14,15,17,11,13,16,18,19,21,20,23,25,26,28,22,27,30,24,29,31,32,34,33,36,41},and the max prime sum: 23.  
Which is the biggest summation you can generate from the group.
