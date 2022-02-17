package factorial;

public class Factorial {
	
	public String calculate(int x) {
		
		int i = 1; // iterator
		int current = x; // value after division
		
		// while the current value / i has a remainder of 0
		while(current % i == 0) {
			// if the current / i is equal to 1 ( can't get smaller )
			if ( current / i == 1 ) {
				// return the value + ! for factorial
				return i + "!";
			}
			// otherwise divide current by i and iterate i
			current = current / i;
			i++;
		}
		
		// if it isn't a factorial, return "NONE"
		return "NONE";
		
	}

}
