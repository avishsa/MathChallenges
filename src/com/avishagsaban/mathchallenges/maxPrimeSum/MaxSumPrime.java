package com.avishagsaban.mathchallenges.maxPrimeSum;

import java.util.ArrayList;
import java.util.List;

public class MaxSumPrime {
	int numIter;
	int maxPrimeSum = 2;
	int maxPrime = 2;
	List<Integer>listSum = new ArrayList<Integer>();
	public MaxSumPrime() {
		numIter = 20;
		getMaxSumPrime();
	}
	public MaxSumPrime(int iterNum) {
		numIter = iterNum;
		getMaxSumPrime();
	}
	public int getMaxSumPrimeVal() {
		return maxPrimeSum;
	}
	private void getMaxSumPrime() {		
		listSum.add(0);
		listSum.add(2);		
		int currPrime = 2;
		int i = 0;
		while (i<numIter -1) {
			currPrime = Prime.nextPrime(currPrime );
			maxPrime = currPrime;
			listSum  = add2listSum(listSum,currPrime);
			i++;
		}
	
	}
	private List<Integer> add2listSum(List <Integer> listSum,int currPrime){
		int oldLength = listSum.size();
		for (int i=0;i<oldLength;i++) {
			int newSum = listSum.get(i)+currPrime;
			if(listSum.contains(newSum)) continue;
			listSum.add(newSum);
			if(newSum> maxPrimeSum && Prime.isPrime(newSum))  maxPrimeSum  = newSum;			
		}
		return listSum;	
	}
	public void printListSum() {
		for (Integer sumPrime : listSum) {
		    System.out.print(sumPrime+" ");
		}
		System.out.println(" ");
	}
}
