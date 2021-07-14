package com.avishagsaban.mathchallenges.maxPrimeSum;

public class Prime {
	public static int nextPrime(int currPrime) {
		int nextPrime = currPrime+1;
		while(!isPrime(nextPrime ))
			nextPrime++;
		return nextPrime;
	}
	public static int prevPrime(int currPrime) throws Exception {
		int nextPrime = currPrime+1;
		if(nextPrime<2) {
			throw new Exception("no primes smaller than 2");
		}
		while(!isPrime(nextPrime )) {
			nextPrime--;
			
		}
		return nextPrime;
	}
	public static int nThPrime(int n) {
		int currPrime = 2;
		int i=0;
		while(i<n) {
			while(!isPrime(currPrime ))
				currPrime++;
			i++;
		}
		return currPrime;
	}
	public static int serialNumOfPrime(int prime) {
		int startPrime = 2;
		int i=0;
		while(startPrime<prime) {
			while(!isPrime(startPrime ))
				startPrime++;
			i++;
		}
		return i;
	}
	public static boolean isPrime(int num) {
		int currDiv = 2;
		while(currDiv <= Math.sqrt(num)) {
			if (num%currDiv ==0) return false;
			currDiv++;
		}
		return true;
	}
	public static boolean isSumPrimes(int num) {
		return false;
	}
	public static int getRandomPrime() {
		return nextPrime((int)Math.random()*1000);
	}

}
