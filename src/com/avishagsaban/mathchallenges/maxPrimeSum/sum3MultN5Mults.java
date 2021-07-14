package com.avishagsaban.mathchallenges.maxPrimeSum;

import java.util.ArrayList;
import java.util.List;

public class sum3MultN5Mults {
	static final int maxNumberToAdd = 10;
	static final int _3 = 3 , _5 = 5;
	public static int getSumBruteForce() {
		
		int sum = 0;
		int num = Math.min(_3, _5);
		while( num <maxNumberToAdd) {
			if(num% _3==0 ||num%_5==0) {
				sum += num;
//				System.out.print(num+" ");
			}
			num++;
		}
		System.out.println("");
		return sum;

	}
	//formula couldn't do it because of the redendency of 3 and 5 multipications
	//to delete series of 15
	public static int getSumFormula() {
		int sum_3, sum_5,sum_15;
		final int n_3 = (int)(maxNumberToAdd/_3);
		final int n_5 = (int)(maxNumberToAdd/_5);
		final int n_15 = (int)(maxNumberToAdd/(_3*_5));
		final int lastNum_3 = n_3*_3;
		final int lastNum_5 = n_5*_5;
		final int lastNum_15 = n_15*(_5*_3);
		sum_3 = n_3*(_3+lastNum_3)/2;
		sum_5 = n_5*(_5+lastNum_5)/2;
		sum_15 = n_15*((_3*_5)+lastNum_15)/2;
		return sum_3+sum_5-sum_15;
	}
	
	public static int getSumList() {
		List<Integer>listmult = new ArrayList<Integer>();
		final int _3 = 3 , _5 = 5;
		int sum_3 = 0, sum_5 = 0, sum = 0;
		final int iterMax_3 = ((int)maxNumberToAdd/_3);
		final int iterMax_5 = ((int)maxNumberToAdd/_5);
		int flag = 1;
		int count_iter = 0;
		while(count_iter<iterMax_3) {
			sum_3 += _3; // 3, 6 , 9
			listmult.add(sum_3);
			count_iter++;
		}
		count_iter = 0;
		
		while(count_iter<iterMax_5) {
			count_iter++;
			
			if (flag == _3) {
				flag = 1;				
				continue;
			}
			listmult.add(sum_5);
			sum_5 += _5;
			flag ++;
		}
		for(int i=0;i<listmult.size(); i++) {
			sum += listmult.get(i);
		}
		return sum;
	}

}
