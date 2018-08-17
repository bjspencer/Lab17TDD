import java.util.Scanner;

public class PrimeMain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int userPrime = 0;
		String choice = "y";
		
		System.out.println("Let's locate some primes!");

		System.out.println("This application will find any prime, " + "in order, from the first prime on.");
		do {
			userPrime = Validator.getInt(scan, "Which prime number are you looking for? ");

			
			System.out.println("The number " + userPrime + " prime is " + PrimeNumber.findPrime(userPrime));
			
			choice = Validator.getString(scan, "Would you like to find another prime number? ");

		} while (choice.equalsIgnoreCase("y"));

		System.out.println("Goodbye!");
		
		scan.close();
	}

}
