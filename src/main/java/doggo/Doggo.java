package doggo;

import java.util.ArrayList;
import java.util.List;

public class Doggo {

	public String place(int x) {
		// create a list to store results
		List<String> results = new ArrayList<>();
		
		// create a loop to count the places
		for(int i = 1; i <= 100; i++) {
			if (i == 11 || i == 12 || i == 13) {
				results.add(i+"th");
			} else {
				switch(i%10) {
				case 1:
					results.add(i + "st");
					break;
				case 2:
					results.add(i + "nd");
					break;
				case 3:
					results.add(i + "rd");
					break;
				default:
					results.add(i + "th");
				}
			}
		}
		results.remove(x-1);
		return String.join(", ", results);
		
	}
	
}
