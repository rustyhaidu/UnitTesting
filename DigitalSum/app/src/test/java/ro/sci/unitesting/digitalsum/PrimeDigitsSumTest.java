package ro.sci.unitesting.digitalsum;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


/**
 * Test used to check the functionality of {@link PrimeDigitsSum}.
 * 
 * @author sebi
 *
 */
public class PrimeDigitsSumTest {

	private PrimeDigitsSum primeDigitsSum;

	@Before
	public void setup() {
		primeDigitsSum = new PrimeDigitsSum();
	}

	@Test(expected = PrimeDigitsSum.InvalidNumberException.class)
	public void test_invalidNumber() throws Exception {
		primeDigitsSum.calculateDigitsCum("12d");
	}

	@Test
	public void test_sum_for_one() throws Exception {
		Assert.assertEquals("1 is not a prime number", 0,
				primeDigitsSum.calculateDigitsCum("1"));
	}
	
	@Test
	public void test_sum_for_zero() throws Exception {
		Assert.assertEquals("0 is not a prime number", 0,
				primeDigitsSum.calculateDigitsCum("0"));
	}

	@Test
	public void test_sum_all_prime() throws Exception {
		Assert.assertEquals(17, primeDigitsSum.calculateDigitsCum("12357"));
	}

	@Test
	public void test_sum_all_not_prime() throws Exception {
		Assert.assertEquals("none of digits are prime", 0,
				primeDigitsSum.calculateDigitsCum("14689"));
	}

	@Test
	public void test_sum_mixed() throws Exception {
		Assert.assertEquals(24,
				primeDigitsSum.calculateDigitsCum("14263850797"));
	}

	@Test
	public void test_sum_all_prime_doubled() throws Exception {
		Assert.assertEquals(34, primeDigitsSum.calculateDigitsCum("1122335577"));
	}

	
	
	@Test(expected = PrimeDigitsSum.InvalidNumberException.class)
	public void test_null() throws Exception {
		Assert.assertEquals(34, primeDigitsSum.calculateDigitsCum(null));
	}
}
