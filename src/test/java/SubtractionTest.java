import static org.junit.Assert.*;

import java.text.DecimalFormat;
import java.util.Random;
import java.util.logging.Logger;

import org.junit.Test;

public class SubtractionTest {

	private static final Logger LOG = Logger.getLogger(Calculator.class.getName());
	Calculator calculator = new Calculator();
	Random random = new Random();
	DecimalFormat df = new DecimalFormat();

	@Test
	public void testSubSmallSizedPositiveNumbers() {
		double firstNumber = 0;
		double secondNumber = 0;
		double result = 0;

		for (int i = 0; i < 5; i++) {
			firstNumber = Double.valueOf(df.format(random.nextDouble() * 10));
			secondNumber = Double.valueOf(df.format(random.nextDouble() * 10));
			result = firstNumber - secondNumber;

			double resultMethod = calculator.subtract(firstNumber, secondNumber);

			LOG.info("Testing the method subtract small positive with: " + firstNumber + " and " + secondNumber
					+ " . Result of those: " + result + ". The temp is " + resultMethod);
			assertEquals(Math.round(calculator.subtract(firstNumber, secondNumber)), Math.round(result), 1);

		}
	}

	@Test
	public void testSubMediumSizedPositiveNumbers() {
		double firstNumber = 0;
		double secondNumber = 0;
		double result = 0;

		for (int i = 0; i < 5; i++) {
			firstNumber = Double.valueOf(df.format(random.nextDouble() * 100));
			secondNumber = Double.valueOf(df.format(random.nextDouble() * 100));
			result = firstNumber - secondNumber;

			double resultMethod = calculator.subtract(firstNumber, secondNumber);

			LOG.info("Testing the method subtract medium positive with: " + firstNumber + " and " + secondNumber
					+ " . Result of those: " + result + ". Result from Method is: " + resultMethod);
			assertEquals(Math.round(calculator.subtract(firstNumber, secondNumber)), Math.round(result), 1);

		}
	}

	@Test
	public void testSubLargeSizedPositiveNumbers() {
		double firstNumber = 0;
		double secondNumber = 0;
		double result = 0;

		for (int i = 0; i < 5; i++) {
			firstNumber = Double.valueOf(df.format(random.nextDouble() * 1000));
			secondNumber = Double.valueOf(df.format(random.nextDouble() * 1000));
			result = firstNumber - secondNumber;

			double resultMethod = calculator.subtract(firstNumber, secondNumber);

			LOG.info("Testing the method subtract large positive with: " + firstNumber + " and " + secondNumber
					+ " . Result of those: " + result + ". Result from Method is: " + resultMethod);
			assertEquals(Math.round(calculator.subtract(firstNumber, secondNumber)), Math.round(result), 1);

		}
	}

	@Test
	public void testSubZeros() {
		double firstNumber = 0;
		double secondNumber = 0;
		double result = firstNumber + secondNumber;

		double resultMethod = calculator.subtract(firstNumber, secondNumber);

		LOG.info("Testing the method subtract zeros with: " + firstNumber + " and " + secondNumber
				+ " . Result of those: " + result + ". Result from Method is: " + resultMethod);
		assertEquals(Math.round(calculator.subtract(firstNumber, secondNumber)), Math.round(result), 1);
	}

	@Test
	public void testSubFirstZero() {
		double firstNumber = 0;
		double secondNumber = 0;

		for (int i = 0; i < 5; i++) {

			secondNumber = Double.valueOf(df.format(random.nextDouble() * 1000));
			double result = firstNumber - secondNumber;

			double resultMethod = calculator.subtract(firstNumber, secondNumber);

			LOG.info("Testing the method subtract first zero with: " + firstNumber + " and " + secondNumber
					+ " . Result of those: " + result + ". Result from Method is: " + resultMethod);
			assertEquals(Math.round(calculator.subtract(firstNumber, secondNumber)), Math.round(result), 1);
		}
	}

	@Test
	public void testSubSecondZero() {

		double firstNumber = 0;
		double secondNumber = 0;

		for (int i = 0; i < 5; i++) {
			firstNumber = Double.valueOf(df.format(random.nextDouble() * 1000));
			double result = firstNumber - secondNumber;

			double resultMethod = calculator.subtract(firstNumber, secondNumber);

			LOG.info("Testing the method subtract second zero with: " + firstNumber + " and " + secondNumber
					+ " . Result of those: " + result + ". Result from Method is: " + resultMethod);
			assertEquals(Math.round(calculator.subtract(firstNumber, secondNumber)), Math.round(result), 1);

		}

	}

	@Test
	public void testSubSmallSizedNegativeNumbers() {
		double firstNumber = 0;
		double secondNumber = 0;
		double result = 0;

		for (int i = 0; i < 5; i++) {
			firstNumber = Double.valueOf(df.format(random.nextDouble() * -10));
			secondNumber = Double.valueOf(df.format(random.nextDouble() * -10));
			result = firstNumber - secondNumber;

			double resultMethod = calculator.subtract(firstNumber, secondNumber);

			LOG.info("Testing the method subtract small negative with: " + firstNumber + " and " + secondNumber
					+ " . Result of those: " + result + ". The temp is " + resultMethod);
			assertEquals(Math.round(calculator.subtract(firstNumber, secondNumber)), Math.round(result), 1);

		}
	}

	@Test
	public void testSubMediumSizedNegativeNumbers() {
		double firstNumber = 0;
		double secondNumber = 0;
		double result = 0;

		for (int i = 0; i < 5; i++) {
			firstNumber = Double.valueOf(df.format(random.nextDouble() * -100));
			secondNumber = Double.valueOf(df.format(random.nextDouble() * -100));
			result = firstNumber - secondNumber;

			double resultMethod = calculator.subtract(firstNumber, secondNumber);

			LOG.info("Testing the method subtract medium negative with: " + firstNumber + " and " + secondNumber
					+ " . Result of those: " + result + ". Result from Method is: " + resultMethod);
			assertEquals(Math.round(calculator.subtract(firstNumber, secondNumber)), Math.round(result), 1);

		}
	}

	@Test
	public void testSubLargeSizedNegativeNumbers() {
		double firstNumber = 0;
		double secondNumber = 0;
		double result = 0;

		for (int i = 0; i < 5; i++) {
			firstNumber = Double.valueOf(df.format(random.nextDouble() * -1000));
			secondNumber = Double.valueOf(df.format(random.nextDouble() * -1000));
			result = firstNumber - secondNumber;

			double resultMethod = calculator.subtract(firstNumber, secondNumber);

			LOG.info("Testing the method subtract large negative with: " + firstNumber + " and " + secondNumber
					+ " . Result of those: " + result + ". Result from Method is: " + resultMethod);
			assertEquals(Math.round(calculator.subtract(firstNumber, secondNumber)), Math.round(result), 1);

		}
	}

}
