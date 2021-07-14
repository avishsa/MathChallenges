/*package com.avishagsaban.mathchallenges.maxPrimeSum;

import static org.junit.Assert.*;

import org.junit.Test;

public class testMathChallenges {
	//testing input
	public void testMenu() {
		//test invalid
		// a , -1,
		
	}
	@Test	
	public void testMaxSumPrimeRnd() {
		int numTests = (int)Math.random()*10;
		int i=0;
		int rndPrime = Prime.getRandomPrime();
		int maxSum = 0;
		int currIter =0;
		while(i<numTests) {
			//relate num iter to prime number
			currIter = Prime.serialNumOfPrime(rndPrime);
			MaxSumPrime msp = new MaxSumPrime(currIter);
			maxSum = msp.getMaxSumPrimeVal();			
			assertTrue(testMaxSumPrime(rndPrime,maxSum));
			rndPrime  = Prime.getRandomPrime();
		
		}
		
	}
	
	
	private boolean testMaxSumPrime(int prime,int maxSum) {
		int maxVal = (1+prime)*prime/2;
		for(int i=maxSum+1;i<maxVal;i++) {
			if(Prime.isPrime(i)&&Prime.isSumPrimes(i)) {
				continue;
			}
			return false;
		}
		return true;
		
	}

}
*/