import static org.junit.Assert.*;

import java.text.DecimalFormat;
import java.util.Random;
import java.util.logging.Logger;

import org.junit.Test;

public class MultiplcationTest {
	private static final Logger LOG = Logger.getLogger(Calculator.class.getName());
	Calculator calculator = new Calculator();
	Random random = new Random();
	DecimalFormat df = new DecimalFormat();

	@Test
	public void testMultiSmallSizedPositiveNumbers() {
		double firstNumber = 0;
		double secondNumber = 0;
		double result = 0;

		for (int i = 0; i < 5; i++) {
			firstNumber = Double.valueOf(df.format(random.nextDouble() * 10));
			secondNumber = Double.valueOf(df.format(random.nextDouble() * 10));
			result = firstNumber * secondNumber;

			double resultMethod = calculator.multiply(firstNumber, secondNumber);

			LOG.info("Testing the method multiply small positive with: " + firstNumber + " and " + secondNumber
					+ " . Result of those: " + result + ". The temp is " + resultMethod);
			assertEquals(Math.round(calculator.multiply(firstNumber, secondNumber)), Math.round(result), 1);

		}
	}

	@Test
	public void testMultiMediumSizedPositiveNumbers() {
		double firstNumber = 0;
		double secondNumber = 0;
		double result = 0;

		for (int i = 0; i < 5; i++) {
			firstNumber = Double.valueOf(df.format(random.nextDouble() * 100));
			secondNumber = Double.valueOf(df.format(random.nextDouble() * 100));
			result = firstNumber * secondNumber;

			double resultMethod = calculator.multiply(firstNumber, secondNumber);

			LOG.info("Testing the method multiply medium positive with: " + firstNumber + " and " + secondNumber
					+ " . Result of those: " + result + ". Result from Method is: " + resultMethod);
			assertEquals(Math.round(calculator.multiply(firstNumber, secondNumber)), Math.round(result), 1);

		}
	}

	@Test
	public void testMultiLargeSizedPositiveNumbers() {
		double firstNumber = 0;
		double secondNumber = 0;
		double result = 0;

		for (int i = 0; i < 5; i++) {
			firstNumber = Double.valueOf(df.format(random.nextDouble() * 1000));
			secondNumber = Double.valueOf(df.format(random.nextDouble() * 1000));
			result = firstNumber * secondNumber;

			double resultMethod = calculator.multiply(firstNumber, secondNumber);

			LOG.info("Testing the method multiply large positive with: " + firstNumber + " and " + secondNumber
					+ " . Result of those: " + result + ". Result from Method is: " + resultMethod);
			assertEquals(Math.round(calculator.multiply(firstNumber, secondNumber)), Math.round(result), 1);

		}
	}

	@Test
	public void testMultiZeros() {
		double firstNumber = 0;
		double secondNumber = 0;
		double result = firstNumber * secondNumber;

		double resultMethod = calculator.multiply(firstNumber, secondNumber);

		LOG.info("Testing the method multiply zeros with: " + firstNumber + " and " + secondNumber
				+ " . Result of those: " + result + ". Result from Method is: " + resultMethod);
		assertEquals(Math.round(calculator.multiply(firstNumber, secondNumber)), Math.round(result), 1);
	}

	@Test
	public void testMultiFirstZero() {
		double firstNumber = 0;
		double secondNumber = 0;

		for (int i = 0; i < 5; i++) {
			secondNumber = Double.valueOf(df.format(random.nextDouble() * 1000));
			double result = firstNumber * secondNumber;

			double resultMethod = calculator.multiply(firstNumber, secondNumber);

			LOG.info("Testing the method multiply first zero with: " + firstNumber + " and " + secondNumber
					+ " . Result of those: " + result + ". Result from Method is: " + resultMethod);
			assertEquals(Math.round(calculator.multiply(firstNumber, secondNumber)), Math.round(result), 1);

		}

	}

	@Test
	public void testMultiSecondZero() {
		double firstNumber = 0;
		double secondNumber = 0;

		for (int i = 0; i < 5; i++) {
			firstNumber = Double.valueOf(df.format(random.nextDouble() * 1000));
			double result = firstNumber * secondNumber;

			double resultMethod = calculator.multiply(firstNumber, secondNumber);

			LOG.info("Testing the method multiply second zero with: " + firstNumber + " and " + secondNumber
					+ " . Result of those: " + result + ". Result from Method is: " + resultMethod);
			assertEquals(Math.round(calculator.multiply(firstNumber, secondNumber)), Math.round(result), 1);
		}

	}

	@Test
	public void testMultiSmallSizedNegativeNumbers() {
		double firstNumber = 0;
		double secondNumber = 0;
		double result = 0;

		for (int i = 0; i < 5; i++) {
			firstNumber = Double.valueOf(df.format(random.nextDouble() * -10));
			secondNumber = Double.valueOf(df.format(random.nextDouble() * -10));
			result = firstNumber * secondNumber;

			double resultMethod = calculator.multiply(firstNumber, secondNumber);

			LOG.info("Testing the method multiply small negative with: " + firstNumber + " and " + secondNumber
					+ " . Result of those: " + result + ". The temp is " + resultMethod);
			assertEquals(Math.round(calculator.multiply(firstNumber, secondNumber)), Math.round(result), 1);

		}
	}

	@Test
	public void testMultiMediumSizedNegativeNumbers() {
		double firstNumber = 0;
		double secondNumber = 0;
		double result = 0;

		for (int i = 0; i < 5; i++) {
			firstNumber = Double.valueOf(df.format(random.nextDouble() * -100));
			secondNumber = Double.valueOf(df.format(random.nextDouble() * -100));
			result = firstNumber * secondNumber;

			double resultMethod = calculator.multiply(firstNumber, secondNumber);

			LOG.info("Testing the method multiply medium negative with: " + firstNumber + " and " + secondNumber
					+ " . Result of those: " + result + ". Result from Method is: " + resultMethod);
			assertEquals(Math.round(calculator.multiply(firstNumber, secondNumber)), Math.round(result), 1);

		}
	}

	@Test
	public void testMultiLargeSizedNegativeNumbers() {
		double firstNumber = 0;
		double secondNumber = 0;
		double result = 0;

		for (int i = 0; i < 5; i++) {
			firstNumber = Double.valueOf(df.format(random.nextDouble() * -1000));
			secondNumber = Double.valueOf(df.format(random.nextDouble() * -1000));
			result = firstNumber * secondNumber;

			double resultMethod = calculator.multiply(firstNumber, secondNumber);

			LOG.info("Testing the method multiply large negative with: " + firstNumber + " and " + secondNumber
					+ " . Result of those: " + result + ". Result from Method is: " + resultMethod);
			assertEquals(Math.round(calculator.multiply(firstNumber, secondNumber)), Math.round(result), 1);

		}
	}

}
