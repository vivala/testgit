package com.jinyoung.test1;

	

public class CheckPrime {
	
	static final int max = 1000;
	static final int min = 0;
	static int input = 0;
	
	public static void main (String [] args) {
		
		CheckPrime check = new CheckPrime();
	
		try {
			check.CheckArgs(args);
		}
		catch (Exception e) {
			System.out.println("Useage : checkprime x");
			System.exit(1);
			
		}
		
		if(check.primeCheck(input)) 
			System.out.println(input + "is a prime number");
		
		else 
			System.out.println(input + "is not a prime number");
		
		
	}
	
	public void CheckArgs(String [] args) throws Exception {
		if(args.length != 1) {
			throw new Exception();
		}
		else {
			Integer num = Integer.valueOf(args[0]);
			input = num.intValue();
			
			if(input < min || input > max) {
				throw new Exception();
			}
		}
	}
	
	public int[] makePrime(int n) {
		
		int prime[] = new int [n + 1];
		int j, t = 0, flag = 0;
		prime [0] = 2;
		
		for(int i = 3; i <= n; i++){
			flag = 0;
			for(j = 0; prime[j] != 0; j++){
				if(prime[j] > Math.sqrt(i)) break;
				if(i % prime[j] == 0) {flag = 1; break; }
			}
			if(flag == 0) prime[t++] = i;
		}
		return prime;

	}
	
	public boolean primeCheck(int num){
		
		int prime [] = makePrime(max);
				
		for (int i = 0; prime[i] < Math.sqrt(input); i++){
			if(input%prime[i] == 0) return false;
		}
		return true;
	}
}
