import java.util.ArrayList;

public class PrimeNumber {

	
	
	public static int findPrime(int input) {
		int num = 1;
		boolean isPrime = true;

		ArrayList<Integer> primeList = new ArrayList<>();

		do {
			num++;
			for (int i = 2; i < num; i++) {
				if (num % i == 0) {
					isPrime = false;
					break;
				} else {
					isPrime = true;
				}
			}

			if (isPrime) {
				primeList.add(num);
			}
		} while (primeList.size() < input);

		return num;
	}

}
