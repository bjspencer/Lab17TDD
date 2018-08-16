import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class PrimeNumberTest {

	@Test
	void test1() {
		PrimeNumber primeN = new PrimeNumber();
		int expected = 2;
		int actual = PrimeNumber.findPrime(1);

		assertEquals(expected, actual);
	}

	@Test
	void test2() {
		PrimeNumber primeN = new PrimeNumber();
		int expected = 3;
		int actual = PrimeNumber.findPrime(2);

		assertEquals(expected, actual);
	}

	@Test
	void test3() {
		PrimeNumber primeN = new PrimeNumber();
		int expected = 5;
		int actual = PrimeNumber.findPrime(3);

		assertEquals(expected, actual);
	}

	@Test
	void test4() {
		PrimeNumber primeN = new PrimeNumber();
		int expected = 7;
		int actual = PrimeNumber.findPrime(4);

		assertEquals(expected, actual);
	}

	@Test
	void test5() {
		PrimeNumber primeN = new PrimeNumber();
		int expected = 11;
		int actual = PrimeNumber.findPrime(5);

		assertEquals(expected, actual);
	}

	@Test
	void test6() {
		PrimeNumber primeN = new PrimeNumber();
		int expected = 13;
		int actual = PrimeNumber.findPrime(6);

		assertEquals(expected, actual);
	}

	@Test
	void test7() {
		PrimeNumber primeN = new PrimeNumber();
		int expected = 17;
		int actual = PrimeNumber.findPrime(7);

		assertEquals(expected, actual);
	}

	@Test
	void test8() {
		PrimeNumber primeN = new PrimeNumber();
		int expected = 19;
		int actual = PrimeNumber.findPrime(8);

		assertEquals(expected, actual);
	}

	@Test
	void test9() {
		PrimeNumber primeN = new PrimeNumber();
		int expected = 23;
		int actual = PrimeNumber.findPrime(9);

		assertEquals(expected, actual);
	}

	@Test
	void test10() {
		PrimeNumber primeN = new PrimeNumber();
		int expected = 29;
		int actual = PrimeNumber.findPrime(10);

		assertEquals(expected, actual);
	}
}
